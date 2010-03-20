import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.io.iterator.*;
import org.openscience.cdk.nonotify.NoNotificationChemObjectBuilder;
import org.openscience.cdk.qsar.DescriptorValue;
import org.openscience.cdk.qsar.DescriptorSpecification;
import org.openscience.cdk.qsar.IMolecularDescriptor;
import org.openscience.cdk.qsar.descriptors.molecular.*;
import org.openscience.cdk.tools.manipulator.*;

import com.google.code.semanticchemistry.cdk.io.ChemInfOWLWriter;

public String zeroPad(int intVal) {
  StringBuffer buffer = new StringBuffer();
  String value = "" + intVal;
  for (int i=1; i<(7-value.length()); i++) {
    buffer.append('0');
  }
  buffer.append(value);
  return buffer.toString();
}

CDK_VERSION = "1.3.1";

println "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>.";
println "@prefix obo: <http://purl.obolibrary.org/obo/>.";
println "@prefix ci: <http://www.semanticweb.org/ontologies/cheminf.owl#>.";
println "@prefix : <http://cdk.sf.net/org/openscience/cdk/qsar/>.";
println "";
println ":cdk-v" + CDK_VERSION + " a obo:IAO_0000010 ;";
println "  ci:CHEMINF_000333 \"The Chemistry Development Kit\" ;";
println "  ci:CHEMINF_000338 \"" + CDK_VERSION + "\" .";
println "";

List<IMolecularDescriptor> descriptors = new ArrayList();
descriptors.add(new TPSADescriptor());
descriptors.add(new BCUTDescriptor());
descriptors.add(new XLogPDescriptor());
descriptors.add(new HBondAcceptorCountDescriptor());
descriptors.add(new HBondDonorCountDescriptor());
descriptors.add(new RotatableBondsCountDescriptor());

i = 0
Map<String, String> specs = new HashMap();
for (IMolecularDescriptor descriptor : descriptors) {
  i++
  spec = descriptor.getSpecification();
  specs.put(spec.getImplementationTitle(), ":CDK_" + zeroPad(i));
  System.out.println(specs.get(spec.getImplementationTitle()) + " a :CHEMINF_000302");
  System.out.println(
    "  rdfs:label \"CDK " + 
    spec.getImplementationTitle().substring(47) + 
    " Implementation\" ;"
  );
  System.out.println("  ci:CHEMINF_000321 <" + spec.getSpecificationReference() + "> ;");
  System.out.println("  :distributedWith :cdk-v" + CDK_VERSION + " .");
}
println "";

iterator = new IteratingMDLReader(
  new File("ChEBI_complete.sdf").newReader(),
  NoNotificationChemObjectBuilder.getInstance()
)

i = 0
iterator.each { mol ->
  i++
  StringWriter output = new StringWriter();
  ChemInfOWLWriter writer = new ChemInfOWLWriter(output, specs);

  for (IMolecularDescriptor descriptor : descriptors) {
    try {
      DescriptorValue value = descriptor.calculate(mol);
      mol.setProperty(value.getSpecification(), value);
      writer.write(mol);

      String outputString = output.toString();
      System.out.println(outputString);
    } catch (Exception exception) {
      System.err.println "\nFailed to convert to RDF: " + mol.getProperty("ChEBI ID");
    }
  }
  if (i == 1) {
    System.exit(0);
  }
}

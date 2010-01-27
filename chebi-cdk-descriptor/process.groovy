import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.io.iterator.*;
import org.openscience.cdk.nonotify.NoNotificationChemObjectBuilder;
import org.openscience.cdk.qsar.DescriptorValue;
import org.openscience.cdk.qsar.descriptors.molecular.TPSADescriptor;
import org.openscience.cdk.tools.manipulator.*;

import com.google.code.semanticchemistry.cdk.io.ChemInfOWLWriter;

iterator = new IteratingMDLReader(
  new File("ChEBI_complete.sdf").newReader(),
  NoNotificationChemObjectBuilder.getInstance()
)
i = 0
iterator.each { mol ->
  i++
  StringWriter output = new StringWriter();
  ChemInfOWLWriter writer = new ChemInfOWLWriter(output);

  try {
    TPSADescriptor descriptor = new TPSADescriptor();
    DescriptorValue value = descriptor.calculate(mol);
    mol.setProperty(value.getSpecification(), value);
    writer.write(mol);

    String outputString = output.toString();
    System.out.println(outputString);
  } catch (Exception exception) {
    println "\nFailed to convert to RDF: " + mol.getProperty("ChEBI ID");
  }
  if (i == 50) {
    System.exit(0);
  }
}

/**
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.tests;

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Service;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer;
import com.google.inject.Inject;
import java.net.URL;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DSLSyntaxInjectorProvider.class)
@SuppressWarnings("all")
public class DSLSyntaxParsingTest {
  @Inject
  private ParseHelper<Deployment> parseHelper;
  
  @Inject
  private Serializer serializer;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("deployment { ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("of service \"test-service\" { api-version \"1.1\" }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("into container \'test-container\' {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("base-url \'http://teste.com:80/basePath\'");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("description \'Nice description\' ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Deployment result = this.parseHelper.parse(_builder);
      InputOutput.<URL>println(result.getContainer().getBaseUrl());
      InputOutput.<Class<? extends URL>>println(result.getContainer().getBaseUrl().getClass());
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      InputOutput.<String>println(this.serializer.serialize(result));
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  @DisplayName("Serialize the model and reparse it works")
  public void serializeModelAndReparse() {
    try {
      final Deployment deployment = this.sampleDeploymentModel();
      final String serialized = this.serializer.serialize(deployment);
      InputOutput.<String>println(serialized);
      final Deployment roundtrip = this.parseHelper.parse(serialized);
      final EList<Resource.Diagnostic> errors = roundtrip.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder.append(_join);
      Assertions.assertTrue(_isEmpty, _builder.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Deployment sampleDeploymentModel() {
    try {
      final DeploymentModelFactory factory = DeploymentModelPackage.eINSTANCE.getDeploymentModelFactory();
      final Deployment deployment = factory.createDeployment();
      final Service service = factory.createService();
      service.setName("test-service");
      service.setApiVersion("1.0.0");
      deployment.setService(service);
      final ServiceContainer container = factory.createServiceContainer();
      container.setName("host-machine");
      URL _uRL = new URL("http://test.domain:8080/my/service/base/path");
      container.setBaseUrl(_uRL);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("This service provides some functionality that");
      _builder.newLine();
      _builder.append("is of great interest for the user.");
      _builder.newLine();
      container.setDescription(_builder.toString());
      deployment.setContainer(container);
      final Contact contact = factory.createContact();
      contact.setEmail("teste@teste.domain");
      contact.setName("Dr. Test Unicorn");
      URL _uRL_1 = new URL("http://unicorn.com/");
      contact.setUrl(_uRL_1);
      deployment.setContactInformation(contact);
      return deployment;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

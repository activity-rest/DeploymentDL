/*
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.tests

import com.google.inject.Inject
import deploymentmodel.Deployment
import deploymentmodel.DeploymentmodelPackage
import java.net.URL
import org.eclipse.xtext.serializer.impl.Serializer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DSLSyntaxInjectorProvider)
class DSLSyntaxParsingTest {
	
	@Inject	ParseHelper<Deployment> parseHelper
	@Inject Serializer serializer
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			deployment { 
					of service "test-service" { api-version "1.1" }
					into container 'test-container' {
							base-url 'http://teste.com:80/basePath'
							description 'Nice description' 
						}
			}
		''')
		println(result.container.baseUrl)
		println(result.container.baseUrl.class)
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		println(serializer.serialize(result))
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	@DisplayName("Serialize the model and reparse it works")
	def void serializeModelAndReparse() {
		
		val deployment = sampleDeploymentModel()
		
		val serialized = serializer.serialize(deployment)
		println(serialized)	
		val roundtrip = parseHelper.parse(serialized)	
		
		val errors = roundtrip.eResource.errors;
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
	}
	
	def Deployment sampleDeploymentModel() {
		val factory = DeploymentmodelPackage.eINSTANCE.deploymentmodelFactory;
		
		val deployment = factory.createDeployment;
		
		val service = factory.createService
		service.name = "test-service"
		service.apiVersion = "1.0.0"
		deployment.service = service
		
		val container = factory.createServiceContainer
		container.name = "host-machine"
		container.baseUrl = new URL("http://test.domain:8080/my/service/base/path")
		container.description = '''
			This service provides some functionality that
			is of great interest for the user.
		'''
		deployment.container = container
		
		val contact = factory.createContact
		contact.email = "teste@teste.domain"
		contact.name = "Dr. Test Unicorn"
		contact.url = new URL("http://unicorn.com/")
		deployment.contactInformation = contact
		
		return deployment
	} 
}

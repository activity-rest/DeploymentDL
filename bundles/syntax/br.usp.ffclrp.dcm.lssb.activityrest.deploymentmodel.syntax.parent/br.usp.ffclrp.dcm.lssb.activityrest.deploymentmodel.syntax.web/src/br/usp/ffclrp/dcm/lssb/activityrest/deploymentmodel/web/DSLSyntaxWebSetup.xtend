/*
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.web

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntaxRuntimeModule
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntaxStandaloneSetup
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ide.DSLSyntaxIdeModule
import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class DSLSyntaxWebSetup extends DSLSyntaxStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DSLSyntaxRuntimeModule, new DSLSyntaxIdeModule, new DSLSyntaxWebModule))
	}
	
}

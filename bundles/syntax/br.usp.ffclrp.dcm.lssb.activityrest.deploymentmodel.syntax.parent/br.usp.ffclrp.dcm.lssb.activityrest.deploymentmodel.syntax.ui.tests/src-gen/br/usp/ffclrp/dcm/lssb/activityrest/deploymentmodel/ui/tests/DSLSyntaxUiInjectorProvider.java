/*
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ui.tests;

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.syntax.ui.internal.SyntaxActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DSLSyntaxUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SyntaxActivator.getInstance().getInjector("br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntax");
	}

}

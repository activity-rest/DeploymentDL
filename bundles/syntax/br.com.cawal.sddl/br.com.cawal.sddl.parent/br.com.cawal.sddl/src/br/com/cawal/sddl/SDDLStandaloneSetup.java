/*
 * generated by Xtext 2.25.0
 */
package br.com.cawal.sddl;

import br.com.cawal.sddl.SDDLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SDDLStandaloneSetup extends SDDLStandaloneSetupGenerated {

	public static void doSetup() {
		new SDDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
/**
 */
package deploymentmodel;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentmodel.Contact#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link deploymentmodel.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link deploymentmodel.Contact#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see deploymentmodel.DeploymentmodelPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Name</em>' attribute.
	 * @see #setContactName(String)
	 * @see deploymentmodel.DeploymentmodelPackage#getContact_ContactName()
	 * @model
	 * @generated
	 */
	String getContactName();

	/**
	 * Sets the value of the '{@link deploymentmodel.Contact#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Name</em>' attribute.
	 * @see #getContactName()
	 * @generated
	 */
	void setContactName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see deploymentmodel.DeploymentmodelPackage#getContact_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link deploymentmodel.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URL)
	 * @see deploymentmodel.DeploymentmodelPackage#getContact_Url()
	 * @model dataType="deploymentmodel.URL"
	 * @generated
	 */
	URL getUrl();

	/**
	 * Sets the value of the '{@link deploymentmodel.Contact#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URL value);

} // Contact

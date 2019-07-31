/**
 */
package deploymentmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deploymentmodel.DeploymentmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deploymentmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcm.ffclrp.usp.br/lssb/metamodels/deployment-model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentmodelPackage eINSTANCE = deploymentmodel.impl.DeploymentmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link deploymentmodel.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deploymentmodel.impl.DeploymentImpl
	 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CONTACT_INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deploymentmodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deploymentmodel.impl.ServiceImpl
	 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__API_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deploymentmodel.impl.ServiceContainerImpl <em>Service Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deploymentmodel.impl.ServiceContainerImpl
	 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getServiceContainer()
	 * @generated
	 */
	int SERVICE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTAINER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTAINER__BASE_URL = 2;

	/**
	 * The number of structural features of the '<em>Service Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deploymentmodel.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deploymentmodel.impl.ContactImpl
	 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 3;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CONTACT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__URL = 2;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getURL()
	 * @generated
	 */
	int URL = 4;


	/**
	 * Returns the meta object for class '{@link deploymentmodel.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see deploymentmodel.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference '{@link deploymentmodel.Deployment#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see deploymentmodel.Deployment#getService()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Service();

	/**
	 * Returns the meta object for the containment reference '{@link deploymentmodel.Deployment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see deploymentmodel.Deployment#getContainer()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Container();

	/**
	 * Returns the meta object for the containment reference '{@link deploymentmodel.Deployment#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Information</em>'.
	 * @see deploymentmodel.Deployment#getContactInformation()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ContactInformation();

	/**
	 * Returns the meta object for class '{@link deploymentmodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see deploymentmodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deploymentmodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Service#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see deploymentmodel.Service#getApiVersion()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see deploymentmodel.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for class '{@link deploymentmodel.ServiceContainer <em>Service Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Container</em>'.
	 * @see deploymentmodel.ServiceContainer
	 * @generated
	 */
	EClass getServiceContainer();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.ServiceContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deploymentmodel.ServiceContainer#getName()
	 * @see #getServiceContainer()
	 * @generated
	 */
	EAttribute getServiceContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.ServiceContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see deploymentmodel.ServiceContainer#getDescription()
	 * @see #getServiceContainer()
	 * @generated
	 */
	EAttribute getServiceContainer_Description();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.ServiceContainer#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see deploymentmodel.ServiceContainer#getBaseUrl()
	 * @see #getServiceContainer()
	 * @generated
	 */
	EAttribute getServiceContainer_BaseUrl();

	/**
	 * Returns the meta object for class '{@link deploymentmodel.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see deploymentmodel.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Contact#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see deploymentmodel.Contact#getContactName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_ContactName();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see deploymentmodel.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link deploymentmodel.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see deploymentmodel.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Url();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentmodelFactory getDeploymentmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link deploymentmodel.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deploymentmodel.impl.DeploymentImpl
		 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SERVICE = eINSTANCE.getDeployment_Service();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CONTAINER = eINSTANCE.getDeployment_Container();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CONTACT_INFORMATION = eINSTANCE.getDeployment_ContactInformation();

		/**
		 * The meta object literal for the '{@link deploymentmodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deploymentmodel.impl.ServiceImpl
		 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__API_VERSION = eINSTANCE.getService_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '{@link deploymentmodel.impl.ServiceContainerImpl <em>Service Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deploymentmodel.impl.ServiceContainerImpl
		 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getServiceContainer()
		 * @generated
		 */
		EClass SERVICE_CONTAINER = eINSTANCE.getServiceContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTAINER__NAME = eINSTANCE.getServiceContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTAINER__DESCRIPTION = eINSTANCE.getServiceContainer_Description();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTAINER__BASE_URL = eINSTANCE.getServiceContainer_BaseUrl();

		/**
		 * The meta object literal for the '{@link deploymentmodel.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deploymentmodel.impl.ContactImpl
		 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CONTACT_NAME = eINSTANCE.getContact_ContactName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__URL = eINSTANCE.getContact_Url();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see deploymentmodel.impl.DeploymentmodelPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

	}

} //DeploymentmodelPackage

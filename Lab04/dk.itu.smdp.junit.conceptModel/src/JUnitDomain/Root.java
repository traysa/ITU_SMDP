/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Root#getRunners <em>Runners</em>}</li>
 *   <li>{@link JUnitDomain.Root#getClasses <em>Classes</em>}</li>
 *   <li>{@link JUnitDomain.Root#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link JUnitDomain.Root#getSetup <em>Setup</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Runners</b></em>' containment reference list.
	 * The list contents are of type {@link JUnitDomain.Runner}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runners</em>' containment reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getRoot_Runners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Runner> getRunners();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link JUnitDomain.JUClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getRoot_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JUClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link JUnitDomain.JUAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getRoot_Annotations()
	 * @model
	 * @generated
	 */
	EList<JUAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(Setup)
	 * @see JUnitDomain.JUnitDomainPackage#getRoot_Setup()
	 * @model containment="true"
	 * @generated
	 */
	Setup getSetup();

	/**
	 * Sets the value of the '{@link JUnitDomain.Root#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(Setup value);

} // Root

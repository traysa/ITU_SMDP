/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JU Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.JUClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link JUnitDomain.JUClass#getFixture <em>Fixture</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getJUClass()
 * @model
 * @generated
 */
public interface JUClass extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link JUnitDomain.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getJUClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fixture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture</em>' containment reference.
	 * @see #setFixture(Fixture)
	 * @see JUnitDomain.JUnitDomainPackage#getJUClass_Fixture()
	 * @model containment="true"
	 * @generated
	 */
	Fixture getFixture();

	/**
	 * Sets the value of the '{@link JUnitDomain.JUClass#getFixture <em>Fixture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixture</em>' containment reference.
	 * @see #getFixture()
	 * @generated
	 */
	void setFixture(Fixture value);

} // JUClass

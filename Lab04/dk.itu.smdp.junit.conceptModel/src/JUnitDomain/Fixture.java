/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Fixture#getIsUsedBy <em>Is Used By</em>}</li>
 *   <li>{@link JUnitDomain.Fixture#getAfter <em>After</em>}</li>
 *   <li>{@link JUnitDomain.Fixture#getBefore <em>Before</em>}</li>
 *   <li>{@link JUnitDomain.Fixture#getSetUp <em>Set Up</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getFixture()
 * @model annotation="FreeTextConstraint free\040text='The after method is annocated with an After method annotation\n'"
 *        annotation="FreeTextConstraint freeText='Before method must have @Before annotation '"
 * @generated
 */
public interface Fixture extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Used By</b></em>' reference list.
	 * The list contents are of type {@link JUnitDomain.Test}.
	 * It is bidirectional and its opposite is '{@link JUnitDomain.Test#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Used By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Used By</em>' reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getFixture_IsUsedBy()
	 * @see JUnitDomain.Test#getUses
	 * @model opposite="uses"
	 * @generated
	 */
	EList<Test> getIsUsedBy();

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference.
	 * @see #setAfter(Method)
	 * @see JUnitDomain.JUnitDomainPackage#getFixture_After()
	 * @model containment="true"
	 * @generated
	 */
	Method getAfter();

	/**
	 * Sets the value of the '{@link JUnitDomain.Fixture#getAfter <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' containment reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(Method value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' containment reference.
	 * @see #setBefore(Method)
	 * @see JUnitDomain.JUnitDomainPackage#getFixture_Before()
	 * @model containment="true"
	 * @generated
	 */
	Method getBefore();

	/**
	 * Sets the value of the '{@link JUnitDomain.Fixture#getBefore <em>Before</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' containment reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(Method value);

	/**
	 * Returns the value of the '<em><b>Set Up</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Up</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Up</em>' containment reference.
	 * @see #setSetUp(Method)
	 * @see JUnitDomain.JUnitDomainPackage#getFixture_SetUp()
	 * @model containment="true"
	 * @generated
	 */
	Method getSetUp();

	/**
	 * Sets the value of the '{@link JUnitDomain.Fixture#getSetUp <em>Set Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Up</em>' containment reference.
	 * @see #getSetUp()
	 * @generated
	 */
	void setSetUp(Method value);

} // Fixture

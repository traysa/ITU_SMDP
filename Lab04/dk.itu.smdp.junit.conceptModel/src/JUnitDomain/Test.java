/**
 */
package JUnitDomain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Test#getUses <em>Uses</em>}</li>
 *   <li>{@link JUnitDomain.Test#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends Method {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link JUnitDomain.Fixture#getIsUsedBy <em>Is Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Fixture)
	 * @see JUnitDomain.JUnitDomainPackage#getTest_Uses()
	 * @see JUnitDomain.Fixture#getIsUsedBy
	 * @model opposite="isUsedBy"
	 * @generated
	 */
	Fixture getUses();

	/**
	 * Sets the value of the '{@link JUnitDomain.Test#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Fixture value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(JUAssertion)
	 * @see JUnitDomain.JUnitDomainPackage#getTest_Contains()
	 * @model containment="true"
	 * @generated
	 */
	JUAssertion getContains();

	/**
	 * Sets the value of the '{@link JUnitDomain.Test#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(JUAssertion value);

} // Test

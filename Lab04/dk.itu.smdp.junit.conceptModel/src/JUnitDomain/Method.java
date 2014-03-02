/**
 */
package JUnitDomain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Method#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(MethodAnnotation)
	 * @see JUnitDomain.JUnitDomainPackage#getMethod_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	MethodAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link JUnitDomain.Method#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(MethodAnnotation value);

} // Method

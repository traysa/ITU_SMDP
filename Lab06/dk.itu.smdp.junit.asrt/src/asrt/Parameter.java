/**
 */
package asrt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asrt.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see asrt.AsrtPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link asrt.SimpleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see asrt.SimpleTypeEnum
	 * @see #setType(SimpleTypeEnum)
	 * @see asrt.AsrtPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypeEnum getType();

	/**
	 * Sets the value of the '{@link asrt.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see asrt.SimpleTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleTypeEnum value);

} // Parameter

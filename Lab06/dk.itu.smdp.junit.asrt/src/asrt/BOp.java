/**
 */
package asrt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asrt.BOp#getOperator <em>Operator</em>}</li>
 *   <li>{@link asrt.BOp#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link asrt.BOp#getRexpr <em>Rexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see asrt.AsrtPackage#getBOp()
 * @model
 * @generated
 */
public interface BOp extends Exp {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see asrt.AsrtPackage#getBOp_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link asrt.BOp#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Lexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexpr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexpr</em>' containment reference.
	 * @see #setLexpr(Exp)
	 * @see asrt.AsrtPackage#getBOp_Lexpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getLexpr();

	/**
	 * Sets the value of the '{@link asrt.BOp#getLexpr <em>Lexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexpr</em>' containment reference.
	 * @see #getLexpr()
	 * @generated
	 */
	void setLexpr(Exp value);

	/**
	 * Returns the value of the '<em><b>Rexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rexpr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rexpr</em>' containment reference.
	 * @see #setRexpr(Exp)
	 * @see asrt.AsrtPackage#getBOp_Rexpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getRexpr();

	/**
	 * Sets the value of the '{@link asrt.BOp#getRexpr <em>Rexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rexpr</em>' containment reference.
	 * @see #getRexpr()
	 * @generated
	 */
	void setRexpr(Exp value);

} // BOp

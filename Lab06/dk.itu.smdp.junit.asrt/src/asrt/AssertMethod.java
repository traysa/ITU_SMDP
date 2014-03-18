/**
 */
package asrt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asrt.AssertMethod#getParams <em>Params</em>}</li>
 *   <li>{@link asrt.AssertMethod#getBodyExpr <em>Body Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see asrt.AsrtPackage#getAssertMethod()
 * @model
 * @generated
 */
public interface AssertMethod extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link asrt.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see asrt.AsrtPackage#getAssertMethod_Params()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Body Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Expr</em>' containment reference.
	 * @see #setBodyExpr(Exp)
	 * @see asrt.AsrtPackage#getAssertMethod_BodyExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getBodyExpr();

	/**
	 * Sets the value of the '{@link asrt.AssertMethod#getBodyExpr <em>Body Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Expr</em>' containment reference.
	 * @see #getBodyExpr()
	 * @generated
	 */
	void setBodyExpr(Exp value);

} // AssertMethod

/**
 */
package asrt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asrt.FunCall#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see asrt.AsrtPackage#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends NamedElement, Exp {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link asrt.Exp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see asrt.AsrtPackage#getFunCall_Arg()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exp> getArg();

} // FunCall

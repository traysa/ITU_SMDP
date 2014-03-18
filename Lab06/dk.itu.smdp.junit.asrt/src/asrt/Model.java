/**
 */
package asrt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asrt.Model#getAssertMethods <em>Assert Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see asrt.AsrtPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Assert Methods</b></em>' containment reference list.
	 * The list contents are of type {@link asrt.AssertMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert Methods</em>' containment reference list.
	 * @see asrt.AsrtPackage#getModel_AssertMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssertMethod> getAssertMethods();

} // Model

/**
 */
package T4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Printer Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link T4.PrinterPool#getPrinter <em>Printer</em>}</li>
 * </ul>
 * </p>
 *
 * @see T4.T4Package#getPrinterPool()
 * @model
 * @generated
 */
public interface PrinterPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Printer</b></em>' containment reference list.
	 * The list contents are of type {@link T4.Printer}.
	 * It is bidirectional and its opposite is '{@link T4.Printer#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printer</em>' containment reference list.
	 * @see T4.T4Package#getPrinterPool_Printer()
	 * @see T4.Printer#getPool
	 * @model opposite="pool" containment="true" required="true"
	 * @generated
	 */
	EList<Printer> getPrinter();

} // PrinterPool

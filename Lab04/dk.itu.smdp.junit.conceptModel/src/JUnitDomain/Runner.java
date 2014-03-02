/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Runner#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getRunner()
 * @model
 * @generated
 */
public interface Runner extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs</b></em>' reference list.
	 * The list contents are of type {@link JUnitDomain.Suite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getRunner_Runs()
	 * @model required="true"
	 * @generated
	 */
	EList<Suite> getRuns();

} // Runner

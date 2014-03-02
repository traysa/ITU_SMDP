/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.Suite#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getSuite()
 * @model annotation="FreeTextConstraint freeText='the collection of tests have to be a subset of the inherited collection of methods'"
 * @generated
 */
public interface Suite extends JUClass {
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' reference list.
	 * The list contents are of type {@link JUnitDomain.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getSuite_Tests()
	 * @model
	 * @generated
	 */
	EList<Test> getTests();

} // Suite

/**
 */
package JUnitDomain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JUnitDomain.TestAnnotation#getExpectedException <em>Expected Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see JUnitDomain.JUnitDomainPackage#getTestAnnotation()
 * @model
 * @generated
 */
public interface TestAnnotation extends MethodAnnotation {
	/**
	 * Returns the value of the '<em><b>Expected Exception</b></em>' reference list.
	 * The list contents are of type {@link JUnitDomain.JUClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Exception</em>' reference list.
	 * @see JUnitDomain.JUnitDomainPackage#getTestAnnotation_ExpectedException()
	 * @model
	 * @generated
	 */
	EList<JUClass> getExpectedException();

} // TestAnnotation

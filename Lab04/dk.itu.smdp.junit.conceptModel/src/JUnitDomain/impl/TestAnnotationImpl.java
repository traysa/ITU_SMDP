/**
 */
package JUnitDomain.impl;

import JUnitDomain.JUClass;
import JUnitDomain.JUnitDomainPackage;
import JUnitDomain.TestAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JUnitDomain.impl.TestAnnotationImpl#getExpectedException <em>Expected Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestAnnotationImpl extends MethodAnnotationImpl implements TestAnnotation {
	/**
	 * The cached value of the '{@link #getExpectedException() <em>Expected Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedException()
	 * @generated
	 * @ordered
	 */
	protected EList<JUClass> expectedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JUnitDomainPackage.Literals.TEST_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUClass> getExpectedException() {
		if (expectedException == null) {
			expectedException = new EObjectResolvingEList<JUClass>(JUClass.class, this, JUnitDomainPackage.TEST_ANNOTATION__EXPECTED_EXCEPTION);
		}
		return expectedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JUnitDomainPackage.TEST_ANNOTATION__EXPECTED_EXCEPTION:
				return getExpectedException();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JUnitDomainPackage.TEST_ANNOTATION__EXPECTED_EXCEPTION:
				getExpectedException().clear();
				getExpectedException().addAll((Collection<? extends JUClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JUnitDomainPackage.TEST_ANNOTATION__EXPECTED_EXCEPTION:
				getExpectedException().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JUnitDomainPackage.TEST_ANNOTATION__EXPECTED_EXCEPTION:
				return expectedException != null && !expectedException.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestAnnotationImpl

/**
 */
package JUnitDomain.impl;

import JUnitDomain.JUnitDomainPackage;
import JUnitDomain.Runner;
import JUnitDomain.Suite;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JUnitDomain.impl.RunnerImpl#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnerImpl extends MinimalEObjectImpl.Container implements Runner {
	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected EList<Suite> runs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JUnitDomainPackage.Literals.RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Suite> getRuns() {
		if (runs == null) {
			runs = new EObjectResolvingEList<Suite>(Suite.class, this, JUnitDomainPackage.RUNNER__RUNS);
		}
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JUnitDomainPackage.RUNNER__RUNS:
				return getRuns();
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
			case JUnitDomainPackage.RUNNER__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends Suite>)newValue);
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
			case JUnitDomainPackage.RUNNER__RUNS:
				getRuns().clear();
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
			case JUnitDomainPackage.RUNNER__RUNS:
				return runs != null && !runs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RunnerImpl

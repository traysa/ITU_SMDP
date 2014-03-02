/**
 */
package JUnitDomain.impl;

import JUnitDomain.JUAnnotation;
import JUnitDomain.JUClass;
import JUnitDomain.JUnitDomainPackage;
import JUnitDomain.Root;
import JUnitDomain.Runner;
import JUnitDomain.Setup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JUnitDomain.impl.RootImpl#getRunners <em>Runners</em>}</li>
 *   <li>{@link JUnitDomain.impl.RootImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link JUnitDomain.impl.RootImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link JUnitDomain.impl.RootImpl#getSetup <em>Setup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getRunners() <em>Runners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunners()
	 * @generated
	 * @ordered
	 */
	protected EList<Runner> runners;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JUClass> classes;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<JUAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected Setup setup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JUnitDomainPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Runner> getRunners() {
		if (runners == null) {
			runners = new EObjectContainmentEList<Runner>(Runner.class, this, JUnitDomainPackage.ROOT__RUNNERS);
		}
		return runners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<JUClass>(JUClass.class, this, JUnitDomainPackage.ROOT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JUAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<JUAnnotation>(JUAnnotation.class, this, JUnitDomainPackage.ROOT__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(Setup newSetup, NotificationChain msgs) {
		Setup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.ROOT__SETUP, oldSetup, newSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetup(Setup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.ROOT__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.ROOT__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.ROOT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JUnitDomainPackage.ROOT__RUNNERS:
				return ((InternalEList<?>)getRunners()).basicRemove(otherEnd, msgs);
			case JUnitDomainPackage.ROOT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case JUnitDomainPackage.ROOT__SETUP:
				return basicSetSetup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JUnitDomainPackage.ROOT__RUNNERS:
				return getRunners();
			case JUnitDomainPackage.ROOT__CLASSES:
				return getClasses();
			case JUnitDomainPackage.ROOT__ANNOTATIONS:
				return getAnnotations();
			case JUnitDomainPackage.ROOT__SETUP:
				return getSetup();
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
			case JUnitDomainPackage.ROOT__RUNNERS:
				getRunners().clear();
				getRunners().addAll((Collection<? extends Runner>)newValue);
				return;
			case JUnitDomainPackage.ROOT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends JUClass>)newValue);
				return;
			case JUnitDomainPackage.ROOT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends JUAnnotation>)newValue);
				return;
			case JUnitDomainPackage.ROOT__SETUP:
				setSetup((Setup)newValue);
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
			case JUnitDomainPackage.ROOT__RUNNERS:
				getRunners().clear();
				return;
			case JUnitDomainPackage.ROOT__CLASSES:
				getClasses().clear();
				return;
			case JUnitDomainPackage.ROOT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JUnitDomainPackage.ROOT__SETUP:
				setSetup((Setup)null);
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
			case JUnitDomainPackage.ROOT__RUNNERS:
				return runners != null && !runners.isEmpty();
			case JUnitDomainPackage.ROOT__CLASSES:
				return classes != null && !classes.isEmpty();
			case JUnitDomainPackage.ROOT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JUnitDomainPackage.ROOT__SETUP:
				return setup != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl

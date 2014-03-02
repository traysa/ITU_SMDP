/**
 */
package JUnitDomain.impl;

import JUnitDomain.Fixture;
import JUnitDomain.JUnitDomainPackage;
import JUnitDomain.Method;
import JUnitDomain.Test;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JUnitDomain.impl.FixtureImpl#getIsUsedBy <em>Is Used By</em>}</li>
 *   <li>{@link JUnitDomain.impl.FixtureImpl#getAfter <em>After</em>}</li>
 *   <li>{@link JUnitDomain.impl.FixtureImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link JUnitDomain.impl.FixtureImpl#getSetUp <em>Set Up</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixtureImpl extends MinimalEObjectImpl.Container implements Fixture {
	/**
	 * The cached value of the '{@link #getIsUsedBy() <em>Is Used By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUsedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> isUsedBy;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected Method after;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected Method before;

	/**
	 * The cached value of the '{@link #getSetUp() <em>Set Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetUp()
	 * @generated
	 * @ordered
	 */
	protected Method setUp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JUnitDomainPackage.Literals.FIXTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getIsUsedBy() {
		if (isUsedBy == null) {
			isUsedBy = new EObjectWithInverseResolvingEList<Test>(Test.class, this, JUnitDomainPackage.FIXTURE__IS_USED_BY, JUnitDomainPackage.TEST__USES);
		}
		return isUsedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(Method newAfter, NotificationChain msgs) {
		Method oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__AFTER, oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(Method newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__AFTER, null, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__AFTER, null, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__AFTER, newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(Method newBefore, NotificationChain msgs) {
		Method oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__BEFORE, oldBefore, newBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(Method newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__BEFORE, null, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__BEFORE, null, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__BEFORE, newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSetUp() {
		return setUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetUp(Method newSetUp, NotificationChain msgs) {
		Method oldSetUp = setUp;
		setUp = newSetUp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__SET_UP, oldSetUp, newSetUp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetUp(Method newSetUp) {
		if (newSetUp != setUp) {
			NotificationChain msgs = null;
			if (setUp != null)
				msgs = ((InternalEObject)setUp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__SET_UP, null, msgs);
			if (newSetUp != null)
				msgs = ((InternalEObject)newSetUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.FIXTURE__SET_UP, null, msgs);
			msgs = basicSetSetUp(newSetUp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.FIXTURE__SET_UP, newSetUp, newSetUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsUsedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				return ((InternalEList<?>)getIsUsedBy()).basicRemove(otherEnd, msgs);
			case JUnitDomainPackage.FIXTURE__AFTER:
				return basicSetAfter(null, msgs);
			case JUnitDomainPackage.FIXTURE__BEFORE:
				return basicSetBefore(null, msgs);
			case JUnitDomainPackage.FIXTURE__SET_UP:
				return basicSetSetUp(null, msgs);
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
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				return getIsUsedBy();
			case JUnitDomainPackage.FIXTURE__AFTER:
				return getAfter();
			case JUnitDomainPackage.FIXTURE__BEFORE:
				return getBefore();
			case JUnitDomainPackage.FIXTURE__SET_UP:
				return getSetUp();
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
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				getIsUsedBy().clear();
				getIsUsedBy().addAll((Collection<? extends Test>)newValue);
				return;
			case JUnitDomainPackage.FIXTURE__AFTER:
				setAfter((Method)newValue);
				return;
			case JUnitDomainPackage.FIXTURE__BEFORE:
				setBefore((Method)newValue);
				return;
			case JUnitDomainPackage.FIXTURE__SET_UP:
				setSetUp((Method)newValue);
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
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				getIsUsedBy().clear();
				return;
			case JUnitDomainPackage.FIXTURE__AFTER:
				setAfter((Method)null);
				return;
			case JUnitDomainPackage.FIXTURE__BEFORE:
				setBefore((Method)null);
				return;
			case JUnitDomainPackage.FIXTURE__SET_UP:
				setSetUp((Method)null);
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
			case JUnitDomainPackage.FIXTURE__IS_USED_BY:
				return isUsedBy != null && !isUsedBy.isEmpty();
			case JUnitDomainPackage.FIXTURE__AFTER:
				return after != null;
			case JUnitDomainPackage.FIXTURE__BEFORE:
				return before != null;
			case JUnitDomainPackage.FIXTURE__SET_UP:
				return setUp != null;
		}
		return super.eIsSet(featureID);
	}

} //FixtureImpl

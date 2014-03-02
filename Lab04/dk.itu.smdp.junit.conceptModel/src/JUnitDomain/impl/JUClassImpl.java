/**
 */
package JUnitDomain.impl;

import JUnitDomain.Fixture;
import JUnitDomain.JUClass;
import JUnitDomain.JUnitDomainPackage;
import JUnitDomain.Method;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JU Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JUnitDomain.impl.JUClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link JUnitDomain.impl.JUClassImpl#getFixture <em>Fixture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JUClassImpl extends NamedElementImpl implements JUClass {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;
	/**
	 * The cached value of the '{@link #getFixture() <em>Fixture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixture()
	 * @generated
	 * @ordered
	 */
	protected Fixture fixture;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JUClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JUnitDomainPackage.Literals.JU_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, JUnitDomainPackage.JU_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixture(Fixture newFixture, NotificationChain msgs) {
		Fixture oldFixture = fixture;
		fixture = newFixture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.JU_CLASS__FIXTURE, oldFixture, newFixture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixture(Fixture newFixture) {
		if (newFixture != fixture) {
			NotificationChain msgs = null;
			if (fixture != null)
				msgs = ((InternalEObject)fixture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.JU_CLASS__FIXTURE, null, msgs);
			if (newFixture != null)
				msgs = ((InternalEObject)newFixture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JUnitDomainPackage.JU_CLASS__FIXTURE, null, msgs);
			msgs = basicSetFixture(newFixture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JUnitDomainPackage.JU_CLASS__FIXTURE, newFixture, newFixture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JUnitDomainPackage.JU_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JUnitDomainPackage.JU_CLASS__FIXTURE:
				return basicSetFixture(null, msgs);
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
			case JUnitDomainPackage.JU_CLASS__METHODS:
				return getMethods();
			case JUnitDomainPackage.JU_CLASS__FIXTURE:
				return getFixture();
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
			case JUnitDomainPackage.JU_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JUnitDomainPackage.JU_CLASS__FIXTURE:
				setFixture((Fixture)newValue);
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
			case JUnitDomainPackage.JU_CLASS__METHODS:
				getMethods().clear();
				return;
			case JUnitDomainPackage.JU_CLASS__FIXTURE:
				setFixture((Fixture)null);
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
			case JUnitDomainPackage.JU_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case JUnitDomainPackage.JU_CLASS__FIXTURE:
				return fixture != null;
		}
		return super.eIsSet(featureID);
	}

} //JUClassImpl

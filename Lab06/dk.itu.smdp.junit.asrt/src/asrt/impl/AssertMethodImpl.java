/**
 */
package asrt.impl;

import asrt.AsrtPackage;
import asrt.AssertMethod;
import asrt.Exp;
import asrt.Parameter;

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
 * An implementation of the model object '<em><b>Assert Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asrt.impl.AssertMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link asrt.impl.AssertMethodImpl#getBodyExpr <em>Body Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertMethodImpl extends NamedElementImpl implements AssertMethod {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getBodyExpr() <em>Body Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyExpr()
	 * @generated
	 * @ordered
	 */
	protected Exp bodyExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsrtPackage.Literals.ASSERT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, AsrtPackage.ASSERT_METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp getBodyExpr() {
		return bodyExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyExpr(Exp newBodyExpr, NotificationChain msgs) {
		Exp oldBodyExpr = bodyExpr;
		bodyExpr = newBodyExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsrtPackage.ASSERT_METHOD__BODY_EXPR, oldBodyExpr, newBodyExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyExpr(Exp newBodyExpr) {
		if (newBodyExpr != bodyExpr) {
			NotificationChain msgs = null;
			if (bodyExpr != null)
				msgs = ((InternalEObject)bodyExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.ASSERT_METHOD__BODY_EXPR, null, msgs);
			if (newBodyExpr != null)
				msgs = ((InternalEObject)newBodyExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.ASSERT_METHOD__BODY_EXPR, null, msgs);
			msgs = basicSetBodyExpr(newBodyExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsrtPackage.ASSERT_METHOD__BODY_EXPR, newBodyExpr, newBodyExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsrtPackage.ASSERT_METHOD__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case AsrtPackage.ASSERT_METHOD__BODY_EXPR:
				return basicSetBodyExpr(null, msgs);
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
			case AsrtPackage.ASSERT_METHOD__PARAMS:
				return getParams();
			case AsrtPackage.ASSERT_METHOD__BODY_EXPR:
				return getBodyExpr();
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
			case AsrtPackage.ASSERT_METHOD__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AsrtPackage.ASSERT_METHOD__BODY_EXPR:
				setBodyExpr((Exp)newValue);
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
			case AsrtPackage.ASSERT_METHOD__PARAMS:
				getParams().clear();
				return;
			case AsrtPackage.ASSERT_METHOD__BODY_EXPR:
				setBodyExpr((Exp)null);
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
			case AsrtPackage.ASSERT_METHOD__PARAMS:
				return params != null && !params.isEmpty();
			case AsrtPackage.ASSERT_METHOD__BODY_EXPR:
				return bodyExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //AssertMethodImpl

/**
 */
package asrt.impl;

import asrt.AsrtPackage;
import asrt.BOp;
import asrt.Exp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asrt.impl.BOpImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link asrt.impl.BOpImpl#getLexpr <em>Lexpr</em>}</li>
 *   <li>{@link asrt.impl.BOpImpl#getRexpr <em>Rexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOpImpl extends ExpImpl implements BOp {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLexpr() <em>Lexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexpr()
	 * @generated
	 * @ordered
	 */
	protected Exp lexpr;

	/**
	 * The cached value of the '{@link #getRexpr() <em>Rexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRexpr()
	 * @generated
	 * @ordered
	 */
	protected Exp rexpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsrtPackage.Literals.BOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsrtPackage.BOP__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp getLexpr() {
		return lexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLexpr(Exp newLexpr, NotificationChain msgs) {
		Exp oldLexpr = lexpr;
		lexpr = newLexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsrtPackage.BOP__LEXPR, oldLexpr, newLexpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexpr(Exp newLexpr) {
		if (newLexpr != lexpr) {
			NotificationChain msgs = null;
			if (lexpr != null)
				msgs = ((InternalEObject)lexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.BOP__LEXPR, null, msgs);
			if (newLexpr != null)
				msgs = ((InternalEObject)newLexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.BOP__LEXPR, null, msgs);
			msgs = basicSetLexpr(newLexpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsrtPackage.BOP__LEXPR, newLexpr, newLexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp getRexpr() {
		return rexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRexpr(Exp newRexpr, NotificationChain msgs) {
		Exp oldRexpr = rexpr;
		rexpr = newRexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsrtPackage.BOP__REXPR, oldRexpr, newRexpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRexpr(Exp newRexpr) {
		if (newRexpr != rexpr) {
			NotificationChain msgs = null;
			if (rexpr != null)
				msgs = ((InternalEObject)rexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.BOP__REXPR, null, msgs);
			if (newRexpr != null)
				msgs = ((InternalEObject)newRexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsrtPackage.BOP__REXPR, null, msgs);
			msgs = basicSetRexpr(newRexpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsrtPackage.BOP__REXPR, newRexpr, newRexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsrtPackage.BOP__LEXPR:
				return basicSetLexpr(null, msgs);
			case AsrtPackage.BOP__REXPR:
				return basicSetRexpr(null, msgs);
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
			case AsrtPackage.BOP__OPERATOR:
				return getOperator();
			case AsrtPackage.BOP__LEXPR:
				return getLexpr();
			case AsrtPackage.BOP__REXPR:
				return getRexpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AsrtPackage.BOP__OPERATOR:
				setOperator((String)newValue);
				return;
			case AsrtPackage.BOP__LEXPR:
				setLexpr((Exp)newValue);
				return;
			case AsrtPackage.BOP__REXPR:
				setRexpr((Exp)newValue);
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
			case AsrtPackage.BOP__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case AsrtPackage.BOP__LEXPR:
				setLexpr((Exp)null);
				return;
			case AsrtPackage.BOP__REXPR:
				setRexpr((Exp)null);
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
			case AsrtPackage.BOP__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case AsrtPackage.BOP__LEXPR:
				return lexpr != null;
			case AsrtPackage.BOP__REXPR:
				return rexpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BOpImpl

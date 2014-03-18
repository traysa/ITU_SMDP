/**
 */
package asrt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asrt.AsrtFactory
 * @model kind="package"
 * @generated
 */
public interface AsrtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asrt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.itu.dk/people/wasowski/dk.itu.smdp.junit.asrt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smdpjunitasrt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsrtPackage eINSTANCE = asrt.impl.AsrtPackageImpl.init();

	/**
	 * The meta object id for the '{@link asrt.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.NamedElementImpl
	 * @see asrt.impl.AsrtPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asrt.impl.AssertMethodImpl <em>Assert Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.AssertMethodImpl
	 * @see asrt.impl.AsrtPackageImpl#getAssertMethod()
	 * @generated
	 */
	int ASSERT_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_METHOD__PARAMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_METHOD__BODY_EXPR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assert Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assert Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.ParameterImpl
	 * @see asrt.impl.AsrtPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.ExpImpl <em>Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.ExpImpl
	 * @see asrt.impl.AsrtPackageImpl#getExp()
	 * @generated
	 */
	int EXP = 3;

	/**
	 * The number of structural features of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asrt.impl.UOpImpl <em>UOp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.UOpImpl
	 * @see asrt.impl.AsrtPackageImpl#getUOp()
	 * @generated
	 */
	int UOP = 4;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP__EXPR = EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP__OPERATOR = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UOp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UOp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.ConstImpl
	 * @see asrt.impl.AsrtPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 5;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.NULLImpl <em>NULL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.NULLImpl
	 * @see asrt.impl.AsrtPackageImpl#getNULL()
	 * @generated
	 */
	int NULL = 6;

	/**
	 * The number of structural features of the '<em>NULL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = CONST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NULL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OPERATION_COUNT = CONST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.IdImpl
	 * @see asrt.impl.AsrtPackageImpl#getId()
	 * @generated
	 */
	int ID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.BOpImpl <em>BOp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.BOpImpl
	 * @see asrt.impl.AsrtPackageImpl#getBOp()
	 * @generated
	 */
	int BOP = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP__OPERATOR = EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP__LEXPR = EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP__REXPR = EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BOp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BOp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.BOpMethodImpl <em>BOp Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.BOpMethodImpl
	 * @see asrt.impl.AsrtPackageImpl#getBOpMethod()
	 * @generated
	 */
	int BOP_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_METHOD__OPERATOR = BOP__OPERATOR;

	/**
	 * The feature id for the '<em><b>Lexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_METHOD__LEXPR = BOP__LEXPR;

	/**
	 * The feature id for the '<em><b>Rexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_METHOD__REXPR = BOP__REXPR;

	/**
	 * The number of structural features of the '<em>BOp Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_METHOD_FEATURE_COUNT = BOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BOp Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_METHOD_OPERATION_COUNT = BOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.FunCallImpl <em>Fun Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.FunCallImpl
	 * @see asrt.impl.AsrtPackageImpl#getFunCall()
	 * @generated
	 */
	int FUN_CALL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL__ARG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fun Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_CALL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asrt.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.impl.ModelImpl
	 * @see asrt.impl.AsrtPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 11;

	/**
	 * The feature id for the '<em><b>Assert Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ASSERT_METHODS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asrt.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asrt.SimpleTypeEnum
	 * @see asrt.impl.AsrtPackageImpl#getSimpleTypeEnum()
	 * @generated
	 */
	int SIMPLE_TYPE_ENUM = 12;


	/**
	 * Returns the meta object for class '{@link asrt.AssertMethod <em>Assert Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Method</em>'.
	 * @see asrt.AssertMethod
	 * @generated
	 */
	EClass getAssertMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link asrt.AssertMethod#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see asrt.AssertMethod#getParams()
	 * @see #getAssertMethod()
	 * @generated
	 */
	EReference getAssertMethod_Params();

	/**
	 * Returns the meta object for the containment reference '{@link asrt.AssertMethod#getBodyExpr <em>Body Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Expr</em>'.
	 * @see asrt.AssertMethod#getBodyExpr()
	 * @see #getAssertMethod()
	 * @generated
	 */
	EReference getAssertMethod_BodyExpr();

	/**
	 * Returns the meta object for class '{@link asrt.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see asrt.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link asrt.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asrt.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link asrt.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see asrt.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link asrt.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see asrt.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link asrt.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp</em>'.
	 * @see asrt.Exp
	 * @generated
	 */
	EClass getExp();

	/**
	 * Returns the meta object for class '{@link asrt.UOp <em>UOp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UOp</em>'.
	 * @see asrt.UOp
	 * @generated
	 */
	EClass getUOp();

	/**
	 * Returns the meta object for the containment reference '{@link asrt.UOp#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see asrt.UOp#getExpr()
	 * @see #getUOp()
	 * @generated
	 */
	EReference getUOp_Expr();

	/**
	 * Returns the meta object for the attribute '{@link asrt.UOp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see asrt.UOp#getOperator()
	 * @see #getUOp()
	 * @generated
	 */
	EAttribute getUOp_Operator();

	/**
	 * Returns the meta object for class '{@link asrt.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see asrt.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for class '{@link asrt.NULL <em>NULL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NULL</em>'.
	 * @see asrt.NULL
	 * @generated
	 */
	EClass getNULL();

	/**
	 * Returns the meta object for class '{@link asrt.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see asrt.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for class '{@link asrt.BOp <em>BOp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOp</em>'.
	 * @see asrt.BOp
	 * @generated
	 */
	EClass getBOp();

	/**
	 * Returns the meta object for the attribute '{@link asrt.BOp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see asrt.BOp#getOperator()
	 * @see #getBOp()
	 * @generated
	 */
	EAttribute getBOp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link asrt.BOp#getLexpr <em>Lexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lexpr</em>'.
	 * @see asrt.BOp#getLexpr()
	 * @see #getBOp()
	 * @generated
	 */
	EReference getBOp_Lexpr();

	/**
	 * Returns the meta object for the containment reference '{@link asrt.BOp#getRexpr <em>Rexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rexpr</em>'.
	 * @see asrt.BOp#getRexpr()
	 * @see #getBOp()
	 * @generated
	 */
	EReference getBOp_Rexpr();

	/**
	 * Returns the meta object for class '{@link asrt.BOpMethod <em>BOp Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOp Method</em>'.
	 * @see asrt.BOpMethod
	 * @generated
	 */
	EClass getBOpMethod();

	/**
	 * Returns the meta object for class '{@link asrt.FunCall <em>Fun Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun Call</em>'.
	 * @see asrt.FunCall
	 * @generated
	 */
	EClass getFunCall();

	/**
	 * Returns the meta object for the containment reference list '{@link asrt.FunCall#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see asrt.FunCall#getArg()
	 * @see #getFunCall()
	 * @generated
	 */
	EReference getFunCall_Arg();

	/**
	 * Returns the meta object for class '{@link asrt.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see asrt.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link asrt.Model#getAssertMethods <em>Assert Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assert Methods</em>'.
	 * @see asrt.Model#getAssertMethods()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_AssertMethods();

	/**
	 * Returns the meta object for enum '{@link asrt.SimpleTypeEnum <em>Simple Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type Enum</em>'.
	 * @see asrt.SimpleTypeEnum
	 * @generated
	 */
	EEnum getSimpleTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsrtFactory getAsrtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link asrt.impl.AssertMethodImpl <em>Assert Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.AssertMethodImpl
		 * @see asrt.impl.AsrtPackageImpl#getAssertMethod()
		 * @generated
		 */
		EClass ASSERT_METHOD = eINSTANCE.getAssertMethod();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_METHOD__PARAMS = eINSTANCE.getAssertMethod_Params();

		/**
		 * The meta object literal for the '<em><b>Body Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_METHOD__BODY_EXPR = eINSTANCE.getAssertMethod_BodyExpr();

		/**
		 * The meta object literal for the '{@link asrt.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.NamedElementImpl
		 * @see asrt.impl.AsrtPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link asrt.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.ParameterImpl
		 * @see asrt.impl.AsrtPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link asrt.impl.ExpImpl <em>Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.ExpImpl
		 * @see asrt.impl.AsrtPackageImpl#getExp()
		 * @generated
		 */
		EClass EXP = eINSTANCE.getExp();

		/**
		 * The meta object literal for the '{@link asrt.impl.UOpImpl <em>UOp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.UOpImpl
		 * @see asrt.impl.AsrtPackageImpl#getUOp()
		 * @generated
		 */
		EClass UOP = eINSTANCE.getUOp();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOP__EXPR = eINSTANCE.getUOp_Expr();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOP__OPERATOR = eINSTANCE.getUOp_Operator();

		/**
		 * The meta object literal for the '{@link asrt.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.ConstImpl
		 * @see asrt.impl.AsrtPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '{@link asrt.impl.NULLImpl <em>NULL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.NULLImpl
		 * @see asrt.impl.AsrtPackageImpl#getNULL()
		 * @generated
		 */
		EClass NULL = eINSTANCE.getNULL();

		/**
		 * The meta object literal for the '{@link asrt.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.IdImpl
		 * @see asrt.impl.AsrtPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '{@link asrt.impl.BOpImpl <em>BOp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.BOpImpl
		 * @see asrt.impl.AsrtPackageImpl#getBOp()
		 * @generated
		 */
		EClass BOP = eINSTANCE.getBOp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOP__OPERATOR = eINSTANCE.getBOp_Operator();

		/**
		 * The meta object literal for the '<em><b>Lexpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP__LEXPR = eINSTANCE.getBOp_Lexpr();

		/**
		 * The meta object literal for the '<em><b>Rexpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP__REXPR = eINSTANCE.getBOp_Rexpr();

		/**
		 * The meta object literal for the '{@link asrt.impl.BOpMethodImpl <em>BOp Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.BOpMethodImpl
		 * @see asrt.impl.AsrtPackageImpl#getBOpMethod()
		 * @generated
		 */
		EClass BOP_METHOD = eINSTANCE.getBOpMethod();

		/**
		 * The meta object literal for the '{@link asrt.impl.FunCallImpl <em>Fun Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.FunCallImpl
		 * @see asrt.impl.AsrtPackageImpl#getFunCall()
		 * @generated
		 */
		EClass FUN_CALL = eINSTANCE.getFunCall();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN_CALL__ARG = eINSTANCE.getFunCall_Arg();

		/**
		 * The meta object literal for the '{@link asrt.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.impl.ModelImpl
		 * @see asrt.impl.AsrtPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Assert Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ASSERT_METHODS = eINSTANCE.getModel_AssertMethods();

		/**
		 * The meta object literal for the '{@link asrt.SimpleTypeEnum <em>Simple Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asrt.SimpleTypeEnum
		 * @see asrt.impl.AsrtPackageImpl#getSimpleTypeEnum()
		 * @generated
		 */
		EEnum SIMPLE_TYPE_ENUM = eINSTANCE.getSimpleTypeEnum();

	}

} //AsrtPackage

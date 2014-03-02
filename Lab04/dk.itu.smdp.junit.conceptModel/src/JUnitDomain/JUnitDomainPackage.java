/**
 */
package JUnitDomain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see JUnitDomain.JUnitDomainFactory
 * @model kind="package"
 * @generated
 */
public interface JUnitDomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "JUnitDomain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.itu.dk/people/wasowski/dk.itu.smdp.junit.conceptModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smdpjunitdomain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JUnitDomainPackage eINSTANCE = JUnitDomain.impl.JUnitDomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.NamedElementImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 15;

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
	 * The meta object id for the '{@link JUnitDomain.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.MethodImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.TestImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ANNOTATION = METHOD__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__USES = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CONTAINS = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.JUAnnotationImpl <em>JU Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.JUAnnotationImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUAnnotation()
	 * @generated
	 */
	int JU_ANNOTATION = 6;

	/**
	 * The number of structural features of the '<em>JU Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JU Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.ClassAnnotationImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getClassAnnotation()
	 * @generated
	 */
	int CLASS_ANNOTATION = 1;

	/**
	 * The number of structural features of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_FEATURE_COUNT = JU_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ANNOTATION_OPERATION_COUNT = JU_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.JUAssertionImpl <em>JU Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.JUAssertionImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUAssertion()
	 * @generated
	 */
	int JU_ASSERTION = 2;

	/**
	 * The number of structural features of the '<em>JU Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_ASSERTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JU Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_ASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.FixtureImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 3;

	/**
	 * The feature id for the '<em><b>Is Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__IS_USED_BY = 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__AFTER = 1;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__BEFORE = 2;

	/**
	 * The feature id for the '<em><b>Set Up</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__SET_UP = 3;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.SetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.SetupImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getSetup()
	 * @generated
	 */
	int SETUP = 4;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.MethodAnnotationImpl <em>Method Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.MethodAnnotationImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getMethodAnnotation()
	 * @generated
	 */
	int METHOD_ANNOTATION = 7;

	/**
	 * The number of structural features of the '<em>Method Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ANNOTATION_FEATURE_COUNT = JU_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_ANNOTATION_OPERATION_COUNT = JU_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.TestAnnotationImpl <em>Test Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.TestAnnotationImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getTestAnnotation()
	 * @generated
	 */
	int TEST_ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Expected Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANNOTATION__EXPECTED_EXCEPTION = METHOD_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANNOTATION_FEATURE_COUNT = METHOD_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ANNOTATION_OPERATION_COUNT = METHOD_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.BeforeImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 9;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = METHOD_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_OPERATION_COUNT = METHOD_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.AfterImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 10;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = METHOD_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = METHOD_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.JUClassImpl <em>JU Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.JUClassImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUClass()
	 * @generated
	 */
	int JU_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_CLASS__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_CLASS__FIXTURE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JU Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JU Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JU_CLASS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.SuiteImpl <em>Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.SuiteImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getSuite()
	 * @generated
	 */
	int SUITE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__NAME = JU_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__METHODS = JU_CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Fixture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__FIXTURE = JU_CLASS__FIXTURE;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__TESTS = JU_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FEATURE_COUNT = JU_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_OPERATION_COUNT = JU_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JUnitDomain.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.RunnerImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 13;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__RUNS = 0;

	/**
	 * The number of structural features of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link JUnitDomain.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JUnitDomain.impl.RootImpl
	 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 14;

	/**
	 * The feature id for the '<em><b>Runners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__RUNNERS = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SETUP = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link JUnitDomain.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see JUnitDomain.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference '{@link JUnitDomain.Test#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see JUnitDomain.Test#getUses()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Test#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see JUnitDomain.Test#getContains()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Contains();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.ClassAnnotation <em>Class Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Annotation</em>'.
	 * @see JUnitDomain.ClassAnnotation
	 * @generated
	 */
	EClass getClassAnnotation();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.JUAssertion <em>JU Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JU Assertion</em>'.
	 * @see JUnitDomain.JUAssertion
	 * @generated
	 */
	EClass getJUAssertion();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see JUnitDomain.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for the reference list '{@link JUnitDomain.Fixture#getIsUsedBy <em>Is Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Used By</em>'.
	 * @see JUnitDomain.Fixture#getIsUsedBy()
	 * @see #getFixture()
	 * @generated
	 */
	EReference getFixture_IsUsedBy();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Fixture#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see JUnitDomain.Fixture#getAfter()
	 * @see #getFixture()
	 * @generated
	 */
	EReference getFixture_After();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Fixture#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see JUnitDomain.Fixture#getBefore()
	 * @see #getFixture()
	 * @generated
	 */
	EReference getFixture_Before();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Fixture#getSetUp <em>Set Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Up</em>'.
	 * @see JUnitDomain.Fixture#getSetUp()
	 * @see #getFixture()
	 * @generated
	 */
	EReference getFixture_SetUp();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Setup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup</em>'.
	 * @see JUnitDomain.Setup
	 * @generated
	 */
	EClass getSetup();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see JUnitDomain.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Method#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see JUnitDomain.Method#getAnnotation()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Annotation();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.JUAnnotation <em>JU Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JU Annotation</em>'.
	 * @see JUnitDomain.JUAnnotation
	 * @generated
	 */
	EClass getJUAnnotation();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.MethodAnnotation <em>Method Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Annotation</em>'.
	 * @see JUnitDomain.MethodAnnotation
	 * @generated
	 */
	EClass getMethodAnnotation();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.TestAnnotation <em>Test Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Annotation</em>'.
	 * @see JUnitDomain.TestAnnotation
	 * @generated
	 */
	EClass getTestAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link JUnitDomain.TestAnnotation#getExpectedException <em>Expected Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expected Exception</em>'.
	 * @see JUnitDomain.TestAnnotation#getExpectedException()
	 * @see #getTestAnnotation()
	 * @generated
	 */
	EReference getTestAnnotation_ExpectedException();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see JUnitDomain.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see JUnitDomain.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Suite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite</em>'.
	 * @see JUnitDomain.Suite
	 * @generated
	 */
	EClass getSuite();

	/**
	 * Returns the meta object for the reference list '{@link JUnitDomain.Suite#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tests</em>'.
	 * @see JUnitDomain.Suite#getTests()
	 * @see #getSuite()
	 * @generated
	 */
	EReference getSuite_Tests();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.JUClass <em>JU Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JU Class</em>'.
	 * @see JUnitDomain.JUClass
	 * @generated
	 */
	EClass getJUClass();

	/**
	 * Returns the meta object for the containment reference list '{@link JUnitDomain.JUClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see JUnitDomain.JUClass#getMethods()
	 * @see #getJUClass()
	 * @generated
	 */
	EReference getJUClass_Methods();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.JUClass#getFixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixture</em>'.
	 * @see JUnitDomain.JUClass#getFixture()
	 * @see #getJUClass()
	 * @generated
	 */
	EReference getJUClass_Fixture();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see JUnitDomain.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for the reference list '{@link JUnitDomain.Runner#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs</em>'.
	 * @see JUnitDomain.Runner#getRuns()
	 * @see #getRunner()
	 * @generated
	 */
	EReference getRunner_Runs();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see JUnitDomain.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link JUnitDomain.Root#getRunners <em>Runners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runners</em>'.
	 * @see JUnitDomain.Root#getRunners()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Runners();

	/**
	 * Returns the meta object for the containment reference list '{@link JUnitDomain.Root#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see JUnitDomain.Root#getClasses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Classes();

	/**
	 * Returns the meta object for the reference list '{@link JUnitDomain.Root#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see JUnitDomain.Root#getAnnotations()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link JUnitDomain.Root#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setup</em>'.
	 * @see JUnitDomain.Root#getSetup()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Setup();

	/**
	 * Returns the meta object for class '{@link JUnitDomain.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see JUnitDomain.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link JUnitDomain.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see JUnitDomain.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JUnitDomainFactory getJUnitDomainFactory();

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
		 * The meta object literal for the '{@link JUnitDomain.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.TestImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__USES = eINSTANCE.getTest_Uses();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__CONTAINS = eINSTANCE.getTest_Contains();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.ClassAnnotationImpl <em>Class Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.ClassAnnotationImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getClassAnnotation()
		 * @generated
		 */
		EClass CLASS_ANNOTATION = eINSTANCE.getClassAnnotation();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.JUAssertionImpl <em>JU Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.JUAssertionImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUAssertion()
		 * @generated
		 */
		EClass JU_ASSERTION = eINSTANCE.getJUAssertion();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.FixtureImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '<em><b>Is Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE__IS_USED_BY = eINSTANCE.getFixture_IsUsedBy();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE__AFTER = eINSTANCE.getFixture_After();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE__BEFORE = eINSTANCE.getFixture_Before();

		/**
		 * The meta object literal for the '<em><b>Set Up</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE__SET_UP = eINSTANCE.getFixture_SetUp();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.SetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.SetupImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getSetup()
		 * @generated
		 */
		EClass SETUP = eINSTANCE.getSetup();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.MethodImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ANNOTATION = eINSTANCE.getMethod_Annotation();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.JUAnnotationImpl <em>JU Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.JUAnnotationImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUAnnotation()
		 * @generated
		 */
		EClass JU_ANNOTATION = eINSTANCE.getJUAnnotation();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.MethodAnnotationImpl <em>Method Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.MethodAnnotationImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getMethodAnnotation()
		 * @generated
		 */
		EClass METHOD_ANNOTATION = eINSTANCE.getMethodAnnotation();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.TestAnnotationImpl <em>Test Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.TestAnnotationImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getTestAnnotation()
		 * @generated
		 */
		EClass TEST_ANNOTATION = eINSTANCE.getTestAnnotation();

		/**
		 * The meta object literal for the '<em><b>Expected Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_ANNOTATION__EXPECTED_EXCEPTION = eINSTANCE.getTestAnnotation_ExpectedException();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.BeforeImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.AfterImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.SuiteImpl <em>Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.SuiteImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getSuite()
		 * @generated
		 */
		EClass SUITE = eINSTANCE.getSuite();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUITE__TESTS = eINSTANCE.getSuite_Tests();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.JUClassImpl <em>JU Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.JUClassImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getJUClass()
		 * @generated
		 */
		EClass JU_CLASS = eINSTANCE.getJUClass();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JU_CLASS__METHODS = eINSTANCE.getJUClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Fixture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JU_CLASS__FIXTURE = eINSTANCE.getJUClass_Fixture();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.RunnerImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getRunner()
		 * @generated
		 */
		EClass RUNNER = eINSTANCE.getRunner();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNER__RUNS = eINSTANCE.getRunner_Runs();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.RootImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Runners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__RUNNERS = eINSTANCE.getRoot_Runners();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CLASSES = eINSTANCE.getRoot_Classes();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ANNOTATIONS = eINSTANCE.getRoot_Annotations();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SETUP = eINSTANCE.getRoot_Setup();

		/**
		 * The meta object literal for the '{@link JUnitDomain.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JUnitDomain.impl.NamedElementImpl
		 * @see JUnitDomain.impl.JUnitDomainPackageImpl#getNamedElement()
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

	}

} //JUnitDomainPackage

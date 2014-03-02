/**
 */
package JUnitDomain.impl;

import JUnitDomain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JUnitDomainFactoryImpl extends EFactoryImpl implements JUnitDomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JUnitDomainFactory init() {
		try {
			JUnitDomainFactory theJUnitDomainFactory = (JUnitDomainFactory)EPackage.Registry.INSTANCE.getEFactory(JUnitDomainPackage.eNS_URI);
			if (theJUnitDomainFactory != null) {
				return theJUnitDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JUnitDomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUnitDomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JUnitDomainPackage.TEST: return createTest();
			case JUnitDomainPackage.CLASS_ANNOTATION: return createClassAnnotation();
			case JUnitDomainPackage.JU_ASSERTION: return createJUAssertion();
			case JUnitDomainPackage.FIXTURE: return createFixture();
			case JUnitDomainPackage.SETUP: return createSetup();
			case JUnitDomainPackage.METHOD: return createMethod();
			case JUnitDomainPackage.JU_ANNOTATION: return createJUAnnotation();
			case JUnitDomainPackage.METHOD_ANNOTATION: return createMethodAnnotation();
			case JUnitDomainPackage.TEST_ANNOTATION: return createTestAnnotation();
			case JUnitDomainPackage.BEFORE: return createBefore();
			case JUnitDomainPackage.AFTER: return createAfter();
			case JUnitDomainPackage.SUITE: return createSuite();
			case JUnitDomainPackage.JU_CLASS: return createJUClass();
			case JUnitDomainPackage.RUNNER: return createRunner();
			case JUnitDomainPackage.ROOT: return createRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAnnotation createClassAnnotation() {
		ClassAnnotationImpl classAnnotation = new ClassAnnotationImpl();
		return classAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUAssertion createJUAssertion() {
		JUAssertionImpl juAssertion = new JUAssertionImpl();
		return juAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup createSetup() {
		SetupImpl setup = new SetupImpl();
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUAnnotation createJUAnnotation() {
		JUAnnotationImpl juAnnotation = new JUAnnotationImpl();
		return juAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodAnnotation createMethodAnnotation() {
		MethodAnnotationImpl methodAnnotation = new MethodAnnotationImpl();
		return methodAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestAnnotation createTestAnnotation() {
		TestAnnotationImpl testAnnotation = new TestAnnotationImpl();
		return testAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Before createBefore() {
		BeforeImpl before = new BeforeImpl();
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suite createSuite() {
		SuiteImpl suite = new SuiteImpl();
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUClass createJUClass() {
		JUClassImpl juClass = new JUClassImpl();
		return juClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runner createRunner() {
		RunnerImpl runner = new RunnerImpl();
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUnitDomainPackage getJUnitDomainPackage() {
		return (JUnitDomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JUnitDomainPackage getPackage() {
		return JUnitDomainPackage.eINSTANCE;
	}

} //JUnitDomainFactoryImpl

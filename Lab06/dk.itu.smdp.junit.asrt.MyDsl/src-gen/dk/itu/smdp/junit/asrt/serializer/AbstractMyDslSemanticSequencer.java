package dk.itu.smdp.junit.asrt.serializer;

import asrt.AsrtPackage;
import asrt.AssertMethod;
import asrt.BOp;
import asrt.BOpMethod;
import asrt.FunCall;
import asrt.Id;
import asrt.Model;
import asrt.NULL;
import asrt.Parameter;
import asrt.UOp;
import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.junit.asrt.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AsrtPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AsrtPackage.ASSERT_METHOD:
				if(context == grammarAccess.getAssertMethodRule()) {
					sequence_AssertMethod(context, (AssertMethod) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.BOP:
				if(context == grammarAccess.getBOp_ImplRule() ||
				   context == grammarAccess.getExpRule()) {
					sequence_BOp_Impl(context, (BOp) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.BOP_METHOD:
				if(context == grammarAccess.getBOpMethodRule() ||
				   context == grammarAccess.getExpRule()) {
					sequence_BOpMethod(context, (BOpMethod) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.FUN_CALL:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getFunCallRule()) {
					sequence_FunCall(context, (FunCall) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.ID:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getId0Rule()) {
					sequence_Id0(context, (Id) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.NULL:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getNULLRule()) {
					sequence_NULL(context, (NULL) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case AsrtPackage.UOP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getUOpRule()) {
					sequence_UOp(context, (UOp) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString params+=Parameter params+=Parameter* bodyExpr=Exp)
	 */
	protected void sequence_AssertMethod(EObject context, AssertMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=EString lexpr=Exp rexpr=Exp)
	 */
	protected void sequence_BOpMethod(EObject context, BOpMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__LEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__LEXPR));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__REXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__REXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBOpMethodAccess().getOperatorEStringParserRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBOpMethodAccess().getLexprExpParserRuleCall_5_0(), semanticObject.getLexpr());
		feeder.accept(grammarAccess.getBOpMethodAccess().getRexprExpParserRuleCall_7_0(), semanticObject.getRexpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=EString lexpr=Exp rexpr=Exp)
	 */
	protected void sequence_BOp_Impl(EObject context, BOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__LEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__LEXPR));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.BOP__REXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.BOP__REXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBOp_ImplAccess().getOperatorEStringParserRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBOp_ImplAccess().getLexprExpParserRuleCall_5_0(), semanticObject.getLexpr());
		feeder.accept(grammarAccess.getBOp_ImplAccess().getRexprExpParserRuleCall_7_0(), semanticObject.getRexpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (arg+=Exp arg+=Exp*)?)
	 */
	protected void sequence_FunCall(EObject context, FunCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Id0(EObject context, Id semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getId0Access().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((assertMethods+=AssertMethod assertMethods+=AssertMethod*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NULL}
	 */
	protected void sequence_NULL(EObject context, NULL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=SimpleTypeEnum)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeSimpleTypeEnumEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=EString expr=Exp)
	 */
	protected void sequence_UOp(EObject context, UOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.UOP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.UOP__EXPR));
			if(transientValues.isValueTransient(semanticObject, AsrtPackage.Literals.UOP__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsrtPackage.Literals.UOP__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUOpAccess().getOperatorEStringParserRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUOpAccess().getExprExpParserRuleCall_5_0(), semanticObject.getExpr());
		feeder.finish();
	}
}

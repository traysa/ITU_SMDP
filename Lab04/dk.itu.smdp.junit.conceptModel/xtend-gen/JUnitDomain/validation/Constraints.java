/**
 * (c) Andrzej Wąsowski 2014
 * A set of constraints for the FiniteStateMachine example, implemented in Xtend.
 * I avoid EMF integration for constraints on purpose, to keep this simple.
 * IMHO, you should always avoid the EMF integration for constraints, if you do
 * not explicitly need it.  It seems just way to complex.
 */
package JUnitDomain.validation;

import JUnitDomain.After;
import JUnitDomain.Before;
import JUnitDomain.Fixture;
import JUnitDomain.Method;
import JUnitDomain.MethodAnnotation;
import JUnitDomain.Suite;
import JUnitDomain.Test;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Constraints {
  /**
   * To solve the exercise, just replace the "true" constants
   * with suitable expressions and test them with some instance data
   */
  protected static boolean _constraint(final Fixture it) {
    boolean _xblockexpression = false;
    {
      boolean result = true;
      Method _after = it.getAfter();
      boolean _notEquals = (!Objects.equal(_after, null));
      if (_notEquals) {
        Method _after_1 = it.getAfter();
        MethodAnnotation _annotation = _after_1.getAnnotation();
        result = (_annotation instanceof After);
      }
      Method _before = it.getBefore();
      boolean _notEquals_1 = (!Objects.equal(_before, null));
      if (_notEquals_1) {
        Method _before_1 = it.getBefore();
        MethodAnnotation _annotation_1 = _before_1.getAnnotation();
        result = (_annotation_1 instanceof Before);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final Suite it) {
    EList<Method> _methods = it.getMethods();
    EList<Test> _tests = it.getTests();
    return _methods.containsAll(_tests);
  }
  
  /**
   * Fall back for all types that are not constrained
   */
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof Suite) {
      return _constraint((Suite)it);
    } else if (it instanceof Fixture) {
      return _constraint((Fixture)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

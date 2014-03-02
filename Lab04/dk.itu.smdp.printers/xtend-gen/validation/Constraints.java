/**
 * (c) Andrzej Wąsowski 2014
 * Replace true constants (besides the very last one) with solutions
 * to the exercises
 */
package validation;

import T1.Fax;
import T1.Printer;
import T1.PrinterPool;
import T2.Copier;
import T2.Scanner;
import T4.ColorPrinterHead;
import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final PrinterPool it) {
    boolean _and = false;
    boolean _printerIsMandatory = Constraints.printerIsMandatory(it);
    if (!_printerIsMandatory) {
      _and = false;
    } else {
      boolean _faxRequiresAPrinter = Constraints.faxRequiresAPrinter(it);
      _and = _faxRequiresAPrinter;
    }
    return _and;
  }
  
  public static boolean printerIsMandatory(final PrinterPool it) {
    Printer _printer = it.getPrinter();
    return (!Objects.equal(_printer, null));
  }
  
  public static boolean faxRequiresAPrinter(final PrinterPool it) {
    boolean _xifexpression = false;
    Fax _fax = it.getFax();
    boolean _notEquals = (!Objects.equal(_fax, null));
    if (_notEquals) {
      Printer _printer = it.getPrinter();
      _xifexpression = (!Objects.equal(_printer, null));
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  protected static boolean _constraint(final Fax it) {
    boolean _xifexpression = false;
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      PrinterPool _pool = it.getPool();
      Printer _printer = _pool.getPrinter();
      _xifexpression = (!Objects.equal(_printer, null));
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  protected static boolean _constraint(final T2.PrinterPool it) {
    boolean _xblockexpression = false;
    {
      boolean result = true;
      T2.Fax _fax = it.getFax();
      boolean _notEquals = (!Objects.equal(_fax, null));
      if (_notEquals) {
        T2.Printer _printer = it.getPrinter();
        boolean _notEquals_1 = (!Objects.equal(_printer, null));
        result = _notEquals_1;
      }
      Copier _copier = it.getCopier();
      boolean _notEquals_2 = (!Objects.equal(_copier, null));
      if (_notEquals_2) {
        boolean _and = false;
        T2.Printer _printer_1 = it.getPrinter();
        boolean _notEquals_3 = (!Objects.equal(_printer_1, null));
        if (!_notEquals_3) {
          _and = false;
        } else {
          Scanner _scanner = it.getScanner();
          boolean _notEquals_4 = (!Objects.equal(_scanner, null));
          _and = _notEquals_4;
        }
        result = _and;
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected static boolean _constraint(final T3.PrinterPool it) {
    int _speed = it.getSpeed();
    int _minus = (_speed - 300);
    int _minSpeed = it.getMinSpeed();
    return (_minus < _minSpeed);
  }
  
  protected static boolean _constraint(final T4.Printer it) {
    boolean _xifexpression = false;
    boolean _isColor = it.isColor();
    if (_isColor) {
      ColorPrinterHead _head = it.getHead();
      _xifexpression = (!Objects.equal(_head, null));
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  protected static boolean _constraint(final T5.PrinterPool it) {
    boolean _xifexpression = false;
    boolean _isColor = it.isColor();
    if (_isColor) {
      EList<T5.Printer> _printer = it.getPrinter();
      final Function1<T5.Printer,Boolean> _function = new Function1<T5.Printer,Boolean>() {
        public Boolean apply(final T5.Printer it) {
          return Boolean.valueOf(it.isColor());
        }
      };
      _xifexpression = IterableExtensions.<T5.Printer>exists(_printer, _function);
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  protected static boolean _constraint(final T6.PrinterPool it) {
    EList<T6.Printer> _printer = it.getPrinter();
    final Function1<T6.Printer,Boolean> _function = new Function1<T6.Printer,Boolean>() {
      public Boolean apply(final T6.Printer it) {
        return Boolean.valueOf(it.isColor());
      }
    };
    return IterableExtensions.<T6.Printer>exists(_printer, _function);
  }
  
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof Fax) {
      return _constraint((Fax)it);
    } else if (it instanceof PrinterPool) {
      return _constraint((PrinterPool)it);
    } else if (it instanceof T2.PrinterPool) {
      return _constraint((T2.PrinterPool)it);
    } else if (it instanceof T3.PrinterPool) {
      return _constraint((T3.PrinterPool)it);
    } else if (it instanceof T4.Printer) {
      return _constraint((T4.Printer)it);
    } else if (it instanceof T5.PrinterPool) {
      return _constraint((T5.PrinterPool)it);
    } else if (it instanceof T6.PrinterPool) {
      return _constraint((T6.PrinterPool)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

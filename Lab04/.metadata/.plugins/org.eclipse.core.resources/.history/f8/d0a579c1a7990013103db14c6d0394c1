/* (c) Andrzej Wąsowski 2014
 * Replace true constants (besides the very last one) with solutions 
 * to the exercises
 */
package validation

import org.eclipse.emf.ecore.EObject

class Constraints {

	// Constraints for the Printer Pool
	
	def static dispatch constraint(T1.PrinterPool it) {
		printerIsMandatory && 
		faxRequiresAPrinter
	}

	def static printerIsMandatory(T1.PrinterPool it) { // example
		(printer != null)
	} 

	def static faxRequiresAPrinter(T1.PrinterPool it) { // task 1.1
		if (fax != null)
			printer != null
		else
			true
	} 

	def static dispatch constraint (T1.Fax it) { // task 1.2
		if (it != null)
			pool.printer != null
		else
			true
	} 
	
	
	
	// Constraints for the T2 instances
	// Each Printer pool with a fax, must have a printer, 
	// and each printer pool with a copier must have a scanner and a printer.
	
	def static dispatch constraint (T2.PrinterPool it) { // task 1.3
		var result = true
		if (fax != null)
			result = (printer != null)
		if (copier != null)
			result = (printer != null && scanner != null)
		result
	}
	
	

	// Constraints for the instances of T3
	// PrinterPool’s minimum speed must be 300 lower than its regular speed.
	def static dispatch constraint (T3.PrinterPool it) { // task 1.4
		(speed - 300 < minSpeed) 
	}

	// Constraints for the instances of T4
	// Every color printer has a colorPrinterHead.
	def static dispatch constraint (T4.Printer it) { // task 1.5
		if (color)
			(head != null) 
		else
			true
	}

	// Constraints for the instances of T5
	// A color-capable printer pool contains at least one 
	// color-capable printer.
	def static dispatch constraint (T5.PrinterPool it) { // task 1.6
		if (color)
			printer.exists[color]
		else
			true
	}
	
	// Constraints for the instances of T6
	def static dispatch constraint (T6.PrinterPool it) { 
		// If a Printer pool contains a color scanner, 
		// then it must contain a color printer.
		// task 1.7
		/*if (scanner.exists[color])
			printer.exists[color]
		else
			true
		&& 
		// If a printer pool contains a color scanner, then all 
		// its printers must be color printers.
		// task 1.8
		if (scanner.exists[color])
			printer.forall[color]
		else
			true
		&&*/
		// There is at most one color printer in any pool
		// task 1.9
		printer.exists[color]
	}
	

	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
}

/*
 * generated by Xtext
 */
package dk.itu.smdp.junit.asrt.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMyDsl2Validator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.itu.dk/people/wasowski/dk.itu.smdp.junit.asrt"));
		return result;
	}
}
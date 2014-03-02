/**
 * (c) Andrzej Wąsowski 2014
 * This file allows running the constraint checker on an instance file as
 * a standalone Java application. Just run it as Java application in Eclipse.
 */
package validation;

import T1.T1Package;
import T2.T2Package;
import T3.T3Package;
import T4.T4Package;
import T5.T5Package;
import T6.T6Package;
import java.util.Map;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import validation.Constraints;

@SuppressWarnings("all")
public class Main {
  private final static String instanceFileName = "test-files/PrinterPoolT6.xmi";
  
  public static void main(final String[] args) {
    Map<String,Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    T1Package.eINSTANCE.eClass();
    T2Package.eINSTANCE.eClass();
    T3Package.eINSTANCE.eClass();
    T4Package.eINSTANCE.eClass();
    T5Package.eINSTANCE.eClass();
    T6Package.eINSTANCE.eClass();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final URI uri = URI.createURI(Main.instanceFileName);
    final Resource resource = resourceSet.getResource(uri, true);
    TreeIterator<EObject> _allProperContents = EcoreUtil.<EObject>getAllProperContents(resource, false);
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
      public Boolean apply(final EObject it) {
        return Boolean.valueOf(Constraints.constraint(it));
      }
    };
    boolean _forall = IteratorExtensions.<EObject>forall(_allProperContents, _function);
    if (_forall) {
      InputOutput.<String>println("All constraints are satisfied!");
    } else {
      InputOutput.<String>println("Some constraint is violated");
    }
  }
}

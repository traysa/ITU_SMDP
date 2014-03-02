/* (c) Andrzej Wąsowski 2014
 * This file allows running the constraint checker on an instance file as
 * a standalone Java application. Just run it as Java application in Eclipse.
 */
package validation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class Main {

	val static instanceFileName = "test-files/PrinterPoolT6.xmi"  	// <-- change input file name here
															// path is relative to project root
	
	def static void main(String[] args) {

		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		// register our meta-model packages (we have quite a few in this exercise)
		T1.T1Package.eINSTANCE.eClass()
		T2.T2Package.eINSTANCE.eClass()
		T3.T3Package.eINSTANCE.eClass()
		T4.T4Package.eINSTANCE.eClass()
		T5.T5Package.eINSTANCE.eClass()
		T6.T6Package.eINSTANCE.eClass()
				
		// load the file 
		val resourceSet = new ResourceSetImpl

		// change file name here to try other files
		val uri = URI::createURI(instanceFileName)
		val resource = resourceSet.getResource(uri, true)

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall[Constraints.constraint(it)])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}
}
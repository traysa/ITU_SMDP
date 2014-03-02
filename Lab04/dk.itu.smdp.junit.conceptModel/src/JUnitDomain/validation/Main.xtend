/* (c) Andrzej Wąsowski 2014
 * This file allows running the constraint checker on an instance file as
 * a standalone Java application. Just run it as Java application in Eclipse.
 */
package JUnitDomain.validation

import JUnitDomain.JUnitDomainPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class Main {

	static val filename = "test-files/test-01.xmi"
	static val fileExtension = "xmi"

	def static void main(String[] args) {

		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(fileExtension, new XMIResourceFactoryImpl)

		// register our meta-model package
		JUnitDomainPackage.eINSTANCE.eClass()

		// load the file 
		val resourceSet = new ResourceSetImpl

		// change file name here to try other files
		val uri = URI::createURI(filename)
		val resource = resourceSet.getResource(uri, true)

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall [Constraints.constraint(it)])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}
}

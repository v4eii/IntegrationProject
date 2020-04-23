package ru.neoflex.ejb.jaxws;

import commonj.sdo.DataObject;
import ru.neoflex.ejb.LoggerLocal;
import com.ibm.websphere.sca.ServiceManager;

public class EJBProxyImpl {
	/**
	 * Default constructor.
	 */
	public EJBProxyImpl() {
		super();
	}

	/**
	 * Return a reference to the component service instance for this implementation
	 * class.  This method should be used when passing this service to a partner reference
	 * or if you want to invoke this component service asynchronously.    
	 *
	 * @generated (com.ibm.wbit.java)
	 */
	@SuppressWarnings("unused")
	private Object getMyService() {
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	/**
	 * This method is used to locate the service for the reference
	 * named "Партнер_LoggerLocal".  This will return an instance of
	 * {@link LoggerLocal}.  If you would like to use this service 
	 * asynchronously then you will need to cast the result
	 * to {@link LoggerLocalAsync}.
	 *
	 * @generated (com.ibm.wbit.java)
	 *
	 * @return LoggerLocal
	 */
	private LoggerLocal _Партнер_LoggerLocal = null;

	public LoggerLocal locateService_Партнер_LoggerLocal() {
		if (_Партнер_LoggerLocal == null) {
			_Партнер_LoggerLocal = (LoggerLocal) ServiceManager.INSTANCE
					.locateService("Партнер_LoggerLocal");
		}
		return _Партнер_LoggerLocal;
	}

	/**
	 * Method generated to support implementation of operation "log" defined for WSDL port type 
	 * named "EJBProxyImpl".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public void log(DataObject input1) {
		// To create a DataObject, use the creation methods on the BOFactory:
		// com.ibm.websphere.bo.BOFactory boFactory = (com.ibm.websphere.bo.BOFactory) ServiceManager.INSTANCE.locateService("com/ibm/websphere/bo/BOFactory");
		//
		// To get or set attributes for a DataObject such as input1, use the APIs as shown below:
		// To set a string attribute in input1, use input1.setString(stringAttributeName, stringValue)
		// To get a string attribute in input1, use input1.getString(stringAttributeName)
		// To set a dataObject attribute in input1, use input1.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in input1, use input1.getDataObject(stringAttributeName)
	}

}
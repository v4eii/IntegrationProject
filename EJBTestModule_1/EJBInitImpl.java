
import java.io.ByteArrayOutputStream;

import commonj.sdo.DataObject;
import ru.neoflex.ejb.LoggerLocal;

import com.ibm.websphere.bo.BOXMLSerializer;
import com.ibm.websphere.sca.ServiceManager;

public class EJBInitImpl {
	/**
	 * Default constructor.
	 */
	public EJBInitImpl() {
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
		BOXMLSerializer serializer = (BOXMLSerializer) new ServiceManager().locateService("com/ibm/websphere/bo/BOXMLSerializer");
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			serializer.writeDataObject(input1, input1.getType().getURI(), input1.getType().getName(), outputStream);
			String xml = outputStream.toString("UTF-8");
			locateService_Партнер_LoggerLocal().log(xml);
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
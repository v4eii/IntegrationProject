package ru.neoflex.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Logger
 */
@Stateless
@LocalBean
public class Logger implements LoggerRemote, LoggerLocal {

    /**
     * Default constructor. 
     */
    public Logger() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void log(String dataObject) {
		System.out.println("DataObject: " + dataObject);
	}

}

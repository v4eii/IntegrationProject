package ru.neoflex.ejb;

import javax.ejb.Local;

@Local
public interface LoggerLocal {
	public void log(String dataObject);
}

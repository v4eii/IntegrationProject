package ru.neoflex;

import java.math.BigDecimal;

public class DataConverter {

	/**
	 * Sample method that can be called from a Mapping Custom Java transform.
	 * The content of this method provides the implementation for the Custom Java transform.
	 */
	public static BigDecimal sampleTransform(Integer price) {
		return new BigDecimal(price);
		
	}

}

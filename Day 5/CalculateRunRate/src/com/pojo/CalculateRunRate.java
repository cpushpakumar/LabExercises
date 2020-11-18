package com.pojo;

public class CalculateRunRate {
	public double runrate(double runscored, double totaloverfaced) throws Exception {
		if ( totaloverfaced < 0) {
			throw new Exception("NumberFormatException");
		}
		return runscored / totaloverfaced;

	}

}

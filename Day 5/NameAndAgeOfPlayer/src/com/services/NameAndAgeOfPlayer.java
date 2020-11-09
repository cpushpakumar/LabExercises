package com.services;

public class NameAndAgeOfPlayer {
	public int eligibleToParticipate(String x, int y) throws Exception {
		/*if(y>18) {
			return y;
		}*/
		if (y < 18) {
			throw new Exception("InvalidAgeRangeException");
		}
		return 0;

	}

}

/*2 In the previous program remove the try{}catch(){} block surrounding the sleep method and try to execute the code. What is your observation?
*/
/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import com.pojo.ThreadSleepTimeWithoutTryCatch;

public class ThreadSleepTimeWithoutTryCatchMain {

	public static void main(String[] args) {
		ThreadSleepTimeWithoutTryCatch threadtime = new ThreadSleepTimeWithoutTryCatch("MyThread");
		threadtime.start();
	}
}

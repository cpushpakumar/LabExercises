/*Write a program to assign the current thread to t1. Change the name of the thread to MyThread. Display the changed name of the thread. Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again.
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import com.pojo.ThreadSleepTime;

public class ThreadSleepTimeMain {

	public static void main(String args[]) {
		ThreadSleepTime threadtime = new ThreadSleepTime("MyThread");
		threadtime.start();
	}
}

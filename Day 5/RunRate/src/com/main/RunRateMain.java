package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

import com.services.RunRate;

public class RunRateMain {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter runs scored:");
		int runs=br.read();
		BufferedReader b=new BufferedReader(r);
		try {
			System.out.println("Enter overs played :");
			int overs=b.read();
			RunRate usingbufferreader=new RunRate();
			int run=usingbufferreader.usingBufferReader(runs,overs);
			System.out.println("Current Run Rate :"+run);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}

}

package com.codinginterviewprep.slidingwindow;

import java.util.Arrays;

public class RunningAverageSlidingWindow {
	
	public static void main(String[] args) {
		RunningAverageSlidingWindow avg = new RunningAverageSlidingWindow();
		int[] input = {3, 4, 5, 6, 7, 8, 9, 10, 11};
		int K = 3;
		
		System.out.println(Arrays.toString(findAverage(input, K)));
	}
	
	//[3, 4, 5, 6, 7, 8, 9, 10, 11]
	public static double[] findAverage(int[] input, int K) {
		
		
		double[] result = new double[input.length - K + 1];
		int windowStart = 0;
		double sum = 0;
		for(int windowEnd = 0; windowEnd < input.length; windowEnd++) {
			sum += input[windowEnd];
			if(windowEnd >= K - 1) {
				result[windowStart] = sum/K;
				sum -= input[windowStart];
				windowStart++;
			}
		}
		return result;
	}

}

package com.codinginterviewprep.slidingwindow;

public class BruteForceRunningAverage {
	
	
	
	public double[] tofindRunningAverage(int K, int[] input) {
		
		double[] runningAverage = new double[input.length - K + 1];
		for(int i = 0; i < input.length - K ; i++) {
			
			double sum = 0;
			for(int j = i; j < i+K; j++) {
				sum += input[j];
			}
			runningAverage[i] = sum/K;
		}

		return runningAverage;
	}

}

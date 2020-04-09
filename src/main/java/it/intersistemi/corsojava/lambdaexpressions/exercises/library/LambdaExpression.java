package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

import java.util.Arrays;

public class LambdaExpression {

	public LambdaExpression() {
	}

	public static void main(String[] args) {
		 String [] arrayString = new String [8];
		 arrayString [0] = "casa";
		 arrayString [1] = "rasa";
		 arrayString [2] = "basale";
		 arrayString [3] = "cwasaogwgolh";
		 arrayString [4] = "lasaw";
		 arrayString [5] = "qasaww";
		 arrayString [6] = "pasawww";
		 arrayString [7] = "zaasawwww";
		 Arrays.sort(arrayString);
		 for(int index = 0; index < arrayString.length; index++){
		 	System.out.println(arrayString[index]);
		 }
	};
}

	
	
	


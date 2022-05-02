package com.callor.school.exec;

public class ExecV2 {

	public static void main(String[] args) {
		int korSum = 0;
		int engSum = 0;
		int MathSum = 0;
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intSum = new int[5];
		for (int i = 0; i < intKor.length; i++) {
			int iKor = (int) (Math.random() * 100) + 1;
			int iEng = (int) (Math.random() * 100) + 1;
			int iMath = (int) (Math.random() * 100) + 1;

			int iSum = iKor + iEng + iMath;
			intKor[i] = iKor;
			intEng[i] = iEng;
			intMath[i] = iMath;
			intSum[i] = iSum;

		}
		for (int i = 0; i < intKor.length; i++) {
			for (int j = i + 1; j < intKor.length; j++) {
				if (intKor[i] > intKor[j]) {
					int _t = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t;
					_t = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _t;
					_t = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _t;
				}

			}
		}
		for (int i = 0 ; i < 5 ; i++) {
			int kor = intKor[i];
			korSum += kor;
			int eng = intEng[i];
			engSum += eng;
			System.out.printf("%d\t", kor);
			System.out.printf("%d\t", eng);
		}
		System.out.println(korSum);
		
		System.out.println(engSum);
		for (int numMath : intMath) {
			MathSum += numMath;
			System.out.printf("%d\t", numMath);
		}
		System.out.println(MathSum);

	}
}

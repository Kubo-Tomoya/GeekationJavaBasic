package basicsyntax;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num1 = 10;
	    int num2 = 5;

	    int addUpResult = Calculation.addUp(num1, num2);
	    int subtractResult = Calculation.subtract(num1, num2);
	    int multiplyResult = Calculation.multiply(num1, num2);
	    int divideResult = Calculation.divide(num1, num2);

	    System.out.println("足し算の計算結果は" + addUpResult + "です。");
	    System.out.println("引き算の計算結果は" + subtractResult + "です。");
	    System.out.println("掛け算の計算結果は" + multiplyResult + "です。");
	    System.out.println("割り算の計算結果は" + divideResult + "です。");
	  }

	}



package basicsyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a =10;
		int b =5 ;
		
		//メソッド１足し算
		int sum =tashi(a,b);
		allresult(sum);
		//メソッド２引き算
		int difference =hiki(a,b);
		allresult(difference);
		//メソッド３掛け算
		int product =kake(a,b);
		allresult(product);
		//メソッド４割り算
		int quotient =wari(a,b);
		allresult(quotient);
	}
	
	public static int tashi(int x ,int y) {
		
		return x + y;
		
	}
	public static int hiki(int x,int y) {
		
		return x - y;

	}
	public static int kake(int x,int y) {
		
		return x * y;
	}
	public static int wari(int x,int y) {
		
		if(y != 0) {
			return x / y ;
		}else {
			System.out.println("0で割ることはできません");
			return 0;
		}
	}
	public static void allresult(int result) {
		System.out.println("計算結果は"+ result +"です");
	}

}

package basicsyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//要件１の実装
		int a=10;
		int b=5;
		
		boolean hikaku1=(a>b);
		
		System.out.println(hikaku1);
		
		
		//要件2の実装
		boolean isSunny=true;
		boolean isWarm=true;
		
		boolean result1=isSunny && isWarm;
		
		System.out.println(result1);
		
		//要件3の実装
		int x=2;
		int y=4;
		
		boolean result2=(x>=0) && (y%2==0);
		
		System.out.println(result2);
		
		//要件4の実装
		boolean hasPermission = !(a<b);
		System.out.println(hasPermission);	}

}

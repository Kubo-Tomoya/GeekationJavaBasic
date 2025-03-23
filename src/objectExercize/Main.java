package objectExercize;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Property apartment=new Apartment("いい感じアパートメント","山田マンション太郎",50000000,"マンション","3LDK");
		Property land =new Land("いい感じの土地","山田土地太郎",8000000,"土地",105.2);
		
		//出力コード
		
		System.out.println("==============================");
		apartment.printproperty();
		System.out.println("==============================");
		System.out.println("==============================");
		land.printproperty();
		System.out.println("==============================");
		
		

	}

}

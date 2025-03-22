package objectPractice;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Geekdam geekdam=new Geekdam("Geek","太郎");
		
		System.out.println(geekdam.getLastName());
		System.out.println(geekdam.getFirstName());
		
		geekdam.setLastName("Geekation");
		geekdam.setFirstName("次郎");
		
		System.out.println(geekdam.getLastName());
		System.out.println(geekdam.getFirstName());

	}

}

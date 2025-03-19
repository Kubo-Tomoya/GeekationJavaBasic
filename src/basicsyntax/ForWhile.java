package basicsyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//要件1を実装
		for(int i = 1; i<=100; i++) {
			if(i%3==0 && 1%5==0) {
				System.out.println("FizzBizz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			} else if(i%5==0) {
				System.out.println("Bizz");
			} else {
				System.out.println(i);
			}
		}
		
		//要件2を実装
		String[] names= {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		
		for(String name:names) {
			if(name.equals("Java")) {
				System.out.println("現在学習中の言語はJavaです");
			continue;
			}
			if(name.equals("HTML")) {
				System.out.println("HTMLはプログラミング言語ではありません");
				break;
			}
			System.out.println(name);
		}

	}

}



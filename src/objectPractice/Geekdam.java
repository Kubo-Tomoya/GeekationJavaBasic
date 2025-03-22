package objectPractice;

public class Geekdam {
	
	
	//フィールドはprivate
	private String lastName;
	private String firstName;
	
	Geekdam(String lastName,String firstName){
		this.lastName=lastName;
		this.firstName=firstName;
	}
	//lastNameのゲッター
	public String getLastName() {
		return this.lastName;
	}
	//firstNameのゲッター
	public String getFirstName() {
		return this.firstName;
	}
	//lastNameのセッター
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	
	}
}

package objectExercize;

public class Apartment extends Property{
	
	private String layout;
	
	//コンストラクタ
	public Apartment(String name,String owner,int price,String type,String layout) {
		
		super(name,owner,price,type);
		this.layout=layout;
		
	}
	
	// ゲッターとセッター
    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
    
    //オーバーライド
    public void printproperty() {
    	super.printproperty();
    	System.out.println("間取り："+layout);
    }

}

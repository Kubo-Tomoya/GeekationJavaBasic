package objectExercize;

public class Property {
	
	private String name;
	private String owner;
	private int price;
	private String type;
	
	//コンストラクタ
	public Property(String name,String owner,int price,String type) {
		
		this.name=name;
		this.owner=owner;
		this.price=price;
		this.type=type;
		
	}
	//ゲッターとセッター
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	
    public void printproperty() {
    	System.out.println("物件名："+name);
    	System.out.println("物件所有者名："+owner);
    	System.out.println("物件種別："+type);
    	System.out.println("物件価格："+price+"円");
    }

}

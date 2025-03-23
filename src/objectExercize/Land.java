package objectExercize;

public class Land extends Property{
	
	private double area;
	
	//コンストラクタ
	public Land(String name,String owner,int price,String type,double area) {
		super(name,owner,price,type);
		this.area=area;
	}
	// ゲッターとセッター
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    //オーバーライド
    public void printproperty() {
    	super.printproperty();
    	System.out.println("広さ："+area+"m²");
    }

}

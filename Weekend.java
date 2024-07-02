public class Weekend{
    public static final float gst = 0.18f;
	
	public static void getgst(int price){
		double totalprice = (price+(gst*price));
		System.out.println("the total price is: "+totalprice);
	}
	
	public static void cloths(){
			String name = "western";
			String brand = "zara";
			System.out.println("name: "+name+" brand: "+brand);
	}
}
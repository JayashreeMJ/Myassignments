package week1day1;

public class Mobile {

	public static void makecall () {
	String mobilemodel="iphone";
	Float mobileweight= 172.f;
	System.out.println(mobilemodel);
	System.out.println(mobileweight);
	
}

   public static void sendmessage () {
	boolean fullycharged= true;
	int mobilecost= 80000;
	System.out.println(fullycharged);
	System.out.println(mobilecost);
	
}

public static void main(String[] args) {
	Mobile details = new Mobile();
	details.makecall();
	details.sendmessage();
	System.out.println("This is my mobile");

}
}
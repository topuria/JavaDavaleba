package demo3;

public class SmartPhone<T> {
	T t;

	public static <T> void printSmartPhones(Iphone iphone){
		System.out.println(iphone.toString());
	}
	public void touchScreen(){
		System.out.println("TouchScreen");
	}
}

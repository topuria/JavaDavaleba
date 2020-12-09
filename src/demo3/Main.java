package demo3;

public class Main {
	public static void main(String[] args) {
		Iphone iphoneX = new Iphone("Iphone X");
		iphoneX.touchScreen();
		SmartPhone.printSmartPhones(iphoneX);
		System.out.println(iphoneX.toString());
		System.out.println("==================");
		Nokia nokia = new Nokia("Lumia");
		nokia.keyBoard();
		Nokia.printSimbian(nokia);
		System.out.println(nokia.toString());
	}


}

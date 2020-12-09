package demo3;

public class Iphone extends SmartPhone<String> {
	private final String title;

	public Iphone(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "IphoneX{" +
				"title='" + title + '\'' +
				'}';
	}
}

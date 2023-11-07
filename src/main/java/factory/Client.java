package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIFactory uiFactory = UIFactoryFactory.createUIFactory(SupportedPlatform.IOS);
		uiFactory.createButton();
		uiFactory.createDropdown();
		uiFactory.createMenu();
	}

}

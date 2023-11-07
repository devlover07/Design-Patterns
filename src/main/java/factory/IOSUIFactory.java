package factory;

import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.dropdown.Dropdown;
import factory.components.dropdown.IOSDropdown;
import factory.components.menu.IOSMenu;
import factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new IOSMenu();
	}

	public Button createButton() {
		// TODO Auto-generated method stub
		return new IOSButton();
	}

	public Dropdown createDropdown() {
		// TODO Auto-generated method stub
		return new IOSDropdown();
	}

}

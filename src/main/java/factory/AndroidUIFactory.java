package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.dropdown.AndroidDropdown;
import factory.components.dropdown.Dropdown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;



public class AndroidUIFactory implements UIFactory {

	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new AndroidMenu();
	}

	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	public Dropdown createDropdown() {
		// TODO Auto-generated method stub
		return new AndroidDropdown();
	}

}

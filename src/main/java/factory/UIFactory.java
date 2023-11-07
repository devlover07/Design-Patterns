package factory;

import factory.components.button.Button;
import factory.components.dropdown.Dropdown;
import factory.components.menu.Menu;

public interface UIFactory {
	public Menu createMenu();
	public Button createButton();
	public Dropdown createDropdown();
}

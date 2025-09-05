package OopsConcepts;

public class Execution extends Button {
	public static void main(String[] args) {

		RadioButton radioButton = new RadioButton();

		radioButton.selectRadioButton();
		radioButton.submit();

		CheckBoxButton checkBoxButton = new CheckBoxButton();
		checkBoxButton.clickCheckButton();
		checkBoxButton.submit();

		TextField textField = new TextField();
		textField.getText();
		textField.setText(null);

		Button button = new Button();
		button.submit();
		button.click();
	}
}
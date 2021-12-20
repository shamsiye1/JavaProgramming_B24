package day57_polymorphism.driver;

public interface WebElement {

    void sendKeys(String text);
    void click();
    String getText();


}
// create a interface webelement
// abstract methods:
//   get();
//   click();
//   getText();
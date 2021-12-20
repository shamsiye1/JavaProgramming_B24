package day57_polymorphism.driver;

public class Google {
    public static void main(String[] args) {

        WebElement elm1= new Link();

        WebElement elm2= new Input();

        WebDriverUtil.clickElement(elm1); // clickElement is a method of WebDriver class

        WebDriverUtil.clickElement(elm2);




    }
}

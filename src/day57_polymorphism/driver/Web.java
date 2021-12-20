package day57_polymorphism.driver;

public class Web {
    public static void main(String[] args) {

        // how can i make link object?

        // reference of itself

        Link link1= new Link();
        link1.click();
        link1.sendKeys("Hello");
        System.out.println(link1.getText());
        System.out.println(link1.getUrl());

// with the reference of Link(itself) we are able to access 4 methods including getUrl()

        WebElement link2 = new Link();

        link2.click();
        link2.sendKeys("hello");
        System.out.println(link2.getText());
      //  System.out.println(link2.getUrl());  // because WebElement reference does not know what getUrl is

WebElement[] allLinks= new Link[3];

allLinks[0]=link1;
allLinks[1]=link2;

WebElement[] elements= new WebElement[3];
elements[0]=link1;
elements[1]= new Input();









    }
}

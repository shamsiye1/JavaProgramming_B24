package day02_print_statements;

public class HelloWorld_Quiz {
    public static void main( String[] args){
        System.out.println("Hello World");
int x=10;
int y= x++;
        System.out.println(y++ + " "+ x++ + " "+y);

  int score =0;
  if (score==0){
      score+=50;

  }
if (score!=0){
    score+=50;
}
        System.out.println(score);

char grade='a';
boolean passed= grade=='a' || grade=='b';
        boolean passed2= grade=='c' || grade=='d';
        if (passed || passed2){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

        int num=9;
        if (num++ ==10){
            System.out.println("hello"+num);
        }else {
            System.out.println("uni"+num);
        }

        int number=10;

        if (--number >10){
            System.out.println("cyber"+number);
        }else if (number ==9){
            System.out.println("wor"+number);
        }

boolean a = true, b= !false;
        if (b){
            System.out.println("b");
        }else if (a){
            System.out.println("a");
        }else {
            System.out.println("c");
        }
 boolean result= true;
        if (result){
            System.out.println("true");
        }else {
            System.out.println("fal");
//        }else if (result){
            System.out.println("none of");
        }


    }
}

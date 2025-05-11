import java.util.Scanner;
public class Program3 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number for which you want to create table");
    int num= scanner.nextInt();
    System.out.println("table of "+num+" here");
    for(int i=1; i<=10; i++)
    {
        int result= num * i;
        System.out.println(num +"x" +i +":" + result);
    }

}
}

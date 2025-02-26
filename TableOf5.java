import java.util.*;
public class TableOf5{
    public static void main(String[] args){
        Scanner j= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = j.nextInt();
        
        for(int a= 1; a <= 10 ; a++){
            System.out.println(num + "x" + a + "=" +(num * a));
        }
    }
}
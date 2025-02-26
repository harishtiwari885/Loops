public class HollowRectangle{
    public static void main(String[] args){
        int n= 4;
        int m= 5;
        
        int a=1;
        while(a <= 4){
            int b=1;
            while(b <=5){
                if(a==1 || b== 1 || a==n || b== m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
/*
Jab a = 1 hota hai (first row), toh inner loop har column ke liye star print karega (b = 1 se b = 5 tak).
Jab a = 2, 3 hota hai (middle rows), toh:
b = 1 aur b = 5 ke liye star print hote hain (yeh first aur last column hain).
Baaki columns mein space print hoti hai (yaani middle area mein).
Jab a = 4 hota hai (last row), toh fir se sabhi columns mein star print hote hain.*/
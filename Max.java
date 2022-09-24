import java.util.Scanner;
public class Max {
    public static void main (String[]args){
        Scanner input =new Scanner (System.in);
        int n1,n2;
        System.out.print("enter num 1 :" );
        n1=input.nextInt();
        System.out.print("enter num 2: ");
        n2=input.nextInt();
        max(n1,n2);
        input.close();
    }
    public static void 1max(int num1,int num2){
        int max=num1;
        if (num1<num2){
            max=num2;
        
        System.out.print("max= "+max);
    
    }
    }

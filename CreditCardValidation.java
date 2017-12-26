

import java.math.*;
import java.util.*;
import javax.swing.JOptionPane;


public class CreditCardValidation {
public static String output = "";

public static boolean isValid(long number)
{
    long temp=0;
    int length = (int)(Math.log10(number)+1);
    if(length >=13 && length<=16 )
    {
         long n=number;
         
       long [] arr = new long[16];
        for(int i=0;i<(int)(Math.log10(number)+1);i++)
       {
       temp=n%10;
       arr[i]=temp;
       n=n/10;
       }
       int a= (int)arr.length;
        
        if ((arr[a-1]==4 || arr[a-1]==5 || arr[a-1]==6)||(arr[a-1]==3 && arr[a-2]==7)){
     return true;
        }
        else{
      return false;
        }
    }
        
    else
        {
             return false;   
        }
  }
   public static int sumOfDoubleEvenPlace(long number){
       long z=0,temp=0;int p,k;
       long e=0;
       long n=number;
       int length = (int)(Math.log10(number)+1);
       long [] arr = new long[16];
       for(int i=0;i<(int)(Math.log10(number)+1);i++)
       {
       temp=n%10;
       arr[i]=temp;
       n=n/10;
       }
     
       for(int j=1;j<(length);j=j+2)
       {
         // j++;
           e=arr[j]*2;
           k=(int)e;
           z=z+ getDigit(k);
           
       }
       p=(int)z;
       return p;
   }
    public static int  getDigit( int number ){
        int d=0,b=0,c=0;
        if(number>9)
        {
            b=number/10;
            c=number%10;
            number=b+c;
        }
    return number;    
    }
    public static int sumOfOddPlace(long number){
        long f=0,temp=0;int g=0;
        long n=number;
        int length = (int)(Math.log10(number)+1);
       long [] arr = new long[16];
       for(int i=0;i<length;i++)
       {
       temp=n%10;
       arr[i]=temp;
       n=n/10;
       
       }
       
       for(int j=0;j<(length);j=j+2)
       {
           f=f+arr[j];
           //j++;
       }
       g=(int)f;
        return g;
    }
    public static void main(String[] args)
    {
       int sum=0,sum1=0,sum2=0;
       long  number = Long.parseLong(JOptionPane.showInputDialog("Enter Your Credit Card Number as a long integer"));
     boolean v =   isValid(number);
       
       if(v==true)
       {
           
        sum1 = sumOfDoubleEvenPlace(number); 
       
        sum2 = sumOfOddPlace(number);
       
        sum=sum1+sum2; 
         
        if(sum%10==0){
         output="\n"+number+" is a valid Credit card number.";
        
        }
        else{
           output="\n"+number+" is an invalid Credit card number.";
       }
       //JOptionPane.showMessageDialog(null,"asdas" );   
        }
       else{
           output="\n"+number+" is an invalid Credit card number.";
       }
      JOptionPane.showMessageDialog(null, output); 
    }
   
}
   

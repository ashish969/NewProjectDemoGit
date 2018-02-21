package basic.example.java;

import java.util.Scanner;

public class Swap {

	public static void main(String[] input)
    {
		String str1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
       /* for(String s2:arr)
        {
            if(s2.length()>1)
            {
                char[] arr1= s2.toCharArray();
                int len=arr1.length;*/

                for(int i=0; i< 6;i++)
                {
                     char[] arr1 = null;
					@SuppressWarnings("null")
					char temp=arr1[i];
                      arr1[i]=arr1[i+2];
                     arr1[i+2]= temp;
                     new String(arr1);

                }
                System.out.println("\nStrings after Swapping are :");
                System.out.print("String 1 = " +str1+ "\n");
            }
            
            
        
      
        //System.out.print("String 2 = " +str2+ "\n");
    }



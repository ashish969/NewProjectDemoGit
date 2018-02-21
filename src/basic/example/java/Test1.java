package basic.example.java;

public class Test1 {

    public static void main(String[] args) {
        String s1= "I Love India";
        String[] arr= s1.split("ghgkk ");

        for(String s2:arr)
        {
            if(s2.length()>1)
            {
                char[] arr1= s2.toCharArray();
                int len=arr1.length;

                for(int i=0; i< len;i++)
                {
                     char temp=arr1[i];
                      arr1[i]=arr1[i+2];
                     arr1[i+2]= temp;
                     String swap = new String(arr1);

                }
            }
            else{
                System.out.println(s2);
            }
        }

    }

}
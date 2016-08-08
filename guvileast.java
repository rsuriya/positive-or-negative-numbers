import java.util.Scanner;
public class LeastNumber {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in); 
		String num1=args[0];		
       int n=Integer.parseInt(num1);       
       int remainder;
       int b[]=new int[10];
       int y;
       int i=0; 
       while(n>0)
       {    	   
    	   remainder=n%10;
    	   b[i]=remainder;
    	   n=n/10;
    	   i++;    	   
       }       
       for( i=0;i<num1.length();i++)
       {    
    	   for(int j=i+1;j<num1.length();j++)
    	   {
    	   if(b[i]>b[j])
    	   {
    		   y=b[i];
    		  b[i]=b[j];
    		  b[j]=y;    		   
    	   }
    	   } 
    	   System.out.println(b[i]);
       } 
       System.out.println("Enter the number of digits to delete");
       int k=a.nextInt();
       for(int j=0;j<num1.length()-k;j++)
       {
    	   System.out.print(b[j]);
       }

	}

}






import java.io.Console;
import java.io.IOException;

public class sum_java
{
public static void main(String args[])
{
Console console = null;
  String inputString1 = null, inputString2 = null;
  int num1 , num2 ,sum;
 try
  {
     console = System.console();

     if (console != null)
     {

        inputString1 = console.readLine("Number 1:");
	   inputString2 = console.readLine("Number 2:");
	   num1 = Integer.parseInt(inputString1);
	   num2 = Integer.parseInt(inputString2 );
	   sum = num1 + num2;
        System.out.println("Sum of no:" +   String.valueOf(sum));
     }
  } catch (Exception ex)
  {
     ex.printStackTrace();
  }
}
}
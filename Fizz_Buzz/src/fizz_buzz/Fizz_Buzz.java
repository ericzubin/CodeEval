/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizz_buzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Eric
 */
public class Fizz_Buzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {     byte[ ] x = new byte[21];
       byte[ ] y = new byte[21];
        byte[ ] n = new byte[21];
       
 InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader brr = new BufferedReader (isr);
   
         for(int lk=0;lk<=19;lk++)
         {
          String numeros=brr.readLine();
 String[] numerosComoArray = numeros.split(" ");
 x[lk]=Byte.parseByte(numerosComoArray[0]);
 y[lk]=Byte.parseByte(numerosComoArray[1]);
   n[lk]=Byte.parseByte(numerosComoArray[2]);
        
         }
      
      
   
      
 
      for(int xf=0;xf<=19;xf++)
   {
        // TODO code application logic here
        fizzBuzz(x[xf],y[xf],n[xf]);
        System.out.println("");
     
   }
        
    }
    
static private void fizzBuzz (int x,int y,int n)
{

for(int nb=1;nb<=n;nb++)
{
	if(nb%x==0 ||	nb%y==0)//Nos indica si nb es divisible por x o y
	{
		if(nb%x==0)//Si nb es divisible entre x 
		{
			if(nb%y==0)//Nb es divisible entre x , y.  Nos imprime FB
			{
					System.out.print("FB ");
			}
			else//Solamente es divisible por x  Nos imprime F
			{
					System.out.print("F ");
			}
		}
		else //Solamente es divisible por y  Nos imprime B
		{
				System.out.print("B ");
		}
	}
        else
        {
        System.out.print(nb+" ");
        }
    
}
}
}

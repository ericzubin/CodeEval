/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_of_primes;

import java.io.IOException;

/**
 *
 * @author Eric
 */
public class Sum_Of_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
       int suma=0;
        int limite= 1000;
          int numeroPrimo=2;

        while(0<limite)
                {
                     //System.out.println("El limite " +limite);
                    //
                  int   numerodiviciones=0;
                
                 int  numeroinicial=numeroPrimo;
                    while(numeroinicial>1)
                    {
                        //System.out.println("Estrando for");
                          //System.out.println(numeroinicial);
                            //    System.out.println(numeroPrimo);
                        if(numeroPrimo%numeroinicial==0)
                        {
                            numerodiviciones++;
                         //  System.out.println("Yes");
                          
                            
                        }
                         if(numerodiviciones>=2)
                         {
                             
               
                       
                           numeroPrimo++;
                             break;
                         }
                         else if(numerodiviciones==1&& numeroinicial==2)
                         {
                     
                          suma=suma+numeroPrimo;
                             limite--;
                           numeroPrimo++;
                         
                         }
                         numeroinicial--;
                    }
                    
                }
        System.out.println(suma);
      
      
    }
}
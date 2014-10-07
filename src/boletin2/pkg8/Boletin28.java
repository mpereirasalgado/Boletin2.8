
package boletin2.pkg8;

import java.util.Scanner;

/**@author Micael*/
public class Boletin28 
{
    public static void main(String[] args) 
    {
        float t;
        System.out.println("Convertir grados celsius a grados kelvin y farenhein\nIntroducir temperatura:");
        Scanner dato = new Scanner(System.in);
        t=dato.nextFloat();
        System.out.println((t+273)+" k\n"+(t*(9/5)+32)+" f");
        
                
    }
    
}

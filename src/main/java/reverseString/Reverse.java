/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverseString;

/**
 *
 * @author metro
 */
public class Reverse {
    
    public static void main(String[] args) {
        
        String sinReversar = "Codigo Reversado";
        String stringReversado = "";
        for (int x = sinReversar.length()-1; x>=0; x-- )
            stringReversado = stringReversado + sinReversar.charAt(x);
        
        System.out.println(stringReversado);

    }
    
}

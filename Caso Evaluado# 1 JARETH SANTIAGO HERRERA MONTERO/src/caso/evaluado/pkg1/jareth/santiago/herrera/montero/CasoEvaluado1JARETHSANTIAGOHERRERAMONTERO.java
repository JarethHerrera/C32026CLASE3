/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.evaluado.pkg1.jareth.santiago.herrera.montero;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class CasoEvaluado1JARETHSANTIAGOHERRERAMONTERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
       
        String NDA = "";
        String CDC = "";
        String CIF = "";
        int CIFINTEGER = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido a la agencia bien chiva");
        JOptionPane.showMessageDialog(null, "Porfavor ingrese informacion del producto");
        NDA = JOptionPane.showInputDialog("Ingrese el nombre del Articulo");
        CDC= JOptionPane.showInputDialog("Ingrese el codigo de categoria");
        CIF = JOptionPane.showInputDialog("Ingrese el valor CIF del paquete");
        
        CIFINTEGER = Integer.valueOf(CIF);
        double IVA = CIFINTEGER * 0.13;
        double IVAN = CIFINTEGER+IVA;
        
        JOptionPane.showMessageDialog(null, "Nombre Formateado= " + NDA.toUpperCase().trim() + "\n" + CIFINTEGER + " x 0.13 = " + IVAN + "\n" + "Lo demas se lo doy un dia de estos");
        
        }
        
        
        
    

    private static void toUpperCase(String toUpperCase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

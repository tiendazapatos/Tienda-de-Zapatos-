
package proyecto.progra;

import javax.swing.JOptionPane;


public class Descuento {
    int metodopago=0;
    String tarjeta="";
    String efectivo="";
    
   
   public void AplicarDescuento(int cantidad, int deportivo, int casual, int elegante){
    //menu para aplicar el metodo de pago    
        String metodopago= JOptionPane.showInputDialog ( "Introduzca el metodo de pago deseado: n/"
                                                        + "1.***Tarjeta***"
                                                        + "2.***Efectivo***");
   switch(metodopago)
   {
       case 1:
           
           break;
       case 2:
           
           break;
       
       
           
   }
            
            
        
       
    }
}


package apparraylistconpoo;

import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        String opcion;
        Producto prod=null;
        System.out.println("Ingrese opción:");
        opcion=lector.next();
        while (opcion!="4")
        {
           switch(opcion)            
           {
               case "1"://Crear curso
               {
                    Producto oP=new Producto();
                    oP.LeerProducto();
                    prod=oP;
                    break;
               }
               case "2"://Añadir curso al catálogo
               {
                   CatalogoProductos.AnadirProductosCatalogo(prod);
                    break;
               }
               case "3"://Escribir cursos del catálogo
               {
                    CatalogoProductos.EscribirProductosCatalogo();
                    break;
               }
               case "4"://Salir
               {
                    opcion="4";
                    break;
               }
           }//fin de switch
           System.out.println("Ingrese opción:");
           opcion=lector.next();
        }
    }
    
}

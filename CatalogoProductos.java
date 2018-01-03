
package apparraylistconpoo;

import java.util.ArrayList;

public class CatalogoProductos 
{
   public static ArrayList<Producto> listaProducto = new ArrayList<Producto>();
   public static void AnadirProductosCatalogo(Producto c)
   {
       listaProducto.add(c); //añadiendo un curso al ArrayList
   }
   public static void EscribirProductosCatalogo()
   {
      for(int i=0;i<=listaProducto.size()-1;i=i+1)
      {
          Producto  miC  =(Producto)listaProducto.get(i);
          System.out.println(miC.getCodProducto() + " " +
                             miC.getDescProducto() + " " +
                             miC.getPrecProducto());
      }
   }
}

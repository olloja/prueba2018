
package apparraylistconpoo;

import java.util.Scanner;

public class Producto 
{
    private int codProducto;
    private String descProducto;
    private double precProducto;

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public double getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(double precProducto) {
        this.precProducto = precProducto;
    }
    public void LeerProducto()
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese Cod.Producto:");
        this.setCodProducto(lector.nextInt());
        System.out.println("Ingrese Desc.Producto:");
        this.setDescProducto(lector.next());
        System.out.println("Ingrese Precio Producto:");
        this.setPrecProducto(lector.nextDouble());
    }
    public void EscribirProducto()
    {
       System.out.println("Cod.Producto:" + this.getCodProducto());
       System.out.println("Desc.Producto:" + this.getDescProducto());
       System.out.println("Precio Producto:" + this.getPrecProducto());
    }
}

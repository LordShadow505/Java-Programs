
package arreglos;


public class Tabla {
    String Producto, Codigo, Precio;

    public Tabla(String Producto, String Codigo, String Precio) {
        this.Producto = Producto;
        this.Codigo = Codigo;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    
    
    
    
}

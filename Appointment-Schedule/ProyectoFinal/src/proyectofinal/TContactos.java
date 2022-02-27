
package proyectofinal;


public class TContactos {

    static void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String Clientes, Tipo, Telefono, Correo;

    public TContactos(String Clientes, String Tipo, String Telefono, String Correo) {
        this.Clientes = Clientes;
        this.Tipo = Tipo;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
         this.Telefono = Telefono;
     
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
         this.Correo = Correo;
     
    }
}

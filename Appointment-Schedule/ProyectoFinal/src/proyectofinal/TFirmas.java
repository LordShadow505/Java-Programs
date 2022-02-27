
package proyectofinal;


public class TFirmas {

    static void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String Clientes, Notaria, Fecha, Notas;

    public TFirmas(String Clientes, String Notaria, String Fecha, String Notas) {
        this.Clientes = Clientes;
        this.Notaria = Notaria;
        this.Fecha = Fecha;
        this.Notas = Notas;
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public String getNotaria() {
        return Notaria;
    }

    public void setNotaria(String Notaria) {
        this.Notaria = Notaria;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
         this.Fecha = Fecha;
     
    }
    
    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
         this.Notas = Notas;
     
    }
}

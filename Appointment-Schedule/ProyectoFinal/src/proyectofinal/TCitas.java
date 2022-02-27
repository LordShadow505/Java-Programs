
package proyectofinal;


public class TCitas {

    static void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String Clientes, Lugar, Fecha, Notas;

    public TCitas(String Clientes, String Lugar, String Fecha, String Notas) {
        this.Clientes = Clientes;
        this.Lugar = Lugar;
        this.Fecha = Fecha;
        this.Notas = Notas;
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
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

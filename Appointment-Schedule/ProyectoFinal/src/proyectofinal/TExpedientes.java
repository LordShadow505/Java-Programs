
package proyectofinal;


public class TExpedientes {

    static void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String Clientes, Banco, Estado, Notas;

    public TExpedientes(String Clientes, String Banco, String Estado, String Notas) {
        this.Clientes = Clientes;
        this.Banco = Banco;
        this.Estado = Estado;
        this.Notas = Notas;
    }

    public String getClientes() {
        return Clientes;
    }

    public void setClientes(String Clientes) {
        this.Clientes = Clientes;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
         this.Estado = Estado;
     
    }
    
    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
         this.Notas = Notas;
     
    }
}

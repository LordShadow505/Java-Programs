
package carreraautos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread {
    private JLabel var;
    private Juego n;
    
    public Carrera(JLabel var, Juego n){
        this.var = var;
        this.n = n;
        
    }
    

public void run(){
    int a1 = 0, a2 = 0;
    
    while(true){
        try {
            sleep((int)(Math.random()*30));
            a1 = n.getAutoAzul().getLocation().x;
            a2 = n.getAutoRojo().getLocation().x;
            if (a1<n.getMeta().getLocation().x-10&&a2<n.getMeta().getLocation().x-10){
                var.setLocation(var.getLocation().x+10, var.getLocation().y);
                n.repaint();
            }
            else{
                break;
            }
            
            
                    
                    } catch (InterruptedException ex) {
            
        }
            
        if (var.getLocation().x >= n.getMeta().getLocation().x-10){
        if (a1 > a2){
            JOptionPane.showMessageDialog(null, "Ganó el Auto Azul");
        }
        
        else if (a2 > a1){
            JOptionPane.showMessageDialog(null, "Ganó el Auto Rojo");
        }
        
        else {
             JOptionPane.showMessageDialog(null, "Empate");
        }
        
    }
            
            
        }
        
    }
    
}
    


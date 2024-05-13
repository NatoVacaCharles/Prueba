
package pruebagit;
import javax.swing.JOptionPane;
public class PruebaGit {
    public static void main(String[] args) 
    {
        int numero1,numero2,producto;
        
        JOptionPane.showMessageDialog(null, "Vamos a ver que tal funciona este programa");
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar número 1: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar número 2: "));
        producto=numero1*numero2;
        JOptionPane.showMessageDialog(null, "El resultado es "+producto);
    }
    
}

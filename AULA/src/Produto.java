import javax.swing.*;
public class Produto {

  
    public static void main(String[] args) {
        
        Produtocheio p1 = new Produtocheio();
		p1.setNome("NOVACK");
		p1.setnumero(10);
		p1.setPreco(2.5);
                
                String nome2 = p1.getNome();
                double num2 = p1.getPreco();
        String aux;
        
        aux = JOptionPane.showInputDialog("1 - Ver nome\n2 - Alterar nome");
        
        if ((Integer.parseInt(aux)) == 1){
         
            JOptionPane.showMessageDialog(null, "NOME: " + nome2);
        } else if((Integer.parseInt(aux)) == 2){
        String a;    
        p1.setNome( a = JOptionPane.showInputDialog("Novo Nome:"));
        
        JOptionPane.showMessageDialog(null, "NOME: " +a);
        }
        
             
              
    }
}

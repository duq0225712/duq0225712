
import javax.swing.JOptionPane;

public class exercicio05 {
    public static void main(String[] args) {
        //Declaração dos Arrays
        String[] nomes = new String[3];
        double[][] notas = new double[3][2];
        double[] media = new double[3];

        //
        for (int i = 0; i < 3 ; i++) {
          nomes[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+" nome: ","Digite apenas letras.");
          double soma = 0;
               for (int x = 0; x < 2; x++) {
          notas[i][x] = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota "+(x+1)+": "));
          soma+=notas[i][x];
        }
         media[i] = soma /2.0;
    } 
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Nome "+(i+1)+": "+nomes[i]+"\nPossui Média: "+media[i]);
                       
        }    
    }

}

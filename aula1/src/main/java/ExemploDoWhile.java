import javax.swing.JOptionPane;

public class ExemploDoWhile {
    
    public static void main(String [] args){
        double nota1, nota2;
        int contador = 1;
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            JOptionPane.showMessageDialog(null,"Média das notas é" + (nota1 + nota2)/2);
            contador = contador + 1;
        }while(contador <= 5);    
        }
    }


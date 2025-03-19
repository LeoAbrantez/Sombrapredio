/*
VAR
AlturaPessoa, SombraPessoa, SombraPredio, AlturaPredio <- Real

INICIO
Ler AlturaPessoa
Ler SombraPessoa
Ler SombraPredio

AlturaPredio <- (AlturaPessoa * SombraPredio) / SombraPessoa

Escreva "A altura do prédio é: " + AlturaPredio + " metros."

FIM

TESTE DE MESA

AlturaPessoa	SombraPessoa	SombraPredio	AlturaPredio
1.75 m	            2.0 m	    10.0 m	        8.75 m
1.80 m	            2.5 m	    12.5 m	        9.00 m
1.65 m	            1.8 m	    9.0 m	        8.25 m
 */
import javax.swing.JOptionPane;

 public class Main {
    public static void main(String[] args) {
        double AlturaPessoa, SombraPessoa, SombraPredio, AlturaPredio;

        // Strings
        String sAlturaPessoa, sSombraPessoa, sSombraPredio;

        // Entrada de dados
        sAlturaPessoa = JOptionPane.showInputDialog(null, "Qual a sua altura (em metros)?");
        AlturaPessoa = Double.parseDouble(sAlturaPessoa);

        sSombraPessoa = JOptionPane.showInputDialog(null, "Qual o comprimento da sua sombra (em metros)?");
        SombraPessoa = Double.parseDouble(sSombraPessoa);

        sSombraPredio = JOptionPane.showInputDialog(null, "Qual o comprimento da sombra do prédio (em metros)?");
        SombraPredio = Double.parseDouble(sSombraPredio);

        // Cálculo da altura do prédio
        AlturaPredio = (AlturaPessoa * SombraPredio) / SombraPessoa;

        // Saída
        JOptionPane.showMessageDialog(null, "A altura do prédio é: " + AlturaPredio + " metros.");
    }
 }
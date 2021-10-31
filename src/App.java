import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String x = JOptionPane.showInputDialog(null, "Digite o primeiro número:", "Compare números",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(x);
        String y = JOptionPane.showInputDialog(null, "Digite o segundo número:", "Compare números",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(y);

        if (a > b) {
            JOptionPane.showMessageDialog(null, "Resultado:\n" + a + " é maior que " + b, "Comparação",
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (a < b) {
            JOptionPane.showMessageDialog(null, "Resultado:\n" + b + " é maior que " + a, "Comparação",
                    JOptionPane.INFORMATION_MESSAGE);}
        
         else {
            JOptionPane.showMessageDialog(null, "Resultado:\n" + a +" é igual a " + b, "Comparação", JOptionPane.INFORMATION_MESSAGE);
          }
        
    }
}
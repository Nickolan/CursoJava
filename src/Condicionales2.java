import javax.swing.*;

public class Condicionales2 {
    public static void main(String[] args) {
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("1- Cafe con tortitas\n2-Cafe con medialunas\n3-Gaseosa con sandwich\nElija opcion"));
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Son $1000 pesos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Son $1500 pesos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Son $3000 pesos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no disponible");
                break;
        }

    }
}

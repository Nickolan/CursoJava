import javax.swing.*;

public class OperadoresSwing{
    public static void main(String[] args) {
        String nombre;
        int numero1,numero2;
        Double numero3;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        System.out.println("El nombre es " + nombre);
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero2"));
        System.out.println("La suma es " + (numero2 + numero1));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero decimal 3"));
        numero3+=numero1;
        JOptionPane.showMessageDialog(null, "El resultado es " + numero3);
    }
}

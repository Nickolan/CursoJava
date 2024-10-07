import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int a,b,c,i;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el valor de a: ");
        a=lectura.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b=lectura.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c=lectura.nextInt();
        i=1;
        a = a + (++i);
        System.out.println("El valor de a es " +a);
        a = a + (i++);
        System.out.println("El valor de a es " +a);
        b = b + (--i);
        System.out.println("El valor de b es " +b);
        c = c + (i--);
        System.out.println("El valor de c es " +c);
    }
}

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        int edad;
        boolean examenVisual=true;
        String examen = "APROBADO";
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        edad = lectura.nextInt();
        if (edad >= 18 && examenVisual && examen.equals("APROBADO")){
            System.out.println("Puede obtener el carnet");
        } else {
            System.out.println("No esta autorizado a conducir");
        }
    }
}

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] options = {"1 Añadir contacto", "2 Mostrar contactos", "3 Buscar contacto", "4 Salir"};

        for (String list : options) {
            System.out.println(list);
        }

        int choice= sc.nextInt();
        System.out.println("Has escogido " + options[choice-1]);
    }
}
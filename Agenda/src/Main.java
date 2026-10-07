import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String first = "1 Añadir contacto";
            String second = "2 Mostrar contactos";
            String third = "3 Buscar contacto";
            String fourth = "4 Salir";
            System.out.println("Seleccione\n" + first + "\n" + second + "\n" + third +"\n" + fourth);

            int opcion= sc.nextInt();
            if(opcion==1){
                System.out.println("Has escogido " + first);
            }
            else if(opcion==2){
                System.out.println("Has escogido " + second);
            }
            else if(opcion==3){
                System.out.println("Has escogido " + third);
            }
            else if(opcion==4){
                System.out.println("Has escogido " + fourth);
            }

        }
}

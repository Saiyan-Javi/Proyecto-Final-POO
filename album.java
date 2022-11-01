import Controller.*;
import java.util.Scanner;

public class album {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int option = 0;
        int porcentaje;
        int estampas = 0;

        /// ArrayList<usuarios> Arrayusuarios = new ArrayList();///

        while (option != 10) {
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    Bienvenido a la guía para competar tu albúm
                    Seleccione una opción
                    1. Abrir sobre
                    2. Corroborar listado de estampas faltantes
                    3. Solicitudes de intercambio
                    4. Solicitar intercambio
                    5. Ingresar Usuario
                    6. Porcentaje de albúm completado
                    7. Mostrar lista de usuarios
                    8. Salir del programa""");
            option = Integer.parseInt(in.nextLine());
            switch (option) {
                case 1 -> {
                    int contador = 0;
                    int min = 0;
                    int max = 250;
                    estampas = estampas + 5;

                    // Generate random int value from 0 to 250
                    System.out.println("Las estampas que salieron del sobre son las número: ");
                    while (contador < 5) {
                        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                        System.out.println(random_int);
                        contador = contador + 1;
                    }
                }
                case 5 -> {
                    /// mundialista Newmundialista = new mundialista();
                    /// System.out.println("Ingrese su nombre:");
                    // String name = in.nextLine();
                    // System.out.println("Ingrese su nombre de usuario:");
                    // String username = in.nextLine();
                    ///

                    /// Newmundialista.setName(name);
                    /// Newmundialista.setusername(username);

                }
                case 6 -> {
                    porcentaje = ((100 * estampas) / 250);
                    System.out.println("El porcentaje del album completado es del: " + porcentaje + "%");
                }
                case 7 -> {
                    /// System.out.println(Arrayusuarios);///
                }
                case 8 -> {
                    System.out.println("Gracias por usar el programa");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opción invalida, por favor intente nuevamente");
                }
            }
        }

    }

}

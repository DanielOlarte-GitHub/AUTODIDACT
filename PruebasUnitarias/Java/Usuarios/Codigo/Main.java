package Java.Usuarios.Codigo;

import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    static UsuarioServicio usu;

    public static void main(String[] args) {
        usu = new UsuarioServicio();
        menu();
    }

    public static void menu() {
        String nombre;
        int id;

        System.out.println("Bienvenido al sistema de usuarios");
        System.out.println("1. Crear usuario");
        System.out.println("2. Actualizar usuario");
        System.out.println("3. Obtener usuario");
        System.out.println("0. Salir");
        System.out.println("Ingrese una opción: ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del usuario: ");
                nombre = leer.next();
                System.out.println("Ingrese el id del usuario: ");
                id = leer.nextInt();

                usu.crear(id, nombre);
                break;
            case 2:
                System.out.println("Ingrese el nombre del usuario: ");
                nombre = leer.next();
                System.out.println("Ingrese el id del usuario: ");
                id = leer.nextInt();
                usu.actualizar(id, nombre);
                break;
            case 3:
                System.out.println("Ingrese el id del usuario: ");
                id = leer.nextInt();
                usu.obtener(id);
                break;
            case 0:
                System.out.println("Gracias por usar el sistema");
                break;
            default:
                System.out.println("Opción no válida");
                break;
            
        }
        menu();
    }
}

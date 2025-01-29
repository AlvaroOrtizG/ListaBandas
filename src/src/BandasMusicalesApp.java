package src;

import java.util.ArrayList;
import java.util.Scanner;

public class BandasMusicalesApp {
    private static ArrayList<String> bandas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarBanda();
                    break;
                case 2:
                    eliminarBanda();
                    break;
                case 3:
                    mostrarBandas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú Principal:");
        System.out.println("1. Añadir una nueva banda");
        System.out.println("2. Eliminar una banda");
        System.out.println("3. Mostrar todas las bandas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarBanda() {
        System.out.print("Ingrese el nombre de la banda: ");
        String banda = scanner.nextLine();
        bandas.add(banda);
        System.out.println("Banda añadida exitosamente.");
    }

    private static void eliminarBanda() {
        if (bandas.isEmpty()) {
            System.out.println("No hay bandas en la lista.");
            return;
        }
        System.out.println("Ingrese el nombre de la banda a eliminar: ");
        String banda = scanner.nextLine();
        if (bandas.remove(banda)) {
            System.out.println("Banda eliminada correctamente.");
        } else {
            System.out.println("Banda no encontrada en la lista.");
        }
    }

    private static void mostrarBandas() {
        if (bandas.isEmpty()) {
            System.out.println("No hay bandas en la lista.");
        } else {
            System.out.println("Lista de bandas:");
            for (String banda : bandas) {
                System.out.println("- " + banda);
            }
        }
    }
}

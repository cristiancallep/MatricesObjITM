import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        Metodos m = new Metodos();
        Scanner scanner = new Scanner(System.in);
        int option;
        int dim;
        String nombre;

        do {
            System.out.println("\n\n----------------------------------------------------------------------\n\n");
            System.out.println("Menú de Operaciones con Matrices");
            System.out.println("1. Buscar producto por nombre");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            System.out.println("\n\n----------------------------------------------------------------------\n\n");
            switch (option) {
                case 1:
                    System.out.println("Ingrese la dimension de la matriz: ");
                    dim = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Inicie con el registro: ");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    m.LlenarMatriz(dim);
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Registro finalizado, por favor indique el mnombre del producto a buscar: ");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    nombre = sc.nextLine().toLowerCase();
                    m.BuscarProducto(nombre);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
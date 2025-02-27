import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        Metodos m = new Metodos();
        Scanner scanner = new Scanner(System.in);
        int option;
        int f;
        int c;
        String nombre;

        do {
            System.out.println("\n\n----------------------------------------------------------------------\n\n");
            System.out.println("Menú de Operaciones con Matrices");
            System.out.println("1. Buscar producto por nombre");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. Fusion de Matrices");
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
                    System.out.println("Ingrese el # de filas de la matriz");
                    f = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Ingrese el # de columnas de la matriz: ");
                    c = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Inicie con el registro: ");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    m.LlenarMatrizM(f,c);
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
                    System.out.println("Ingrese el # de filas de la primera matriz: ");
                    f = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Ingrese el # de columnas de la primera matriz: ");
                    c = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Inicie con el registro de la primera matriz: ");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    m.LlenarMatrizM(f,c);
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Registro finalizado");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");

                    System.out.println("Ingrese el # de filas de la segunda matriz: ");
                    f = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Ingrese el # de columnas de la segunda matriz: ");
                    c = scanner.nextInt();
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Inicie con el registro de la segunda matriz: ");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    m.LlenarMatrizN(f,c);
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");
                    System.out.println("Registro finalizado");
                    System.out.println("\n\n----------------------------------------------------------------------\n\n");

                    m.SumarMatrices();
                    m.imprimirSuma();

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
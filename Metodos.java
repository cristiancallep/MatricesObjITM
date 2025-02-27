import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    Producto[][] m;
    Producto[][] n;
    Producto[] newMatrix;
    Scanner sc = new Scanner(System.in);
    public void LlenarMatrizM(int f, int c){
        m = new Producto[f][c];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                Producto obj = new Producto();
                System.out.println("Ingrese el nombre del producto: ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio: ");
                obj.setPrecio(sc.nextInt());
                System.out.println("Ingrese la cantidad: ");
                obj.setCantidad(sc.nextInt());
                m[i][j] = obj;
            }
        }
    }

    public void LlenarMatrizN(int f, int c){
        n = new Producto[f][c];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length ; j++) {
                Producto obj = new Producto();
                System.out.println("Ingrese el nombre del producto: ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio: ");
                obj.setPrecio(sc.nextInt());
                System.out.println("Ingrese la cantidad: ");
                obj.setCantidad(sc.nextInt());
                n[i][j] = obj;
            }
        }
        mostrarMatriz();
    }

    public void mostrarMatriz() {
        if (m == null) {
            System.out.println("La matriz 1 no ha sido inicializada.");
            return;
        }else{
            System.out.println("Contenido de la matriz:");
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + m[i][j].getNombre());
                }
            }
        }

        if (n == null) {
            System.out.println("La matriz 2 no ha sido inicializada.");
            return;
        }else{
            System.out.println("Contenido de la matriz:");
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + n[i][j].getNombre());
                }
            }
        }
    }

    public void BuscarProducto(String nombre){
        boolean sw = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length ; j++) {
                if (!sw){
                    if(m[i][j].getNombre().toLowerCase().equals(nombre)){
                        System.out.println("El producto esta en la posicion:  " + " fila: " + i + " columna: " + j);
                        sw = true;
                    }
                }
            }
        }
        if (!sw){
            System.out.println("Producto no encontrado");
        }
    }

    public void SumarMatrices() {
        // Inicializar el arreglo resultante con un tamaño suficiente
        newMatrix = new Producto[m.length * m[0].length + n.length * n[0].length];
        int posNewMatrix = 0;

        // Recorrer la primera matriz (m)
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                boolean encontrado = false;

                // Buscar coincidencias en la segunda matriz (n)
                for (int p = 0; p < n.length; p++) {
                    for (int l = 0; l < n[p].length; l++) {
                        if (m[i][j].getNombre().equals(n[p][l].getNombre())) {
                            // Si hay coincidencia, sumar las cantidades
                            Producto k = new Producto();
                            k.setNombre(m[i][j].getNombre());
                            k.setPrecio(m[i][j].getPrecio());
                            k.setCantidad(m[i][j].getCantidad() + n[p][l].getCantidad());
                            newMatrix[posNewMatrix] = k;
                            posNewMatrix++;
                            encontrado = true;
                            break; // Salir del bucle interno
                        }
                    }
                    if (encontrado) break; // Salir del bucle externo si se encontró una coincidencia
                }

                // Si no se encontró coincidencia, agregar el producto de m
                if (!encontrado) {
                    Producto k = new Producto();
                    k.setNombre(m[i][j].getNombre());
                    k.setPrecio(m[i][j].getPrecio());
                    k.setCantidad(m[i][j].getCantidad());
                    newMatrix[posNewMatrix] = k;
                    posNewMatrix++;
                }
            }
        }

        // Recorrer la segunda matriz (n) para agregar productos no coincidentes
        for (int p = 0; p < n.length; p++) {
            for (int l = 0; l < n[p].length; l++) {
                boolean encontrado = false;

                // Verificar si el producto ya está en newMatrix
                for (int i = 0; i < posNewMatrix; i++) {
                    if (n[p][l].getNombre().equals(newMatrix[i].getNombre())) {
                        encontrado = true;
                        break;
                    }
                }

                // Si no está en newMatrix, agregarlo
                if (!encontrado) {
                    Producto k = new Producto();
                    k.setNombre(n[p][l].getNombre());
                    k.setPrecio(n[p][l].getPrecio());
                    k.setCantidad(n[p][l].getCantidad());
                    newMatrix[posNewMatrix] = k;
                    posNewMatrix++;
                }
            }
        }

        // Redimensionar newMatrix para eliminar espacios vacíos
        newMatrix = Arrays.copyOf(newMatrix, posNewMatrix);
    }

    public void imprimirSuma(){
        System.out.println("FUSION DE MATRICES: ");
        for (Producto matrix : newMatrix) {
            if (!(matrix.getNombre() == null || matrix.getNombre().isEmpty())) {
                System.out.println("nombre: " + matrix.getNombre());
                System.out.println("precio: " + matrix.getPrecio());
                System.out.println("cantidad: " + matrix.getCantidad());
            }
        }
    }
}

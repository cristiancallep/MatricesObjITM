import java.util.Objects;
import java.util.Scanner;

public class Metodos {
    Producto[][] m;
    Scanner sc = new Scanner(System.in);
    public void LlenarMatriz(int d){
        m = new Producto[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length ; j++) {
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
}

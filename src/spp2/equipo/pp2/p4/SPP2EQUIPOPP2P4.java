/*
Orianna Linette Virgen Mar       A01411515
María Teresa Corripio Herrera  A01410393
Rafael Alejandro Cisneros Gual A01410038
Leticia Vianey Narváez Reyes     A01410432
Ana Martha Alanis Cortaza        A01411418
*/
package spp2.equipo.pp2.p4;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2EQUIPOPP2P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] arreglo={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        System.out.println("Bienvenido al programa #4 de una matriz 4x4 con diferentes funciones");
        System.out.println("Los valores de la matriz 4x4 en sus respectivas coordenadas son los siguientes");
        valores(arreglo);
        prom(arreglo);
        valorMin(arreglo);
        valorMax(arreglo);
        sumaDiagonal(arreglo);
        sumaarriba(arreglo);
        sumaabajo(arreglo);
    }
    public static void valores(int[][]arreglo){
        for(int i=0; i<arreglo.length; i++){
            for(int j=0; j<arreglo.length; j++){
                System.out.println("El valor en las coordenadas "+i+","+j+" es de "+arreglo[i][j]);
            }
        }
    }
    
    public static void prom(int[][]arreglo){
        double prom=0;
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo.length;j++){
                prom=prom+(arreglo[i][j]);
            }
        }
        System.out.println("El promedio de los arreglos es de "+prom/16);
    }
    public static void valorMin(int[][]arreglo){
        int valormin=1000000;
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo.length;j++){
                int n=arreglo[i][j];
                if(valormin>n){
                    valormin=n;
                }else{
            }
        }
    }
        System.out.println("El valor minimo es de "+valormin);
}
    public static void valorMax(int[][]arreglo){
         int valormax=-1000000;
        for (int[] arreglo1 : arreglo) {
            for (int j = 0; j<arreglo.length; j++) {
                int n = arreglo1[j];
                if(valormax<n){
                    valormax=n;
                }else{
                }
            }
        }
        System.out.println("El valor maximo es de "+valormax);
}
    public static void sumaDiagonal(int[][]arreglo){
        int sumaDiagonal=0;
        for(int i=0;i<arreglo.length;i++){
            sumaDiagonal=sumaDiagonal+arreglo[i][i];
        }
        System.out.println("La suma de los valores en diagonal es de "+sumaDiagonal);
    }
    public static void sumaabajo(int[][]arreglo){
        int suma=0;
        for(int i=1;i<arreglo.length;i++){
            suma=suma+arreglo[i][i-1];
        }
        System.out.println("La suma de los valores de la matriz abajo de la diagonal es igual a"+suma);
    }
    public static void sumaarriba(int[][]arreglo){
        int suma=0;
        for(int i=1;i<arreglo.length;i++){
            suma=suma+arreglo[i][i-1];
        }
        System.out.println("La suma de valores de la matriz arriba de la diagonal es igual a "+suma);
    }
}

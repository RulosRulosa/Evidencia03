import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        menu();
        menuAccion(-1);

    }
    public static void menu(){
        System.out.println("Hola buenas tardes");
        System.out.println("Desea comprar una sopaipilla? 1. Sí, 2. No");
    }

    public static int menuAccion(int opcion){
        VendedorSopapipillas v1= new VendedorSopapipillas();
        int opcion2= 1;
       opcion= validarEntrada(-1,2,1);
       do {
           switch (opcion) {

               case 1:

                   v1.RealizarVenta();
                   System.out.println("desea comprar otra sopaipilla? 1.Sí, 2.No");
                   opcion2= validarEntrada(1,2,1);
                   break;
               case 2:
                   System.out.println("bueno");
                   opcion2= 2;
                   break;
           }


       }while (opcion2==1);

        return opcion;
    }

    public static int validarEntrada(int n, int max, int min) {

        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");

            try {
                n = teclado.nextInt(); //numero que se validará¡

            } catch (Exception e) {
                teclado.next();
                System.out.println("Ingrese un numero valido");
            }
            if (n < min || n > max) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < min || n > max);
        return n;
    }
    // para llamarlo: variable = V_entrada(variable,(numero maximo),(numero minimo));

}

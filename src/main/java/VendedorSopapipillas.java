import java.util.Scanner;

public class VendedorSopapipillas {


    private String aderezo;
    private int vuelto;
    private int cobro;

    public VendedorSopapipillas() {

    }

    public int getCobro() {
        return cobro;
    }

    public void setCobro(int cobro) {
        this.cobro = cobro;
    }

    public String getAderezo() {
        return aderezo;
    }

    public void setAderezo(String aderezo) {
        this.aderezo = aderezo;
    }

    public int getVuelto() {
        return vuelto;
    }

    public void setVuelto(int vuelto) {
        this.vuelto = vuelto;
    }

    public int RealizarVenta(){

            System.out.println("serían 200 pesitos");
            cobro= V_entrada(-1, 50000, 200);
            Vuelto();
            Aderezo();

        return cobro;
    }

    public void Aderezo (){
        Scanner input = new Scanner(System.in);
        System.out.println("desea agregar aderezo? 1. sí 0. no");
        int respuesta=V_entrada(-1,1,0);
        if(respuesta==1){
            System.out.println("*le pone aderezo*");
        }else{
            System.out.println("bueno");
        }
    }

    public int Vuelto (){

        if(cobro>200){
            vuelto= cobro-200;
            System.out.println("su vuelto es "+vuelto);
        }

        return vuelto;
    }

    //validador de entrada

    public static int V_entrada(int n, int max, int min) {

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

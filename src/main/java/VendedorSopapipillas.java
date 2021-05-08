import java.util.Scanner;

public class VendedorSopapipillas {
    private int sopaipillas; //cantidad de sopaipillas
    private int dinero; //para dar de vuelto y por lo que recibe
    private String aderezo;
    private int vuelto;

    public VendedorSopapipillas(int dinero, String aderezo) {
        this.dinero = dinero;
        this.aderezo = aderezo;
    }

    public int getSopaipillas() {
        return sopaipillas;
    }

    public void setSopaipillas(int sopaipillas) {
        this.sopaipillas = sopaipillas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
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

    public int Cobrar (int cobro){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("serían 200 pesitos");
            cobro= input.nextInt();

        } while(!PrevensionContraEstafa(cobro, 200));

        return cobro;
    }
    public void Aderezo (){
        Scanner input = new Scanner(System.in);
        System.out.println("desea agregar aderezo? 1. sí 0. no");
        int respuesta=V_entrada(-1,1,0);
        if(respuesta==1){
            System.out.println("*le pone aderezo*");
        }else{
            System.out.println("bueno ya");
        }
    }

    public void cantidadSopaipillas(){
        int max= 400;
        int min= 200;
        setSopaipillas((int)Math.floor(Math.random()*(max-min+1)+min));
        System.out.println("el nro de sopaipillas es: "+getSopaipillas());
    }

    public static boolean PrevensionContraEstafa(int num, int limiteInf) {
        return (limiteInf <= num);
    }

    public int Vuelto (int vuelto){

        return vuelto;
    }

    //validador de entrada

    static int V_entrada(int n, int max, int min) {

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

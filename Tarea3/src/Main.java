public class Main {
    public static void main(String[] args) {

        //Primera parte------------------------------------------
        int resultado;
        resultado= suma(4, 7, 9);

        System.out.println("El resultado es: " + resultado);

        //Segunda Parte-------------------------------------------
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("El numero de puertas del coche es: " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int puertas = 0;

    public void IncrementarPuertas (){
        this.puertas++;
    }
}
public class Main {
    public static void main(String[] args) {

        //If, else if ----------------------------------------

        int numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es 0");
        }

        //while ----------------------------------------------

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Do while --------------------------------------------

        int numeroDoWhile = 2;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile < 3);

        //for ------------------------------------------------

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Switch ---------------------------------------------

        var estacion = "primavera";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
            break;
            case "invierno":
                System.out.println("es invierno");
            break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estación");
        }
    }
}
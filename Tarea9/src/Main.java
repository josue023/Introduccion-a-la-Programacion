public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //cliente -------------------------------------------------
        cliente.setEdad(38);
        cliente.setNombre("Carlos");
        cliente.setTelefono("593988353792");
        cliente.setCredito(2000);

        System.out.println("> Cliente:");
        System.out.println(cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        System.out.println("------------------------------------------");

        //Trabajador -------------------------------------------------
        trabajador.setEdad(45);
        trabajador.setNombre("Andres");
        trabajador.setTelefono("593987355702");
        trabajador.setSalario(5500);

        System.out.println("> Trabajador:");
        System.out.println(trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}

abstract class Persona{
    int edad;
    String nombre;
    String telefono;

    public Persona(){
        System.out.println("constructor");
    }

    abstract public void setEdad(int edad);
    abstract public int getEdad();

    abstract public void setNombre(String nombre);
    abstract public String getNombre();

    abstract public void setTelefono(String telefono);
    abstract public String getTelefono();

}

class Cliente extends Persona{

    int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
    //--------------------------------------
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    //-----------------------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return "Nombre: " + this.nombre;
    }
    //---------------------------------------------
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return "Teléfono: " + this.telefono;
    }


}


class Trabajador extends Persona{

    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
    //--------------------------------------
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    //-----------------------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return "Nombre: " + this.nombre;
    }
    //---------------------------------------------
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return "Teléfono: " + this.telefono;
    }


}

public class Entrenador  extends Persona {

    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void Concentrarce() {
        System.out.println("Concentrarse como entrenador");

    }

    @Override
    public void Viajar() {
        System.out.println("Viajar como entrenador");
    }

    public void dirigirPartido() {
        System.out.println("Dirigir partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigir entrenamiento");
    }
   

    @Override
    public void mostrarInf() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("ID Federación: " + getIdFederacion());
    }
   
   
}

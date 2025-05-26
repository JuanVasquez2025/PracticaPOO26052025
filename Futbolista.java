public class Futbolista extends Persona {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("Jugar partido como central");
    }

   

    @Override
    public void Concentrarce() {
        System.out.println("Concentrarse como futbolista");
    }
     public void entrenar() {
        System.out.println("Entrenar con el entrenador");
    }

    @Override
    public void Viajar() {
        System.out.println("Viajar como futbolista");
    }




}

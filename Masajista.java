public class Masajista extends Persona {

    private String titulacion;
    private int annoExperiencia;

    public Masajista(){

    }

    public Masajista(String titulacion, int annoExperiencia) {
        this.titulacion = titulacion;
        this.annoExperiencia = annoExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnnoExperiencia() {
        return annoExperiencia;
    }

    public void setAnnoExperiencia(int annoExperiencia) {
        this.annoExperiencia = annoExperiencia;
    }
    

    @Override
    public void Concentrarce() {
        System.out.println("Masajista Concentrarse");
    }

    @Override
    public void Viajar() {
        System.out.println("Masajista Viajar");
    }


    public void DarMasajes(){
        System.out.println("Dar masajes");
    }

}

package co.edu.unab.wilmer.laura.sintomapp.entity;

public class Categoria {
    private String nombre;
    private  String apellido;
    private String programaacademico;

    public Categoria(String nombre, String apellido, String programaacademico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.programaacademico = programaacademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProgramaacademico() {
        return programaacademico;
    }

    public void setProgramaacademico(String programaacademico) {
        this.programaacademico = programaacademico;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", programaacademico='" + programaacademico + '\'' +
                '}';
    }
}

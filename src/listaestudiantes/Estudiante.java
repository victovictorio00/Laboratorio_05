/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaestudiantes;

/**
 *
 * @author ESTUDIANTE
 */
public class Estudiante {
    private String nombre;
    private String Apellido;
    private String Codigo;
    
    public Estudiante(){}
    public Estudiante(String nombre, String Apellido, String Codigo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    String getTexto() {
       return this.Apellido + ", " + this.nombre + " |Codigo " + this.Codigo;
    }
    
    
}

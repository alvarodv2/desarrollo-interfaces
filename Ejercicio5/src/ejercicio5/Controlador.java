/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Álvaro Rivera Ruiz
 */
public class Controlador {
    
    String profesion;
    int numeroHermanos;
    int edad;
    String sexo;
    String deporte;

    public Controlador(String profesion, int numeroHermanos, int edad, String sexo, String deporte) {
        this.profesion = profesion;
        this.numeroHermanos = numeroHermanos;
        this.edad = edad;
        this.sexo = sexo;
        this.deporte = deporte;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getNumeroHermanos() {
        return numeroHermanos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setNumeroHermanos(int numeroHermanos) {
        this.numeroHermanos = numeroHermanos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    
}

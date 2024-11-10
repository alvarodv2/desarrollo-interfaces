/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Álvaro Rivera Ruiz
 */
public class LogicaOperacionesSencillas {
        
        private int numero;
        private int numeroDos;

    public LogicaOperacionesSencillas(int numero, int numeroDos) {
        this.numero = numero;
        this.numeroDos = numeroDos;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroDos() {
        return numeroDos;
    }
     
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    public int operacionSuma(){
            return numero + numeroDos;
    }
    
    public int operacionResta(){
            return numero - numeroDos; 
    }
    
    
}

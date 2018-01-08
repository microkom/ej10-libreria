
package ej10;


public class Libros {
    private String titulo;
    private Persona autor;
    private boolean disponible;
    
    public Libros(String titulo, Persona autor, boolean disponible){
        this.titulo=titulo;
        this.autor=autor;
        this.disponible=disponible;
    }
    
    public String getTitulo(){return this.titulo;}
    public Persona getAutor(){return this.autor;}
    public boolean getDisponible(){return this.disponible;}
    
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setPersona(Persona autor){this.autor=autor;}
    public void setDisponible(boolean disp){this.disponible=disp;}
    
    /*
         
La clase “Libro” con los siguientes atributos:
 titulo: Cadena con el título del libro.
 autor: Objeto de la clase persona.
 disponible: Dato lógico (boolean) para indicar si el libro está
disponible o no.
Todos los datos son privados, por lo que la clase deberá tener métodos
get/set para todos los atributos.
Además un constructor con todos los atributos como parámetros de
entrada.

        
    */
}

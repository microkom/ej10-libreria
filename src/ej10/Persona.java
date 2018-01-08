
package ej10;

public class Persona {
    private String nombre;
    private String apellidos;
    private Fecha fechaNacimiento;
    
    public Persona(String nombre, String apellidos, Fecha fechaNac){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento=fechaNac;
    }
    
    public String getNombre(){return this.nombre;}
    public String getApellidos(){return this.apellidos;}
    public Fecha getFechaNac(){return this.fechaNacimiento;}
    
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}
    public void setFechaNacimiento(Fecha fechaNac){this.fechaNacimiento=fechaNac;}
    /*
    La clase Persona debe tener los siguientes datos:
 nombre.
 apellidos
 fechaNacimiento: Objeto de tipo fecha.
Todos los datos son privados por lo que se necesitarán métodos para
obtener la información. Además se debe generar el método set para todos
ellos y un constructor con todos los atributos como parámetros de
entrada.
    */
}

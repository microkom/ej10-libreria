package ej10;
public class Main {
    public static void main(String[] args) {

        
        
        String libreria="Librería Municipal";
        String direccion="Avda. Blasco Ibañez nº 4";
        
        Libreria libreria1 =new Libreria(libreria,direccion);
        
        String libro="El código da vinci";
        String autor="Dan";
        String apellido="Brawn";
        boolean disponible=true;
        int dia=2, mes=6, anyo=1965;
        
        Fecha fechaNac=new Fecha(dia,mes,anyo);
        Persona persona1=new Persona(autor,apellido,fechaNac);
        Libros lib1=new Libros(libro,persona1,disponible);
        
        //*****
        libro="El alquimista";
        autor="Paulo";
        apellido="Coelho";
        disponible=false;
        dia=12; mes=12; anyo=1959;
        
        Fecha fechaNac2=new Fecha(dia,mes,anyo);
        Persona persona2=new Persona(autor,apellido,fechaNac);
        Libros lib2=new Libros(libro,persona1,disponible);
        
         //*****
        libro="El diario de Ana Frank";
        autor="Ana";
        apellido="Frank";
        disponible=true;
        dia=7; mes=4; anyo=1934;
        
        Fecha fechaNac3=new Fecha(dia,mes,anyo);
        Persona persona3=new Persona(autor,apellido,fechaNac);
        Libros lib3=new Libros(libro,persona1,disponible);
        
        //libreria1.nuevoLibro(lib1);
        
        libreria1.imprimir();

        /*
En la misma clase main crear los siguientes libros y añadidlos a la librería:

Buscar por título el señor de los anillos y mostrar el resultado
obtenido.
Eliminad el libro El código da vinci.
Buscadlo y mostrar el resultado.
Añadid el libro:
 título: El principito
 Autor: Antoine de Saint-Exupéry. Fecha Nacimiento: 14 de Agosto
de 1916.
 No Disponible.
        
Prestad “El prinicpito”.
Mostar toda la información de la librería mediante el método
“imprimir”.
        */
    }
    
}

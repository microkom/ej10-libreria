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
        libreria1.nuevoLibro(lib1);
        System.out.println("\tSe ha agregado "+libro+" a la libreria");
        
        
        //*****
        libro="El alquimista";
        autor="Paulo";
        apellido="Coelho";
        disponible=false;
        dia=12; mes=12; anyo=1959;
        
        Fecha fechaNac2=new Fecha(dia,mes,anyo);
        Persona persona2=new Persona(autor,apellido,fechaNac2);
        Libros lib2=new Libros(libro,persona2,disponible);
        libreria1.nuevoLibro(lib2);
        System.out.println("\tSe ha agregado "+libro+" a la libreria");
        
        //*****
        libro="El diario de Ana Frank";
        autor="Ana";
        apellido="Frank";
        disponible=true;
        dia=7; mes=4; anyo=1934;
        
        Fecha fechaNac3=new Fecha(dia,mes,anyo);
        Persona persona3=new Persona(autor,apellido,fechaNac3);
        Libros lib3=new Libros(libro,persona3,disponible);
        libreria1.nuevoLibro(lib3);
        System.out.println("\tSe ha agregado "+libro+" a la libreria");
        
        System.out.println(libreria1.imprimir());
        
        
        //Buscar por título el señor de los anillos y mostrar el resultado obtenido.
        libro="El señor de los anillos";
        int existe=libreria1.buscarLibro(libro); 
        if (existe!=-1){
            System.out.println("\tEl libro \""+libro+"\" se encuentra en el índice "+existe);
        }else{
            System.out.println("\tEl libro \""+libro+"\" no existe en la libreria");
        }
        
        //Eliminad el libro El código da vinci.
        libro="El codigo Davinci";
        libreria1.borrarLibroNombre(libro);
        
        //Buscadlo y mostrar el resultado.
        existe=libreria1.buscarLibro(libro);
        if (existe!=-1){
            System.out.println("\tEl libro \""+libro+"\" se encuentra en el índice "+existe);
        }else{
            System.out.println("\tEl libro \""+libro+"\" no existe en la libreria");
        }
        
        /*Añadid el libro:
        título: El principito
        Autor: Antoine de Saint-Exupéry. 
        Fecha Nacimiento: 14 de Agosto de 1916.
        No Disponible. */
        
        //*****
        libro="El principito";
        autor="Antoine";
        apellido="de Saint-Exupéry";
        disponible=false;
        dia=14; mes=8; anyo=1916;
        
        Fecha fechaNac4=new Fecha(dia,mes,anyo);
        Persona persona4=new Persona(autor,apellido,fechaNac4);
        Libros lib4=new Libros(libro,persona4,disponible);
        libreria1.nuevoLibro(lib4);
        System.out.println("\tSe ha agregado "+libro+" a la libreria");
        
        // Prestad “El prinicpito”.
        existe=libreria1.buscarLibro(libro);
        libreria1.prestar(existe);
        
        //Mostar toda la información de la librería mediante el método “imprimir”.
        System.out.println(libreria1.imprimir());
        
    }
    
}

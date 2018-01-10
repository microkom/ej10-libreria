/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

public class Libreria {

    /*
    10 – Diseña la clase “Librería” con los siguientes datos:
 nombre: cadena con el nombre de la librería.
 direccion: cadena con la dirección de la librería.
 libros: Vector con un máximo de 20 posiciones en el que se
almacenarán objetos de la clase “Libros” que se explica a
continuación.
     */
    private String nombre;
    private String direccion;
    private Libros[] libro = new Libros[20];

    /*
    
    Los datos son privados por lo que se necesitarán métodos para obtener la
información. Además se deben generar el método set para todos ellos y
un constructor con el nombre y la dirección como parámetro de entrada.
     */
    public Libreria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public Libros[] getLibros() {
        return this.libro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLibros(Libros[] libro) {
        this.libro = libro;
    }

    /*    

Se deberá crear además los métodos:
nuevoLibro (Libro l): Añadir un libro a la librería. En caso que lo haya
podido añadir debe devolver la posición en el vector en la que la ha
insertado. En caso contrario (vector lleno) debe devolver -1.
     */
    public int nuevoLibro(Libros libroNuevo) {
        ordenVector();
        int vector = -1;
        boolean granted = false;
        for (int i = 0; i < libro.length && granted == false; i++) {
            //buscar lineas que no están vacías
            if (libro[i] == null) {
                libro[i] = libroNuevo;
                granted = true;
                vector = i;
            }
        }
        return vector;
    }

    public void ordenVector() {
        for (int i = 0; i < libro.length; i++) {
            //buscar lineas que no están vacías
            if (libro[i] != null) {
                boolean found = false;

                //búsqueda del primer null en el array y reemplazo con el último not null
                for (int j = 0; j < libro.length && found == false; j++) {
                    if (libro[j] == null) {
                        libro[j] = libro[i];
                        libro[i] = null;
                        found = true;
                    }
                }
            }
        }
    }

    //borrarLibroNumero(int pos) : Elimina el libro que ocupa la posición indicada.  */
    public void borrarLibroNumero(int posicion) {
        this.libro[posicion] = null;
        ordenVector();
    }

    /* borrarLibroNombre(String titulo): Elimina el libro con el título
    indicado (no distinguir entre mayúsculas y minúsculas).*/
    public void borrarLibroNombre(String titulo) {
        int i = buscarLibro(titulo);
        if (i != -1) {
            libro[i] = null;
        }
        ordenVector();
    }

    /* buscarLibro(String titulo): Buscar si se dispone del libro indicado. 
    Debe devolver la posición en el vector en caso de encontrarlo o -1
    en caso de que no.*/
    public int buscarLibro(String titulo) {
        int vector = -1;
        boolean found = false;
        for (int i = 0; i < libro.length && found == false; i++) {
            if (libro[i] != null) {
                if (libro[i].getTitulo().equalsIgnoreCase(titulo)) {
                    vector = i;
                    found = true;
                }
            }
        }
        return vector;
    }

    //numeroLibros(): Devuelve la cantidad de libros de la librería.
    public int numeroLibros() {
        int numero = 0;
        for (int i = 0; i < libro.length; i++) {
            if (libro[i] != null) {
                numero++;
            }
        }
        return numero;
    }

    //librosDisponibles():Devuelve la cantidad de libros disponibles de la librería.
    public int librosDisponibles() {
        int numero = 0;
        for (int i = 0; i < libro.length; i++) {
            if (libro[i] != null && libro[i].getDisponible() == true) {
                numero++;
            }
        }
        return numero;
    }

    /* imprimir(): Método para imprimir el nombre, la dirección completa y el 
    listado de libros junto con información de su autor y sudisponibilidad 
    actual, la cantidad total de libros y la cantidad de libros disponibles.*/
    public String imprimir() {
        String texto = "";

        texto = "\n\t*******************************************"
                + "\n\tLibreria: " + this.nombre + "\n\tDireccion: " + this.direccion + "\n";
        for (int i = 0; i < libro.length; i++) {
            if (libro[i] != null) {
                texto += "\n\t" + libro[i].getTitulo() + "\n";
                texto += "\t" + libro[i].getAutor().getNombre() + " ";
                texto += "" + libro[i].getAutor().getApellidos() + "\n";
                texto += "\t" + libro[i].getAutor().getFechaNac().corta() + "\n";
                if (libro[i].getDisponible() == true) {
                    texto += "\tDisponible: Sí\n";
                } else {
                    texto += "\tDisponible: No\n";
                }
            }
        }
        return texto;
    }

    /* prestar(int pos): Método para indicar que un citado libro debe pasar 
    al estado de “No disponible” */
    public void prestar(int pos) {
        if (libro[pos]!=null)
        libro[pos].setDisponible(false);
    }
}

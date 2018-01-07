package ej10;
public class Main {
    public static void main(String[] args) {

        /*
        10 – Diseña la clase “Librería” con los siguientes datos:
 nombre: cadena con el nombre de la librería.
 direccion: cadena con la dirección de la librería.
 libros: Vector con un máximo de 20 posiciones en el que se
almacenarán objetos de la clase “Libros” que se explica a
continuación.
Los datos son privados por lo que se necesitarán métodos para obtener la
información. Además se deben generar el método set para todos ellos y
un constructor con el nombre y la dirección como parámetro de entrada.
Se deberá crear además los métodos:
 nuevoLibro (Libro l): Añadir un libro a la librería. En caso que lo haya
podido añadir debe devolver la posición en el vector en la que la ha
insertado. En caso contrario (vector lleno) debe devolver -1.
 borrarLibroNumero(int pos) : Elimina el libro que ocupa la posición
indicada.
 borrarLibroNombre(String titulo): Elimina el libro con el título
indicado (no distinguir entre mayúsculas y minúsculas).
 buscarLibro(String titulo): Buscar si se dispone del libro indicado.
Debe devolver la posición en el vector en caso de encontrarlo o -1
en caso de que no.
 numeroLibros(): Devuelve la cantidad de libros de la librería.
 librosDisponibles():Devuelve la cantidad de libros disponibles de la
librería.
 imprimir(): Método para imprimir el nombre, la dirección completa
y el listado de libros junto con información de su autor y sudisponibilidad actual, la cantidad total de libros y la cantidad de
libros disponibles.
 prestar(int pos): Método para indicar que un citado libro debe pasar
al estado de “No disponible”.
La clase “Libro” con los siguientes atributos:
 titulo: Cadena con el título del libro.
 autor: Objeto de la clase persona.
 disponible: Dato lógico (boolean) para indicar si el libro está
disponible o no.
Todos los datos son privados, por lo que la clase deberá tener métodos
get/set para todos los atributos.
Además un constructor con todos los atributos como parámetros de
entrada.
La clase Persona debe tener los siguientes datos:
 nombre.
 apellidos
 fechaNacimiento: Objeto de tipo fecha.
Todos los datos son privados por lo que se necesitarán métodos para
obtener la información. Además se debe generar el método set para todos
ellos y un constructor con todos los atributos como parámetros de
entrada.La clase “Fecha” con los siguientes atributos:
 dia
 mes
 anyo
Todos los datos son privados, por lo que la clase deberá tener métodos
get/set para todos los atributos.
Además un constructor con todos los atributos como parámetros de
entrada.
Y un método que muestre la fecha en formato corto: dd-mm-aaaa
En otra clase (la que contiene el método main) se deberá crear una librería
con los siguientes datos:
 nombre: Librería Municipal
 direccion: Avda. Blasco Ibañez nº 4
En la misma clase main crear los siguientes libros y añadidlos a la librería:
 título: El código da vinci
 Autor: Dan Brawn. Fecha Nacimiento: 2 de junio de 1965.
 Disponible.
 título: El alquimista
 Autor: Paulo Coelho. Fecha Nacimiento: 12 de diciembre de
1959.
 No Disponible. título: El diario de Ana Frank
 Autor: Ana Frank. Fecha Nacimiento: 7 de Abril de 1934.
 Disponible.
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

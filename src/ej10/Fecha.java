
package ej10;

import java.util.Calendar;


public class Fecha {
/*
         La clase “Fecha” con los siguientes atributos:
 dia
 mes
 anyo
Todos los datos son privados, por lo que la clase deberá tener métodos
get/set para todos los atributos.
Además un constructor con todos los atributos como parámetros de
entrada.
    */
    private int day;
    private int month;
    private int year;
   
    //Constructor con los parámetros con día, mes y año.
    
    public Fecha(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    // Métodos set y get para los 3 atributos.
    public int getDia(){
        return this.day;
    }
    public int getMes(){
        return this.month;
    }
    public int getAnyo(){
        return this.year;
    }
    public void setDia(int day){
        this.day=day;
    }
    public void setMes(int month){
        this.month=month;
    }
    public void setAnyo(int year){
        this.year=year;
    }
    //corta(): mostrará la fecha en formato corto (02-09-2003). 
    public String corta(){
        return this.day+"-"+this.month+"-"+this.year;
    }
}

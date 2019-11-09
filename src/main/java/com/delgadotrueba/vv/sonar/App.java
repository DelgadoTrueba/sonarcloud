package com.delgadotrueba.vv.sonar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello SonarCloud!" );
        
        Concesionario concesionario = new Concesionario();
        concesionario.mostrarMarcasDelConcesionario();
        concesionario.getNombreMarca("BMW");
    }
    
}

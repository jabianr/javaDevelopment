package com.java24hours; // package es un grupo de archivos java y representa el nombre del programa

// El nombre de la clase debe ser idéntico al nombre del archivo .java
// Las mayúsculas deben de coicidir en ambos nombres (clase y archivo)
class Saludo{   // nombre de la clase
        
        // Aquí es donde inicia la ejecución del programa
        // Punto de entrada, solo puede existir uno en todo el programa
        public static void main(String [] args){ 
            // Aquí va el codigo a ejecutar
            
            // Doble diagonal indica que es un comentario
            
            /*
            ** Bloque de comentarios
            ** inicia con diagonal asterisco y termina con asterisco diagona
            */
            
            // Todos los comentarios son ignorados por el compilador
            
            // Variables - almacenan informacion que puede cambiar a lo largo del programa
            // Tipos de variables básicos
            int entero;                 // Numeros enteros
            short enteroChico;          // Numeros enteros Chicos
            long enteroGrande;          // Numeros enteros Grandes
            char caracter;              // Caracteres
            boolean boleano;            // Verdadero o Falso
            float puntoFlotante;        // Numeros con punto decimal
            double puntoFlotanteGrande; // Numeros con punto decimal grandes
            String cadena;              // Cadena de caracteres
            
            // Almacenar información o asignación de variables
            entero = 2147483647;
            boleano = true;
            puntoFlotante = 15.18f;
            puntoFlotanteGrande = 7.0; // ó tambien 7.0d
            cadena = "Hola mundo!";
            
            // Mostrar mensajes y contenido de variables en consola
            System.out.println("Primer programa");
            System.out.println("Contenido de la variable entero: " + entero);
            System.out.println(cadena);
            
            
            
            
            
        }
}
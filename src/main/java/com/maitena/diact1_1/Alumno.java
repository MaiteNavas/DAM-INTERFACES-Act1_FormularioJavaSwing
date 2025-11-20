
package com.maitena.diact1_1;

/**
 *
 * @author maite
 */
public class Alumno {
   private String nombre;
   private String apellidos;
   private String email;
   private int edad;
   private String telefono;
   
   public Alumno(String nombre, String apellidos, String email, int edad, String telefono){
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.email = email;
       this.edad = edad;
       this.telefono = telefono;
    }
    public Alumno(String nombre, String apellidos, int edad){

       this(nombre, apellidos, "",edad, "");
    }
    
    public Alumno(){
        this("", "", "",0, "");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        /**
     * devuelve true cuando la edad del alumno es igual o mayor de 18
     */
    boolean esMayorDeEdad(){
        if(this.edad>=18){
            System.out.println("El alumno es mayor de edad");
            return true;
        }else{
            System.out.println("El alumno no es mayor de edad");
            return false;
        }
         
    }
      
}

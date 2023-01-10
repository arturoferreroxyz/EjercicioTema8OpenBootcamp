public class Main {
    /**
     *
     *Ejercicio para practicar la encapsulación:
     *
     *  Crear clase Persona.
     *
     *  Crear variables las privadas edad, nombre y telefono de la clase Persona.
     *
     *  Crear gets y sets de cada propiedad.
     *
     *  Crear un objeto persona en el main.
     *
     *  Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a los ejercicios del tema 8 de Open Bootcamp");
        Persona personaPrueba= new Persona();

        personaPrueba.setEdad(12);
        personaPrueba.setNombre("Alberto");
        personaPrueba.setTelefono(666);

        System.out.println("La persona se llama "+personaPrueba.getNombre()+", su edad es "+personaPrueba.getEdad()+" y su telefono es "+personaPrueba.getTelefono());



    }
}
 class Persona{
    //Atributos
     private int edad;
     private String nombre;
     private int telefono;
     //Metodos
     public void setEdad(int edad) {
         this.edad = edad;
     }

     public int getEdad() {
         return edad;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public String getNombre() {
         return nombre;
     }
     public void setTelefono(int telefono) {
         this.telefono = telefono;
     }
     public int getTelefono() {
         return telefono;
     }
 }

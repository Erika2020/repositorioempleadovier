/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author 503
 */
public class Empleado {
    //atrubitos = datos = variables
    int id;  // solo s declara
    String nombre;  // es una clase 
    String cargo; 
    int salario;
    String telefono; 
    String direccion;
    
    //metodo especial = fotocopia = inicia clase = constructor " es una funcion especial que se encarga  de ejecutar nuestro codigo "
  

    public Empleado(int id, String nombre, String cargo, int salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

   
     // metodos = acciones = funciones 
    
    public int calcularsalario(){
    return(0);
    
    }
}
   

    

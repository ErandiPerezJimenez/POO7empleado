
package Poop7;


public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;
    public Empleado() {
    }
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public void setSueldo(int sueldo) {
        if(sueldo>=0){
           this.sueldo = sueldo; 
        }
        
    }  
    public void aumentarSueldo(int porcentaje){
        sueldo=(sueldo+(sueldo*porcentaje/100));
        
    }
    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }   
}

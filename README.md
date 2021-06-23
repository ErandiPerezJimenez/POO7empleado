# POO7empleado
Git pages
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
**************************************************************************************************************************************************************************
package Poop7;


public class Gerente extends Empleado {
    private int presupuesto;

    public Gerente() {
    }

    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
}
*****************************************************************************************************************************************************************************
package Poop7;

public class Main {

    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setNombre("Erandi Perez");
        ger.setNumEmpleado(9638);
        ger.setSueldo(16000);

        System.out.println(ger);
        System.out.println(ger.getNombre());
        System.out.println(ger.getNumEmpleado());
        System.out.println(10);
        System.out.println(ger.getSueldo());
        ger.asignarPresupuesto(100000);
        System.out.println(ger.getPresupuesto());

        System.out.println("**********************************************");
        if (ger instanceof Gerente) {
            System.out.println("Instancia de Gerente");
        }
        if (ger instanceof Empleado) {
            System.out.println("Instancia de Empleado");
        }

        if (ger instanceof Object) {
            System.out.println("Instancia de Object");
        }
        System.out.println("*************************************************");
        Gerente ger2 = new Gerente(50000,"PaulaAzul",1234,20000);
        System.out.println(ger2);
    }
}

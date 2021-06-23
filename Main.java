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

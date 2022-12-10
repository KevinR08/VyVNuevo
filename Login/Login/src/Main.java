import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 5;
        Persona persona;
        listaPersonas lista = new listaPersonas();
        while(opc!=0){
        System.out.println("\t**MENÚ**" +
                "\n1. Registrar usuario" +
                "\n2. Login"+
                "\n3. Ver usuarios registrados"+
                "\n4. Verificación de no ser un robot"+
                "\n5. Salir");

        opc = sc.nextInt();
        String usuario;
        String contraseña;

            switch (opc) {
                case 1:
                    System.out.println("Ingrese usuario");
                    usuario = sc.next();
                    System.out.println("Ingrese contraseña");
                    contraseña = sc.next();
                    persona = new Persona(usuario, contraseña);
                    lista.addPersona(persona);
                    break;
                case 2:
                    System.out.println("LOGIN");
                    System.out.println("Ingrese usuario");
                    usuario = sc.next();
                    System.out.println("Ingrese contraseña");
                    contraseña = sc.next();
                    //Definir la variable contraseña como tipo int puede reflejar un defecto del sistema
                    //Que obliga al usuario a ingresar completamente valores numéricos al sistema.
                    lista.verificarContraseña(usuario, contraseña);
                    break;
                case 3:
                    System.out.println("Lista de usuarios registrados");
                    lista.toStringLista();
                    break;
                case 4:
                    //Ejemplo de fallo no capturado en tiempo de ejecución con una sentencia try catch
                    //Muestra una manifestación de defecto con un mensaje no programado.
                    System.out.println("Ingrese el número 54");
                    int num= sc.nextInt();
            }
        }
    }
}
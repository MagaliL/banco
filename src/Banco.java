import java.util.Scanner;

public class Banco {
    public static void main (String [] args){
        String nombre = "Tony Stark";
        String tipoCuenta= "Premium";
        Double saldo = 1599.99;
        int opcion = 0;

        System.out.println("**************");
        System.out.println("\n Bienvenid@");
        System.out.println("Nombre del cliente: " +nombre);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo disponible: $ "+saldo);
        System.out.println("\n**************");

        String menu = """
                ***Escribe el número de la opción deseada***
                1) Consultar saldo
                2) Retirar
                3) Depositar
                9) Salir
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {

            System.out.println(menu);
            System.out.println("Ingrese su operación:");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("\nTu saldo actualizado es de: "+saldo);
                    System.out.println("*****");
                    break;

                case 2:
                    System.out.println("\n¿Cuál es la cantidad que desea retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if(saldo < valorRetirar){
                        System.out.println("No es posible hacer el retiro: saldo insuficiente");
                        System.out.println("*****");

                    } else{
//                        saldo = saldo - valorRetirar;
                        saldo -= valorRetirar;
                        System.out.println("\nRetiro exitoso. Su saldo actual es de: "+saldo);
                        System.out.println("*****");
                    }
                    break;
                case 3:
                    System.out.println("\n¿Cuál es la cantidad que desea depositar?");
                    double valorDeposito = teclado.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Su deposito fue exitoso. Su saldo actualizado es de: "+saldo);
                    System.out.println("*****");
                    break;
                case 9:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }



    }
}


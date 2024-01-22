package org.example;


import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotal;

        Boolean tienelicenciaElConductor;
        String tipoDeCompra;

        Scanner leerDato = new Scanner(System.in);

        //PROCESO
        System.out.println("****************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("****************");

        System.out.println("Apreciado Cliente Usted Cuenta Con Licencia?");
        tienelicenciaElConductor=leerDato.hasNextBoolean();

        //PRIMERA PREGUNTA O DECISION
        if (tienelicenciaElConductor==true){
            // SI TIENE LICENCIA
            System.out.print("Nombres del cliente: ");
            nombres=leerDato.nextLine();
            leerDato.nextLine();

            System.out.print("Apellidos del cliente: ");
            apellidos=leerDato.nextLine();

            System.out.print("Tipo de documento: ");
            tipoDocumento=leerDato.nextLine();

            System.out.print("Número documento: ");
            documento=leerDato.nextLine();

            System.out.print("Telefono celular: ");
            telefonoMovil=leerDato.nextLine();

            System.out.print("Telefono fijo: ");
            telefonoFijo=leerDato.nextLine();

            System.out.print("Dirección: ");
            direccion=leerDato.nextLine();

            System.out.print("Documento fiador: ");
            documentoFiador=leerDato.nextLine();

            System.out.print("Nombres fiador: ");
            nombresFiador=leerDato.nextLine();

            System.out.println("Nuestras Motocicletas: ");
            System.out.println("1. Yamaha SZR-125---$9000000");
            System.out.println("2. Yamaha crypton FI---$8000000");
            System.out.println("3. Yamaha XTZ125---$10500000");
            System.out.println("4. Yamaha MT10---$72000000");
            System.out.println("5. Yamaha NMAX300---$34000000");

            Integer motoSeleccionada;
            System.out.println("Digite la motocicleta deseada");
            motoSeleccionada=leerDato.nextInt();
            Double valorMoto=0.0;

            if (motoSeleccionada==1){
                valorMoto=9000000.0;
            } else if (motoSeleccionada==2) {
                valorMoto=8000000.0;
            } else if (motoSeleccionada==3) {
                valorMoto=10500000.0;
            } else if (motoSeleccionada==4) {
                valorMoto=72000000.0;
            } else if (motoSeleccionada==5) {
                valorMoto=34000000.0;
            }else {
                System.out.println("Moto Invalida");
            }

            // 2. PREGUNTA: LO QUIERE A CREDITO?

            System.out.println("Usuario Digite /credito O /contado Para Continuar Su Compra: ");
            leerDato.nextLine();
            tipoDeCompra=leerDato.nextLine().toLowerCase(Locale.ROOT);

            if (tipoDeCompra.equals("credito")){

                //PREGUNTAR PORCENTAJE A FINANCIAR

                Double porcentajeDeCredito;
                System.out.println("Ingresa el porcentaje a financiar: ");
                porcentajeDeCredito=leerDato.nextDouble();

                if(porcentajeDeCredito==1.0){

                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajeDeCredito==0.7) {

                    Double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajeDeCredito==0.5) {

                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else {
                    System.out.println("Opción invalida");

                }


            }else {
                System.out.println("Excelente Le Daremos Un Descuento Del 10%");
            }
        }else {
            // NO TIENE LICENCIA
            System.out.println("Apreciado Usuario No Podemos Continuar La Transacción");
            System.out.println("Lo Invitamos A Tramitar Su Licencia, Vuelva Pronto...");
        }















    }

}
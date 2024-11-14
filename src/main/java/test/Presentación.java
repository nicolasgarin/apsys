package test;

import negocio.FuncionesImpl;
import java.sql.*;
import java.util.*;
import negocio.IFunciones;

public class Presentación {

    public static void main(String[] args) throws SQLException {

        var opcion = -1;

        var scanner = new Scanner(System.in);
        IFunciones apsys = new FuncionesImpl();

        while (opcion != 0) {
            System.out.println("Bienvenido al sistema de registro de partidos y pronóstico de apuestas. Elige una opcion: \n"
                    + "1. Listar partidos\n"
                    + "2. Agregar partido\n"
                    + "3. Iniciar pronosticador\n"
                    + "4. Ver estadísticas generales\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    var opcionA = -1;
                    while (opcionA != 0) {
                        System.out.println("Qué partidos quiere listar? \n"
                                + "1. Listar por liga\n"
                                + "2. Listar todos\n"
                                + "0. Volver");
                        opcionA = Integer.parseInt(scanner.nextLine());

                        switch (opcionA) {
                            case 1:
                                String liga = "";
                                System.out.println("Ingrese liga o pais");
                                liga = scanner.nextLine();
                                apsys.listarPartidos(liga);
                                break;
                            case 2:
                                apsys.listarPartidos();
                                break;
                            case 0:

                                break;
                            default:
                                System.out.println("Opcion no reconocida");
                                break;
                        }
                    }
                    break;
                case 2:
                    apsys.agregarPartidoCompleto();
                    break;
                case 3:
                    var opcionPron = -1;
                    System.out.println("En qué momento se encuentra el partido?\n"
                            + "2. Entretiempo\n"
                            + "3. Fin 3er período\n");
                    opcionPron = Integer.parseInt(scanner.nextLine());

                    switch (opcionPron) {
                        case 2:
                            apsys.inicializarPartido2C();
                            break;
                        case 3:
                            apsys.inicializarPartido3C();
                            break;
                        default:
                            System.out.println("Opcion no reconocida");
                            break;
                    }
                    
                    break;
                case 4:
                    apsys.cargarDatosGenerales();
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}

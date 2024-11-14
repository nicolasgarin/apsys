package negocio;

import datos.IPartidoDao;
import datos.PartidoDaoJDBC;
import domain.*;
import java.sql.SQLException;
import java.util.Scanner;

public class FuncionesImpl implements IFunciones {

    private final IPartidoDao datos;
    private String predic3p;

    public FuncionesImpl() {
        this.datos = new PartidoDaoJDBC();
    }
    Condiciones cond = new Condiciones();
    Condiciones condbasicas = new Condiciones();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void inicializarPartido2C() {
        System.out.println("Introduce la fecha del partido");
        var fecha = scanner.nextLine();
        System.out.println("Introduce la liga del partido");
        var liga = scanner.nextLine();
        System.out.println("Introduce el nombre del equipo locatario");
        var equipoA = scanner.nextLine();
        System.out.println("Introduce el nombre del equipo visitante");
        var equipoB = scanner.nextLine();
        System.out.println("Indica qué equipo es el favorito a ganar");
        var favorito = scanner.nextLine();
        System.out.println("Indica el dividendo del equipo favorito");
        String divFavString = scanner.nextLine();
        double divFavorito = Double.valueOf(divFavString);
        System.out.println("¿Cúantos puntos hizo " + equipoA + " en el primer cuarto?");
        var p1A = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoB + " en el primer cuarto?");
        var p1B = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoA + " en el segundo cuarto?");
        var p2A = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoB + " en el segundo cuarto?");
        var p2B = scanner.nextInt();
        Partido partido = new Partido(fecha, liga, equipoA, equipoB, p1A, p1B, p2A, p2B, favorito, divFavorito);
        System.out.println("El partido se ha cargado al sistema");
        partido.toStringTable(2);
        cond.setearCondiciones(partido);
        cond.pronostic3erCAvanzado(partido);
        System.out.println(cond.toString());
    }

    @Override
    public void inicializarPartido3C() {
        String fecha = null;
        System.out.println("Introduce la liga del partido");
        var liga = scanner.nextLine();
        System.out.println("Introduce el nombre del equipo locatario");
        var equipoA = scanner.nextLine();
        System.out.println("Introduce el nombre del equipo visitante");
        var equipoB = scanner.nextLine();
        System.out.println("Indica qué equipo es el favorito a ganar");
        var favorito = scanner.nextLine();
        System.out.println("Indica el dividendo del equipo favorito");
        String divFavString = scanner.nextLine();
        double divFavorito = Double.valueOf(divFavString);
        System.out.println("¿Cúantos puntos hizo " + equipoA + " en el primer cuarto?");
        var p1A = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoB + " en el primer cuarto?");
        var p1B = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoA + " en el segundo cuarto?");
        var p2A = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoB + " en el segundo cuarto?");
        var p2B = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoA + " en el tercer cuarto?");
        var p3A = scanner.nextInt();
        System.out.println("¿Cúantos puntos hizo " + equipoB + " en el tercer cuarto?");
        var p3B = scanner.nextInt();
        Partido partido = new Partido(fecha, liga, equipoA, equipoB, p1A, p1B, p2A, p2B, favorito, divFavorito, p3A, p3B);
        System.out.println("El partido se ha agregado con éxito a la base de datos");
        partido.toStringTable(2);
        cond.setearCondiciones(partido);
        cond.pronostic3erCAvanzado(partido);
    }

    @Override
    public void agregarPartidoCompleto() {
        try {
            System.out.println("Introduce la fecha del partido");
            var fecha = scanner.nextLine();
            System.out.println("Introduce la liga del partido");
            var liga = scanner.nextLine();
            System.out.println("Introduce el nombre del equipo locatario");
            var equipoA = scanner.nextLine();
            System.out.println("Introduce el nombre del equipo visitante");
            var equipoB = scanner.nextLine();
            System.out.println("Indica qué equipo es el favorito a ganar");
            var favorito = scanner.nextLine();
            System.out.println("Indica el dividendo del equipo favorito");
            String divFavString = scanner.nextLine();
            double divFavorito = Double.valueOf(divFavString);
            System.out.println("¿Cúantos puntos hizo " + equipoA + " en el primer cuarto?");
            var p1A = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoB + " en el primer cuarto?");
            var p1B = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoA + " en el segundo cuarto?");
            var p2A = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoB + " en el segundo cuarto?");
            var p2B = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoA + " en el tercer cuarto?");
            var p3A = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoB + " en el tercer cuarto?");
            var p3B = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoA + " en el último cuarto?");
            var p4A = scanner.nextInt();
            System.out.println("¿Cúantos puntos hizo " + equipoB + " en el último cuarto?");
            var p4B = scanner.nextInt();
            scanner.nextLine();
            Partido partido = new Partido(fecha, liga, equipoA, equipoB, p1A, p1B, p2A, p2B, favorito, divFavorito, p3A, p3B, p4A, p4B);
            partido.toStringTable(4);
            System.out.println("Cargar partido? Y/N");
            String opcion = "";
            opcion = scanner.nextLine();

            switch (opcion) {
                case "Y":
                    this.datos.insert(partido);
                    System.out.println("El partido se ha agregado con éxito a la base de datos");
                    break;
                case "N":
                    agregarPartidoCompleto();
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPartidos() {
        try {
            var partidos = this.datos.select();
            var stats = new Estadistica();
            
            for (Partido partido : partidos) {
                stats.setPartidosAnalizados(stats.getPartidosAnalizados() + 1);
                cond.setearCondiciones(partido);
                cond.pronostic3erCAvanzado(partido);
                if (partido.getPredicted3() == partido.getGp3()) {
                    stats.setPartidosAcertados(stats.getPartidosAcertados() + 1);
                } else if (partido.getPredicted3() == "N") {
                    stats.setPartidosSPronost(stats.getPartidosSPronost() + 1);
                }/* else if (partido.getPredicted3().equals("N") && partido.getGp3() != cond.pronostic3erCSimple(partido)){
                    stats.setAciertossnpronostico(stats.getAciertossnpronostico() + 1);
                }*/ else
                {
                    stats.setPartidosErrados(stats.getPartidosErrados() + 1);
                }
                if ((partido.getGp1().equals("A") && partido.getGp2().equals("A")) || (partido.getGp1().equals("B") && partido.getGp2().equals("B"))) {
                    stats.setTotalPartidosAA(stats.getTotalPartidosAA() + 1);
                    if (partido.getPredicted3() == partido.getGp3()) {
                        stats.setAcertadosAA(stats.getAcertadosAA() + 1);
                    } else if (partido.getPredicted3() == "N") {
                        stats.setSinpronosticoAA(stats.getSinpronosticoAA() + 1);
                    } else {
                        stats.setErradosAA(stats.getErradosAA() + 1);
                    }
                }
                if ((partido.getGp1().equals("A") && partido.getGp2().equals("B")) || (partido.getGp1().equals("B") && partido.getGp2().equals("A"))) {
                    stats.setTotalPartidosAB(stats.getTotalPartidosAB() + 1);
                    if (partido.getPredicted3() == partido.getGp3()) {
                        stats.setAcertadosAB(stats.getAcertadosAB() + 1);
                    } else if (partido.getPredicted3() == "N") {
                        stats.setSinpronosticoAB(stats.getSinpronosticoAB() + 1);
                    } else {
                        stats.setErradosAB(stats.getErradosAB() + 1);
                    }
                }
                partido.toStringTable(4);

            }
            stats.setPorcentAcierto(stats.getPartidosAcertados(), stats.getPartidosErrados());
            stats.setPorcentajeAA(stats.getAcertadosAA(), stats.getErradosAA());
            stats.setPorcentajeAB(stats.getAcertadosAB(), stats.getErradosAB());
            stats.settotalespronost();
            stats.toStringTable();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPartidos(String liga) {
        try {
            var partidos = this.datos.select();
            var stats = new Estadistica();
            if (liga.equals("Europa")) {
                for (Partido partido : partidos) {
                    if (partido.getLiga().equals("EUR") || partido.getLiga().equals("ESP") || partido.getLiga().equals("ALE") || partido.getLiga().equals("GRE") || partido.getLiga().equals("ITA") || partido.getLiga().equals("FRA") || partido.getLiga().equals("GEO") || partido.getLiga().equals("TUR") || partido.getLiga().equals("POR")) {
                        stats.setPartidosAnalizados(stats.getPartidosAnalizados() + 1);
                        cond.setearCondiciones(partido);
                        cond.pronostic3erCAvanzado(partido);
                        if (partido.getPredicted3() == partido.getGp3()) {
                            stats.setPartidosAcertados(stats.getPartidosAcertados() + 1);
                        } else if (partido.getPredicted3() == "N") {
                            stats.setPartidosSPronost(stats.getPartidosSPronost() + 1);
                        } else {
                            stats.setPartidosErrados(stats.getPartidosErrados() + 1);
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("A")) || (partido.getGp1().equals("B") && partido.getGp2().equals("B"))) {
                            stats.setTotalPartidosAA(stats.getTotalPartidosAA() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAA(stats.getAcertadosAA() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAA(stats.getSinpronosticoAA() + 1);
                            } else {
                                stats.setErradosAA(stats.getErradosAA() + 1);
                            }
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("B")) || (partido.getGp1().equals("B") && partido.getGp2().equals("A"))) {
                            stats.setTotalPartidosAB(stats.getTotalPartidosAB() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAB(stats.getAcertadosAB() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAB(stats.getSinpronosticoAB() + 1);
                            } else {
                                stats.setErradosAB(stats.getErradosAB() + 1);
                            }
                        }
                        partido.toStringTable(4);
                    }
                }
            } else if (liga.equals("Sudamerica")) {
                for (Partido partido : partidos) {
                    if (partido.getLiga().equals("AME") || partido.getLiga().equals("BRA") || partido.getLiga().equals("ARG") || partido.getLiga().equals("URU") || partido.getLiga().equals("COL")) {
                        stats.setPartidosAnalizados(stats.getPartidosAnalizados() + 1);
                        cond.setearCondiciones(partido);
                        cond.pronostic3erCAvanzado(partido);
                        if (partido.getPredicted3() == partido.getGp3()) {
                            stats.setPartidosAcertados(stats.getPartidosAcertados() + 1);
                        } else if (partido.getPredicted3() == "N") {
                            stats.setPartidosSPronost(stats.getPartidosSPronost() + 1);
                        } else {
                            stats.setPartidosErrados(stats.getPartidosErrados() + 1);
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("A")) || (partido.getGp1().equals("B") && partido.getGp2().equals("B"))) {
                            stats.setTotalPartidosAA(stats.getTotalPartidosAA() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAA(stats.getAcertadosAA() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAA(stats.getSinpronosticoAA() + 1);
                            } else {
                                stats.setErradosAA(stats.getErradosAA() + 1);
                            }
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("B")) || (partido.getGp1().equals("B") && partido.getGp2().equals("A"))) {
                            stats.setTotalPartidosAB(stats.getTotalPartidosAB() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAB(stats.getAcertadosAB() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAB(stats.getSinpronosticoAB() + 1);
                            } else {
                                stats.setErradosAB(stats.getErradosAB() + 1);
                            }
                        }
                        partido.toStringTable(4);
                    }
                }
            } else {
                for (Partido partido : partidos) {
                    if (partido.getLiga().equals(liga)) {
                        stats.setPartidosAnalizados(stats.getPartidosAnalizados() + 1);
                        cond.setearCondiciones(partido);
                        cond.pronostic3erCAvanzado(partido);
                        if (partido.getPredicted3() == partido.getGp3()) {
                            stats.setPartidosAcertados(stats.getPartidosAcertados() + 1);
                        } else if (partido.getPredicted3() == "N") {
                            stats.setPartidosSPronost(stats.getPartidosSPronost() + 1);
                        } else {
                            stats.setPartidosErrados(stats.getPartidosErrados() + 1);
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("A")) || (partido.getGp1().equals("B") && partido.getGp2().equals("B"))) {
                            stats.setTotalPartidosAA(stats.getTotalPartidosAA() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAA(stats.getAcertadosAA() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAA(stats.getSinpronosticoAA() + 1);
                            } else {
                                stats.setErradosAA(stats.getErradosAA() + 1);
                            }
                        }
                        if ((partido.getGp1().equals("A") && partido.getGp2().equals("B")) || (partido.getGp1().equals("B") && partido.getGp2().equals("A"))) {
                            stats.setTotalPartidosAB(stats.getTotalPartidosAB() + 1);
                            if (partido.getPredicted3() == partido.getGp3()) {
                                stats.setAcertadosAB(stats.getAcertadosAB() + 1);
                            } else if (partido.getPredicted3() == "N") {
                                stats.setSinpronosticoAB(stats.getSinpronosticoAB() + 1);
                            } else {
                                stats.setErradosAB(stats.getErradosAB() + 1);
                            }
                        }
                        partido.toStringTable(4);
                    }
                }
            }
            stats.setPorcentAcierto(stats.getPartidosAcertados(), stats.getPartidosErrados());
            stats.setPorcentajeAA(stats.getAcertadosAA(), stats.getErradosAA());
            stats.setPorcentajeAB(stats.getAcertadosAB(), stats.getErradosAB());
            stats.settotalespronost();
            stats.toStringTable();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void cargarDatosGenerales() {
        try {
            var partidos = this.datos.select();
            var datos = new DatosGenerales();
            for (Partido p : partidos) {
                datos.setTotalPart(datos.getTotalPart() + 1);
                cond.setearCondiciones(p);
                if ((p.getGp1().equals("A") && p.getGp2().equals("A") && p.getGp3().equals("A")) || (p.getGp1().equals("B") && p.getGp2().equals("B") && p.getGp3().equals("B"))) {
                    datos.setPartAAA(datos.getPartAAA() + 1);
                }

                if (p.getGp1().equals("A") && p.getGp2().equals("A") && p.getGp3().equals("B")) {
                    datos.setPartAAB(datos.getPartAAB() + 1);
                }

                if ((p.getGp1().equals("B") && p.getGp2().equals("B") && p.getGp3().equals("A"))) {
                    datos.setPartAAB(datos.getPartAAB() + 1);
                }
                if ((p.getGp1().equals("A") && p.getGp2().equals("A") && p.getGp3().equals("-")) || (p.getGp1().equals("B") && p.getGp2().equals("B") && p.getGp3().equals("-"))) {
                    datos.setPartAAN(datos.getPartAAN() + 1);
                }
                if ((p.getGp1().equals("A") && p.getGp2().equals("-") && p.getGp3().equals("A")) || (p.getGp1().equals("B") && p.getGp2().equals("-") && p.getGp3().equals("B"))) {
                    datos.setPartANA(datos.getPartANA() + 1);
                }
                if ((p.getGp1().equals("A") && p.getGp2().equals("-") && p.getGp3().equals("B")) || (p.getGp1().equals("B") && p.getGp2().equals("-") && p.getGp3().equals("A"))) {
                    datos.setPartANB(datos.getPartANB() + 1);
                }
                if ((p.getGp1().equals("A") && p.getGp2().equals("-") && p.getGp3().equals("-")) || (p.getGp1().equals("B") && p.getGp2().equals("-") && p.getGp3().equals("-"))) {
                    datos.setPartANA(datos.getPartANA() + 1);
                }
                if (p.getGp1().equals("A") && p.getGp2().equals("B") && p.getGp3().equals("A")) {
                    datos.setPartABA(datos.getPartABA() + 1);
                    datos.setPartidosABO(datos.getPartidosABO() + 1);
                    if (cond.getArise()) {
                        datos.setABOcantArise(datos.getABOcantArise() + 1);
                    }
                    if (cond.getBrise()) {
                        datos.setABOcantBrise(datos.getABOcantBrise() + 1);
                    }
                    if (cond.getDifABganA()) {
                        datos.setABOcantdifBAganaB(datos.getABOcantdifBAganaB() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setABOcantACbajo(datos.getABOcantACbajo() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setABOcantBCbajo(datos.getABOcantBCbajo() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setABOcantAMalta(datos.getABOcantAMalta() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setABOcantBMalta(datos.getABOcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setABOcantAfav(datos.getABOcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setABOcantBfav(datos.getABOcantBfav() + 1);
                    }
                }
                if (p.getGp1().equals("B") && p.getGp2().equals("A") && p.getGp3().equals("B")) {
                    datos.setPartABA(datos.getPartABA() + 1);
                    datos.setPartidosABO(datos.getPartidosABO() + 1);
                    if (cond.getBrise()) {
                        datos.setABOcantArise(datos.getABOcantArise() + 1);
                    }
                    if (cond.getArise()) {
                        datos.setABOcantBrise(datos.getABOcantBrise() + 1);
                    }
                    if (cond.getDifBAganB()) {
                        datos.setABOcantdifBAganaB(datos.getABOcantdifBAganaB() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setABOcantACbajo(datos.getABOcantACbajo() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setABOcantBCbajo(datos.getABOcantBCbajo() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setABOcantAMalta(datos.getABOcantAMalta() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setABOcantBMalta(datos.getABOcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setABOcantAfav(datos.getABOcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setABOcantBfav(datos.getABOcantBfav() + 1);
                    }
                }
                if (p.getGp1().equals("A") && p.getGp2().equals("B") && p.getGp3().equals("B")) {
                    datos.setPartABB(datos.getPartABB() + 1);
                    datos.setPartidosABB(datos.getPartidosABB() + 1);
                    if (cond.getArise()) {
                        datos.setABBcantArise(datos.getABBcantArise() + 1);
                    }
                    if (cond.getBrise()) {
                        datos.setABBcantBrise(datos.getABBcantBrise() + 1);
                    }
                    if (cond.getDifABganA()) {
                        datos.setABBcantdifABganaA(datos.getABBcantdifABganaA() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setABBcantACbajo(datos.getABBcantACbajo() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setABBcantBCbajo(datos.getABBcantBCbajo() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setABBcantAMalta(datos.getABBcantAMalta() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setABBcantBMalta(datos.getABBcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setABBcantAfav(datos.getABBcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setABBcantBfav(datos.getABBcantBfav() + 1);
                    }
                }
                if ((p.getGp1().equals("B") && p.getGp2().equals("A") && p.getGp3().equals("A"))) {
                    datos.setPartABB(datos.getPartABB() + 1);
                    datos.setPartidosBAA(datos.getPartidosBAA() + 1);
                    if (cond.getArise()) {
                        datos.setBAAcantArise(datos.getBAAcantArise() + 1);
                    }
                    if (cond.getBrise()) {
                        datos.setBAAcantBrise(datos.getBAAcantBrise() + 1);
                    }
                    if (cond.getDifBAganB()) {
                        datos.setBAAcantdifBAganaB(datos.getBAAcantdifBAganaB() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setBAAcantACbajo(datos.getBAAcantACbajo() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setBAAcantBCbajo(datos.getBAAcantBCbajo() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setBAAcantAMalta(datos.getBAAcantAMalta() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setBAAcantBMalta(datos.getBAAcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setBAAcantAfav(datos.getBAAcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setBAAcantBfav(datos.getBAAcantBfav() + 1);
                    }
                }
                if (p.getGp1().equals("A") && p.getGp2().equals("B") && p.getGp3().equals("-")) {
                    datos.setPartABN(datos.getPartABN() + 1);
                    datos.setPartidosABO(datos.getPartidosABO() + 1);
                    if (cond.getArise()) {
                        datos.setABOcantArise(datos.getABOcantArise() + 1);
                    }
                    if (cond.getBrise()) {
                        datos.setABOcantBrise(datos.getABOcantBrise() + 1);
                    }
                    if (cond.getDifABganA()) {
                        datos.setABOcantdifBAganaB(datos.getABOcantdifBAganaB() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setABOcantACbajo(datos.getABOcantACbajo() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setABOcantBCbajo(datos.getABOcantBCbajo() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setABOcantAMalta(datos.getABOcantAMalta() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setABOcantBMalta(datos.getABOcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setABOcantAfav(datos.getABOcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setABOcantBfav(datos.getABOcantBfav() + 1);
                    }
                }
                if (p.getGp1().equals("B") && p.getGp2().equals("A") && p.getGp3().equals("-")) {
                    datos.setPartABN(datos.getPartABN() + 1);
                    datos.setPartidosABO(datos.getPartidosABO() + 1);
                    if (cond.getBrise()) {
                        datos.setABOcantArise(datos.getABOcantArise() + 1);
                    }
                    if (cond.getArise()) {
                        datos.setABOcantBrise(datos.getABOcantBrise() + 1);
                    }
                    if (cond.getDifBAganB()) {
                        datos.setABOcantdifBAganaB(datos.getABOcantdifBAganaB() + 1);
                    }
                    if (cond.getBCbajo()) {
                        datos.setABOcantACbajo(datos.getABOcantACbajo() + 1);
                    }
                    if (cond.getACbajo()) {
                        datos.setABOcantBCbajo(datos.getABOcantBCbajo() + 1);
                    }
                    if (cond.getBMalta()) {
                        datos.setABOcantAMalta(datos.getABOcantAMalta() + 1);
                    }
                    if (cond.getAMalta()) {
                        datos.setABOcantBMalta(datos.getABOcantBMalta() + 1);
                    }
                    if (p.getFavorito().equals("B")) {
                        datos.setABOcantAfav(datos.getABOcantAfav() + 1);
                    }
                    if (p.getFavorito().equals("A")) {
                        datos.setABOcantBfav(datos.getABOcantBfav() + 1);
                    }
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("A")) || (p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("B"))) {
                    datos.setPartNAA(datos.getPartNAA() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("B")) || (p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("A"))) {
                    datos.setPartNAB(datos.getPartNAB() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("-")) || (p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("-"))) {
                    datos.setPartNAN(datos.getPartNAN() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("A")) || (p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("B"))) {
                    datos.setPartNBA(datos.getPartNBA() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("B")) || (p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("A"))) {
                    datos.setPartNBB(datos.getPartNBB() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("B") && p.getGp3().equals("-")) || (p.getGp1().equals("-") && p.getGp2().equals("A") && p.getGp3().equals("-"))) {
                    datos.setPartNBN(datos.getPartNBN() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("A")) || (p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("B"))) {
                    datos.setPartNNA(datos.getPartNNA() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("B")) || (p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("A"))) {
                    datos.setPartNNB(datos.getPartNNB() + 1);
                }
                if ((p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("-")) || (p.getGp1().equals("-") && p.getGp2().equals("-") && p.getGp3().equals("-"))) {
                    datos.setPartNNN(datos.getPartNNN() + 1);
                }
            }
            datos.setPorcentajes();
            datos.toStringTable();
            datos.datosABB();
            datos.datosBAA();
            datos.datosABO();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}

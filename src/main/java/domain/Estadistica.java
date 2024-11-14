package domain;

public class Estadistica {

    private int partidosAnalizados;
    private int partidosPronosticados;
    private int partidosAcertados;
    private int partidosErrados;
    private int partidosSPronost;
    private int aciertossnpronostico;
    private int porcentAcierto;
    private int ganadosFav;
    private int ganadosNoFav;
    private int totalPartidosAA;
    private int totalPronosticadosAA;
    private int acertadosAA;
    private int erradosAA;
    private int sinpronosticoAA;
    private int totalPartidosAB;
    private int totalPronosticadosAB;
    private int acertadosAB;
    private int erradosAB;
    private int sinpronosticoAB;
    private int porcentajeAA;
    private int porcentajeAB;

    public Estadistica() {
    }

    public Estadistica(int partidosAnalizados, int partidosAcertados, int partidosErrados, int partidosSPronost, int totalPartidosAA, int acertadosAA, int erradosAA, int sinpronosticoAA, int totalPartidosAB, int acertadosAB, int erradosAB ) {
        this.partidosAnalizados = partidosAnalizados;
        this.partidosAcertados = partidosAcertados;
        this.partidosErrados = partidosErrados;
        this.partidosSPronost = partidosSPronost;
        this.totalPartidosAA = totalPartidosAA;
        this.acertadosAA = acertadosAA;
        this.erradosAA = erradosAA;
        this.sinpronosticoAA = totalPartidosAA - acertadosAA - erradosAA;
        this.totalPartidosAB = totalPartidosAB;
        this.acertadosAB = acertadosAB;
        this.erradosAB = erradosAB;
        this.sinpronosticoAB = totalPartidosAB - acertadosAB - erradosAB;   
        if (this.partidosAcertados > 0) {
        this.porcentAcierto = (this.partidosAcertados * 100) / (this.partidosAcertados + this.partidosErrados);
        }
        if (this.porcentajeAA > 0) {
        this.porcentajeAA = (this.acertadosAA * 100) / (this.acertadosAA + this.erradosAA);
        }
        if (this.porcentajeAB > 0) {
        this.porcentajeAB = (this.acertadosAB * 100) / (this.acertadosAB + this.erradosAB);
        }
    }

    public int getPartidosAnalizados() {
        return this.partidosAnalizados;
    }

    public void setPartidosAnalizados(int partidosAnalizados) {
        this.partidosAnalizados = partidosAnalizados;
    }

    public int getPartidosPronosticados() {
        return partidosPronosticados;
    }

    public void setPartidosPronosticados(int partidosPronosticados) {
        this.partidosPronosticados = partidosPronosticados;
    }

    public int getPartidosAcertados() {
        return this.partidosAcertados;
    }

    public void setPartidosAcertados(int partidosAcertados) {
        this.partidosAcertados = partidosAcertados;
    }

    public int getPartidosErrados() {
        return this.partidosErrados;
    }

    public void setPartidosErrados(int partidosErrados) {
        this.partidosErrados = partidosErrados;
    }

    public int getPartidosSPronost() {
        return this.partidosSPronost;
    }

    public void setPartidosSPronost(int partidosSPronost) {
        this.partidosSPronost = partidosSPronost;
    }

    public int getPorcentAcierto() {
        return this.porcentAcierto;
    }

    public void setPorcentAcierto(int ganados, int perdidos) {
        if (ganados > 0) {
        this.porcentAcierto = (ganados * 100) / (ganados + perdidos);
        }
    }

    public int getGanadosFav() {
        return this.ganadosFav;
    }

    public void setGanadosFav(int ganadosFav) {
        this.ganadosFav = ganadosFav;
    }

    public int getGanadosNoFav() {
        return this.ganadosNoFav;
    }

    public void setGanadosNoFav(int ganadosNoFav) {
        this.ganadosNoFav = ganadosNoFav;
    }

    public int getTotalPartidosAA() {
        return totalPartidosAA;
    }

    public int getAciertossnpronostico() {
        return aciertossnpronostico;
    }

    public void setAciertossnpronostico(int aciertossnpronostico) {
        this.aciertossnpronostico = aciertossnpronostico;
    }

    public void setTotalPartidosAA(int totalPartidosAA) {
        this.totalPartidosAA = totalPartidosAA;
    }

    public int getAcertadosAA() {
        return acertadosAA;
    }

    public void setAcertadosAA(int acertadosAA) {
        this.acertadosAA = acertadosAA;
    }

    public int getErradosAA() {
        return erradosAA;
    }

    public void setErradosAA(int erradosAA) {
        this.erradosAA = erradosAA;
    }

    public int getSinpronosticoAA() {
        return sinpronosticoAA;
    }

    public void setSinpronosticoAA(int sinpronosticoAA) {
        this.sinpronosticoAA = sinpronosticoAA;
    }

    public int getTotalPartidosAB() {
        return totalPartidosAB;
    }

    public void setTotalPartidosAB(int totalPartidosAB) {
        this.totalPartidosAB = totalPartidosAB;
    }

    public int getAcertadosAB() {
        return acertadosAB;
    }

    public void setAcertadosAB(int acertadosAB) {
        this.acertadosAB = acertadosAB;
    }

    public int getErradosAB() {
        return erradosAB;
    }

    public void setErradosAB(int erradosAB) {
        this.erradosAB = erradosAB;
    }

    public int getSinpronosticoAB() {
        return sinpronosticoAB;
    }

    public void setSinpronosticoAB(int sinpronosticoAB) {
        this.sinpronosticoAB = sinpronosticoAB;
    }

    public int getPorcentajeAA() {
        return porcentajeAA;
    }

    public void setPorcentajeAA(int ganados, int perdidos) {
        if (ganados > 0) {
        this.porcentajeAA = (ganados * 100) / (ganados + perdidos);
        }
    }

    public int getPorcentajeAB() {
        return porcentajeAB;
    }

    public void setPorcentajeAB(int ganados, int perdidos) {
        if (ganados > 0) {
        this.porcentajeAB = (ganados * 100) / (ganados + perdidos);
        }
    }

    public int getTotalPronosticadosAA() {
        return totalPronosticadosAA;
    }

    public void setTotalPronosticadosAA(int totalPronosticadosAA) {
        this.totalPronosticadosAA = totalPronosticadosAA;
    }

    public int getTotalPronosticadosAB() {
        return totalPronosticadosAB;
    }

    public void setTotalPronosticadosAB(int totalPronosticadosAB) {
        this.totalPronosticadosAB = totalPronosticadosAB;
    }
    
    
    
    public void settotalespronost(){
        this.partidosPronosticados = partidosAcertados + partidosErrados;
        this.totalPronosticadosAA = acertadosAA + erradosAA;
        this.totalPronosticadosAB = acertadosAB + erradosAB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estadistica{");
        sb.append("partidosAnalizados=").append(partidosAnalizados);
        sb.append(", partidosAcertados=").append(partidosAcertados);
        sb.append(", partidosErrados=").append(partidosErrados);
        sb.append(", partidosSPronost=").append(partidosSPronost);
        sb.append(", porcentAcierto=").append(porcentAcierto);
        sb.append(", ganadosFav=").append(ganadosFav);
        sb.append(", ganadosNoFav=").append(ganadosNoFav);
        sb.append(", totalPartidosAA=").append(totalPartidosAA);
        sb.append(", acertadosAA=").append(acertadosAA);
        sb.append(", erradosAA=").append(erradosAA);
        sb.append(", sinpronosticoAA=").append(sinpronosticoAA);
        sb.append(", totalPartidosAB=").append(totalPartidosAB);
        sb.append(", acertadosAB=").append(acertadosAB);
        sb.append(", erradosAB=").append(erradosAB);
        sb.append(", sinpronosticoAB=").append(sinpronosticoAB);
        sb.append(", porcentajeAA=").append(porcentajeAA);
        sb.append(", porcentajeAB=").append(porcentajeAB);
        sb.append('}');
        return sb.toString();
    }

    public void toStringTable() {
        System.out.println("Total de partidos analizados: " + partidosAnalizados
                + "\nPartidos pronosticados: " + partidosPronosticados
                + "\nPartidos acertados: " + partidosAcertados
                + "\nPartidos errados: " + partidosErrados
                + "\nPartidos sin pronóstico: " + partidosSPronost
                + "\nPartidos sin pronosticar acertados: " + aciertossnpronostico
                + "\nPorcentaje de acierto: " + porcentAcierto + "%"
                + "\n\nTotal partidos AA: " + totalPartidosAA
                + "\nPartidos pronosticados AA: " + totalPronosticadosAA
                + "\nPartidos acertados AA: " + acertadosAA
                + "\nPartidos errados AA: " + erradosAA
                + "\nPartidos sin pronóstico AA: " + sinpronosticoAA
                + "\nPorcentaje acierto AA: " + porcentajeAA + "%"
                + "\n\nTotal partidos AB: " + totalPartidosAB
                + "\nPartidos pronosticados AB: " + totalPronosticadosAB
                + "\nPartidos acertados AB: " + acertadosAB
                + "\nPartidos errados AB: " + erradosAB
                + "\nPartidos sin pronóstico AB: " + sinpronosticoAB
                + "\nPorcentaje acierto AB: " + porcentajeAB + "%"
                + "\n\n-----------------------------------------------\n");
    }

}

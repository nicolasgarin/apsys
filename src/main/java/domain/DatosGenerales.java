package domain;

public class DatosGenerales {
    
    private int totalPart;
    private int partAAA;
    private int porcentAAA;
    private int partAAB;
    private int porcentAAB;
    private int partAAN;
    private int porcentAAN;
    private int partANA;
    private int porcentANA;
    private int partANB;
    private int porcentANB;
    private int partANN;
    private int porcentANN;
    private int partABA;
    private int porcentABA;
    private int partABB;
    private int porcentABB;
    private int partABN;
    private int porcentABN;
    private int partNAA;
    private int porcentNAA;
    private int partNAB;
    private int porcentNAB;
    private int partNAN;
    private int porcentNAN;
    private int partNBA;
    private int porcentNBA;
    private int partNBB;
    private int porcentNBB;
    private int partNBN;
    private int porcentNBN;
    private int partNNA;
    private int porcentNNA;
    private int partNNB;
    private int porcentNNB;
    private int partNNN;
    private int porcentNNN;
    
    //Cuando se da un ABB
    //Contadores de condiciones
    private int partidosABB;
    private int ABBcantArise;
    private int ABBcantBrise;
    private int ABBcantdifABganaA;
    private int ABBcantACbajo;
    private int ABBcantBCbajo;
    private int ABBcantAMalta;
    private int ABBcantBMalta;
    private int ABBcantfavAdivbajo;
    private int ABBcantfavBdivbajo;
    private int ABBcantAfav;
    private int ABBcantBfav;
    
    //Cuando se da un BAA
    //Contadores de condiciones
    private int partidosBAA;
    private int BAAcantArise;
    private int BAAcantBrise;
    private int BAAcantdifBAganaB;
    private int BAAcantACbajo;
    private int BAAcantBCbajo;
    private int BAAcantAMalta;
    private int BAAcantBMalta;
    private int BAAcantfavAdivbajo;
    private int BAAcantfavBdivbajo;
    private int BAAcantAfav;
    private int BAAcantBfav;
    
    //Cuando se da un ABOtro || BAOtro
    private int partidosABO;
    private int ABOcantArise;
    private int ABOcantBrise;
    private int ABOcantdifBAganaB;
    private int ABOcantACbajo;
    private int ABOcantBCbajo;
    private int ABOcantAMalta;
    private int ABOcantBMalta;
    private int ABOcantfavAdivbajo;
    private int ABOcantfavBdivbajo;
    private int ABOcantAfav;
    private int ABOcantBfav;
    
    //Cuando se da un AAB
    
    public DatosGenerales(){
    }

    public int getPartidosABO() {
        return partidosABO;
    }

    public void setPartidosABO(int partidosABO) {
        this.partidosABO = partidosABO;
    }

    public int getABOcantArise() {
        return ABOcantArise;
    }

    public void setABOcantArise(int ABOcantArise) {
        this.ABOcantArise = ABOcantArise;
    }

    public int getABOcantBrise() {
        return ABOcantBrise;
    }

    public void setABOcantBrise(int ABOcantBrise) {
        this.ABOcantBrise = ABOcantBrise;
    }

    public int getABOcantdifBAganaB() {
        return ABOcantdifBAganaB;
    }

    public void setABOcantdifBAganaB(int ABOcantdifBAganaB) {
        this.ABOcantdifBAganaB = ABOcantdifBAganaB;
    }

    public int getABOcantACbajo() {
        return ABOcantACbajo;
    }

    public void setABOcantACbajo(int ABOcantACbajo) {
        this.ABOcantACbajo = ABOcantACbajo;
    }

    public int getABOcantBCbajo() {
        return ABOcantBCbajo;
    }

    public void setABOcantBCbajo(int ABOcantBCbajo) {
        this.ABOcantBCbajo = ABOcantBCbajo;
    }

    public int getABOcantAMalta() {
        return ABOcantAMalta;
    }

    public void setABOcantAMalta(int ABOcantAMalta) {
        this.ABOcantAMalta = ABOcantAMalta;
    }

    public int getABOcantBMalta() {
        return ABOcantBMalta;
    }

    public void setABOcantBMalta(int ABOcantBMalta) {
        this.ABOcantBMalta = ABOcantBMalta;
    }

    public int getABOcantfavAdivbajo() {
        return ABOcantfavAdivbajo;
    }

    public void setABOcantfavAdivbajo(int ABOcantfavAdivbajo) {
        this.ABOcantfavAdivbajo = ABOcantfavAdivbajo;
    }

    public int getABOcantfavBdivbajo() {
        return ABOcantfavBdivbajo;
    }

    public void setABOcantfavBdivbajo(int ABOcantfavBdivbajo) {
        this.ABOcantfavBdivbajo = ABOcantfavBdivbajo;
    }

    public int getABOcantAfav() {
        return ABOcantAfav;
    }

    public void setABOcantAfav(int ABOcantAfav) {
        this.ABOcantAfav = ABOcantAfav;
    }

    public int getABOcantBfav() {
        return ABOcantBfav;
    }

    public void setABOcantBfav(int ABOcantBfav) {
        this.ABOcantBfav = ABOcantBfav;
    }

    public int getPartidosBAA() {
        return partidosBAA;
    }

    public void setPartidosBAA(int partidosBAA) {
        this.partidosBAA = partidosBAA;
    }

    public int getBAAcantArise() {
        return BAAcantArise;
    }

    public void setBAAcantArise(int BAAcantArise) {
        this.BAAcantArise = BAAcantArise;
    }

    public int getBAAcantBrise() {
        return BAAcantBrise;
    }

    public void setBAAcantBrise(int BAAcantBrise) {
        this.BAAcantBrise = BAAcantBrise;
    }

    public int getBAAcantdifBAganaB() {
        return BAAcantdifBAganaB;
    }

    public void setBAAcantdifBAganaB(int BAAcantdifBAganaB) {
        this.BAAcantdifBAganaB = BAAcantdifBAganaB;
    }

    public int getBAAcantACbajo() {
        return BAAcantACbajo;
    }

    public void setBAAcantACbajo(int BAAcantACbajo) {
        this.BAAcantACbajo = BAAcantACbajo;
    }

    public int getBAAcantBCbajo() {
        return BAAcantBCbajo;
    }

    public void setBAAcantBCbajo(int BAAcantBCbajo) {
        this.BAAcantBCbajo = BAAcantBCbajo;
    }

    public int getBAAcantAMalta() {
        return BAAcantAMalta;
    }

    public void setBAAcantAMalta(int BAAcantAMalta) {
        this.BAAcantAMalta = BAAcantAMalta;
    }

    public int getBAAcantBMalta() {
        return BAAcantBMalta;
    }

    public void setBAAcantBMalta(int BAAcantBMalta) {
        this.BAAcantBMalta = BAAcantBMalta;
    }

    public int getBAAcantfavAdivbajo() {
        return BAAcantfavAdivbajo;
    }

    public void setBAAcantfavAdivbajo(int BAAcantfavAdivbajo) {
        this.BAAcantfavAdivbajo = BAAcantfavAdivbajo;
    }

    public int getBAAcantfavBdivbajo() {
        return BAAcantfavBdivbajo;
    }

    public void setBAAcantfavBdivbajo(int BAAcantfavBdivbajo) {
        this.BAAcantfavBdivbajo = BAAcantfavBdivbajo;
    }

    public int getBAAcantAfav() {
        return BAAcantAfav;
    }

    public void setBAAcantAfav(int BAAcantAfav) {
        this.BAAcantAfav = BAAcantAfav;
    }

    public int getBAAcantBfav() {
        return BAAcantBfav;
    }

    public void setBAAcantBfav(int BAAcantBfav) {
        this.BAAcantBfav = BAAcantBfav;
    }

    
    public int getPartidosABB() {
        return partidosABB;
    }

    public void setPartidosABB(int partidosABB) {
        this.partidosABB = partidosABB;
    }

    
    public int getTotalPart() {
        return totalPart;
    }

    public void setTotalPart(int totalPart) {
        this.totalPart = totalPart;
    }

    public int getPartAAA() {
        return partAAA;
    }

    public void setPartAAA(int partAAA) {
        this.partAAA = partAAA;
    }

    public int getPartAAB() {
        return partAAB;
    }

    public void setPartAAB(int partAAB) {
        this.partAAB = partAAB;
    }

    public int getPartAAN() {
        return partAAN;
    }

    public void setPartAAN(int partAAN) {
        this.partAAN = partAAN;
    }

    public int getPartANA() {
        return partANA;
    }

    public void setPartANA(int partANA) {
        this.partANA = partANA;
    }

    public int getPartANB() {
        return partANB;
    }

    public void setPartANB(int partANB) {
        this.partANB = partANB;
    }

    public int getPartANN() {
        return partANN;
    }

    public void setPartANN(int partANN) {
        this.partANN = partANN;
    }

    public int getPartABA() {
        return partABA;
    }

    public void setPartABA(int partABA) {
        this.partABA = partABA;
    }

    public int getPartABB() {
        return partABB;
    }

    public void setPartABB(int partABB) {
        this.partABB = partABB;
    }

    public int getPartABN() {
        return partABN;
    }

    public void setPartABN(int partABN) {
        this.partABN = partABN;
    }

    public int getPartNAA() {
        return partNAA;
    }

    public void setPartNAA(int partNAA) {
        this.partNAA = partNAA;
    }

    public int getPartNAB() {
        return partNAB;
    }

    public void setPartNAB(int partNAB) {
        this.partNAB = partNAB;
    }

    public int getPartNAN() {
        return partNAN;
    }

    public void setPartNAN(int partNAN) {
        this.partNAN = partNAN;
    }

    public int getPartNBA() {
        return partNBA;
    }

    public void setPartNBA(int partNBA) {
        this.partNBA = partNBA;
    }

    public int getPartNBB() {
        return partNBB;
    }

    public void setPartNBB(int partNBB) {
        this.partNBB = partNBB;
    }

    public int getPartNBN() {
        return partNBN;
    }

    public void setPartNBN(int partNBN) {
        this.partNBN = partNBN;
    }

    public int getPartNNA() {
        return partNNA;
    }

    public void setPartNNA(int partNNA) {
        this.partNNA = partNNA;
    }

    public int getPartNNB() {
        return partNNB;
    }

    public void setPartNNB(int partNNB) {
        this.partNNB = partNNB;
    }

    public int getPartNNN() {
        return partNNN;
    }

    public void setPartNNN(int partNNN) {
        this.partNNN = partNNN;
    }

    public int getPorcentAAA() {
        return porcentAAA;
    }

    public void setPorcentAAA(int esto, int total) {
        if (esto > 0){
        this.porcentAAA = (esto * 100) / total;
        }
    }

    public int getPorcentAAB() {
        return porcentAAB;
    }

    public void setPorcentAAB(int esto, int total) {
        if (esto > 0){
        this.porcentAAB = (esto * 100) / total;
        }
    }

    public int getPorcentAAN() {
        return porcentAAN;
    }

    public void setPorcentAAN(int esto, int total) {
        if (esto > 0){
        this.porcentAAN = (esto * 100) / total;
        }
    }

    public int getPorcentANA() {
        return porcentANA;
    }

    public void setPorcentANA(int esto, int total) {
        if (esto > 0){
        this.porcentANA = (esto * 100) / total;
        }
    }

    public int getPorcentANB() {
        return porcentANB;
    }

    public void setPorcentANB(int esto, int total) {
        if (esto > 0){
        this.porcentANB = (esto * 100) / total;
        }
    }

    public int getPorcentANN() {
        return porcentANN;
    }

    public void setPorcentANN(int esto, int total) {
        if (esto > 0){
        this.porcentANN = (esto * 100) / total;
        }
    }

    public int getPorcentABA() {
        return porcentABA;
    }

    public void setPorcentABA(int esto, int total) {
        if (esto > 0){
        this.porcentABA = (esto * 100) / total;
        }
    }

    public int getPorcentABB() {
        return porcentABB;
    }

    public void setPorcentABB(int esto, int total) {
        if (esto > 0){
        this.porcentABB = (esto * 100) / total;
        }
    }

    public int getPorcentABN() {
        return porcentABN;
    }

    public void setPorcentABN(int esto, int total) {
        if (esto > 0){
        this.porcentABN = (esto * 100) / total;
        }
    }

    public int getPorcentNAA() {
        return porcentNAA;
    }

    public void setPorcentNAA(int esto, int total) {
        if (esto > 0){
        this.porcentNAA = (esto * 100) / total;
        }
    }

    public int getPorcentNAB() {
        return porcentNAB;
    }

    public void setPorcentNAB(int esto, int total) {
        if (esto > 0){
        this.porcentNAB = (esto * 100) / total;
        }
    }

    public int getPorcentNAN() {
        return porcentNAN;
    }

    public void setPorcentNAN(int esto, int total) {
        if (esto > 0){
        this.porcentNAN = (esto * 100) / total;
        }
    }

    public int getPorcentNBA() {
        return porcentNBA;
    }

    public void setPorcentNBA(int esto, int total) {
        if (esto > 0){
        this.porcentNBA = (esto * 100) / total;
        }
    }

    public int getPorcentNBB() {
        return porcentNBB;
    }

    public void setPorcentNBB(int esto, int total) {
        if (esto > 0){
        this.porcentNBB = (esto * 100) / total;
        }
    }

    public int getPorcentNBN() {
        return porcentNBN;
    }

    public void setPorcentNBN(int esto, int total) {
        if (esto > 0){
        this.porcentNBN = (esto * 100) / total;
        }
    }

    public int getPorcentNNA() {
        return porcentNNA;
    }

    public void setPorcentNNA(int esto, int total) {
        if (esto > 0){
        this.porcentNNA = (esto * 100) / total;
        }
    }

    public int getPorcentNNB() {
        return porcentNNB;
    }

    public void setPorcentNNB(int esto, int total) {
        if (esto > 0){
        this.porcentNNB = (esto * 100) / total;
        }
    }

    public int getPorcentNNN() {
        return porcentNNN;
    }

    public void setPorcentNNN(int esto, int total) {
        if (esto > 0){
        this.porcentNNN = (esto * 100) / total;
        }
    }

    public int getABBcantArise() {
        return ABBcantArise;
    }

    public void setABBcantArise(int ABBcantArise) {
        this.ABBcantArise = ABBcantArise;
    }

    public int getABBcantBrise() {
        return ABBcantBrise;
    }

    public void setABBcantBrise(int ABBcantBrise) {
        this.ABBcantBrise = ABBcantBrise;
    }

    public int getABBcantdifABganaA() {
        return ABBcantdifABganaA;
    }

    public void setABBcantdifABganaA(int ABBcantdifABganaA) {
        this.ABBcantdifABganaA = ABBcantdifABganaA;
    }

    public int getABBcantACbajo() {
        return ABBcantACbajo;
    }

    public void setABBcantACbajo(int ABBcantACbajo) {
        this.ABBcantACbajo = ABBcantACbajo;
    }

    public int getABBcantBCbajo() {
        return ABBcantBCbajo;
    }

    public void setABBcantBCbajo(int ABBcantBCbajo) {
        this.ABBcantBCbajo = ABBcantBCbajo;
    }

    public int getABBcantAMalta() {
        return ABBcantAMalta;
    }

    public void setABBcantAMalta(int ABBcantAMalta) {
        this.ABBcantAMalta = ABBcantAMalta;
    }

    public int getABBcantBMalta() {
        return ABBcantBMalta;
    }

    public void setABBcantBMalta(int ABBcantBMalta) {
        this.ABBcantBMalta = ABBcantBMalta;
    }

    public int getABBcantfavAdivbajo() {
        return ABBcantfavAdivbajo;
    }

    public void setABBcantfavAdivbajo(int ABBcantfavAdivbajo) {
        this.ABBcantfavAdivbajo = ABBcantfavAdivbajo;
    }

    public int getABBcantfavBdivbajo() {
        return ABBcantfavBdivbajo;
    }

    public void setABBcantfavBdivbajo(int ABBcantfavBdivbajo) {
        this.ABBcantfavBdivbajo = ABBcantfavBdivbajo;
    }

    public int getABBcantAfav() {
        return ABBcantAfav;
    }

    public void setABBcantAfav(int ABBcantAfav) {
        this.ABBcantAfav = ABBcantAfav;
    }

    public int getABBcantBfav() {
        return ABBcantBfav;
    }

    public void setABBcantBfav(int ABBcantBfav) {
        this.ABBcantBfav = ABBcantBfav;
    }
    
    
    
    public void setPorcentajes(){
        setPorcentAAA(this.partAAA, this.totalPart);
        setPorcentAAB(this.partAAB, this.totalPart);
        setPorcentAAN(this.partAAN, this.totalPart);
        setPorcentABA(this.partABA, this.totalPart);
        setPorcentABB(this.partABB, this.totalPart);
        setPorcentABN(this.partABN, this.totalPart);
        setPorcentANA(this.partANA, this.totalPart);
        setPorcentANB(this.partANB, this.totalPart);
        setPorcentANN(this.partANN, this.totalPart);
        setPorcentNAA(this.partNAA, this.totalPart);
        setPorcentNAB(this.partNAB, this.totalPart);
        setPorcentNAN(this.partNAN, this.totalPart);
        setPorcentNBA(this.partNBA, this.totalPart);
        setPorcentNBB(this.partNBB, this.totalPart);
        setPorcentNBN(this.partNBN, this.totalPart);
        setPorcentNNA(this.partNNA, this.totalPart);
        setPorcentNNB(this.partNNB, this.totalPart);
        setPorcentNNN(this.partNNN, this.totalPart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DatosGenerales{");
        sb.append("totalPart=").append(totalPart);
        sb.append(", partAAA=").append(partAAA);
        sb.append(", partAAB=").append(partAAB);
        sb.append(", partAAN=").append(partAAN);
        sb.append(", partANA=").append(partANA);
        sb.append(", partANB=").append(partANB);
        sb.append(", partANN=").append(partANN);
        sb.append(", partABA=").append(partABA);
        sb.append(", partABB=").append(partABB);
        sb.append(", partABN=").append(partABN);
        sb.append(", partNAA=").append(partNAA);
        sb.append(", partNAB=").append(partNAB);
        sb.append(", partNAN=").append(partNAN);
        sb.append(", partNBA=").append(partNBA);
        sb.append(", partNBB=").append(partNBB);
        sb.append(", partNBN=").append(partNBN);
        sb.append(", partNNA=").append(partNNA);
        sb.append(", partNNB=").append(partNNB);
        sb.append(", partNNN=").append(partNNN);
        sb.append('}');
        return sb.toString();
    }
    
    public void toStringTable() {
        System.out.println("Total de partidos analizados: " + totalPart
                + "\n\nPartidos AAA: " + partAAA
                + "\nPorcentaje partidos AAA: " + porcentAAA + "%"
                + "\nPartidos AAB: " + partAAB
                + "\nPorcentaje partidos AAB: " + porcentAAB + "%"
                + "\nPartidos AAN: " + partAAN
                + "\nPorcentaje partidos AAN: " + porcentAAN + "%"
                + "\n\nPartidos ANA: " + partANA
                + "\nPorcentaje partidos ANA: " + porcentANA + "%"
                + "\nPartidos ANB: " + partANB
                + "\nPorcentaje partidos ANB: " + porcentANB + "%"
                + "\nPartidos ANN: " + partANN
                + "\nPorcentaje partidos ANN: " + porcentANN + "%"
                + "\n\nPartidos ABA: " + partABA
                + "\nPorcentaje partidos ABA: " + porcentABA + "%"
                + "\nPartidos ABB: " + partABB
                + "\nPorcentaje partidos ABB: " + porcentABB + "%"
                + "\nPartidos ABN: " + partABN
                + "\nPorcentaje partidos ABN: " + porcentABN + "%"
                + "\n\nPartidos NAA: " + partNAA
                + "\nPorcentaje partidos NAA: " + porcentNAA + "%"
                + "\nPartidos NAB: " + partNAB
                + "\nPorcentaje partidos NAB: " + porcentNAB + "%"
                + "\nPartidos NAN: " + partNAN
                + "\nPorcentaje partidos NAN: " + porcentNAN + "%"
                + "\n\nPartidos NBA: " + partNBA
                + "\nPorcentaje partidos NBA: " + porcentNBA + "%"
                + "\nPartidos NBB: " + partNBB
                + "\nPorcentaje partidos NBB: " + porcentNBB + "%"
                + "\nPartidos NBN: " + partNBN
                + "\nPorcentaje partidos NBN: " + porcentNBN + "%"
                + "\n\nPartidos NNA: " + partNNA
                + "\nPorcentaje partidos NNA: " + porcentNNA + "%"
                + "\nPartidos NNB: " + partNNB
                + "\nPorcentaje partidos NNB: " + porcentNNB + "%"
                + "\nPartidos NNN: " + partNNN
                + "\nPorcentaje partidos NNN: " + porcentNNN + "%"
                + "\n\n-----------------------------------------------\n");
    }
    
    public void datosABB() {
        System.out.println("Total partidos ABB: " + partidosABB
                + "\nCondición Arise (A mete más puntos de un cuarto a otro): " + ABBcantArise
                + "\nCondición Brise: " + ABBcantBrise
                + "\nCondición difABganaA (B gana el segundo cuarto pero no supera a A): " + ABBcantdifABganaA
                + "\nCondición ACbajo (A tiene por lo menos un cuarto bajo): " + ABBcantACbajo
                + "\nCondición BCbajo: " + ABBcantBCbajo
                + "\nCondición AMalta(A mete más de 20 pts en sus dos cuartos): " + ABBcantAMalta
                + "\nCondición BMalta: " + ABBcantBMalta
                + "\nCondición A Favorito: " + ABBcantAfav
                + "\nCondición B favorito: " + ABBcantBfav
                + "\n\n-----------------------------------------------\n");
    }
    
    public void datosBAA() {
        System.out.println("Total partidos BAA: " + partidosBAA
                + "\nCondición Arise (A mete más puntos de un cuarto a otro): " + BAAcantArise
                + "\nCondición Brise: " + BAAcantBrise
                + "\nCondición difBAganaB (B gana el segundo cuarto pero no supera a A): " + BAAcantdifBAganaB
                + "\nCondición ACbajo (A tiene por lo menos un cuarto bajo): " + BAAcantACbajo
                + "\nCondición BCbajo: " + BAAcantBCbajo
                + "\nCondición AMalta(A mete más de 20 pts en sus dos cuartos): " + BAAcantAMalta
                + "\nCondición BMalta: " + BAAcantBMalta
                + "\nCondición A Favorito: " + BAAcantAfav
                + "\nCondición B favorito: " + BAAcantBfav
                + "\n\n-----------------------------------------------\n");
    }
    
    public void datosABO() {
        System.out.println("Total partidos ABO: " + partidosABO
                + "\nCondición Arise (A mete más puntos de un cuarto a otro): " + ABOcantArise
                + "\nCondición Brise: " + ABOcantBrise
                + "\nCondición difBAganaB (B gana el segundo cuarto pero no supera a A): " + ABOcantdifBAganaB
                + "\nCondición ACbajo (A tiene por lo menos un cuarto bajo): " + ABOcantACbajo
                + "\nCondición BCbajo: " + ABOcantBCbajo
                + "\nCondición AMalta(A mete más de 20 pts en sus dos cuartos): " + ABOcantAMalta
                + "\nCondición BMalta: " + ABOcantBMalta
                + "\nCondición A Favorito: " + ABOcantAfav
                + "\nCondición B favorito: " + ABOcantBfav
                + "\n\n-----------------------------------------------\n");
    }
}

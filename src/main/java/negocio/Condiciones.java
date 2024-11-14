package negocio;

import domain.Partido;

public class Condiciones {
    
    private Boolean AB;
    private Boolean AA;
    private Boolean BA;
    private Boolean BB;
    private Boolean AN;
    private Boolean BN;
    
    
    private Boolean Arise;
    private Boolean Brise;
    private Boolean AriseAA;
    private Boolean BriseBB;
    private Boolean difAADecreciente;
    private Boolean difBBDecreciente;
    private Boolean difABganA;
    private Boolean difBAganB;
    private Boolean ACalto;
    private Boolean BCalto;
    private Boolean ACaltoAA;
    private Boolean BCaltoBB;
    private Boolean ACbajo;
    private Boolean BCbajo;
    private Boolean AMalta;
    private Boolean BMalta;
    private Boolean AMbaja;
    private Boolean BMbaja;
    
    private Boolean favoritoAdivbajo;
    private Boolean favoritoBdivbajo;
    
    private Boolean noFavMedio;
    private Boolean noFavAlto;
    
    private int promA;
    private int promB;
    
    
    public Condiciones(){
        
    }

    public Boolean getAB() {
        return AB;
    }

    public void setAB(Boolean AB) {
        this.AB = AB;
    }

    public Boolean getAA() {
        return AA;
    }

    public void setAA(Boolean AA) {
        this.AA = AA;
    }

    public Boolean getBA() {
        return BA;
    }

    public void setBA(Boolean BA) {
        this.BA = BA;
    }

    public Boolean getBB() {
        return BB;
    }

    public void setBB(Boolean BB) {
        this.BB = BB;
    }

    public Boolean getAN() {
        return AN;
    }

    public void setAN(Boolean AN) {
        this.AN = AN;
    }

    public Boolean getBN() {
        return BN;
    }

    public void setBN(Boolean BN) {
        this.BN = BN;
    }

    public Boolean getArise() {
        return Arise;
    }

    public void setArise(Boolean Arise) {
        this.Arise = Arise;
    }

    public Boolean getBrise() {
        return Brise;
    }

    public void setBrise(Boolean Brise) {
        this.Brise = Brise;
    }

    public Boolean getDifAADecreciente() {
        return difAADecreciente;
    }

    public void setDifAADecreciente(Boolean difAADecreciente) {
        this.difAADecreciente = difAADecreciente;
    }

    public Boolean getDifABganA() {
        return difABganA;
    }

    public Boolean getDifBBDecreciente() {
        return difBBDecreciente;
    }

    public void setDifBBDecreciente(Boolean difBBDecreciente) {
        this.difBBDecreciente = difBBDecreciente;
    }

    public int getPromA() {
        return promA;
    }

    public void setPromA(int promA) {
        this.promA = promA;
    }

    public int getPromB() {
        return promB;
    }

    public void setPromB(int promB) {
        this.promB = promB;
    }

    public Boolean getDifBAganB() {
        return difBAganB;
    }

    public void setDifBAganB(Boolean difBAganB) {
        this.difBAganB = difBAganB;
    }

    public void setDifABganA(Boolean difABganA) {
        this.difABganA = difABganA;
    }
    
    public Boolean getFavoritoAdivbajo() {
        return favoritoAdivbajo;
    }

    public void setFavoritoAdivbajo(Boolean favoritoAdivbajo) {
        this.favoritoAdivbajo = favoritoAdivbajo;
    }

    public Boolean getFavoritoBdivbajo() {
        return favoritoBdivbajo;
    }

    public void setFavoritoBdivbajo(Boolean favoritoBdivbajo) {
        this.favoritoBdivbajo = favoritoBdivbajo;
    }

    public Boolean getACbajo() {
        return ACbajo;
    }

    public void setACbajo(Boolean ACbajo) {
        this.ACbajo = ACbajo;
    }

    public Boolean getBCbajo() {
        return BCbajo;
    }

    public void setBCbajo(Boolean BCbajo) {
        this.BCbajo = BCbajo;
    }

    public Boolean getACaltoAA() {
        return ACaltoAA;
    }

    public void setACaltoAA(Boolean ACaltoAA) {
        this.ACaltoAA = ACaltoAA;
    }

    public Boolean getBCaltoBB() {
        return BCaltoBB;
    }

    public void setBCaltoBB(Boolean BCaltoBB) {
        this.BCaltoBB = BCaltoBB;
    }

    public Boolean getAMalta() {
        return AMalta;
    }

    public void setAMalta(Boolean AMalta) {
        this.AMalta = AMalta;
    }

    public Boolean getBMalta() {
        return BMalta;
    }

    public void setBMalta(Boolean BMalta) {
        this.BMalta = BMalta;
    }

    public Boolean getNoFavMedio() {
        return noFavMedio;
    }

    public void setNoFavMedio(Boolean noFavMedio) {
        this.noFavMedio = noFavMedio;
    }

    public Boolean getNoFavAlto() {
        return noFavAlto;
    }

    public void setNoFavAlto(Boolean noFavAlto) {
        this.noFavAlto = noFavAlto;
    }

    public Boolean getAMbaja() {
        return AMbaja;
    }

    public void setAMbaja(Boolean AMbaja) {
        this.AMbaja = AMbaja;
    }

    public Boolean getBMbaja() {
        return BMbaja;
    }

    public void setBMbaja(Boolean BMbaja) {
        this.BMbaja = BMbaja;
    }

    public Boolean getACalto() {
        return ACalto;
    }

    public void setACalto(Boolean ACalto) {
        this.ACalto = ACalto;
    }

    public Boolean getBCalto() {
        return BCalto;
    }

    public void setBCalto(Boolean BCalto) {
        this.BCalto = BCalto;
    }

    public Boolean getAriseAA() {
        return AriseAA;
    }

    public void setAriseAA(Boolean AriseAA) {
        this.AriseAA = AriseAA;
    }

    public Boolean getBriseBB() {
        return BriseBB;
    }

    public void setBriseBB(Boolean BriseBB) {
        this.BriseBB = BriseBB;
    }

    
    @Override
    public String toString() {
        return "Condiciones{" + "AB=" + AB + ", AA=" + AA + ", BA=" + BA + ", BB=" + BB + ", AN=" + AN + ", BN=" + BN + ", Arise=" + Arise + ", Brise=" + Brise + ", difAADecreciente=" + difAADecreciente + ", difBBDecreciente=" + difBBDecreciente + ", difABganA=" + difABganA + ", difBAganB=" + difBAganB + ", ACbajo=" + ACbajo + ", BCbajo=" + BCbajo + ", AMalta=" + AMalta + ", BMalta=" + BMalta + ", favoritoAdivbajo=" + favoritoAdivbajo + ", favoritoBdivbajo=" + favoritoBdivbajo + ", noFavMedio=" + noFavMedio + ", noFavAlto=" + noFavAlto + '}';
    }
    
    
    
    public void setearCondiciones(Partido p){
        if(p.getGp1() == "A" && p.getGp2() == "B"){
            this.AB = true;
        } else {
            this.AB = false;
        }
        
        if(p.getGp1() == "B" && p.getGp2() == "A"){
            this.BA = true;
        } else {
            this.BA = false;
        }
        
        if(p.getGp1() == "A" && p.getGp2() == "A"){
            this.AA = true;
        } else {
            this.AA = false;
        }
        if(p.getGp1() == "B" && p.getGp2() == "B"){
            this.BB = true;
        } else {
            this.BB = false;
        }
        
        if(p.getGp1() == "A" && p.getGp2() == "-"){
            this.AN = true;
        } else {
            this.AN = false;
        }
        
        if(p.getGp1() == "B" && p.getGp2() == "-"){
            this.BN = true;
        } else {
            this.BN = false;
        }
        
        if(p.getP1A() <= p.getP2A()){
            this.Arise = true;
        } else {
            this.Arise = false;
        }
        
        if(p.getP1B() <= p.getP2B()){
            this.Brise = true;
        } else {
            this.Brise = false;
        }
        
        if(p.getP1A()+2 <= p.getP2A()){
            this.AriseAA = true;
        } else {
            this.AriseAA = false;
        }
        if(p.getP1B()+2 <= p.getP2B()){
            this.BriseBB = true;
        } else {
            this.BriseBB = false;
        }
        //A o B gana los dos primeros, el segundo por menos diferencia
        if(p.getP1A() - p.getP1B() +1 <= p.getP2A() - p.getP2B()){
            this.difAADecreciente = true;
        } else {
            this.difAADecreciente = false;
        }
        
        if(p.getP1B() - p.getP1A() +1 <= p.getP2B() - p.getP2A()){
            this.difBBDecreciente = true;
        } else {
            this.difBBDecreciente = false;
        }
        
        //A gana primer cuarto y B el segundo, pero por menos diferencia
        if(p.getP1A() - p.getP1B() > p.getP2B() - p.getP2A()){
            this.difABganA = true;
        } else {
            this.difABganA = false;
        }
        
        if(p.getP1B() - p.getP1A() > p.getP2A() - p.getP2B()){
            this.difBAganB = true;
        } else {
            this.difBAganB = false;
        }
        
        if(p.getFavorito().equals("A") && p.getDivFavorito() <= 1.15){
            this.favoritoAdivbajo = true;
        } else {
            this.favoritoAdivbajo = false;
        }
        
        if(p.getFavorito().equals("B") && p.getDivFavorito() <= 1.15){
            this.favoritoBdivbajo = true;
        } else {
            this.favoritoBdivbajo = false;
        }
        
        if(p.getP1A() <=15 || p.getP2A() <= 15){
            this.ACbajo = true;
        } else {
            this.ACbajo = false;
        }
        
        if(p.getP1B() <=15 || p.getP2B() <= 15){
            this.BCbajo = true;
        } else {
            this.BCbajo = false;
        }
        
        if(p.getP1A() >=20 && p.getP2A() >= 20){
            this.AMalta = true;
        } else {
            this.AMalta = false;
        }
        
        if(p.getP1B() >=20 && p.getP2B() >= 20){
            this.BMalta = true;
        } else {
            this.BMalta = false;
        }
        
        if(p.getP1A() < 15 && p.getP2A() < 15){
            this.AMbaja = true;
        } else {
            this.AMbaja = false;
        }
        
        if(p.getP1B() < 15 && p.getP2B() < 15){
            this.BMbaja = true;
        } else {
            this.BMbaja = false;
        }
        
        if( p.getP2A() > 26){
            this.ACalto = true;
        } else {
            this.ACalto = false;
        }
        
        if( p.getP2A() >= 25){
            this.ACaltoAA = true;
        } else {
            this.ACaltoAA = false;
        }
        
        if( p.getP2B() > 26){
            this.BCalto = true;
        } else {
            this.BCalto = false;
        }
        
        if( p.getP2B() > 26){
            this.BCaltoBB = true;
        } else {
            this.BCaltoBB = false;
        }
        
        this.promA = (p.getP1A() + p.getP2A()) / 2 ;
        
        this.promB = (p.getP1B() + p.getP2B()) / 2;
    }
    
    public void pronostic3erCAvanzado(Partido p){
        if ((BA && Arise && !Brise && difBAganB) || (BB && Arise && !BCalto  && !ACaltoAA && difAADecreciente && !(p.getFavorito().equals("B") && p.getDivFavorito() < 1.30))){
            p.setPredicted3("A");   
            System.out.println(p.getEquipoA());
        } else if ((AB && Brise && !Arise  && difABganA) || (AA && Brise && !ACalto   && !BCaltoBB && difBBDecreciente   && (p.getFavorito().equals("A") && p.getDivFavorito() < 1.30))){
            p.setPredicted3("B");
            System.out.println(p.getEquipoB());          
        } else {
            p.setPredicted3("N");
            System.out.println("Los datos no permiter predecir al ganador");
        }
    }
    
    public void pronostic3erCSimple(Partido p){
        if((BB) || (BA)){
            p.setPredicted3("A");   
            System.out.println(p.getEquipoA());
        } else if( (AA) || (AB)){
            p.setPredicted3("B");
            System.out.println(p.getEquipoB());          
        } else {
            p.setPredicted3("N");
            System.out.println("Los datos no permiter predecir al ganador");
        }
    }
    
    /*
    BCaltoBB && !ACaltoAA   !BCbajo && !ACalto
     ACaltoAA && !BCaltoBB    !ACbajo && !BCalto
    
    (BA && difBAganB  && !ACaltoAA && !(p.getFavorito().equals("B") && p.getDivFavorito() < 1.20)
    */
    
    
    
    /*
    
    (BB && difBBDecreciente && BCaltoBB && !ACaltoAA) || 
    (AA && difAADecreciente && ACaltoAA && !BCaltoBB) || 
    
    if(((BB && Arise && ACbajo && !favoritoBdivbajo) || (BA && difBAganB && !BCbajo) || BN && Arise) ){
            p.setPredicted3("A");   
            System.out.println(p.getEquipoA());
        } else if(((AA && Brise && BCbajo && !favoritoAdivbajo) || (AB && difABganA && !ACbajo) || AN && Brise)){
            p.setPredicted3("B");
            System.out.println(p.getEquipoB());          
        } else {
            p.setPredicted3("N");
            System.out.println("Los datos no permiter predecir al ganador");
        }
    
    
    
    Config apostando siempre contra favorito
    if ((BA && difBAganB  && !ACaltoAA && p.getFavorito().equals("B")  && (p.getDivFavorito() > 1.15)) || (BB && p.getFavorito().equals("B") && !BCalto  && !ACaltoAA && !AMbaja && (p.getDivFavorito() > 1.30))){
            p.setPredicted3("A");   
            System.out.println(p.getEquipoA());
        } else if ((AB && difABganA  && !BCaltoBB && p.getFavorito().equals("A") && (p.getDivFavorito() > 1.15)) || (AA && p.getFavorito().equals("A") && !ACalto   && !BCaltoBB  && !BMbaja && (p.getDivFavorito() > 1.30))){
    
    
    */
}

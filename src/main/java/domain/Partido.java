package domain;

import java.text.DecimalFormat;

public class Partido {

    //Atributos de cada partido
    private int idPartido;
    private String fecha;
    private String liga;
    private String equipoA;
    private String equipoB;
    private String favorito;
    private double divFavorito;
    private int p1A;
    private int p1B;
    private int p2A;
    private int p2B;
    private int p3A;
    private int p3B;
    private int p4A;
    private int p4B;
    
    private int pMitadA;
    private int pMitadB;
    private int p3CA;
    private int p3CB;
    private int resfA;
    private int resfB;
    private String gp1;
    private String gp2;
    private String gp3;
    private String gp4;
    private String gP;
    
    private String predicted3;
    private String predicted4;
    private String formatter = "#.##";
    private DecimalFormat df = new DecimalFormat(formatter);

    //Constructores de partido
    public Partido() {
    }

    public Partido(String fecha, String liga, String equipoA, String equipoB, int p1A, int p1B, int p2A, int p2B, String favorito, double divFavorito) {
        this.fecha = fecha;
        this.liga = liga;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.p1A = p1A;
        this.p1B = p1B;
        this.p2A = p2A;
        this.p2B = p2B;
        this.pMitadA = this.p1A + this.p2A;
        this.pMitadB = this.p1B + this.p2B;
        this.favorito = favorito;
        this.divFavorito = divFavorito;
        if(this.p1A > this.p1B) {
            this.gp1 = "A";
        } else if (this.p1B > this.p1A) {
            this.gp1 = "B";
        } else {
            this.gp1 = "-";
        }
        if(this.p2A > this.p2B) {
            this.gp2 = "A";
        } else if (this.p2B > this.p2A) {
            this.gp2 = "B";
        } else {
            this.gp2 = "-";
        }
    }

    public Partido(String fecha, String liga, String equipoA, String equipoB, int p1A, int p1B, int p2A, int p2B, String favorito, double divFavorito, int p3A, int p3B) {
        this.fecha = fecha;
        this.liga = liga;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.p1A = p1A;
        this.p1B = p1B;
        this.p2A = p2A;
        this.p2B = p2B;
        this.p3A = p3A;
        this.p3B = p3B;
        this.pMitadA = this.p1A + this.p2A;
        this.pMitadB = this.p1B + this.p2B;
        this.favorito = favorito;
        this.divFavorito = divFavorito;
        this.p3CA = this.pMitadA + this.p3A;
        this.p3CB = this.pMitadB + this.p3B;
        if(this.p1A > this.p1B) {
            this.gp1 = "A";
        } else if (this.p1B > this.p1A) {
            this.gp1 = "B";
        } else {
            this.gp1 = "-";
        }
        if(this.p2A > this.p2B) {
            this.gp2 = "A";
        } else if (this.p2B > this.p2A) {
            this.gp2 = "B";
        } else {
            this.gp2 = "-";
        }
        if(this.p3A > this.p3B) {
            this.gp3 = "A";
        } else if (this.p3B > this.p3A) {
            this.gp3 = "B";
        } else {
            this.gp3 = "-";
        }
    }

    public Partido(String fecha, String liga, String equipoA, String equipoB, int p1A, int p1B, int p2A, int p2B, String favorito, double divFavorito, int p3A, int p3B, int p4A, int p4B) {
        this.fecha = fecha;
        this.liga = liga;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.p1A = p1A;
        this.p1B = p1B;
        this.p2A = p2A;
        this.p2B = p2B;
        this.p3A = p3A;
        this.p3B = p3B;
        this.pMitadA = this.p1A + this.p2A;
        this.pMitadB = this.p1B + this.p2B;
        this.favorito = favorito;
        this.divFavorito = divFavorito;
        this.p3CA = this.pMitadA + this.p3A;
        this.p3CB = this.pMitadB + this.p3B;
        this.p4A = p4A;
        this.p4B = p4B;
        this.resfA = this.p3CA + this.p4A;
        this.resfB = this.p3CB + this.p4B;
        if(this.p1A > this.p1B) {
            this.gp1 = "A";
        } else if (this.p1B > this.p1A) {
            this.gp1 = "B";
        } else {
            this.gp1 = "-";
        }
        if(this.p2A > this.p2B) {
            this.gp2 = "A";
        } else if (this.p2B > this.p2A) {
            this.gp2 = "B";
        } else {
            this.gp2 = "-";
        }
        if(this.p3A > this.p3B) {
            this.gp3 = "A";
        } else if (this.p3B > this.p3A) {
            this.gp3 = "B";
        } else {
            this.gp3 = "-";
        }
        if(this.p4A > this.p4B) {
            this.gp4 = "A";
        } else if (this.p4B > this.p4A) {
            this.gp4 = "B";
        } else {
            this.gp4 = "-";
        }
        if(this.resfA > this.resfB) {
            this.gP = "A";
        } else if (this.resfB > this.resfA) {
            this.gP = "B";
        } else {
            this.gP = "-";
        }
    }

    //Getters y Setters
    public int getIdPartido() {
        return this.idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLiga() {
        return this.liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getEquipoA() {
        return this.equipoA;
    }

    public void setEquipoA(String equipoA) {
        this.equipoA = equipoA;
    }

    public String getEquipoB() {
        return this.equipoB;
    }

    public void setEquipoB(String equipoB) {
        this.equipoB = equipoB;
    }

    public int getP1A() {
        return this.p1A;
    }

    public void setP1A(int p1A) {
        this.p1A = p1A;
    }

    public int getP1B() {
        return this.p1B;
    }

    public void setP1B(int p1B) {
        this.p1B = p1B;
    }

    public int getP2A() {
        return this.p2A;
    }

    public void setP2A(int p2A) {
        this.p2A = p2A;
    }

    public int getP2B() {
        return this.p2B;
    }

    public void setP2B(int p2B) {
        this.p2B = p2B;
    }

    public int getP3A() {
        return this.p3A;
    }

    public void setP3A(int p3A) {
        this.p3A = p3A;
    }

    public int getP3B() {
        return this.p3B;
    }

    public void setP3B(int p3B) {
        this.p3B = p3B;
    }

    public int getpMitadA() {
        return this.pMitadA;
    }

    public void setpMitadA(int pMitadA) {
        this.pMitadA = pMitadA;
    }

    public int getpMitadB() {
        return this.pMitadB;
    }

    public void setpMitadB(int pMitadB) {
        this.pMitadB = pMitadB;
    }

    public int getP3CA() {
        return this.p3CA;
    }

    public void setP3CA(int p3CA) {
        this.p3CA = p3CA;
    }

    public int getP3CB() {
        return this.p3CB;
    }

    public void setP3CB(int p3CB) {
        this.p3CB = p3CB;
    }

    public String getFavorito() {
        return this.favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public int getP4A() {
        return this.p4A;
    }

    public void setP4A(int p4A) {
        this.p4A = p4A;
    }

    public int getP4B() {
        return this.p4B;
    }

    public void setP4B(int p4B) {
        this.p4B = p4B;
    }

    public int getResfA() {
        return this.resfA;
    }

    public void setResfA(int resfA) {
        this.resfA = resfA;
    }

    public int getResfB() {
        return this.resfB;
    }

    public void setResfB(int resfB) {
        this.resfB = resfB;
    }

    public double getDivFavorito() {
        return this.divFavorito;
    }

    public void setDivFavorito(double divFavorito) {
        this.divFavorito = divFavorito;
    }

    public String getGp1() {
        return this.gp1;
    }

    public void setGp1(String gp1) {
        this.gp1 = gp1;
    }

    public String getGp2() {
        return this.gp2;
    }

    public void setGp2(String gp2) {
        this.gp2 = gp2;
    }

    public String getGp3() {
        return this.gp3;
    }

    public void setGp3(String gp3) {
        this.gp3 = gp3;
    }

    public String getGp4() {
        return this.gp4;
    }

    public void setGp4(String gp4) {
        this.gp4 = gp4;
    }

    public String getgP() {
        return this.gP;
    }

    public void setgP(String gP) {
        this.gP = gP;
    }

    public String getPredicted3() {
        return this.predicted3;
    }

    public void setPredicted3(String predicted3) {
        this.predicted3 = predicted3;
    }

    public String getPredicted4() {
        return this.predicted4;
    }

    public void setPredicted4(String predicted4) {
        this.predicted4 = predicted4;
    }
     
    
    //Métodos toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partido{");
        sb.append("idPartido=").append(idPartido);
        sb.append(", fecha=").append(fecha);
        sb.append(", liga=").append(liga);
        sb.append(", equipoA=").append(equipoA);
        sb.append(", equipoB=").append(equipoB);
        sb.append(", p1A=").append(p1A);
        sb.append(", p1B=").append(p1B);
        sb.append(", p2A=").append(p2A);
        sb.append(", p2B=").append(p2B);
        sb.append(", p3A=").append(p3A);
        sb.append(", p3B=").append(p3B);
        sb.append(", p4A=").append(p4A);
        sb.append(", p4B=").append(p4B);
        sb.append(", pMitadA=").append(pMitadA);
        sb.append(", pMitadB=").append(pMitadB);
        sb.append(", p3CA=").append(p3CA);
        sb.append(", p3CB=").append(p3CB);
        sb.append(", resfA=").append(resfA);
        sb.append(", resfB=").append(resfB);
        sb.append(", favorito=").append(favorito);
        sb.append(", divFavorito=").append(divFavorito);
        sb.append('}');
        return sb.toString();
    }

    public void toStringTable(int periodo) {
        switch (periodo) {
            case 2:
                System.out.println("Id Partido: " + idPartido
                        + "\nFecha: " + fecha
                        + "\nLiga: " + liga
                        + "\n" + equipoA + " - " + equipoB
                        + "\nFavorito: " + favorito + " Div: " + df.format(divFavorito)
                        + "\n1er C: " + p1A + " - " + p1B
                        + "\n2do C: " + p2A + " - " + p2B
                        + "\nParcial 1er Mitad: " + pMitadA + " - " + pMitadB
                        + "\nNomenclatura: " + gp1 + " " + gp2
                        + "\n\n-----------------------------------------------\n");
                break;
            case 3:
                System.out.println("Id Partido: " + idPartido
                        + "\nFecha: " + fecha
                        + "\nLiga: " + liga
                        + "\n" + equipoA + " - " + equipoB
                        + "\nFavorito: " + favorito + " Div: " + df.format(divFavorito)
                        + "\n1er C: " + p1A + " - " + p1B
                        + "\n2do C: " + p2A + " - " + p2B
                        + "\n3er C: " + p3A + " - " + p3B
                        + "\nParcial 1er Mitad: " + pMitadA + " - " + pMitadB
                        + "\nParcial 3er C: " + p3CA + " - " + p3CB
                        + "\nNomenclatura: " + gp1 + " " + gp2 + " " + gp3
                        + "\n\n-----------------------------------------------\n");
                break;
            case 4:
                System.out.println("Id Partido: " + idPartido
                + "\nFecha: " + fecha
                + "\nLiga: " + liga
                + "\n" + equipoA + " - " + equipoB                        
                + "\nFavorito: " + favorito + " Div: " + divFavorito
                + "\n1er C: " + p1A + " - " + p1B
                + "\n2do C: " + p2A + " - " + p2B
                + "\n3er C: " + p3A + " - " + p3B
                + "\n4ro C: " + p4A + " - " + p4B
                + "\nParcial 1er Mitad: " + pMitadA + " - " + pMitadB
                + "\nParcial 3er C: " + p3CA + " - " + p3CB
                + "\nResultado Final: " + resfA + " - " + resfB
                + "\nNomenclatura: " + gp1 + " " + gp2 + " " + gp3 + " " + gp4
                + "\n\n-----------------------------------------------\n");
                break;
        }
    }
}


package Exercicio02;

public class Automovel {
    private double dist;
    private double combustivelGasto;

    // Distãncia
    public void setDist(double sDist) {
        dist = sDist;
    }
    public double getDist() {
        return dist;
    }

    // Combustível gasto
    public void setComb(double sComb) {
        combustivelGasto = sComb;
    }
    public double getComb() {
        return combustivelGasto;
    }

    public double consumoMedio() {
        return dist / combustivelGasto;
    }
}

package Carretera;
/*
 * @author emanuel.lopezh
 */
public class Asfalto extends TramoGenerico {
    
    private String proveedor;
    private int velMax;
    private boolean adelantar;

    public Asfalto(double xInit, double yInit, double xFinal, double yFinal, String proveedor) {
        this.xInit = xInit;
        this.yInit = yInit;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.proveedor = proveedor;
    }

    public boolean isAdelantar() {
        return true;
    }

    public int getVelMax() {
        return 150;
    }
   
    @Override
    public double longitud() {
        double longitud = Math.sqrt(Math.pow((this.xFinal - this.xInit), 2) + Math.pow((yInit - yFinal), 2));
        return longitud;
    }

    @Override
    public double area() {
        return longitud()*8.0;
    }

    @Override
    public double volumen() {
        return area()*0.25;
    }
    
    
}

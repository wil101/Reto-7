package Carretera;
/**
 * @author emanuel.lopezh
 */
public abstract class TramoGenerico {
    /*el protected es lo mismo que el private pero los hijos lo pueden ver es chevere eso*/
    protected double xInit;
    protected double yInit;
    protected double xFinal;
    protected double yFinal;

    
    /* aca invoco los get para que en la comparacion si esta conectados o no pues no me ponga problema y sea sencillo*/
    public double xInit() {
        return xInit;
    }

    public double yInit() {
        return yInit;
    }

    public double xFinal() {
        return xFinal;
    }

    public double yFinal() {
        return yFinal;
    }
    
    
    
    public abstract double longitud();
    public abstract double area();
    public abstract double volumen();
}

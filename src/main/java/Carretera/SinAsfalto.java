package Carretera;
/**
 * @author emanuel.lopezh
 */
public class SinAsfalto extends TramoGenerico{
   
    private String material;
    private double espesor;

    public SinAsfalto(double xInit, double yInit, double xFinal, double yFinal, String material, double espesor) {
        this.xInit = xInit;
        this.yInit = yInit;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        
        switch (material){
            case "piedra":
                this.material = "piedra";
                break;
            case "arena":
                this.material = "arena";
                break;
            case "balastro":
                this.material = "balastro";
                break;
            default:
                this.material = "piedra";
                break;
        }

        this.espesor = espesor;
    }

    @Override
    public double longitud() {
        double longitud = Math.sqrt(Math.pow((this.xFinal - this.xInit), 2) + Math.pow((yInit - yFinal), 2));
        return longitud;
    }

    @Override
    public double area() {
        return longitud()*6.0;
    }

    @Override
    public double volumen() {
        return area()*this.espesor;
    }    
    
}

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
        this.material = material;
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
    
    /*aca puse esto para la comparacion por tipo de material pero a la final no lo utilice entonces si quiere lo quita jajaja */ 
    public void material(){
        int tipo = 0;
        System.out.println("escoga el tipo de material entre los tres disponibles");
        System.out.println("escriba: *uno* para seleccionar la piedra ");
        System.out.println("escribra: *dos* para seleccionar la arena ");
        System.out.println("escriba: *tres* para seleccionar el balastro ");
        
        switch (tipo){
            case 1: 
                material = "piedra";
                break;
            case 2: 
                material = "arena";
                break;
            case 3: 
                material = "balastro";
                break;
        }
    }

   
    
}

package Carretera;
/**
 * @author emanuel.lopezh
 */
public class Main {
    public static void main(String[] args){
        
        /*Los tipos de material para la carretera sin asfaltar son:
        piedra, arena y balastto*/
        
        Asfalto tramo1 = new Asfalto(1, 2, 5, 7.48, "yo");
        SinAsfalto tramo2 = new SinAsfalto(5, 7.48, 10.12, 13.16, "piedra", 0.26);
        System.out.println("longitud del tramo 1 " + tramo1.longitud());
        System.out.println("longitud del tramo 2 " + tramo2.longitud());
        System.out.println("área del tramo 1 " + tramo1.area());
        System.out.println("área del tramo 2 " + tramo2.area());
        System.out.println("volumen del tramo 1 " + tramo1.volumen());
        System.out.println("volumen del tramo 2 " + tramo2.volumen());
        
        CarreteraCompleta carretera = new CarreteraCompleta();
        System.out.println("");
        carretera.aniadirCarreteraAsfaltada(tramo1);
        carretera.aniadirCarreteraSinAsfaltar(tramo2);
 
        System.out.println("Longitud total " + carretera.longitudTotal());
        System.out.println("Área total " + carretera.areaTotal());
        System.out.println("Volumen total " + carretera.volumenTotal());
        System.out.println("Volumen asfaltado " + carretera.volumenAsfalto());
        System.out.println("Volumen sin asfalto " + carretera.volumenSinAsfalto());
        System.out.println(carretera.conectados());
        
        
        
    }
}

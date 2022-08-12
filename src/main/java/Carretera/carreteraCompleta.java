package Carretera;

/**
 *
 * @author wilmar.osorio1
 */
import java.util.ArrayList;

public class carreteraCompleta {

    ArrayList<TramoGenerico> tramosCarreteras = new ArrayList<>();

    public void crearCarreteraAsfaltada() {
        tramosCarreteras.add(new Asfalto(5, 8, 16, 20, "su"));
    }

    public void crearCarreteraSinAsfaltar() {
        tramosCarreteras.add(new SinAsfalto(45, 16, 17, 86, "roca", 0.3));
    }

    public double longitudTotal() {
        double longitudTotal = 0;
        for (int i = 0; i <= tramosCarreteras.size(); i++) {
            longitudTotal += tramosCarreteras.get(i).longitud();
        }

        return longitudTotal;
    }

    public double areaTotal() {
        double areaTotal = 0;
        for (int i = 0; i <= tramosCarreteras.size(); i++) {
            areaTotal += tramosCarreteras.get(i).area();
        }
        return areaTotal;
    }

    public double volumenTotal() {
        double volumenTotal = 0;
        for (int i = 0; i <= tramosCarreteras.size(); i++) {
            volumenTotal += tramosCarreteras.get(i).volumen();
        }
        return volumenTotal;
    }
 
    /* en esta parte del volumen todavia no esta diseñada para que solo que coja lo asfaltado*/ 
    public double volumenAsfalto() {
        double volumenAsfalto = 0;
        for (int i = 0; i <= tramosCarreteras.size(); i++) {
            volumenAsfalto += tramosCarreteras.get(i).volumen();
        }
        return volumenAsfalto;
    }
    /* esta parte del volumen no esta diseñada todavia para que me coga la parte sinasfalto solamente*/

    public double volumenSinAsfalto() {
        double volumenSinAsfalto = 0;
        for (int i = 0; i <= tramosCarreteras.size(); i++) {
            volumenSinAsfalto += tramosCarreteras.get(i).volumen();
        }
        return volumenSinAsfalto;
    }

    
    /*en esta parte se hicieron modificarion en tramogenerico para que los rebices por si no has visto aun */
    public void conectados() {
        /*se puso el boolean para ver si todos los tramos estan conectado o no */
        boolean band = true;
        /*el -1 esta porque la cantidad total de comparacion que se hacen nose cuenta una */ 
        for (int i = 0; i <= tramosCarreteras.size() - 1; i++) {
            /*el mas uno que tiene en el xinit es para comparar el de adelante con el xfinal del de atras y ver si estan conectados o no*/
            if (tramosCarreteras.get(i + 1).xInit() == tramosCarreteras.get(i).xFinal()
                    && tramosCarreteras.get(i + 1).yInit() == tramosCarreteras.get(i).yFinal())
            /* hago las comparaciones con x y y para ver todo el tramo completo supongo que no hay problema */
            {
                System.out.println("el tramo de carretera esta conectada");
            } else {
                System.out.println("el tramo de carretera no esta conectada");
                band = false;
            /*el false esta para ver si al final todos los tramos estan conectados o no*/
            }
            
            /*por ultimo pues mire a ver si no entiende me dice o lo modificas tu fin del comunicado*/
            /*al git voy a montar dos diagramas para que mire cual le parece mejor y lo deje el otro lo elimina
            o sino deja los dos jajajaj*/
            /*el ultimo pues elimina los comentarios que no tiene nada que ver con las explicacion del codigo pero solo eso
            nada mas aparte de eso*/

        }

    }

}

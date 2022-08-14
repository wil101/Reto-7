package Carretera;
/**
 * @author wilmar.osorio1
 */
import java.util.ArrayList;
import java.util.List;

public class CarreteraCompleta {

    List<TramoGenerico> tramosCarreteras = new ArrayList<>();

    public void aniadirCarreteraAsfaltada(Asfalto carretera) {
        tramosCarreteras.add(carretera);
    }

    public void aniadirCarreteraSinAsfaltar(SinAsfalto carretera) {
        tramosCarreteras.add(carretera);
    }

    public double longitudTotal() {
        double longitudTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            longitudTotal += tramosCarreteras.get(i).longitud();
        }

        return longitudTotal;
    }

    public double areaTotal() {
        double areaTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            areaTotal += tramosCarreteras.get(i).area();
        }
        return areaTotal;
    }

    public double volumenTotal() {
        double volumenTotal = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            volumenTotal += tramosCarreteras.get(i).volumen();
        }
        return volumenTotal;
    }
 
    public double volumenAsfalto() {
        double volumenAsfalto = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
           if(tramosCarreteras.get(i).getClass().getSimpleName().equals("Asfalto")){
               volumenAsfalto += tramosCarreteras.get(i).volumen();
           } 
        }
        return volumenAsfalto;    
    }
    
    public double volumenSinAsfalto() {
        double volumenSinAsfalto = 0;
        for (int i = 0; i < tramosCarreteras.size(); i++) {
            if(tramosCarreteras.get(i).getClass().getSimpleName().equals("SinAsfalto")){
                volumenSinAsfalto += tramosCarreteras.get(i).volumen();
            }         
        }
        return volumenSinAsfalto;
    }

    
    public String conectados(){
        boolean band = false;
        int s = 1;
        String conectado = "";
        for (int i = 0; i < tramosCarreteras.size() - 1; i++) {
            band = (tramosCarreteras.get(i + 1).xInit() == tramosCarreteras.get(i).xFinal()
                    && tramosCarreteras.get(i + 1).yInit() == tramosCarreteras.get(i).yFinal());
            if(band == true){
                s++;
            }
        }
        if(s > 0){
            conectado = "Hay " + s + " tramos conectados";
        } else {
            conectado = "No hay tramos conectados";
        }
        return conectado;
    }

}

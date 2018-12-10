package boletin13;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionFutbol equipo = new SeleccionFutbol();
        Xogador unXogador = new Xogador();
        Adestrador unAdestrador = new Adestrador();
        Masaxista unMasaxista = new Masaxista();
        
        unXogador.concentrarse();
        unAdestrador.concentrarse();
        unMasaxista.concentrarse();
        
        unXogador.viajar();
        unAdestrador.viajar();
        unMasaxista.viajar();

    }
    
}
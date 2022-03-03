package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Hector
 */
public class Aro {
    /**
     * Constante que establece o radio mínimo.
     */
    public static final double LIMITERADIO = 0.0;
   
  
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     * Construtor por defecto
     */
    public Aro() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
        
    }

    
    /**
     * Método para obter o valor de coordenadaX.
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Método para establecer o valor de coordenadaX.
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Método para obter o valor de coordenadaY.
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Método para establecer o valor de coordenadaY.
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Método para obter o valor de radio.
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método para establecer o valor de radio.
     * 
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio=(radio< LIMITERADIO ? LIMITERADIO : radio);
    }
    
    /**
     * Método para calcular o diámetro.
     * @return diametro.
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *Método para calcular a circunferencia.
     * @return circunferencia.
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *Método para calcular a superficie.
     * @return superficie
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * A partir dos parámetros de entrada modifícanse as coordenadas.
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * Método que da a salida en texto do obxeto.
     * @return cadena de caracteres.
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    
}
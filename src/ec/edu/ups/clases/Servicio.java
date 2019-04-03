
package ec.edu.ups.clases;

/**
 * Esta clase Servicio contine atributos, set´s , get's de sus atributos.
 * @author Darwin Leon
 */
public class Servicio {
    private String nombreSer;
    private String tipoSer;
    private int persona;
    private int valorSer;

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getNombreSer() {
        return nombreSer;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param nombreSer 
     */
    public void setNombreSer(String nombreSer) {
        this.nombreSer = nombreSer;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getTipoSer() {
        return tipoSer;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param tipoSer 
     */
    public void setTipoSer(String tipoSer) {
        this.tipoSer = tipoSer;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return int
     */
    public int getPersona() {
        return persona;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param persona 
     */
    public void setPersona(int persona) {
        this.persona = persona;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return int
     */
    public int getValorSer() {
        return valorSer;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param valorSer 
     */
    public void setValorSer(int valorSer) {
        this.valorSer = valorSer;
    }
    
    
    /**
     * Convierte un objeto "servicio" a String (cadena de texto).
     * @return cadena de texto con valores en los atributos
     */
    @Override
    public String toString() {
        return "Servicio ►►" + " Nombre del Servicio= " + nombreSer + ", Servicio= " + tipoSer +
                ", Cantidad de personas= " + persona + ", Valor a Pagar= " + valorSer;
    }
    
    
    
}

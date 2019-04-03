
package ec.edu.ups.clases;


/**
 * Esta clase Reservacion contine atributos, set´s y get's de sus atributos.
 * @author Darwin Leon
 */
public class Reservacion {
    private int codigo;
    private String fechaEncuentro;
    private String horaEncuentro;
    private int cantAsientos;
    private String nombreReservista;

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return int
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getFechaEncuentro(){
        return fechaEncuentro;
    }
    
    /**
     * El metodo nos permite designar un valor al parametro.
     * @param fechaEncuentro 
     */
    public void setFechaEncuentro(String fechaEncuentro){
        this.fechaEncuentro = fechaEncuentro;
    }
    
    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getHoraEncuentro() {
        return horaEncuentro;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param horaEncuentro 
     */
    public void setHoraEncuentro(String horaEncuentro) {
        this.horaEncuentro = horaEncuentro;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return int
     */
    public int getCantAsientos() {
        return cantAsientos;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param cantAsientos 
     */
    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getNombreReservista() {
        return nombreReservista;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param nombreReservista 
     */
    public void setNombreReservista(String nombreReservista) {
        this.nombreReservista = nombreReservista;
    }
    
    /**
     * Convierte un objeto "reservacion" a String (cadena de texto).
     * @return cadena de texto con valores en los atributos
     */
    @Override
    public String toString() {
        return "Reservación ►►" + " Código= " + codigo + ", Fecha de Reservacion= " + fechaEncuentro +
                ", Hora de reservación = "+ horaEncuentro+", "+ "Cantidad de asientos= " + cantAsientos + 
                        ", Nombre del reservista= " + nombreReservista ;
    }
    
    
    
}

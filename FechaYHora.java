
/**
 * Write a description of class FechaYHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private int dias;
    private int meses;
    private int anhos;
    private int horas;
    private int minutos;
    

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        dias=  01;
        meses= 01;
        anhos= 01;
        horas= 0;
        minutos= 0;
        
    }
    
    
    /**
     * Método para fijar la Fecha y la hora
     */
    public void fijarFechaYHora(int dia,int mes,int anho, int hora, int minuto)
    {
        dias = dia;
        meses = mes;
        anhos = anho;
        horas = hora;
        minutos = minuto;
    }
    
    /**
     * Permita avanzar un minuto la fecha y la hora almacenadas a través de un método sin parámetros.
     */
    public void avanzar()
    {
        if ((minutos == 59) && (horas == 23)){
            if (dias == 28 && meses == 2){
                dias = 1;
                meses = meses + 1;
            } else if (dias == 30 && meses == 12) {
                dias = 1;
                meses = 1;
                anhos = anhos + 1;
            } else if (dias == 30) {
                dias = 1;
                meses = meses + 1;
            } else {
                dias = dias + 1;
            }
        }
    }
   
    /**
     * Permita obtener a través de un método sin parámetros un String que contenga la fecha y la hora
     */
    public String getFechaYHora()
    {
        {
         String fechadevolver1;
         String fechadevolver2;
         String fechadevolver3;
         String fechadevolver4;
         String fechadevolver5;
         String fechaADevolver;
         fechadevolver1 = String.valueOf(dias);
         fechadevolver2 = String.valueOf(meses);
         fechadevolver3 = String.valueOf(anhos);
         fechadevolver4 = String.valueOf(horas);
         fechadevolver5 = String.valueOf(minutos);
         if (fechadevolver1.length() < 2) {
             fechadevolver1 = "0" + fechadevolver1;   
         }
         if (meses < 10) {
             fechadevolver2 = "0" + fechadevolver2;    
         }
         if (fechadevolver3.length() < 2) {
             fechadevolver3 = "0" + fechadevolver3;
         }
         if (fechadevolver4.length() < 2) {
             fechadevolver4 = "0" + fechadevolver4;
         }
         if (fechadevolver5.length() < 2) {
             fechadevolver5 = "0" + fechadevolver5;
         }
          fechaADevolver = fechadevolver1 + "-" + fechadevolver2 + "-" + fechadevolver3 + " " + fechadevolver4 + ":" + fechadevolver5;
          return fechaADevolver;
         
        }
    }

    
    
}

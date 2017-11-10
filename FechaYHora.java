
/**
 * Write a description of class FechaYHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres dias;
    private DisplayDosCaracteres meses;
    private DisplayDosCaracteres anhos;
    private NumberDisplay horas;
    private NumberDisplay minutos;
    

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        dias= new DisplayDosCaracteres(07);
        meses=new DisplayDosCaracteres(11);
        anhos= new DisplayDosCaracteres(17);
        horas= new NumberDisplay(8);
        minutos=new NumberDisplay(35);
        
    }

}

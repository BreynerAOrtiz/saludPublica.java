import java.util.*;


/**
 * Write a description of class Ciudadano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciudadano extends Persona
{
    private String sisben;
    private int estrato;
    private CanastaFamiliar canastaFamiliar;
    private Medicina medicina;
    
    public Ciudadano() {
        super();
        this.bono = new Bono(160000);
        this.medicina = new Medicina(0);
        this.canastaFamiliar = new CanastaFamiliar(0);
    }
    
    public Ciudadano(String tipoDocumento, String numeroDocumento, String nombre, String apellidos, String direccion, String telefono, int edad, boolean cabezaHogar, String estadoCivil, String sisben, int estrato) {
        super(tipoDocumento, numeroDocumento, nombre, apellidos, direccion, telefono, edad, cabezaHogar, estadoCivil);
        this.sisben = sisben;
        this.estrato = estrato;
        this.bono = new Bono(160000);
        this.medicina = new Medicina(0);
        this.canastaFamiliar = new CanastaFamiliar(0);
    }    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie sisben*/
    public String getSisben(){
        return this.sisben;
    }//end method getSisben

    /**SET Method Propertie sisben*/
    public void setSisben(String sisben){
        this.sisben = sisben;
    }//end method setSisben

    /**GET Method Propertie estrato*/
    public int getEstrato(){
        return this.estrato;
    }//end method getEstrato

    /**SET Method Propertie estrato*/
    public void setEstrato(int estrato){
        this.estrato = estrato;
    }//end method setEstrato

    public Medicina getMedicina(){
         return this.medicina; 
        }
        
    public void setMedicina(Medicina medicina){
        this.medicina = medicina; 
    }
 
    public CanastaFamiliar getCanastaFamiliar(){ 
        return this.canastaFamiliar;
    }
    
    public void setCanastaFamiliar(CanastaFamiliar canastaFamiliar){ 
        this.canastaFamiliar = canastaFamiliar; 
    }

//End GetterSetterExtension Source Code
 @Override
    public String toString(){
        return "Ciudadano -> " + super.toString()
             + ", Medicina: " + medicina.getValor()
             + ", Canasta familiar: " + canastaFamiliar.getValor();
    }

}//End class
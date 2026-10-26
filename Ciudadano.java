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
    
    private ArrayList <CanastaFamiliar> canastafamiliar = new ArrayList<>();
    private ArrayList <Medicina> medicina = new ArrayList<>();
    
    public Ciudadano(){
        
    }
    
    public Ciudadano(String sisben, int estrato){
        this.sisben=sisben;
        this.estrato=estrato;
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

    /**GET Method Propertie canastafamiliar*/
    public java.util.ArrayList<CanastaFamiliar> getCanastafamiliar(){
        return this.canastafamiliar;
    }//end method getCanastafamiliar

    /**SET Method Propertie canastafamiliar*/
    public void setCanastafamiliar(java.util.ArrayList<CanastaFamiliar> canastafamiliar){
        this.canastafamiliar = canastafamiliar;
    }//end method setCanastafamiliar

    /**GET Method Propertie medicina*/
    public java.util.ArrayList<Medicina> getMedicina(){
        return this.medicina;
    }//end method getMedicina

    /**SET Method Propertie medicina*/
    public void setMedicina(java.util.ArrayList<Medicina> medicina){
        this.medicina = medicina;
    }//end method setMedicina

//End GetterSetterExtension Source Code


}//End class
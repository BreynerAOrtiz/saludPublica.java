package Modelo;


/**
 * Write a description of class Medicina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medicina
{
    // instance variables - replace the example below with your own
    private int valor;
    
    public Medicina(){
        
    }
    
    public Medicina(int valor){
        this.valor=valor;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie valor*/
    public int getValor(){
        return this.valor;
    }//end method getValor

    /**SET Method Propertie valor*/
    public void setValor(int valor){
        this.valor = valor;
    }//end method setValor

//End GetterSetterExtension Source Code

@Override

public String toString(){
    return "Medicina(" + "valorMedicina=" + valor;
}

}
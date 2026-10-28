package Modelo;


/**
 * Write a description of class Bioseguridad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bioseguridad
{
    private int valor;
    
    public Bioseguridad(){
        
    }
    
    public Bioseguridad(int valor){
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
    return "Bioseguridad(" + "valorBioseguridad=" + valor;
}
}
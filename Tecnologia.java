
/**
 * Write a description of class Tecnologia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tecnologia
{
    
    private int valor;
    
    public Tecnologia(){
        
    }
    
    public Tecnologia(int valor){
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
    return "Tecnologia(" + "valorTecnologia=" + valor;
}
}//End class
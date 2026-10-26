
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    
    protected String tipoDocumento;
    protected int numeroDocumento;
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected int telefono;
    protected int edad;
    protected boolean cabezaHogar;
    protected String estadoCivil;
    protected Bono bono;
    
    public Persona(){
        
    }
    
    public Persona(String tipoDocumento, int numeroDocumento, String nombre,String apellidos,String direccion, int telefono,int edad,boolean cabezaHogar, String estadoCivil){
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento =numeroDocumento;
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.edad=edad;
        this.cabezaHogar=cabezaHogar;
        this.estadoCivil=estadoCivil;
        
    }
    
    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie tipoDocumento*/
    public String getTipoDocumento(){
        return this.tipoDocumento;
    }//end method getTipoDocumento

    /**SET Method Propertie tipoDocumento*/
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }//end method setTipoDocumento

    /**GET Method Propertie numeroDocumento*/
    public int getNumeroDocumento(){
        return this.numeroDocumento;
    }//end method getNumeroDocumento

    /**SET Method Propertie numeroDocumento*/
    public void setNumeroDocumento(int numeroDocumento){
        this.numeroDocumento = numeroDocumento;
    }//end method setNumeroDocumento

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie apellidos*/
    public String getApellidos(){
        return this.apellidos;
    }//end method getApellidos

    /**SET Method Propertie apellidos*/
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }//end method setApellidos

    /**GET Method Propertie direccion*/
    public String getDireccion(){
        return this.direccion;
    }//end method getDireccion

    /**SET Method Propertie direccion*/
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }//end method setDireccion

    /**GET Method Propertie telefono*/
    public int getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**SET Method Propertie telefono*/
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**GET Method Propertie edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**SET Method Propertie edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

    /**GET Method Propertie cabezaHogar*/
    public boolean getCabezaHogar(){
        return this.cabezaHogar;
    }//end method getCabezaHogar

    /**SET Method Propertie cabezaHogar*/
    public void setCabezaHogar(boolean cabezaHogar){
        this.cabezaHogar = cabezaHogar;
    }//end method setCabezaHogar

    /**GET Method Propertie estadoCivil*/
    public String getEstadoCivil(){
        return this.estadoCivil;
    }//end method getEstadoCivil

    /**SET Method Propertie estadoCivil*/
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }//end method setEstadoCivil

    /**GET Method Propertie bono*/
    public Bono getBono(){
        return this.bono;
    }//end method getBono

    /**SET Method Propertie bono*/
    public void setBono(Bono bono){
        this.bono = bono;
    }//end method setBono

//End GetterSetterExtension Source Code
@Override

public String toString(){
    return "Persona(" + "TipoDocumento=" + tipoDocumento + "numeroDocumento=" + numeroDocumento + "Nombre" + nombre + "Apellidos" + apellidos + "Direccion" + direccion + "Telefono" + telefono
    + "Edad" + edad + "CabezaHogar" + cabezaHogar + "EstadoCivil" + estadoCivil;
}

}//End class
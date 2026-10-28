package Modelo;


/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Persona
{
    private Tecnologia tecnologia;
    private PagoServicio pagoServicio;
    private String nivelEducativo;
    private String institucion;
    
    public Docente() {
        super();
        this.bono = new Bono(100000);
        this.tecnologia = new Tecnologia(0);
        this.pagoServicio = new PagoServicio(0);
    }
    
    public Docente(String tipoDocumento, String numeroDocumento, String nombre, String apellidos, String direccion, String telefono, int edad, boolean cabezaHogar, String estadoCivil, String institucion, String nivelEducativo) {
        super(tipoDocumento, numeroDocumento, nombre, apellidos, direccion, telefono, edad, cabezaHogar, estadoCivil);
        this.institucion = institucion;
        this.nivelEducativo = nivelEducativo;
        this.bono = new Bono(100000);
        this.tecnologia = new Tecnologia(0);
        this.pagoServicio = new PagoServicio(0);
    }
    
    public String getInstitucion(){
        return this.institucion;
    }
    
    public void setInstitucion(String institucion){
        this.institucion = institucion;
    }
 
    public String getNivelEducativo(){ 
        return this.nivelEducativo; 
    }
        
    public void setNivelEducativo(String nivelEducativo){
        this.nivelEducativo = nivelEducativo;
    }
 
    public Tecnologia getTecnologia(){ 
        return this.tecnologia; 
    }
    
    public void setTecnologia(Tecnologia tecnologia){ 
        this.tecnologia = tecnologia;
    }
 
    public PagoServicio getPagoServicio(){ 
        return this.pagoServicio;
    }
    
    public void setPagoServicio(PagoServicio pagoServicio){ 
        this.pagoServicio = pagoServicio; 
    }
 
    @Override
    public String toString(){
        return "Docente -> " + super.toString()
             + ", Institucion: " + institucion
             + ", Nivel educativo: " + nivelEducativo
             + ", Tecnologia: " + tecnologia.getValor()
             + ", Pago servicio: " + pagoServicio.getValor();
    }
}
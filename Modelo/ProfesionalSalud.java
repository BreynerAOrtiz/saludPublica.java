package Modelo;


/**
 * Write a description of class ProfesionalSalud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProfesionalSalud extends Persona
{
    // instance variables - replace the example below with your own
    private Bioseguridad bioseguridad;
    private Medicina medicina;
    private String institucion;
    private String especialidad;

    public ProfesionalSalud() {
        super();
        this.bono = new Bono(350000);
        this.bioseguridad = new Bioseguridad(0);
        this.medicina = new Medicina(0);
    }

    public ProfesionalSalud(String tipoDocumento, String numeroDocumento, String nombre, String apellidos, String direccion, String telefono, int edad, boolean cabezaHogar, String estadoCivil, String institucion, String especialidad) {
        super(tipoDocumento, numeroDocumento, nombre, apellidos, direccion, telefono, edad, cabezaHogar, estadoCivil);
        this.institucion = institucion;
        this.especialidad = especialidad;
        this.bono = new Bono(350000);
        this.bioseguridad = new Bioseguridad(0);
        this.medicina = new Medicina(0);
    }
    
    public String getInstitucion(){ 
        return this.institucion;
    }
    
    public void setInstitucion(String institucion){ 
        this.institucion = institucion; 
    }
 
    public String getEspecialidad(){ 
        return this.especialidad; 
    }
    
    public void setEspecialidad(String especialidad){ 
        this.especialidad = especialidad; 
    }
 
    public Medicina getMedicina(){ 
        return this.medicina;
    }
    
    public void setMedicina(Medicina medicina){ 
        this.medicina = medicina; 
    }
 
    public Bioseguridad getBioseguridad(){ 
        return this.bioseguridad; 
    }
    
    public void setBioseguridad(Bioseguridad bioseguridad){ 
        this.bioseguridad = bioseguridad; 
    }
 
    @Override
    public String toString(){
        return "Profesional de salud -> " + super.toString()
             + ", Institucion: " + institucion
             + ", Especialidad: " + especialidad
             + ", Medicina: " + medicina.getValor()
             + ", Bioseguridad: " + bioseguridad.getValor();
    }
}
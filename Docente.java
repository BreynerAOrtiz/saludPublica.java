import java.util.*;
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Persona
{
    private ArrayList <Tecnologia> tecnologia = new ArrayList<>();
    private ArrayList <PagoServicio> pagoservicio = new ArrayList<>();
    
    private String nivelEducativo;
    private String institucion;
    
    public Docente(){
        
    }
    
    public Docente(String nivelEducativo, String institucion){
        this.nivelEducativo =nivelEducativo;
        this.institucion = institucion;
    }
    
}
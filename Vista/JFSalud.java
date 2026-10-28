package Vista;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


/**
 * Write a description of class JFSalud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFSalud extends JFrame
{
    private JComboBox <String> cmbTipoDocumento;
    private JTextField txtDocumento;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEdad;
    private JTextField txtEstrato;
    private JTextField txtEstadoCivil;
    private JTextField txtTipo;
    private JComboBox<String> cmbTipoPersona;
    private JTextField txtInstitucion;
    private JTextField txtEspecialidad;
    private JTextField txtNivel;
    private JCheckBox chkCabezaHogar = new JCheckBox("cabeza de hogar");
    
    
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JButton btnBuscar;
    
    private JTextField txtBioseguridad;
    private JTextField txtMedicina;
    
    private JTextField txtImplementos;
    private JTextField txtServicio;
    
    private JTextField txtMedicinaPersona;
    private JTextField txtCanastaFamiliar;
    
    
    
    public JFSalud(){
        
        setTitle("Registro de personas y bonos ");
        setSize(950,560);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        crearInterfaz();
        
        
        setVisible(true);
    }
    
    public void crearInterfaz(){
        JPanel principal = new JPanel(new GridLayout(1,2,10,10));
        
        JPanel panel1 = new JPanel(new GridLayout(0, 2, 5, 5));
        panel1.setBorder(BorderFactory.createTitledBorder("Registro datos basicos"));
        
        cmbTipoDocumento = new JComboBox<>(new String[]{"CC", "TI"});
        panel1.add(new JLabel("Tipo Documento"));
        panel1.add(cmbTipoDocumento);
        
        txtDocumento = new JTextField();
        panel1.add(new JLabel("Documento"));
        panel1.add(txtDocumento);
        
        txtNombre = new JTextField();
        panel1.add(new JLabel("Nombre"));
        panel1.add(txtNombre);
        
        txtApellido = new JTextField();
        panel1.add(new JLabel("Apellido"));
        panel1.add(txtApellido);
        
        txtDireccion = new JTextField();
        panel1.add(new JLabel("Direccion"));
        panel1.add(txtDireccion);
        
        txtTelefono = new JTextField();
        panel1.add(new JLabel("Telefono"));
        panel1.add(txtTelefono);

        txtEdad = new JTextField();
        panel1.add(new JLabel("Edad"));
        panel1.add(txtEdad);
        
        txtEstrato = new JTextField();
        panel1.add(new JLabel("Estrato"));
        panel1.add(txtEstrato);
        
        txtEstadoCivil = new JTextField();
        panel1.add(new JLabel("Estado Civil"));
        panel1.add(txtEstadoCivil);
        
        cmbTipoPersona = new JComboBox<>(new String[]{"Seleccione", "Profesional Salud", "Docente", "Ciudadano Independiente"});
        panel1.add(new JLabel("Tipo Persona"));
        panel1.add(cmbTipoPersona);
        
        txtInstitucion = new JTextField();
        panel1.add(new JLabel("Institucion"));
        panel1.add(txtInstitucion);
        
        txtEspecialidad = new JTextField();
        panel1.add(new JLabel("Especialidad"));
        panel1.add(txtEspecialidad);
        
        txtNivel = new JTextField();
        panel1.add(new JLabel("Nivel Educativo"));
        panel1.add(txtNivel);
        
        panel1.add(chkCabezaHogar);
        panel1.add(new JLabel());
        
        
        JPanel panel2 = new JPanel(new GridLayout(1, 3, 5, 5));
        panel2.setBorder(BorderFactory.createTitledBorder("Panel Botones"));
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");
        btnBuscar = new JButton("Buscar");
        panel2.add(btnGuardar);
        panel2.add(btnLimpiar);
        panel2.add(btnBuscar);
        
        JPanel panel3 = new JPanel(new GridLayout(2, 2, 5, 5));
        panel3.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Prof Salud"));
        txtBioseguridad = new JTextField();
        txtMedicina = new JTextField();
        panel3.add(new JLabel("Elemento Bioseguridad"));
        panel3.add(txtBioseguridad);
        panel3.add(new JLabel("Medicina"));
        panel3.add(txtMedicina);
        
        JPanel panel4 = new JPanel(new GridLayout(2, 2, 5, 5));
        panel4.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Docente"));
        txtImplementos = new JTextField();
        txtServicio = new JTextField();
        panel4.add(new JLabel("Implementos Tecnologicos"));
        panel4.add(txtImplementos);
        panel4.add(new JLabel("Servicio Internet/Energia"));
        panel4.add(txtServicio);
        
        JPanel panel5 = new JPanel(new GridLayout(2, 2, 5, 5));
        panel5.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Persona Independiente"));
        txtMedicinaPersona = new JTextField();
        txtCanastaFamiliar = new JTextField();
        panel5.add(new JLabel("Medicina"));
        panel5.add(txtMedicinaPersona);
        panel5.add(new JLabel("Canasta Familiar"));
        panel5.add(txtCanastaFamiliar);
        
        JPanel panelDerecho = new JPanel(new GridLayout(4, 1, 5, 5));
        panelDerecho.add(panel2);
        panelDerecho.add(panel3);
        panelDerecho.add(panel4);
        panelDerecho.add(panel5);
        
        principal.add(panel1);
        principal.add(panelDerecho);
        add(principal);
        
        
    }
    
   
}

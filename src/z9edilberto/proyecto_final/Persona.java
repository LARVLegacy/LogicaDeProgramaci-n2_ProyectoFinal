
package z9edilberto.proyecto_final;

public class Persona {
    
    private  String usuario;
    private int contrasena;
    private int edad;
    private String ciudad;
    private int estrato;
    private String genero;
    private boolean estado;
    
    
    public Persona (){    
    }

    public Persona (String usuario, int contrasena, int edad, String ciudad, int estrato, String genero, boolean estado) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.ciudad = ciudad;
        this.estrato = estrato;
        this.genero = genero;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getContrasena() {
        return contrasena;
    }

    public int getEdad(){
        return edad;
    }
    
    public String getCiudad() {
        return ciudad;
    }

    public int getEstrato() {
        return estrato;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "persona\n" + "Usuario= " + usuario + ", contraseña= " + contrasena + ", edad= " + edad 
                + ", ciudad= " + ciudad + ", estrato= " + estrato + ", genero= " + genero 
                + ", estado= " + estado;
    }
    
    
    
}
    
    


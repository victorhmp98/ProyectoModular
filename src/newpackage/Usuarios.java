package newpackage;

class Usuarios {

    public String nombre;
    public String generacion;
    public String fecha_registro ;
    public String usuario;
    public String contraseña;
    public boolean cuenta;
    
    public Usuarios(String nombre,String generacion,String fecha_registro, 
            String usuario, String contraseña, boolean cuenta) {
        this.nombre = nombre;
        this.generacion = generacion;
        this.fecha_registro = fecha_registro;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cuenta = cuenta;

    }

}


package com.mycompany.main;

public class Usuario {
    // Atributos
private int id;
private String nombre;
private String correoElectronico;
private String cedula;
private String direccion;
private String telefono;
//contructor
    public Usuario(int id, String nombre, String correoElectronico, String cedula, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }
//geters y setters
    public int getId(){
        return id;
    }
    public String getNombre (){
        return nombre;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getCedula(){
        return cedula;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    //set
    public void setId(int id) { 
        this.id = id; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico; 
    }
    public void setCedula(String cedula) {
        this.cedula = cedula; 
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion; 
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

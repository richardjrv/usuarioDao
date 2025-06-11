
package com.mycompany.main;

   
public interface UsuarioDao {
    //metodos
    void agregarUsuario(Usuario usuario);
    void modificarUsuario( int id, Usuario usuarioModificado);
    void eliminarUsuario(int id);
    Usuario[] obtenerDatos();
}


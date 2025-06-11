
package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();

        UsuarioServices usuarioServices = new UsuarioServices(usuarioDao);

        Usuario u1 = new Usuario(1, "Ana Pérez", "ana@gmail.com", "101010", "Calle 1", "3001234567");
        Usuario u2 = new Usuario(2, "Luis Gómez", "luis@gmail.com", "202020", "Calle 2", "3007654321");

        usuarioServices.registrarUsuario(u1);
        usuarioServices.registrarUsuario(u2);

        System.out.println("Usuarios registrados:");
        usuarioServices.imprimirUsuarios();

        Usuario u2Modificado = new Usuario(2, "Luis Gómez", "luisnuevo@gmail.com", "202020", "Calle 2", "3007654321");
        usuarioServices.modificarUsuario(u2Modificado);

        System.out.println("\nUsuarios después de modificación:");
        usuarioServices.imprimirUsuarios();
        
        usuarioServices.eliminarUsuario(1);

        System.out.println("Usuarios después de eliminar el usuario con ID 1:");
        usuarioServices.imprimirUsuarios();
    }
}

    



package com.mycompany.main;

    public class UsuarioServicio {
    private UsuarioDao usuarioDao;

    public UsuarioServicio(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public void registrarUsuario(Usuario nuevoUsuario) {
        usuarioDao.agregarUsuario(nuevoUsuario);
    }

    public void modificarUsuario(Usuario usuarioActualizado) {
        usuarioDao.modificarUsuario(usuarioActualizado.getId(), usuarioActualizado);
    }

    public void eliminarUsuario(int id) {
        usuarioDao.eliminarUsuario(id);
    }

    public void imprimirUsuarios() {
        Usuario[] lista = usuarioDao.obtenerDatos();
        for (int i = 0; i < lista.length; i++) {
            Usuario u = lista[i];
            if (u != null) {
                System.out.println("ID: " + u.getId());
                System.out.println("Nombre: " + u.getNombre());
                System.out.println("Correo: " + u.getCorreoElectronico());
                System.out.println("Cédula: " + u.getCedula());
                System.out.println("Dirección: " + u.getDireccion());
                System.out.println("Teléfono: " + u.getTelefono());
            }
        }
    }
}



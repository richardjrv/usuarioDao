
package com.mycompany.main;

public class UsuarioDaoImpl implements UsuarioDao {
    private Usuario[] usuarios = new Usuario[10];
    private int contador = 0;

    @Override
    public void agregarUsuario(Usuario usuario) {
        if (contador < usuarios.length) {
            usuarios[contador] = usuario;
            contador++;
        } else {
            System.out.println("Límite de usuarios alcanzado.");
        }
    }

    @Override
    public void modificarUsuario(int id, Usuario usuarioModificado) {
        for (int i = 0; i < contador; i++) {
            if (usuarios[i].getId() == id) {
                usuarios[i] = usuarioModificado;
                return;
            }
        }
        System.out.println("Usuario con ID " + id + " no encontrado.");
    }

    @Override
    public void eliminarUsuario(int id) {
        for (int i = 0; i < contador; i++) {
            if (usuarios[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                usuarios[contador - 1] = null;
                contador--;
                return;
            }
        }
        System.out.println("Usuario con ID " + id + " no encontrado.");
    }

    @Override
    public Usuario[] obtenerDatos() {
        Usuario[] resultado = new Usuario[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = usuarios[i];
        }
        return resultado;
    }
}


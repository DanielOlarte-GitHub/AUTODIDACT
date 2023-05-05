package Java.Usuarios.Codigo;

import java.util.HashMap;

public class UsuarioServicio {
    private HashMap<Integer, UsuarioDto> usuarios = new HashMap<>();

    public UsuarioDto crear(int id, String nombre){
        usuarios.put(id, new UsuarioDto(id, nombre));
        return usuarios.get(id);
    }


    public UsuarioDto obtener(int id){
        return usuarios.get(id);
    }


    public UsuarioDto actualizar(int id, String nombre){

        usuarios.put(id, new UsuarioDto(id, nombre));
        return usuarios.get(id);
    }

}

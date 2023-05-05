package Java.Usuarios.Tests;

import Java.Usuarios.Codigo.UsuarioDto;
import Java.Usuarios.Codigo.UsuarioServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class UsuarioServicioTest {
    UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp() {
        usuarioServicio = new UsuarioServicio();
    }

    @DisplayName("Prueba de creacion de usuario que sean DIFERENTES")
    @Test
    public void test1() {
        UsuarioDto usu1 = new UsuarioDto(1, "otro");

        UsuarioDto usu2 = usuarioServicio.crear(1, "prueba");

        Assertions.assertEquals(usu1.getId(), usu2.getId());
        Assertions.assertNotEquals(usu1.getNombre(), usu2.getNombre());
        Assertions.assertNotEquals(usu1, usu2);
        /*
         * Assertions.assertTrue(true);
         * Assertions.assertFalse(false);
         * Assertions.fail();
         */

    }

    @DisplayName("Prueba de creacion de usuario")
    @Test
    public void test1() {
        UsuarioDto usu1 = new UsuarioDto(1, "prueba");
        UsuarioDto usu2 = usuarioServicio.crear(1, "prueba");

        Assertions.assertEquals(usu1.getId(), usu2.getId());
        Assertions.assertEquals(usu1.getNombre(), usu2.getNombre());
        Assertions.assertEquals(usu1, usu2);
    }

    @DisplayName("Comprobar si el usuario existe o no")
    @Test
    public void test3() {
        UsuarioDto usu1 = usuarioServicio.obtener(1);

        Assertions.assertEquals(usu1.getId(), null);
    }
}

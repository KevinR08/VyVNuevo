import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String usuario;
    private String contraseña;


    public Persona() {
    }

    public Persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Usuario: " + usuario+
                "  - Contraseña: " + contraseña;
    }


}
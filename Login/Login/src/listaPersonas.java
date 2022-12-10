import java.util.ArrayList;
import java.util.List;

public class listaPersonas {

    Persona persona=new Persona();
    private List listaPersonas = new ArrayList<Persona>();

    public listaPersonas() {
    }

    public void addPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    public List getListaPersonas() {
        return this.listaPersonas;
    }


    public void verificarContraseña(String usuario, String contraseña){
        for(int i = 0; i< listaPersonas.size(); i++){
            Persona persona = (Persona) listaPersonas.get(i);
            if(persona.getUsuario().equals(usuario)){
                //Ejemplo de error por parte del desarrollador
                //Emplea una función que puede aceptar una contraseña incluso si no coincide mayúsculas y minúsculas
                if(persona.getContraseña().equalsIgnoreCase(contraseña)){
                    System.out.println("Usuario autenticado");
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else{
                System.out.println("Usuario incorrecto");
            }
        }
    }

    public void toStringLista() {
        for(int i=0; i<this.listaPersonas.size();i++){
            System.out.println(listaPersonas.get(i));
        }
    }
}

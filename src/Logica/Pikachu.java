package Logica;

import Abstract.Pokemon;
import Interfaz.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    @Override
    protected void atacarPlacaje() {
     System.out.println("Soy Pikachu y este es mi ataque placaje");    
    }
    @Override
    protected void atacarAraniazo() {
    System.out.println("Soy Pikachu y este es mi ataque arañazo");    }

    @Override
    protected void atacarMordisco() {
    System.out.println("Soy Pikachu y este es mi ataque mordico");    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque Impact trueno"); 
    }
    @Override
    public void atacarPunioTrueno() {
         System.out.println("Soy Pikachu y este es mi ataque puño trueno");
    }
}

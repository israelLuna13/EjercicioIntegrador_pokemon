package Logica;

import Abstract.Pokemon;
import Interfaz.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Balbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Balbasaur y este es mi ataque Arañazo");    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Balbasaur y este es mi ataque mordisco");    }

    //----------------------------------------------------------------
    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y este es mi ataque Drenaje");    }

    @Override
    public void atacarParalizar() {
    System.out.println("Soy Bulbasaur y este es mi ataque Paralizar");    }
    
}

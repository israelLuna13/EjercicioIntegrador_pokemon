package Logica;
//cada pokemon posee cosas iguales y para eso creamos una clase abtracta 
//cada pokemon posee cosas en particular y para eso creamos las interfaces


public class EjercicioIntegrador {
    public static void main(String[] args) {
        //creacion de los pokemon
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bula = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        
        squirtle.atacarAraniazo();//metodo de la clase abstracta
        squirtle.atacarHidrobomba();//metodo de la interface
        
        charmander.atacarAraniazo(); //metodo de la clase abstracta
        charmander.atacarLanzallamas();//metodo de la interface
        
        bula.atacarAraniazo();//metodo de la clase abstracta
        bula.atacarParalizar();//metodo de la interface
        
        pika.atacarAraniazo();//metodo de la clase abstracta
        pika.atacarImpactTrueno();//metodo de la interface
    }
    
}

package structural.flyweight.models;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
    private static final Map<Character,Caracter> caracterMap=new HashMap<>();
    public static Caracter getCaracter(char simbolo){
        Caracter caracter=caracterMap.get(simbolo);
        if(caracter==null){
            caracter=new CaracterConcreto(simbolo);
            caracterMap.put(simbolo,caracter);
            System.out.printf("Creando carácter %c\n",simbolo);
        }
        return caracter;
    }
}

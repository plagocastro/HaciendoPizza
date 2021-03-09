package com.PabloLago.programacion;

public class Main {

    public static void main(String[] args) {
	pizza pi = new pizza();
	pi.hacemosPizza(1,true,"fina",true,false,false,false,true,true);
        System.out.println(pi.toString());
    pizza pi2 = new pizza();
    pi2.hacemosPizza(2,false,"fina",true,true,false,false,false,true);
        System.out.println(pi2.toString());

    pizza base = new BuilderPizza().setmasa("pan").setRelleno(true).setTipoSalsa("Carbonara").build();

        System.out.println("Las pizzas");
    }
}

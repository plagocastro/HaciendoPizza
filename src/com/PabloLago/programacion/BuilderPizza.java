package com.PabloLago.programacion;

public class BuilderPizza {
    pizza _pizza;

    public pizza build(){
        return _pizza;
    }
    // constructor
    public BuilderPizza() {
        _pizza = new pizza();
    }

    public BuilderPizza setmasa(String masa){
        _pizza.setMasa(masa);
        return this;
    }
    public BuilderPizza setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }
    public BuilderPizza setTipoSalsa(String TipoSalsa){
        _pizza.setTipoSalsa(TipoSalsa);
        return this;
    }
}

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
    public BuilderPizza setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }
    public BuilderPizza setExtraQueso(boolean extraQueso) {
        _pizza.setRelleno(extraQueso);
        return this;
    }
    public BuilderPizza setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }
    public BuilderPizza setPiña(boolean piña) {
        _pizza.setPiña(piña);
        return this;
    }
}

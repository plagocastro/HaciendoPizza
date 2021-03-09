package com.PabloLago.programacion;

import javax.swing.*;

public class pizza {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
   private String tipoSalsa;
    boolean cebolla;
    boolean sinGluten;
    boolean extraQueso;
    boolean piña=false;
    boolean champiñones;
    boolean jamon;


    public pizza(){

    }
    /**
     * objeto pizza
     * @param m puede ser fina o pan
     * @param r
     * @param p
     * @param t
     */
    public void hacemosPizza(int t, boolean r, String m, boolean c, boolean sG, boolean p, boolean ch, boolean j,boolean ext){
        masa = m;
        relleno = r;
        tipo = t;
        cebolla= c;
        sinGluten = sG;
        piña = p;
        champiñones = ch;
        jamon = j;
        extraQueso = ext;
        if(t==1){
            System.out.println("Carbonara");
        }
        if (t==2){
            System.out.println("tomate");
        }
        if (t==3){
            System.out.println("Barbacoa");
        }
        else{
            System.out.println("Elige un numero del 1 al 3");
        }
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "masa= " + masa +", relleno=" + relleno +", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipoSalsa=" + tipoSalsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon;
    }
}

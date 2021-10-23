package com.generation.animales;

public abstract class Ave extends Animal {

    private int alas;
    private int patas;
    private boolean vuela;

    public Ave () {
        super ();
    }

    public Ave(String nombre) {
        super(nombre);
        System.out.println("Constructor hijo");
    }

    public void hacerNido() {
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo() {
        System.out.println("Estoy poniendo un huevo");
    }

    @Override
    public void comer () {
        System.out.println("Estoy comiendo alpiste");
    }

    @Override
    public void respirar () {
        System.out.println("Estoy respirando por el pico");
    }
}

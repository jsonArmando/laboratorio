package com.java.practice.solid;

public class ConfiguracionEnvio {
    private static final ConfiguracionEnvio INSTANCIA = new ConfiguracionEnvio();
    private final double descuento;
    private ConfiguracionEnvio(){
        descuento = 2.0;
    }

    public static ConfiguracionEnvio getInstacia(){
        return INSTANCIA;
    }

    public double getDescuento(){return descuento;}

}

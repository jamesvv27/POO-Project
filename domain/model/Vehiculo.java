package domain.model;

import domain.enums.Marca;

public class Vehiculo
{
    private final Marca marca;
    private final String modelo;
    private final int anio;
    private int velocidad;

    public Vehiculo(Marca marca, String modelo, int anio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
    }

    public Marca getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public int getAnio()
    {
        return anio;
    }

    public int getVelocidad()
    {
        return velocidad;
    }
    
    private void incVelocidad(int velocidadAdicionada){
        this.velocidad += velocidadAdicionada;
    }
    
    public void acelerar(int incremento){
        System.out.println("Acelerando...");
        incVelocidad(incremento);
    }
    
    public void acelerar(){
        incVelocidad(10);
    }
    
    public void acelerar(int incremento, int veces){
        incremento *= veces;
        incVelocidad(incremento);
    }
    
    public void frenar(int decremento){
        System.out.println("Frenando...");
        decremento = -decremento;
        incVelocidad(decremento);
    }
    
    public boolean puedeCircular(){
        return this.velocidad > 0;
    }
    
    public double calcularTiempo(double distancia){
        if(this.velocidad == 0){
            return 0;
        }
        return distancia/velocidad;
    }
    
    public String mostrarInfo(){
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nAño: " + anio
                + "\nVelocidad actual: " + velocidad;
    }
}

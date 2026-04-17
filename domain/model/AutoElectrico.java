package domain.model;

import domain.enums.Marca;

public class AutoElectrico extends Vehiculo
{
    private int bateria;

    public AutoElectrico(Marca marca, String modelo, int anio,
            int bateria)
    {
        super(marca, modelo, anio);
        this.bateria = bateria;
    }
    
    private void incBateria(int bateriaAdicionada){
        this.bateria += bateriaAdicionada;
    }
    
    public void cargarBateria(int porcentaje){
        incBateria(porcentaje);
    }
    
    public int getBateria(){
        return bateria;
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\nBateria actual: " + this.bateria;
    }
}

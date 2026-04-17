package system;

import domain.enums.Marca;
import domain.model.AutoElectrico;
import domain.model.Vehiculo;

public class Main
{
    public static void main(String[] args)
    {
         Vehiculo ve = new Vehiculo(
            Marca.TOYOTA,
            "Corolla",
            2022);
         
        System.out.println("Puede circular : " + ve.puedeCircular());
        System.out.println("Tiempo : " + ve.calcularTiempo(200));
        
        System.out.println("");
        
        System.out.println(ve.mostrarInfo());
        
        System.out.println("");
        
        ve.acelerar(50);
        System.out.println("Velocidad: " + ve.getVelocidad());
        
        System.out.println("");
        ve.frenar(20);
        
        System.out.println("Velocidad: " + ve.getVelocidad());
        System.out.println("Modelo: " + ve.getModelo());
        System.out.println("Año: " + ve.getAnio());
        System.out.println("Marca: " + ve.getMarca());
        
        System.out.println("");
        
        ve.acelerar();
        System.out.println("Velocidad: " + ve.getVelocidad());
        ve.acelerar(5, 3);
        System.out.println("Velocidad: " + ve.getVelocidad());
        
        System.out.println("");
        
        System.out.println("Puede circular: " + ve.puedeCircular());
        System.out.println("Tiempo: " + ve.calcularTiempo(200));
        
        System.out.println("");
        
        AutoElectrico vs = new AutoElectrico(
                Marca.TOYOTA,
                "Prius",
                2024,
                70
        );
        
        System.out.println(vs.mostrarInfo());
        vs.cargarBateria(30);
        
        System.out.println("");
        
        System.out.println("Bateria: " + vs.getBateria());
    }
}

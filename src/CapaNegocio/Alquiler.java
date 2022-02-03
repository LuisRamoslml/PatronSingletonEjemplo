
package CapaNegocio;


public class Alquiler extends Autos
{
    String fecha_salida;
    double hora_salida;
    String fecha_entrada;
    double hora_entrada;
    double precio;
    double sancion;

    public Alquiler(String fecha_salida, double hora_salida, String fecha_entrada, double hora_entrada, double precio,double sancion, String marca, String modelo, String color, String placa) {
        super(marca, modelo, color, placa);
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.fecha_entrada = fecha_entrada;
        this.hora_entrada = hora_entrada;
        this.precio = precio;
        this.sancion = sancion;
        
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public double getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(double hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public double getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSancion() {
        return sancion;
    }

    public void setSancion(double sancion) {
        this.sancion = sancion;
    }
    
    
    public void Calcular()
    {
        if(hora_entrada>=hora_salida+8){
            sancion =(0.10*precio)+precio;
        }else if(hora_entrada<=hora_salida+24){
            sancion =(0.24*precio)+precio;
        }else if(hora_entrada<=hora_salida){
            sancion = 0;
        }
        
    }
    
}

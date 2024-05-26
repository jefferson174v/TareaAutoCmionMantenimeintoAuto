public class VehiculoCarga extends Vehiculo{

    private int capacidadcarga;

    public VehiculoCarga(String marca, String modelo, int ano, int kilometraje, int capacidadcarga) {
        super(marca, modelo, ano, kilometraje);
        this.capacidadcarga=capacidadcarga;
    }
    
    public int getCapacidadCarga(){
        return capacidadcarga;
    }
    public void setCapacidadCarga(int capacidadcarga){
        this.capacidadcarga=capacidadcarga;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad carga: "+capacidadcarga+" kg");
    }
}

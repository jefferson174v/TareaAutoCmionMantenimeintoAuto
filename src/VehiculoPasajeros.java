public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    public VehiculoPasajeros(String marca, String modelo, int ano, int kilometraje,int numPasajeros) {
        super(marca, modelo, ano, kilometraje);
        this.numPasajeros=numPasajeros;
    }

    public int getNumpasajeros(){
        return numPasajeros;
    }
    public void setNumpasajeros(int numPasajeros){
        this.numPasajeros=numPasajeros;
    }
    
    @Override

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numPasajeros);
    }
}
public class Camion extends VehiculoCarga{
    private int numEjes;

    public Camion(String marca, String modelo, int ano, int kilometraje, int capacidadcarga, int numEjes) {
        super(marca, modelo, ano, kilometraje, capacidadcarga);
        this.numEjes=numEjes;
    }

    public int getNumEjes(){
        return numEjes;
    }
    public void  setNumEjes(int numEjes){
        this.numEjes=numEjes;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ejes: "+numEjes);
    }

    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        System.out.println("Revisión de diferencial");
        System.out.println("Revisión de sistema de frenos de aire");
        System.out.println("Revisión de sistema de dirección");
    }
}

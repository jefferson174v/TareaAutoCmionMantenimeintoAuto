
public class Vehiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int ano, int kilometraje){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.kilometraje=kilometraje;
    }
    public String getMarca(String marca){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(String modelo){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public int getAno(int ano){
        return ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

    public int getKilometraje(int kilometraje){
        return kilometraje;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Kilometraje: "+kilometraje);
    }

    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo...");
        System.out.println("Cambio de aceite");
        System.out.println("Revisión de frenos");
        System.out.println("Revisión de neumáticos");
        System.out.println("Lavado exterior e interior");
    }
}
public class Auto extends VehiculoPasajeros {

    private String tipoCombustible;

    public Auto(String marca, String modelo, int ano, int kilometraje, int numPasajeros, String tipoCombustubile) {
        super(marca, modelo, ano, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustubile;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combsutible: " + tipoCombustible);
    }

    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        System.out.println("Revisión de inyectores");
        System.out.println("Alineación y balanceo de ruedas");
        System.out.println("Revisión de sistema eléctrico");
    }

    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        double costoTotal = costoPorKm * kilometrosRecorridos;
        return costoTotal;
    }
}

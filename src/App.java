//Jefferson Aron Flores Corea 2024-1626U
public class App {
    public static void main(String[] args) throws Exception {
        Auto auto = new Auto("Toyota", "corola", 2011, 1122, 4, "Gasolina");
        Camion camion = new Camion("Volvo", "XD", 2025, 13079, 5000, 6);
        System.out.println("Info del Auto: ");
        auto.mostrarInfo();
        System.out.println("---------------------------");
        System.out.println("Realizando mantenimiento del Auto: ");
        auto.realizarMantenimiento();
        System.out.println("---------------------------");
        double costoMantenimientoAuto = auto.calcularCostoMantenimiento(0.05, 1000);
        System.out.println("Costo de mantenimiento del Auto: $" + costoMantenimientoAuto);

        System.out.println("Info del Camion: ");
        camion.mostrarInfo();
        System.out.println("---------------------------");
        System.out.println("Realizando mantenimiento del Camion: ");
        camion.realizarMantenimiento();
    }
}

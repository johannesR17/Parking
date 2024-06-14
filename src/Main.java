import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear parqueadero con 40 puestos y tarifa inicial de 7.5
        Parqueadero garage = new Parqueadero(40, 7.5);

        // Registrar carros en el estacionamiento
        garage.identificarAuto(new Carro("JKL693", 1));
        garage.identificarAuto(new Carro("ULM284", 3));
        garage.identificarAuto(new Carro("SXT759", 5));

        // Deja ir a un carro específico
        garage.partidaAuto("ULM284", 4);

        // Calcular e imprimir las entradas del parqueadero
        double registros = garage.computoRegistros();
        System.out.println("Ingresos del parqueadero: " + registros);

        // Consultar e imprimir la cantidad de puestos disponibles
        int parkingDesocupados = garage.numeroparkingDesocupados();
        System.out.println("Puestos disponibles: " + parkingDesocupados);

        // Avanzar el reloj del parqueadero a las 18
        garage.prolongarhora(18);

        // Cambiar la tarifa del parqueadero a 12.5
        garage.modificarImporte(12.5);

        // Calcular e imprimir el tiempo promedio en el garage
        double horaMean= garage.HoraMean();
        System.out.println("Hora promedio en el estacionamiento: " + horaMean);

        // Verificar e imprimir si hay algún vehículo estacionado por más de ocho horas
        boolean autoPassOchoHour = garage.AutoPassOchoHour();
        System.out.println("Existe auto pasado ocho horas: " + autoPassOchoHour);

        // Obtener e imprimir la cantidad de carros parqueados por más de tres horas
        ArrayList<Carro> autoTresHoras = garage.AutosTresHorasEstacionados();
        System.out.println("Vehículos pasados tres horas parqueados: " + autoTresHoras.size());

        // Verificar e imprimir si hay vehículos con placas similares
        boolean autosIdMismo = garage.AutosIdMismo();
        System.out.println("Existen vehículos con placa similar: " + autosIdMismo);

        // Contar e imprimir la cantidad de vehículos cuyas placas comienzan con "RI"
        int autosRI = garage.enumerarAutosPlacaPB();
        System.out.println("Vehículos con placa PB: " + autosRI);

        // Verificar e imprimir si hay algún carro con 24 o más horas de permanencia
        boolean auto24Horas = garage.Auto24Horas();
        System.out.println("Existe vehículo con 24 o más horas: " + auto24Horas);

        // Desocupar el parqueadero e imprimir la cantidad de carros sacados
        int autosExit = garage.vaciarEstacionamiento();
        System.out.println("Número de vehículos sacados: " + autosExit);
    }
}

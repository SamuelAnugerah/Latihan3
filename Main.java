
interface EngineVehicle {
    void startEngine();
}

interface FuelVehicle {
    void isiBahanBakar();
}

interface ElectricVehicle {
    void isiBaterai();
}

interface BicycleVehicle {
    void kayuh();
}

class MobilBensin implements EngineVehicle, FuelVehicle {
    public void startEngine() {
        System.out.println("Mesin mobil bensin dinyalakan.");
    }

    public void isiBahanBakar() {
        System.out.println("Mobil bensin mengisi bahan bakar.");
    }
}

class MobilListrik implements EngineVehicle, ElectricVehicle {
    public void startEngine() {
        System.out.println("Motor listrik dinyalakan.");
    }

    public void isiBaterai() {
        System.out.println("Mobil listrik mengisi baterai.");
    }
}

class Sepeda implements BicycleVehicle {
    public void kayuh() {
        System.out.println("Sepeda sedang dikayuh.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===== MOBIL BENSIN =====");
        MobilBensin mobilBensin = new MobilBensin();
        mobilBensin.startEngine();
        mobilBensin.isiBahanBakar();

        System.out.println("\n===== MOBIL LISTRIK =====");
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        System.out.println("\n===== SEPEDA =====");
        Sepeda sepeda = new Sepeda();
        sepeda.kayuh();
    }
}

public class Notebook {
    private String brand;
    private int ramSizeGB;
    private int storageSizeGB;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int ramSizeGB, int storageSizeGB, String operatingSystem, String color) {
        this.brand = brand;
        this.ramSizeGB = ramSizeGB;
        this.storageSizeGB = storageSizeGB;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public int getStorageSizeGB() {
        return storageSizeGB;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ramSizeGB=" + ramSizeGB +
                ", storageSizeGB=" + storageSizeGB +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
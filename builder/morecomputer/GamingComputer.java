package builder.morecomputer;

public class GamingComputer implements ComputerBuilder {
    private Computer computer;

    public GamingComputer() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i9 9900K");
    }

    @Override
    public void buildComputerCase() {
        computer.setComputerCase("Super Led Case");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("ASUS ROG Strix Z390-E");
    }

    @Override
    public void buildHDD() {
        computer.setHDD("SSD 512GB x2");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("ASUS RTX 2080 Ti OC");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply(850);
    }

    @Override
    public void installOperatingSystem() {
        computer.setOperatingSystem("Windows 11");
    }

    @Override
    public void buildAmountOfRAM() {
        computer.setAmountOfRAM(32);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}

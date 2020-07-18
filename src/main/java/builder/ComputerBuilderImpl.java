package builder;

public class ComputerBuilderImpl implements ComputerBuilder{
    private Computer computer;

    public ComputerBuilderImpl() {
        this.computer = new Computer();
    }

    @Override
    public Computer build() {
        return computer;
    }

    @Override
    public ComputerBuilder processor(Integer processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public ComputerBuilder memory(Integer memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder screenSize(Double screenSize) {
        computer.setScreenSize(screenSize);
        return this;
    }

    @Override
    public ComputerBuilder osVersion(String osVersion) {
        computer.setOsVersion(osVersion);
        return this;
    }
}

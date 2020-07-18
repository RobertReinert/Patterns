package builder;

public interface ComputerBuilder {

    Computer build();

    ComputerBuilder processor (Integer processor);
    ComputerBuilder memory (Integer memory);
    ComputerBuilder screenSize (Double screenSize);
    ComputerBuilder osVersion (String osVersion);


}

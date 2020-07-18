package builder;

public class Main {

    public static void main(String[] args) {
    Computer computer = new ComputerBuilderImpl()
            .processor(1200)
            .memory(4096)
            .screenSize(23.0)
            .osVersion("Catalina")
            .build();

        System.out.println(computer);

    }




}

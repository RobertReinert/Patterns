package builder.joshua;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder(1200, 4096)
                .osVersion("Catalina")
                .screenSize(23.5)
                .build();

        System.out.println(computer);
    }
}

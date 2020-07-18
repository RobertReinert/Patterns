package builder;

public class Computer {

    private Integer processor;
    private Integer memory;
    private Double screenSize;
    private String osVersion;


    public void setProcessor(Integer processor) {
        this.processor = processor;
    }


    public void setMemory(Integer memory) {
        this.memory = memory;
    }


    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }


    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }
}

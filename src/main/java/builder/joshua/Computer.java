package builder.joshua;

public class Computer {
    private Integer processor;
    private Integer memory;
    private Double screenSize;
    private String osVersion;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.screenSize = builder.screenSize;
        this.osVersion = builder.osVersion;

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

    public static class Builder {
        private Integer processor;
        private Integer memory;
        private Double screenSize;
        private String osVersion;


        public Builder(Integer processor, Integer memory) {
            this.processor = processor;
            this.memory = memory;
        }

        public Builder screenSize(Double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}

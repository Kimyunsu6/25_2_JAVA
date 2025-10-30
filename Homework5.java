class Monitor {

    private String monitorsize;
    private String color;
    private String power;

    public Monitor(String monitorsize, String color, String power){
        this.monitorsize = monitorsize;
        this.color = color;
        this.power = power;
    }
    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + this.monitorsize);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

}

class Computer {


    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("Cpu: " + this.cpu);
        System.out.println("Memory: " + this.memory);
        System.out.println("HDD: " + this.hd);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }
}
class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer com, Monitor mon) {
        this.computer = com;
        this.monitor = mon;
    }

    public void turnOn() {
        this.computer.turnOn();
        this.monitor.turnOn();
    }
    public void printInfo() {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}
public class Homework5 {
    public static void main(String[] args) {
        Monitor newMonitor = new Monitor("32 inch","Black","45W");
        Computer newComputer = new Computer("Core i7","32GB", "2TB",
                "White","700w");
        PersonalComputer newPersonalComputer = new PersonalComputer(newComputer, newMonitor);

        newPersonalComputer.turnOn();
        newPersonalComputer.printInfo();

    }

}
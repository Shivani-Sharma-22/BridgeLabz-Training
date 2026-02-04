// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light class
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

// AC class
class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

// TV class
class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Test class
public class SmartHome {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();

        d1.turnOff();
        d2.turnOff();
        d3.turnOff();
    }
}

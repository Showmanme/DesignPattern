class Orc implements Cloneable {
    String name;
    int power;
    public Orc(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public Orc clone() {
        try {
            return (Orc) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    public void display() {
        System.out.println("Orc:" + name + "Power:" + power);
    }
}


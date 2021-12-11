package by.epam.lab;

public class Byn {
    private final int value;

    public Byn (){
        value = 0;
    }

    public Byn (int value) {
        this.value = value;
    }

    public Byn (Byn o) {
        this(o.value);
    }

    public int getValue() {
        return value;
    }

    public Byn add(int i){
        return new Byn(value + i);
    }
    public Byn add(Byn o){
        return new Byn(value + o.value);
    }

    public Byn mul(int i) {
        return new Byn(value*i);
    }
    public Byn mul(double i){
        return new Byn((int)Math.round(value*i));
    }
    public Byn sub(Byn o){
        return new Byn(value - o.value);
    }

    public Byn roundDown() {
        return new Byn((value/100)*100);
    }

    public int compareTo(Byn o) {
        return value - o.value;
    }

    @Override
    public String toString() {
        return (value / 100 + "." + value % 100 / 10 + value % 10);
    }
}

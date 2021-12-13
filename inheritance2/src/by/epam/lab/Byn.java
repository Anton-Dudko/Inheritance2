package by.epam.lab;

public class Byn implements Comparable<Byn>{
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

    public Byn add(Byn byn) {
        return new Byn(value + byn.value);
    }

    public Byn sub(Byn byn) {
        return new Byn(value - byn.value);
    }

    public Byn mul(int i) {
        return new Byn(value * i);
    }

    public Byn mul(double i, RoundMethod roundMethod, int accuracy) {
        return new Byn(roundMethod.round(value * i, accuracy));
    }

    public Byn round(RoundMethod roundMethod, int accuracy) {
        return new Byn(roundMethod.round(value, accuracy));
    }

    public int compareTo(Byn o) {
        return value - o.value;
    }

    @Override
    public String toString() {
        return (value / 100 + "." + value % 100 / 10 + value % 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byn byn = (Byn) o;
        return value == byn.value;
    }
}

package model;

import java.util.Objects;

public class Engine {
    private Integer power;
    private Integer capacity;

    //region Getters and Setters
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    //endregion

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power.equals(engine.power) && capacity.equals(engine.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, capacity);
    }
}

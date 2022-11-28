package com.epam.training.student_Maksim_Kondratev.models.planes;

import com.epam.training.student_Maksim_Kondratev.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends AbstractPlane {

    private final MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance,
                         int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militaryType=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof MilitaryPlane)) return false;
        if (!super.equals(obj)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) obj;
        return this.militaryType == militaryPlane.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}

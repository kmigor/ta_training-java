package com.epam.training.student_Maksim_Kondratev.models.planes;

import com.epam.training.student_Maksim_Kondratev.models.ClassificationLevel;
import com.epam.training.student_Maksim_Kondratev.models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends AbstractPlane {

    private final ExperimentalTypes experimentalTypes;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public ExperimentalTypes getExperimentalTypes(){
        return experimentalTypes;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof ExperimentalPlane)) return false;
        if (!super.equals(obj)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) obj;
        return
                this.experimentalTypes == experimentalPlane.experimentalTypes &&
                this.classificationLevel == experimentalPlane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", experimentalTypes=" + experimentalTypes +
                        ", classificationLevel=" + classificationLevel +
                        '}');
    }
}

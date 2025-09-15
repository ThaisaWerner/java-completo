package model.heritage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SS")
public class ScholarshipStudent extends Student {

    private double scholarshipValue;

    public ScholarshipStudent() {
    }

    public ScholarshipStudent(Long id, String name, double scholarshipValue) {
        super(id, name);
        this.scholarshipValue = scholarshipValue;
    }

    public double getScholarshipValue() {
        return scholarshipValue;
    }

    public void setScholarshipValue(double scholarshipValue) {
        this.scholarshipValue = scholarshipValue;
    }
}

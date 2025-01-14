package org.ms.medicalsystem.model;

import java.util.Date;

public class MedicineDispense {
    private Integer dispenseId;

    private Integer patientId;

    private Integer medicineId;

    private Integer quantity;

    private Date dispenseDate;

    public Integer getDispenseId() {
        return dispenseId;
    }

    public void setDispenseId(Integer dispenseId) {
        this.dispenseId = dispenseId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDispenseDate() {
        return dispenseDate;
    }

    public void setDispenseDate(Date dispenseDate) {
        this.dispenseDate = dispenseDate;
    }
}
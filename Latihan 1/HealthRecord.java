// HealthRecord.java
public class HealthRecord {
    private String medicalRecord;
    private String dateCreated;

    public HealthRecord(String medicalRecord, String dateCreated) {
        this.medicalRecord = medicalRecord;
        this.dateCreated = dateCreated;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}

package co.com.automatization.herokuapp.models;

public class Appointment {
    private String date;
    private String idPatient;
    private String idDoctor;
    private String observation;

    public Appointment(String date, String idPatient, String idDoctor, String observation) {
        this.date = date;
        this.idPatient = idPatient;
        this.idDoctor = idDoctor;
        this.observation = observation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }
}

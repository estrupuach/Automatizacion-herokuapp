@stories
Feature: Herokuapp
  As a patient
  I want to request to schedule an appointment
  by the hospital administration system

  @ScenarioAppointment
  Scenario: Schedule appointment
    Given that Carlos needs assits to the doctor
    When he realizes the schedule of appointment
    |date|idPatient|idDoctor|observation|
    |05/16/2022|9823964|103589965|health appointment for consulting my hand|
    Then he validates the appointment menssage in the window Datos guardados correctamente.
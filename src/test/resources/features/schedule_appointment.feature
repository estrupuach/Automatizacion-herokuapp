@stories
Feature: Herokuapp
  As a patient
  I want to request to schedule an appointment
  by the hospital administration system

  @ScenarioAppointment
  Scenario: Schedule appointment
    Given that Carlos needs assits to the doctor
    When he realizes the schedule of appointment
    Then he validates the menssage in the window Datos guardados correctamente
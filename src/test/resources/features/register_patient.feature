@stories
Feature: Herokuapp
  As a patient
  I want to request to schedule an appointment
  by the hospital administration system

  @ScenarioPatient
  Scenario: Register Patient
    Given that Carlos needs register a new patient
    When he realizes the register from same in the hospital administrative system
    Then he validates the menssage in the window Datos guardados correctamente
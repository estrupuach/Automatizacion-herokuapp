@stories
Feature: Herokuapp
  As a patient
  I want to request to schedule an appointment
  by the hospital administration system

  @ScenarioPatient
  Scenario: Register Patient
    Given that Carlos needs register a new patient
    When he realizes the register from patient in the hospital administrative system
      |name|lastName|telephone|idType|id|
      |Camilo |Cadavid |45d64962|Cédula de ciudadanía|9823964|
    Then he validates the patient menssage in the window Datos guardados correctamente.
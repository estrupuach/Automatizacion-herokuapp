@stories
  Feature: Herokuapp
    As a patient
    I want to request to schedule an appointment
    by the hospital administration system

    @ScenarioDoctor
    Scenario: Register doctor
      Given that Carlos needs register a new doctor
      When he realizes the register from doctor in the hospital administrative system
      |name|lastName|telephone|idType|id|
      |Cristian |Avendaño |30045741|Pasaportes|10358965|
      Then he validates the doctor menssage in the window Datos guardados correctamente.

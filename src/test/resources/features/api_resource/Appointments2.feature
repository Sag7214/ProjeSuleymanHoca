Feature: appointments test

  @appointmentsGet

  Scenario:appointments data read

    Given kullanici appointments icin get request yapar
    And kullanici appointments bilgilerini deserialize eder
    Then kullanici appointments bilgilerini validate eder
    
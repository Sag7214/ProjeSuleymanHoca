Feature:  test api

@RoomGet
  Scenario: Rooms api with GET request / Room api testing

    Given kullanici roomlar icin get request yapar
    And kullanici gelen room detayi deserialize eder
    Then kullanici room datasini validate eder


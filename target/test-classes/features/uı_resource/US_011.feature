Feature: "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

  Scenario:  Mevcut bir randevu düzenlenebilmeli

    Given Kullanici  "Medunna" anasayfaya gider
    And account menuye tiklar
    And Sign In butonuna tiklar
    And Username bilgisini girer
    And Password bilgisini girer
    And Sign in butonuna tiklar
    And My Pages butonuna tiklar
    And My Appointments secenegine tiklar
    And Edit butonuna tiklar
    And id, start and end date, Status, physician and patient bilgilerini dogrular
    And Status bolumundeki bilgiyi secer
    And Anamnesis bolumundeki bilgiyi doldurur /Zorunlu
    And Treatment bolumundeki bilgiyi doldurur /Zorunlu
    And Diagnosis  bolumundeki bilgiyi doldurur /Zorunlu
    And Prescription bolumundeki bilgiyi doldurur /Istege bagli
    And Description bolumundeki bilgiyi doldurur /Istege bagli
    And Save secenegine tiklar
    And Basarili bir sekilde kaydedildigini kontrol eder








package utilities;


public class WriteToTxt {
    /*

//    public static void saveRegistrantData(Registrant registrant, String fileName){
//
//        try {
//
//            FileWriter fileWriter = new FileWriter(fileName, true);
//            //src/resource/feature/testdata/PatientData
//
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveRegistrantData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("registrantFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveRegistrantApiData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("registrantApiFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void savePatientdata(pojos.Patients_US015 patients_us015) {
//        try {
//            //src/resources/testdata/Registrantdata.txt
//            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("PatientData_Path"), true);
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//            writer.append(patients_us015 + "\n");
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

     */
}
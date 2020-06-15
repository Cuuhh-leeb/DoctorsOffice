public class DoctorsOffices {
    public static void main(String[] args) {
        String patientName = "Stacey Mason";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numberVisits = 5;
        float copayAmount = 13869.12f;
        String nextAppointmentDate = "08/13/2020";
        String contPhoneNum = "293-989-2232";

        System.out.println("Patient Details");
        System.out.println("Name:" + patientName);
        System.out.println("patient has insurence:" + hasInsurance);
        System.out.println("Body Tempreture:" + temp);
        System.out.println("Number of visits:" + numberVisits);
        System.out.println("Date of next visit:" + nextAppointmentDate);
        System.out.println("Cost of next visit: $" + copayAmount);
        System.out.println("Contact Number for patient: " + contPhoneNum);

    }
}

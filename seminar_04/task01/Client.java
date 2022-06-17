package seminar_04.task01;

public class Client {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String passportNumber;
    private String phoneNum;

    Client(String firstName, String lastName, String birthdate, String passportNumber, String phoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.passportNumber = passportNumber;
        this.phoneNum = phoneNum;
    }

    Client(String firstName, String lastName, String birthdate, String passportNumber) {
        this(firstName, lastName, birthdate, passportNumber, null);
    }

    public void getInfoBy(Worker w) {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthdate);
        if (w.getStatus() != Worker.Status.Manager) {
            System.out.println(passportNumber);
        } else {
            System.out.println("...");
        }
    }
    public void setInfoFLName (String fn, String ln,Worker w){
        if(w.getStatus()!=Worker.Status.Manager){
        this.firstName = fn;
        this.lastName = ln;
        }
    }
    public void setNumPhone(String phoneNum) {
        if (this.phoneNum == null) {
            this.phoneNum = phoneNum;
        }
    }
}

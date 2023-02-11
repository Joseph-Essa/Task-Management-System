package FCIHCaseStudy;


public class Admin extends Staff {

    public Admin() {

    }

    public Admin(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    @Override
    public String toString() {
        return "I'm Manager : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public boolean login(String userName, String Pass) {

        if (userName.equals("test") && Pass.equals("123")) {
            return true;
        }
        return false;

    }

}

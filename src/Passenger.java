public class Passenger {
    private String passport , fullname , email , telnumber;
    private int age;

    public Passenger(String passport, String fullname, String email, String telnumber, int age) {
        this.passport = passport;
        this.fullname = fullname;
        this.email = email;
        this.telnumber = telnumber;
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public int getAge() {
        return age;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

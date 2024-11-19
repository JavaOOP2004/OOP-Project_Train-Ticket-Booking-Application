public class Passenger {
    private String passport , fullname , email , telnumber, role;
    private int age;

    public Passenger(String passport, String fullname, int age, String role, String email, String telnumber) {
        this.passport = passport;
        this.fullname = fullname;
        this.age = age;
        this.role = role;
        this.email = email;
        this.telnumber = telnumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    @Override
    public String toString(){
        return "- CMND/CCCD/The SV: " + passport + "\n"
                + "- Ten: " + fullname + "\n"
                + "- Tuoi: " + age + "\n"
                + "- Vai tro: " + role + "\n"
                + "- Email: " + email + "\n"
                + "- So dien thoai: " + telnumber;
    }
}

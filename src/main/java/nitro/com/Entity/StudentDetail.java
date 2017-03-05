package nitro.com.Entity;


import javax.persistence.*;

@Entity
@Table(name = "passports")
public class StudentDetail {

    @Id
    @Column(name = "passport_id")
    private long id;


    private String passport;



    public StudentDetail() {
    }

    public StudentDetail(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    public String toString(){
        return "passport "+getPassport();
    }
}

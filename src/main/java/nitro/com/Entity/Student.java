package nitro.com.Entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String firstName;
    String secondName;

    protected Student() {
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="passport_id")
    private Set<StudentDetail> studentDetails;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String toString() {
        return "[" + getFirstName() + " , " + getSecondName() + studentDetails.toString();
    }

    public void addDetail(StudentDetail studentDetail) {
        if (studentDetails == null) studentDetails = new HashSet<StudentDetail>();
        studentDetails.add(studentDetail);
    }

    public Set<StudentDetail> getStudentDetails() {
        return studentDetails;
    }
}

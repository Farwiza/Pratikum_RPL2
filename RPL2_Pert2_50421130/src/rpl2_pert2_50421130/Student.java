package rpl2_pert2_50421130;
import java.time.*;

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    private String name;
    private String npm;
    private String classnumber;
    private int birthYear;
    private String alamat;
    
        public Student (){
        this.name = "";
        this.npm = "";
        this.classnumber = "";
        this.birthYear = 0;
        this.alamat = "";
    }
    
    public int calculateAge(){
        int currentYear = Year.now().getValue();
        int x = currentYear - birthYear;
        return x;
    }
}

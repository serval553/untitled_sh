import com.company.Weekday;

public class Course {
    private String courseName;
    private String professor;
    private String time;
    private String roomNumber;
    private String startDate;
    private Weekday[] occurrences;

    public Course() {
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Weekday[] getOccurrences() {
        return this.occurrences;
    }

    public void setOccurrences(Weekday[] occurrences) {
        this.occurrences = occurrences;
    }
}

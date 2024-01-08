import static java.util.Objects.requireNonNull;

public class Adventurer {
    private  int number;
    private Student student;
    private  Journey journey;
    private TourGroup tourGroup;

    public Adventurer(int number, Student student, Journey journey) {
        setNumber(number);
        setStudent(student);
        setJourney(journey);
    }

    public void carrOn(Mission mission) {
        student.carryOn(mission);
    }

    public TourGroup getTourGroup() {
        return tourGroup;
    }

    public int getNumber() {
        return number;
    }

    public Student getStudent() {
        return student;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setTourGroup(TourGroup tourGroup) {
        this.tourGroup = requireNonNull(tourGroup);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }


}

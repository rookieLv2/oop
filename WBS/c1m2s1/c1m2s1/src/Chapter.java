import java.util.List;

import static java.util.Objects.requireNonNull;

public class Chapter {
    private int number;
    private String name;
    private List<Mission> mission;

    public Chapter(int number, String name, List<Mission> mission){
        setMission(mission);
        setNumber(number);
        setName(name);
    }

    public void setMission(List<Mission> mission) {
        this.mission = requireNonNull(mission);
    }

    public List<Mission> getMission() {
        return mission;
    }

    public void setNumber(int number) {
        if(number < 0){
            throw new IllegalArgumentException("The number should > 0");
        }
        this.number = number;
    }

    public void setName(String name) {
        if(name.length() >=1 && name.length() <=30){
            throw new IllegalArgumentException("The name should be 1~30");
        }
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Mission getFirstMission() {
        return mission.get(0);
    }
}

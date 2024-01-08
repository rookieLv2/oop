import java.util.List;

import static java.util.Objects.requireNonNull;

public class TourGroup {
    private int number;
    private List<Adventurer> adventurers;

    public TourGroup(int number, List<Adventurer> adventurers) {
        setNumber(number);
        setAdventurers(adventurers);
    }

    public void add(Adventurer adventurer){
        adventurers.add(adventurer);
        adventurer.setTourGroup(this);
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(List<Adventurer> adventurers) {
        this.adventurers = requireNonNull(adventurers);

        for(Adventurer adventurer: adventurers){
            adventurer.setTourGroup(this);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = ValidationUtils.shouldBePositive(number);
    }
}

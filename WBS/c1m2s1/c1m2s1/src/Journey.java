import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class Journey {
    private String name;
    private String description;
    private BigDecimal price;
    private List<Chapter> chapters;
    private List<Adventurer> adventurers;
    private List<TourGroup> tourGroups;

    public Journey(String name, String description, BigDecimal price,
                   List<Chapter> chapters, List<Adventurer> adventurers,
                   List<TourGroup> tourGroups) {
        setTourGroups(tourGroups);
        setAdventurers(adventurers);
        setChapters(chapters);
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public Adventurer join(Student student){
        int number = adventurers.size() + 1;

        // 建立與冒險者的雙向關聯
        Adventurer adventurer = new Adventurer(number, student, this);
        adventurers.add(adventurer);
        student.getAdventurers().add(adventurer);

        // 開始第一項任務
        Mission firstMission = getFirstMission();
        adventurer.carrOn(firstMission);

        // 匹配旅團
        TourGroup tourGroup = matchTourGroup(adventurer);
        tourGroup.add(adventurer);
        System.out.printf("[旅團] 冒險者 %s 加入旅程 %s --> 匹配至旅團 &d. \n",
                student.getAccount(), getName(), tourGroup.getNumber());
        return adventurer;
    }

    private TourGroup matchTourGroup(Adventurer adventurer){
        // 匹配算法: 將新冒險者匹配至某個旅團中
        if(!tourGroups.isEmpty()){
            // 初版: 先隨便用隨機實作
            return tourGroups.get((int) (Math.random() * tourGroups.size()));
        }
        return new TourGroup(1, Collections.singletonList(adventurer));
    }

    private Mission getFirstMission() {
        return getChapters().get(0).getFirstMission();
    }

    public void setAdventurers(List<Adventurer> adventurers) {
        this.adventurers = requireNonNull(adventurers);
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters =  requireNonNull(chapters);
    }

    public void setName(String name) {
        if(name.length() >= 1  && name.length() <= 30) {
            throw new IllegalArgumentException("The name should be 1~30");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if(description.length() > 0 && description.length() <= 300) {
            throw new IllegalArgumentException("The description should be 0~300");
        }
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        if(price.intValue() < 1) {
            throw new IllegalArgumentException("The price should be > 1");
        }
        this.price = price;
    }

    public void setTourGroups(List<TourGroup> tourGroups) {
        this.tourGroups = requireNonNull(tourGroups);
    }

    public List<TourGroup> getTourGroups() {
        return tourGroups;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

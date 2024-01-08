import java.util.List;

import static java.util.Objects.requireNonNull;

public class Student {
    private final static LevelSheet LEVEL_SHEET = new LevelSheet();
    private String account;
    private String password;
    private int level = 1;
    private int exp = 0;
    private List<MissionCarryOn> missionCarryOns;
    private List<Adventurer> adventurers;

    public Student(String account, String password, List<MissionCarryOn> missionCarryOns, List<Adventurer> adventurers) {
        this.account = account;
        this.password = password;
        setAdventurers(adventurers);
        setMissionCarrOns(missionCarryOns);
    }

    public void setAdventurers(List<Adventurer> adventurers) {
        this.adventurers = requireNonNull(adventurers);
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    private void setMissionCarrOns(List<MissionCarryOn> missionCarryOns) {
        this.missionCarryOns = requireNonNull(missionCarryOns);
    }


    public MissionCarryOn carryOn(Mission mission){
        System.out.printf("[任務] 學員 開始新任務: '%s'\n", account, mission.getName());
        MissionCarryOn missionCarryOn = new MissionCarryOn(this, mission);
        missionCarryOns.add(missionCarryOn); //單向關聯
        return  missionCarryOn;
    }

    public List<MissionCarryOn> getMissionCarryOns() {
        return missionCarryOns;
    }

    public void gainExp(int exp){
        this.exp += exp;
        int newLevel = LEVEL_SHEET.query(this.exp);
        int levelUp = newLevel -level;
        System.out.printf("[獎勵] 學員%s 獲得經驗值 %d。 \n", account, exp);
        for (int i = 0; i < levelUp; i++) {
            levelUp();
        }
    }

    public void levelUp(){
        this.level ++;
        System.out.printf("[升等] 學員%s 等級提升至 %d。 \n", account, exp);
    }

    public String getAccount() {
        return account;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }
}

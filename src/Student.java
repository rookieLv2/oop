public class Student {
    private final static LevelSheet LEVEL_SHEET = new LevelSheet();
    private String account;
    private String password;
    private int level = 1;
    private int exp = 0;

    public Student(String account, String password) {
        this.account = account;
        this.password = password;
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

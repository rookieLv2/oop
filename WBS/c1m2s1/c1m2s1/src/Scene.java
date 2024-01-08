public abstract class Scene {
    private int number;
    private String name;
    protected int expAward;

    public Scene(String number, int name, int expAward) {
        setNumber(Integer.parseInt(number));
        setName(String.valueOf(name));
        setExpAward(expAward);
    }

    public abstract int calculateExpAward(); // 抽象方法，由子類別繼承來實作這個方法

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

    public void setExpAward(int expAward) {
        this.expAward = expAward;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpAward() {
        return expAward;
    }
}

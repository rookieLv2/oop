public class Challenge {
    private int number;
    private String name;
    private Journey journey;

    public  Challenge(int number, String name){
        setNumber(number);
        setName(name);
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
}

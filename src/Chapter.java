public class Chapter {
    private int number;
    private String name;

    public  Chapter(int number, String name){
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
        if(name.length() >=1 && name){
            throw new IllegalArgumentException("The number should > 0");
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

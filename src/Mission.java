public class Mission {
    private int number;
    private String name;
    private Challenge challenge;

    public Mission(int number, String name, Challenge challenge) {
        setNumber(number);
        setName(name);
        setChallenge(challenge);
    }

    public int calculateExpAward(){
        return 0; // TODO: 底下所有 Scene 的精現值加總
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

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Challenge getChallenge() {
        return challenge;
    }
}

import java.util.List;

public class Mission {
    private int number;
    private String name;
    private Challenge challenge;
    private List<Scene> scene;

    public Mission(int number, String name, Challenge challenge, List<Scene> scene) {
        setScene(scene);
        setNumber(number);
        setName(name);
        setChallenge(challenge);
    }

    public int calculateExpAward(){
        return 0; // TODO: 底下所有 Scene 的精現值加總
    }

    public void setScene(List<Scene> scene) {
        this.scene = scene;
    }

    public void setNumber(int number) {
        this.number = ValidationUtils.shouldBePositive(number);
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

    public List<Scene> getScene() {return scene;}

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

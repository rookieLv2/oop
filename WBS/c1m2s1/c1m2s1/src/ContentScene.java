public class ContentScene extends Scene {
    public  ContentScene(int number, String name, int expAward){
        super(number, name, expAward);
    }

    @Override
    public int calculateExpAward() {
        // ContentScene 特殊的經驗值算法
        return (int)(expAward * 1.5);
    }
}



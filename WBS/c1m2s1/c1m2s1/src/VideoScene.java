public class VideoScene extends Scene {
    public VideoScene(String name, int number, int expAward) {
        super(name, number, expAward);
    }

    @Override
    public int calculateExpAward() {
        // VideoScene 特殊的經驗值算法
        return (int)(expAward * 1.5);
    }
}

package behavioral_pattern.strategy_pattern.the_problem;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage("jpeg", "B&W");
        imageStorage.store("sample");
    }
}

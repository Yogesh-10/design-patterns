package behavioral_pattern.strategy_pattern.the_solution;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("sample", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("sample", new PngCompressor(), new BlackAndWhiteFilter());
    }
}

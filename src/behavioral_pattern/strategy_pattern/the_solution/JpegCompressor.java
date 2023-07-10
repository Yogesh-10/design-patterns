package behavioral_pattern.strategy_pattern.the_solution;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String file) {
        System.out.println("Compressing the image into jpg");
    }
}

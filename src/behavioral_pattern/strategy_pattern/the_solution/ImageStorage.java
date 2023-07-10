package behavioral_pattern.strategy_pattern.the_solution;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        // first compress the image
        compressor.compress(fileName);

        // then filter the image
        filter.apply(fileName);

        // store the image
        System.out.println("Storing image....");
    }
}

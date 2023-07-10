package behavioral_pattern.strategy_pattern.the_problem;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if (compressor.equals("jpeg"))
            System.out.println("Compressing using JPEG");
        else if (compressor.equals("png"))
            System.out.println("Compressing using PNG");

        if (filter.equals("B&W"))
            System.out.println("Applying B&W Filter");
        else if (filter.equals("High-Contrast"))
            System.out.println("Applying High-Contrast filter");
    }
}

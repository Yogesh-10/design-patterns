package behavioral_pattern.strategy_pattern.the_solution;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String file) {
        System.out.println("applying B&W filter");
    }
}

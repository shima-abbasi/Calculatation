import java.math.BigDecimal;

/**
 * Created by Shima Abbasi on 7/3/2016.
 */
public class PlayGround {
    public static void main(String[] args) {
        BigDecimal sample = new BigDecimal(1000);
        System.out.println("1: " + sample);
        changeSampleValue(sample);
        System.out.println("3: " + sample);
    }

    private static void changeSampleValue(BigDecimal sample) {
        sample = BigDecimal.TEN;
        System.out.println("2: " + sample);
    }
}

import java.awt.Image;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.BufferedImage;

public class MultiReslnImgex {
    public static void main(String[] args) {
        BufferedImage img1 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage img2 = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        BaseMultiResolutionImage bmi = new BaseMultiResolutionImage(img1, img2);
        Image bestVariant = bmi.getResolutionVariant(150, 150);
        System.out.println("Best Variant:" + bestVariant.getWidth(null));
    }
}
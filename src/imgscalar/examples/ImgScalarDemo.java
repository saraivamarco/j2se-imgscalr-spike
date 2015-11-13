package imgscalar.examples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

/**
 * Sample that creates a thumbnail and converts a jpg image to the png format.
 * https://github.com/thebuzzmedia/imgscalr
 * 
 * @author SaraivaM
 *
 */
public class ImgScalarDemo {

    public static void main(String[] args) throws IOException {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("strawberry.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedImage thumbnail = Scalr.resize(image, 150);

        //Creation of Thumbnail
        ImageIO.write(thumbnail, "PNG", new File("strawberry-thumbnail.png"));

        //Conversion to png - Work Copy
        ImageIO.write(image, "PNG", new File("strawberry-workcopy.png"));

    }

}

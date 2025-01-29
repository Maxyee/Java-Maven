# FBI WSQ fingerprint image format to BMP format Converter

1. First we have to donwload the JNBIS library from github. However, I already downloaded the file into the `downloaded_library` folder.

Link : https://github.com/mhshams/jnbis/tree/main

2. When download finished we have to add that jar file to our project.

3. we can do this in IntelliJ like this snapshot1 :

![alt text](https://github.com/Maxyee/Java-Maven/blob/master/WSQ-to-BMP-fingerprint-converter/snapshot/snapshot1.png)

4. Finally run the code from the WSQ_BMP class file. It will create the BMP file.

```java
package nbis_java;

import org.jnbis.api.Jnbis;
import org.jnbis.api.model.Bitmap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class WSQ_BMP {
    public static void main(String[] args) {
        String wsqFilePath = "input.wsq"; // Path to your WSQ file
        String bmpFilePath = "output.bmp"; // Path to save the BMP file

        try {
            // Decode the WSQ file and get a Bitmap object
            Bitmap bitmap = Jnbis.wsq().decode(new File(wsqFilePath)).asBitmap();

            // Extract image dimensions and pixel data
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            byte[] pixelData = bitmap.getPixels();

            // Create a BufferedImage from the pixel data
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
            bufferedImage.getRaster().setDataElements(0, 0, width, height, pixelData);

            // Save the BufferedImage as a BMP file
            ImageIO.write(bufferedImage, "bmp", new File(bmpFilePath));

            System.out.println("Conversion complete: " + bmpFilePath);
        } catch (IOException e) {
            System.err.println("Error during conversion: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/*读取二维码*/
public class ReadQRCode {

    public static void main(String[] args) {

        MultiFormatReader formatReader = new MultiFormatReader();

        File file = new File("D:/qRCode/img.png");  //存储位置

        try {
            BufferedImage image = ImageIO.read(file);   //将文件识别成一个图片


            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));


            HashMap hints = new HashMap();      //定义二维码的参数
            hints.put(EncodeHintType.CHARACTER_SET,"utf-8");    //定义内容字符集的编码

            Result result = formatReader.decode(binaryBitmap, hints);

            System.out.println("解析结果" + result.toString());
            System.out.println("二维码格式类型" + result.getBarcodeFormat());
            System.out.println("二维码文本内容" + result.getText());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }
}

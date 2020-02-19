package com.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

/*生成二维码*/
public class CreateQRCode {
    /*
       线性堆叠式二维码、矩阵式二维码、邮政码。

       纠错能力

       纠错等级越高 可存储得数据越少
       纠错等级越高 的二维码识读效率越高

　　　　L级：约可纠错7%的数据码字

　　　　M级：约可纠错15%的数据码字

　　　　Q级：约可纠错25%的数据码字

　　　　H级：约可纠错30%的数据码字
     */
    public static void main(String[] args) {

        int width = 300;        //二维码宽度
        int height = 300;         //二维码高度
        String format = "png";      //二维码图片格式
        String content = "https://github.com/XYYYF";    //二维码内容


        HashMap hints = new HashMap();      //定义二维码的参数
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");    //定义内容字符集的编码
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);     //定义纠错等级
        hints.put(EncodeHintType.MARGIN,2); //边框空白


        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE,width,height,hints);

            Path file = new File("D:/qRCode/img.png").toPath(); //存储位置

            MatrixToImageWriter.writeToPath(bitMatrix,format, file);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

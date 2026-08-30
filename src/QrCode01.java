package MainProject01;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class QrCode01 {
    public static void generateQRCode(String data, String filePath, int width, int height) 
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height, hints);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }

    public static void generateBookingQRCode(String name, String cnic, String carModel, String numberPlate, String phoneNumber) {
        String data = "Name: " + name + "\n" +
                      "CNIC: " + cnic + "\n" +
                      "Car Model: " + carModel + "\n" +
                      "Number Plate: " + numberPlate + "\n" +
                      "Phone Number: " + phoneNumber;
        String filePath = "C:\\Users\\prime\\Desktop\\qrcode.png";
        int width = 300;
        int height = 300;
        
        try {
            generateQRCode(data, filePath, width, height);
        } catch (WriterException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error generating QR Code: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

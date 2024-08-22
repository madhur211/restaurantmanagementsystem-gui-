/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author madhurshinde
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            String fileName = id + ".pdf"; // Assuming the file extension is ".pdf"
            String desktopPath = System.getProperty("user.home") + "/Desktop/Madhur/";
            String filePath = desktopPath + fileName;

            File file = new File(filePath);
            if (file.exists()) {
                Process process = Runtime.getRuntime().exec("open " + filePath);
            } else {
                //JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        openById("example");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logging;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LENOVO
 */
public class MyLogger {
    static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
    
    public static void main(String[] args) {
        try {
            // atur LoLevel ke "severe", hanya pesan severse yang akan ditulis 
            LOGGER.setLevel(Level.SEVERE);
            LOGGER.severe("Severe Log 1");
            LOGGER.warning("Warning Log");
            LOGGER.info("Info Log");
            LOGGER.finest("Finest Log");
            
            //atur LogLevel ke "info"
            //hanya log severe, warning dan info akan ditulis
            LOGGER.setLevel(Level.INFO);
            LOGGER.severe("Severe Log 2");
            LOGGER.warning("Warning Log");
            LOGGER.info("Info Log");
            LOGGER.finest("Finest Log");
            int a = 1/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //membuat pesan log (level Severe)
            LOGGER.severe("Severe Log 3: ".concat(e.getMessage()));
        }
    }
    
}

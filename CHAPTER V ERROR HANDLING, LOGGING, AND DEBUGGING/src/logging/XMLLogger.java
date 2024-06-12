package logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class XMLLogger {
    static final Logger LOGGER = Logger.getLogger(XMLLogger.class.getName());
    
    public static void main(String[] args) {
        Handler consoleHandler;
        Handler fileHandler;
        try{
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("log-activity.log");
            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);
            
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
            
            LOGGER.config("Pengaturan selesai");
            LOGGER.removeHandler(consoleHandler);
            LOGGER.log(Level.FINE, "Fine Log");
            LOGGER.finer("Finer Log");
           
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IOException", e);
        }
    }
}

/**
 * Penjelasan:
✓ Baris kode ke-15 merupakan pembuatan objek LOGGER yang diberi nama 
sesuai nama kelas.
✓ Baris 18-19 merupakan deklarasi variable dengan tipe Handler, dimana kedua 
variable ini nantinya akan diinisialisasi dengan tipe handler-nya masing-masing.
✓ Baris kode ke 20-36 merupakan percobaan untuk monitoring kode program 
yang akan dieksekusi dengan menerapkan kata kunci try dan catch. Baris 
kode 21-33 merupakan kode program yang akan dimonitor ketika dieksekusi.
Sedangkan baris 35 merupakan merupakan perintah untuk melakukan logging 
dengan level sereve jika pada blok try ditemukan kesalahan.
✓ Baris kode ke-21 merupakan instansiasi objek consoleHandler.
✓ Baris kode ke-22 merupakan instansiasi objek fileHandler, dengan 
konfigurasi penamaan file yang dihasilkan.
✓ Baris ke-23 menerapkan log handler ke objek LOGGER agar dapat menerima 
pesan dan menampilkannya ke layer (konsol).
✓ Baris ke-24 menerapkan log handler ke objek LOGGER agar dapat menerima 
pesan dan menuliskannya ke dalam file.
✓ Baris ke-26 merupakan pengaturan level logging pada consoleHandler. 
Level yang diterapkan adalah ALL, yang menandakan bahwa semua jenis pesan 
log akan ditulis pada layer konsol.
✓ Baris ke-27 merupakan pengaturan level logging pada fileHandler. Level 
yang diterapkan adalah ALL, yang menandakan bahwa semua jenis pesan log 
akan ditulis pada file yang telah ditentukan.
✓ Baris ke-28 merupakan pengaturan level logging ke ALL, agar semua pesan 
dapat diterima dan dicatat.
✓ Baris ke-30 merupakan pencatatan pesan log dengan level config.
✓ Baris ke-31 merupakan perintah untuk menghapus handler konsol, agar log 
apapun yang dituliskan berada di bawah kode ini tidak akan tercetak lagi pada 
konso, namun handler file tetap mencatat pesan ke dalam file. 
✓ Exception pada clause blok catch berupa IOException merupakan tipe 
pengecualian yang digunakan untuk mendapatkan/menangkap informasi 
kesalahan input/output (I/O) yang mungkin terjadi.

 */

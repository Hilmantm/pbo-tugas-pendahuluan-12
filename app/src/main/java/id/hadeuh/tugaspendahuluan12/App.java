/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package id.hadeuh.tugaspendahuluan12;

import id.hadeuh.tugaspendahuluan12.config.SQLConfig;
import id.hadeuh.tugaspendahuluan12.repository.PegawaiRepository;
import id.hadeuh.tugaspendahuluan12.repository.Repository;
import id.hadeuh.tugaspendahuluan12.view.MainForm;
import java.sql.Connection;
import javax.swing.UIManager;

public class App {
    
    public static final String POSISI_STAFF = "staff";
    public static final String POSISI_MANAGER = "manager";
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Connection connection = SQLConfig.getConnection();
        Repository pegawaiRepository = new PegawaiRepository(connection);
        
        MainForm main = new MainForm(connection, pegawaiRepository);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
    
}

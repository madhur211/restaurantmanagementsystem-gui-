package dataacess;


import javax.swing.JOptionPane;
import java.sql.*;

/**
 * Class to perform database operations like insert, delete, and select.
 * This class interacts with the database and handles exceptions.
 * 
 * @author madhurshinde
 */
public class DbOperations {
    
    /**
     * Method to execute an insert or delete operation on the database.
     * 
     * @param Query the SQL query to execute
     * @param msg the message to display upon successful execution
     */
    public static void setDataOrDelete(String Query, String msg) {
        try {
            Connection con = ConnectionProvider.getCON();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to execute a select query and retrieve data from the database.
     * 
     * @param query the SQL query to execute
     * @return the result set containing the retrieved data
     */
    public static ResultSet getData(String query) {
        try {
            Connection con = ConnectionProvider.getCON();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

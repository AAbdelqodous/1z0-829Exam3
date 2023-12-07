package q35;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws SQLException {
        var url = "jdbc:oracle:thin:@//hyper-v2k19.manpower.gov.kw:1521/T27JUN22";
        var prop = new Properties();
        prop.put("user", "PAM_DB");
        prop.put("password", "PAM_DB2022");
        var query = "Select count(*) FROM DOC_SERVICE_PORTALS_MAP";
        try (var con = DriverManager.getConnection(url, prop);
             var stmt = con.createStatement();
             var rs = stmt.executeQuery(query);)
        {
            while(rs.next())
                System.out.println(rs.getInt(1));
        }
    }
}

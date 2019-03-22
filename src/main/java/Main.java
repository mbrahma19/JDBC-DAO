import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException{
        Connection conn = DBUtil.getConnection(DBType.MYSQLDB);
        Integer id = 8;
        String name = "mike_bot";
        String type = "Demolition Expert";
        Integer version = 3;
        String catchphrase = "\"Mike,Mike,Mike,Mike,Mike,Mike,Mike\"";

        String sql = String.format("INSERT INTO `zipcode_bots`.`bots` (`id`, `bot_name`, `bot_type`, `bot_version`, `bot_catchphrase`) " +
                "VALUES (%d, '%s', '%s', %d, '%s')",id, name, type, version,catchphrase);

        PreparedStatement preparedStatement = conn.prepareStatement(sql);




    }
}

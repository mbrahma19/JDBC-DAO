package jdbc.daos;

import jdbc.models.Bot;
import jdbc.models.BotBuilder;
import jdbc.utils.DBType;
import jdbc.utils.DBUtil;

import java.sql.*;
import java.util.List;

public class BotDAO extends DAO<Bot> {

    private static final String INSERT = "Insert into zipcode_bots.bots" +
            "(bot_name, bot_type, bot_version, bot_catchphrase)" +
            "values(?,?,?,?)";
    private static final String GET_ONE = "SELECT * FROM zipcode_bots.bots WHERE id = ?";
    private static final String UPDATE = "Update zipcode_bots.bots set bot_name = ?, bot_type = ?, bot_version = ?, bot_catchphrase = ? " +
            " where id = ?";
    private static final String DELETE = "DELETE FROM zipcode_bots.bots WHERE id = ?";

    public BotDAO(Connection conn) {
        super(conn);
    }

    public Bot findByID(int id) {
        Bot bot = null;
        try(PreparedStatement pstmt = DBUtil.getConnection(DBType.MYSQLDB).prepareStatement(GET_ONE)){
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                bot = new BotBuilder().createBot();
                bot.setBotID(rs.getInt("id"));
                bot.setBotName(rs.getString("bot_name"));
                bot.setBotModel(rs.getString("bot_type"));
                bot.setBotVersion(rs.getInt("bot_version"));
                bot.setBotCatchphrase(rs.getString("bot_catchphrase"));
            }
        }catch (SQLException e){
            DBUtil.showErrorMessage(e);
        }
        return bot;
    }

    public List<Bot> findAll() {
        return null;
    }

    public Bot update(Bot dto) {
        try(PreparedStatement pstmt = this.connection.prepareStatement(UPDATE)){
            pstmt.setString(1,dto.getBotName());
            pstmt.setString(2,dto.getBotModel());
            pstmt.setInt(3,dto.getBotVersion());
            pstmt.setString(4,dto.getBotCatchphrase());
            pstmt.setInt(5,dto.getId());
            pstmt.executeUpdate();
        }catch(SQLException e){
            DBUtil.showErrorMessage(e);
        }
        return dto;
    }

    public Bot create(Bot dto) {
        try(PreparedStatement pstmt = this.connection.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS)){
            pstmt.setString(1,dto.getBotName());
            pstmt.setString(2,dto.getBotModel());
            pstmt.setInt(3,dto.getBotVersion());
            pstmt.setString(4,dto.getBotCatchphrase());
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()){
                dto.setBotID(rs.getInt(1));
            }
        }catch(SQLException e){
            DBUtil.showErrorMessage(e);
        }
        return dto;
    }

    public void delete(int id) {
        try(PreparedStatement pstmt = this.connection.prepareStatement(DELETE)){
            pstmt.setInt(1,id);
            pstmt.execute();
        }catch(SQLException e){
            DBUtil.showErrorMessage(e);
        }
    }
}

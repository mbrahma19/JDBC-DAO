package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.daos.BotDAO;
import jdbc.models.Bot;
import jdbc.models.BotBuilder;
import jdbc.utils.DBType;
import jdbc.utils.DBUtil;



public class Main {

    public static void main(String[] args) throws SQLException{
        Connection conn = null;
        try{
            conn = DBUtil.getConnection(DBType.MYSQLDB);
            BotDAO botDAO = new BotDAO(conn);
            Bot bot = botDAO.findByID(14);
            bot.setBotName("sean_bot_RUNNER");
            botDAO.update(bot);

            Bot bot2 = botDAO.findByID(14);
            System.out.println(bot2);
//            BotBuilder bb = new BotBuilder();
////            Bot bot = new Bot(null, "sean_bot","Teddy Bear",2,"Something");
//            Bot bot = bb.
//                    setBotName("Sean RowRowRowYourBoat").
//                    setBotModel("Teddy Bear").
//                    setBotVersion(2).
//                    setBotCatchphrase("Someting").
//                    createBot();
//            System.out.println(bot);
//            Bot newBot = botDAO.create(bot);
//            System.out.println(newBot);
//            botDAO.delete(newBot.getId());
//
//
//            Bot bot3 = botDAO.create(bot);
//            System.out.println(bot3);
        }catch (SQLException e){
            DBUtil.showErrorMessage(e);
        }finally {
            conn.close();
        }

    }
}

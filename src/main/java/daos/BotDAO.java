package daos;

import models.Bot;

import java.sql.Connection;
import java.util.List;

public class BotDAO extends DAO<Bot> {

    public BotDAO(Connection conn) {
        super(conn);
    }

    public Bot findByID(int id) {
        return null;
    }

    public List<Bot> findAll() {
        return null;
    }

    public Bot update(Bot dto) {
        return null;
    }

    public Bot create(Bot dto) {
        return null;
    }

    public void delete(int id) {

    }
}

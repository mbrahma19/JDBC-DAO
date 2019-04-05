package jdbc.models;

import jdbc.daos.DTO;

public class Bot implements DTO {

    private Integer botID;
    private String botName;
    private String botModel;
    private Integer botVersion;
    private String botCatchphrase;

    public Bot(){}

    public Bot(Integer botID, String botName, String botModel, Integer botVersion, String botCatchphrase) {
        this.botID = botID;
        this.botName = botName;
        this.botModel = botModel;
        this.botVersion = botVersion;
        this.botCatchphrase = botCatchphrase;
    }

    public void setBotID(Integer botID) {
        this.botID = botID;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotModel() {
        return botModel;
    }

    public void setBotModel(String botModel) {
        this.botModel = botModel;
    }

    public Integer getBotVersion() {
        return botVersion;
    }

    public void setBotVersion(Integer botVersion) {
        this.botVersion = botVersion;
    }

    public String getBotCatchphrase() {
        return botCatchphrase;
    }

    public void setBotCatchphrase(String botCatchphrase) {
        this.botCatchphrase = botCatchphrase;
    }

    @Override
    public int getId() {
        return botID;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "botID=" + botID +
                ", botName='" + botName + '\'' +
                ", botModel='" + botModel + '\'' +
                ", botVersion=" + botVersion +
                ", botCatchphrase='" + botCatchphrase + '\'' +
                '}';
    }
}

package models;

import daos.DTO;

public class Bot implements DTO {

    private int botID;
    private String botName;
    private String botModel;
    private Integer botVersion;
    private String botCatchphrase;

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

    public int getId() {
        return botID;
    }
}

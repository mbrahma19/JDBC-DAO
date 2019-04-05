package jdbc.models;

public class BotBuilder {
    private Integer botID;
    private String botName;
    private String botModel;
    private Integer botVersion;
    private String botCatchphrase;

    public BotBuilder(){
        this.botID = null;
        this.botName = null;
        this.botModel= null;
        this.botVersion = null;
        this.botCatchphrase = null;
    }

    public BotBuilder setBotID(int botID) {
        this.botID = botID;
        return this;
    }

    public BotBuilder setBotName(String botName) {
        this.botName = botName;
        return this;
    }

    public BotBuilder setBotModel(String botModel) {
        this.botModel = botModel;
        return this;
    }

    public BotBuilder setBotVersion(Integer botVersion) {
        this.botVersion = botVersion;
        return this;
    }

    public BotBuilder setBotCatchphrase(String botCatchphrase) {
        this.botCatchphrase = botCatchphrase;
        return this;
    }

    public Bot createBot() {
        return new Bot(botID, botName, botModel, botVersion, botCatchphrase);
    }
}
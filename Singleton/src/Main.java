public class Main {
    public static void main(String[] args) {
        ProgrammLogger.getProgrammLogger().addInfo("First mes");
        ProgrammLogger.getProgrammLogger().addInfo("Second mes");
        ProgrammLogger.getProgrammLogger().addInfo("Third mes");

        ProgrammLogger.getProgrammLogger().showLogInfo();
    }
}
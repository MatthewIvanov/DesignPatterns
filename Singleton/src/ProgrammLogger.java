public class ProgrammLogger {
    private static ProgrammLogger programmLogger;
    private static String logInfo = "This is LogInfo!\n";

    public static  synchronized  ProgrammLogger getProgrammLogger() {
        if(programmLogger == null){
            programmLogger = new ProgrammLogger();
        }
        return  programmLogger;
    }
    public void addInfo(String message){
        logInfo += message+"\n";
    }
    public void showLogInfo(){
        System.out.println(logInfo);
    }
}

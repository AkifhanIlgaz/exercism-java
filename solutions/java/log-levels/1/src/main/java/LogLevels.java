public class LogLevels {

    public static String message(String logLine) {
        String[] fields = logLine.split(":");
        return fields[1].strip();
    }

    public static String logLevel(String logLine) {
        String[] fields = logLine.split(":");
        String level = fields[0].strip().trim().toLowerCase();
        return level.substring(1, level.length() - 1);
        
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return String.format("%s (%s)", message, logLevel);
    }
}

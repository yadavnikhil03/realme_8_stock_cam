package android.os;

public class OplusSystemProperties {

    public static String get(String key) {
        if ("ro.board.platform".equals(key)) return "MT6785";
        if ("ro.separate.soft".equals(key)) return "20681";
        if ("ro.product.name".equals(key) || "ro.product.device".equals(key)) return "RMX3085";
        return SystemProperties.get(key, "");
    }

    public static String get(String key, String def) {
        if ("ro.board.platform".equals(key)) return "MT6785";
        if ("ro.separate.soft".equals(key)) return "20681";
        if ("ro.product.name".equals(key) || "ro.product.device".equals(key)) return "RMX3085";
        return SystemProperties.get(key, def);
    }

    public static int getInt(String key, int def) {
        return SystemProperties.getInt(key, def);
    }

    public static boolean getBoolean(String key, boolean def) {
        return SystemProperties.getBoolean(key, def);
    }
}

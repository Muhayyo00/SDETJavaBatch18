package class27;

import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String key) throws IOException {
        FileInputStream fis = new FileInputStream(Constants.CONFIG_FILE_PATH);
        return read(key, Constants.CONFIG_FILE_PATH);
    }

    public static String read(String key, String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
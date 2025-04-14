package pages;

import java.io.*;
import java.util.Properties;

public class A_4_DataStorage {

    private static final String FILE_PATH = System.getProperty("user.dir") + "/data.properties";

    public static void save(String key, String value) {
        if (key == null || value == null) {
            System.err.println("Key or value is null");
            return;
        }

        Properties props = new Properties();
        File file = new File(FILE_PATH);

        if (file.exists()) {
            try (FileInputStream in = new FileInputStream(file)) {
                props.load(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        props.setProperty(key, value);

        try (FileOutputStream out = new FileOutputStream(file)) {
            props.store(out, "Test Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String load(String key) {
        Properties props = new Properties();
        File file = new File(FILE_PATH);

        if (!file.exists()) return null;

        try (FileInputStream in = new FileInputStream(file)) {
            props.load(in);
            return props.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package support;

import io.cucumber.java.it.Ma;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

public class TestDataManager {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
    private static final ThreadLocal<String> timestampThreadLocal = ThreadLocal.withInitial(() -> LocalDateTime.now().format(formatter));
    public static String getTimestamp(){
        return timestampThreadLocal.get();
    }
    public static Map<String, Object> getMapFromYamlFile(String fileName){
        String path = System.getProperty("user.dir") + "/src/test/resources/data/" + fileName + ".yml";
        try (InputStream stream = new FileInputStream(path)){
            Yaml yaml = new Yaml();
            return yaml.load(stream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + path, e);
        } catch (IOException e) {
            throw new Error("Error reading the file", e);
        }
    }
     public static Map<String, String> getEntityFromFile(String entityName, String fileName){
        Map<String, Object> yamlData = getMapFromYamlFile(fileName);
        Map<String, String> entity = (Map<String, String>) yamlData.get(entityName);
        return entity;
     }
     public static Map<String, String> getNewUserFromFile(){
        Map<String, String> newUser = getEntityFromFile("new_user_signup", "testData");
        String email = newUser.get("email");
        String[] splitEmail = email.split("@");
        email = splitEmail[0] + getTimestamp() + "@" + splitEmail[1];
        newUser.put("email", email);
        return newUser;
     }
    public static Map<String, String> getNewUserAccInfoFromFile(){
        Map<String, String> accInfo = getEntityFromFile("new_user_acc_info", "testData");
        return accInfo;
    }
    public static Map<String, String> getNewUserAddrInfoFromFile(){
        Map<String, String> addrInfo = getEntityFromFile("new_user_addr_info", "testData");
        return addrInfo;
    }
}

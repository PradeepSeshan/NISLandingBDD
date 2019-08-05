package Dataprovider;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
 private static Properties properties;
 private final String propertyFilePath="C:\\Users\\1187335\\Documents\\Eclipse-Rewrite\\NISLanding\\Configs\\Config.properties";
 
 
 public ConfigFileReader(){
 BufferedReader reader;
 try {
 reader = new BufferedReader(new FileReader("C:\\Users\\1187335\\Documents\\Eclipse-Rewrite\\NISLanding\\Configs\\Config.properties"));
 properties = new Properties();
 try {
 properties.load(reader);
 reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
 } 
 }
 
 public static String getDriverPath(){
 String DriverPath = properties.getProperty("DriverPath");
 if(DriverPath!= null) return DriverPath;
 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
 }
 
 public static long getImplicitlyWait() { 
 String implicitlyWait = properties.getProperty("implicitlyWait");
 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
 }
 
 public static String getApplicationUrl() {
 String url = properties.getProperty("url");
 if(url != null) return url;
 else throw new RuntimeException("url not specified in the Configuration.properties file.");
 }
 public static String browserName() {
 String browserName = properties.getProperty("browserName");
 if(browserName!= null) return browserName;
 else throw new RuntimeException("Browser Name is not specified in the Configuration.properties file.");
 }
 public static String username() {
	 String username = properties.getProperty("username");
	 if(username!= null) return username;
	 else throw new RuntimeException("Username is not specified in the Configuration.properties file.");
	 }
 public static String password() {
	 String password = properties.getProperty("password");
	 if(password!= null) return password;
	 else throw new RuntimeException("Password is not specified in the Configuration.properties file.");
	 }
 
}
package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandler {
    private final static String BASE_PATH = "files/";

    public StatusHandler writeFile(String fileName, String fileContent) {
        try(FileWriter fw = new FileWriter( BASE_PATH + fileName + ".txt")) {
            fw.write(fileContent);
            return StatusHandler.createSuccess("Success write");
        } catch (Exception e) {
            return StatusHandler.createError(e.getMessage());
        }
    }

    public StatusHandler readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(BASE_PATH + path)) {
            int sym;
            new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return StatusHandler.createSuccess(stringBuilder.toString());
        } catch (IOException ex) {
            return StatusHandler.createError(ex.getMessage());
        }
    }
}

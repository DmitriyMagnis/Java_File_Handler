package app;

public class AppController {
    private final AppView view;
    private final FileHandler model;

    public AppController(FileHandler model, AppView view) {
        this.view = view;
        this.model = model;
    }

    public void runApp() {
        String fileName = view.getFileName();
        String fileContent = view.getFileContent();
        view.closeScanner();

        StatusHandler result = model.writeFile(fileName, fileContent);
        StatusHandler content = model.readFile(fileName + ".txt");

        view.writeOutput("RESULT: " + result.getMessage());
        view.writeOutput("FILE CONTENT: " + content.getMessage());
    }
}

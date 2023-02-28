package vidmot.takeaway;

public enum View {
    LOGIN("innskra-view.fxml"),
    MAIN("pontun-view.fxml"),
    ABOUT("greidsla-view.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

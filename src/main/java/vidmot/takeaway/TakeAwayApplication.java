package vidmot.takeaway;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TakeAwayApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TakeAwayApplication.class.getResource("pontun-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("TakeAway");
        stage.setScene(scene);
        PontunController c1 = fxmlLoader.getController();
        stage.show();

        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("pontun.view-fxml"));
        Scene scene2 = fxmlLoader2.load();
        new Scene(fxmlLoader2.load(), 320, 240);
        stage.setTitle("Innskráning");
        stage.setScene(scene2);
        PontunController c2 = fxmlLoader2.getController();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

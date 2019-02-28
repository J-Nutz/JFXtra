import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xtraviews.xtraviewsinternal.ControlState;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Login login = new Login();

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(login));
        primaryStage.show();

        ObservableList loginControlStates = ControlState.getControlStates(login);

        System.out.println(loginControlStates);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

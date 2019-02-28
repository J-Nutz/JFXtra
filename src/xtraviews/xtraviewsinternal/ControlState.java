package xtraviews.xtraviewsinternal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.layout.Pane;

public class ControlState
{
    public static ControlState getControlState(Node control)
    {
        return new ControlState();
    }

    public static ObservableList getControlStates(Pane pane)
    {
        //Preferences prefs = Preferences.userNodeForPackage(MyClass.Class)
        //prefs.putBoolean("isWindowMaximized", true);
        //prefs.getBoolean("isWindowMaximized", false);

        ObservableList controls = pane.getChildren().filtered((Node node) -> node instanceof Control);

        return controls;
    }

    public static boolean loadControlStates(ObservableList controlStates, Pane pane)
    {
        ObservableList<? extends Control> controls = FXCollections.emptyObservableList();

        final short[] i = {0};

        pane.getChildren().filtered(node -> node instanceof Control).forEach(node ->
        {
            if(node instanceof Button)
            {
                ((Button) node).setText(String.valueOf(controlStates.get(i[0]++)));
            }
        });

        //controls.forEach();

        return true;
    }

    private ControlState()
    {

    }
}
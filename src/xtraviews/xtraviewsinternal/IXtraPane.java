package xtraviews.xtraviewsinternal;

import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.layout.Pane;

public interface IXtraPane
{

    default ObservableList getControls(Pane pane)
    {
        return pane.getChildren().filtered(node -> node instanceof Control);
    }
}
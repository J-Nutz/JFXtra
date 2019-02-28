package xtraviews;

import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.stage.WindowEvent;
import xtracontrollers.XtraController;
import xtramodels.XtraModel;
import xtraviews.xtraviewsinternal.IXtraPane;

import java.nio.file.Path;

public abstract class XtraVBox extends VBox implements IXtraPane
{
    protected XtraVBox()
    {
        super();

        //registerView(this);
        instantiateComponents();
        initializeComponents();
        addComponents();
    }

    protected XtraVBox(String cssID)
    {
        super();

        this.setId(cssID);

        //registerView(this);

        instantiateComponents();
        initializeComponents();
        //addPreCloseListener(); //Don't know if this is necessary/wanted/etc. What to do?
        //applyStyling(cssID); //Before or after adding components? Style sheets CAN be on a Parent to Parent basis
        addComponents();
    }

    protected XtraVBox(Path cssClassPath)
    {
        super();

        //this.setId(cssID);
        applyStyling(cssClassPath);
        //registerView(this);

        instantiateComponents();
        initializeComponents();
        //addPreCloseListener(); //Don't know if this is necessary/wanted/etc. What to do?
        //applyStyling(cssID); //Before or after adding components? Style sheets CAN be on a Parent to Parent basis
        addComponents();
    }

    protected XtraVBox(String cssID, Path cssClassPath)
    {
        super();

        this.setId(cssID);

        //registerView(this);
        instantiateComponents();
        initializeComponents();
        //addPreCloseListener();
        applyStyling(cssClassPath);
        addComponents();
    }

//  ----------------------------------------------------------------------------------------  //

    public abstract void instantiateComponents();
    public abstract void initializeComponents();
    public abstract void addComponents();

    public abstract XtraController getController(); //Calculation methods - Update, Convert, Etc.,
    public abstract XtraModel getModel(); //Do all saving/loading, Use properties,

//  ----------------------------------------------------------------------------------------  //

    private void applyStyling(Path fileClassPath)
    {
        //getStylesheets().add(0, XtraModel.class.getResource(fileClassPath).toExternalForm());
        getStylesheets().add(0, XtraModel.class.getResource(fileClassPath.toString()).toExternalForm());
    }

    private void addPreCloseListener(EventHandler<WindowEvent> eventHandler)
    {
        addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, eventHandler);


    }
}
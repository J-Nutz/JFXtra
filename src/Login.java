import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import xtracontrollers.XtraController;
import xtramodels.XtraModel;
import xtraviews.XtraVBox;

public class Login extends XtraVBox
{
    //private XtraVBox newVBox = new XtraVBox; Can only declare here, Cant completely create instances due to it being abstract, placement of method calls, etc.
    private ComboBox<String> comboBox;
    private TextField textField;
    private Button button;
    private VBox newVBox;

    Login()
    {
        super("MyID");

        System.out.println("Should Be First");
    }

    @Override
    public void instantiateComponents()
    {
        System.out.println("FIRST");
        comboBox = new ComboBox<>();
        textField = new TextField();
        button = new Button();
        newVBox = new VBox();
    }

    //Where should objects be instantiated? In their own instantiateComponents method?
    @Override
    public void initializeComponents() //"Initializing" components is viewed as any code that should be ran post adding to Pane, Pre making Pane visible
    {
        System.out.println("Should Be Third");
        //Have to initialize components here due to calling init & add components in constructor of XtraVBox
        /*comboBox = new ComboBox<>();
        textField = new TextField();
        button = new Button();
        newVBox = new VBox();*/
    }

    @Override
    public void addComponents()
    {
        getChildren().addAll(comboBox, textField, button, newVBox);
    }

    @Override
    public XtraController getController()
    {
        return null;
    }

    @Override
    public XtraModel getModel()
    {
        return null;
    }
}
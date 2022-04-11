package receiverMenu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import receiverMenu.resource.ModelList;
import receiverMenu.resource.Receiver;

public class Controller {
    Receiver receiver;
    ModelList modelList;

    @FXML
    private ListView<?> receiverList;

    @FXML
    private TextField search;

    @FXML
    private MenuButton modeMenu;

    @FXML
    private MenuItem free;

    @FXML
    private MenuItem status;

    @FXML
    private MenuItem stock;

    @FXML
    private AnchorPane windowReceiver;

    @FXML
    private AnchorPane remoteController;


    @FXML
    void initialize(){

    }
}

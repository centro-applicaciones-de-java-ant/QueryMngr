package org.rmj.querymngr.views;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.rmj.appdriver.GRider;
import org.rmj.appdriver.agentfx.CommonUtils;

public class HelpController implements Initializable {
    
    private GRider poGRider;

    private Button btnOk;
    @FXML
    private AnchorPane acMain;
    @FXML
    private Button btnExit;
    @FXML
    private FontAwesomeIconView glyphExit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }
    
     public void setGRider(GRider foGRider){
        this.poGRider = foGRider;
    }

    @FXML
    private void onExit(ActionEvent event) {
        CommonUtils.closeStage(btnExit);
    }
    
    
}

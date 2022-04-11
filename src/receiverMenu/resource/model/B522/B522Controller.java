package receiverMenu.resource.model.B522;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;
import receiverMenu.resource.Receiver;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class B522Controller implements Receiver {

    public B522Controller() throws MalformedURLException {
    }

    @Override
    public String getName() {
        return "GS B522";
    }

    @FXML
    MediaView video;
    File f = new File("src/receiverMenu/resource/video/dota.mp4");
    Media media = new Media(f.toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    @FXML
    private Button menu;

    @FXML
    private Button exit;

    @FXML
    private Button ok;

    @FXML
    private Button left;

    @FXML
    private Button right;

    @FXML
    private Button up;

    @FXML
    private Button down;

    @FXML
    private Button mute;

    @FXML
    private FlowPane viewMenu;

    @FXML
    private AnchorPane anchor1;

    @FXML
    private Text text1;

    @FXML
    private AnchorPane anchor2;

    @FXML
    private Text text2;

    @FXML
    private AnchorPane anchor3;

    @FXML
    private Text text3;

    @FXML
    private AnchorPane anchor4;

    @FXML
    private Text text4;

    @FXML
    private AnchorPane anchor5;

    @FXML
    private Text text5;

    @FXML
    private VBox lkMenu;

    @FXML
    private AnchorPane anchor10;

    @FXML
    private Text text10;

    @FXML
    private AnchorPane anchor11;

    @FXML
    private Text text11;

    @FXML
    private AnchorPane anchor12;

    @FXML
    private Text text12;

    @FXML
    private AnchorPane anchor13;

    @FXML
    private Text text13;

    @FXML
    private AnchorPane anchor14;

    @FXML
    private Text text14;

    @FXML
    private AnchorPane anchor15;

    @FXML
    private Text text15;

    @FXML
    private AnchorPane anchor16;

    @FXML
    private Text text16;

    @FXML
    private AnchorPane anchor17;

    @FXML
    private Text text17;

    @FXML
    private FlowPane applicationMenu;

    @FXML
    private AnchorPane anchor20;

    @FXML
    private Text text20;

    @FXML
    private AnchorPane anchor21;

    @FXML
    private Text text21;

    @FXML
    private AnchorPane anchor22;

    @FXML
    private Text text22;

    @FXML
    private AnchorPane anchor23;

    @FXML
    private Text text23;

    @FXML
    private AnchorPane anchor24;

    @FXML
    private Text text24;

    @FXML
    private AnchorPane anchor25;

    @FXML
    private Text text25;

    @FXML
    private AnchorPane anchor26;

    @FXML
    private Text text26;

    @FXML
    private AnchorPane anchor27;

    @FXML
    private Text text27;

    @FXML
    private AnchorPane anchor28;

    @FXML
    private Text text28;

    @FXML
    private AnchorPane anchor29;

    @FXML
    private Text text29;

    @FXML
    private AnchorPane anchor30;

    @FXML
    private Text text30;

    @FXML
    private AnchorPane anchor31;

    @FXML
    private Text text31;


    int index = 0;
    int menuIndex = 0;
    int lkIndex = 0;
    int lkMenuIndex = 0;
    int applicationMenuIndex = 0;
    int appIndex = 0;
    int i = 0;

    @FXML
    void initialize() {

        ArrayList<AnchorPane> anchorList = new ArrayList<AnchorPane>();
        anchorList.add(anchor1);
        anchorList.add(anchor2);
        anchorList.add(anchor3);
        anchorList.add(anchor4);
        anchorList.add(anchor5);
        ArrayList<Text> textList = new ArrayList<Text>();
        textList.add(text1);
        textList.add(text2);
        textList.add(text3);
        textList.add(text4);
        textList.add(text5);
        ArrayList<AnchorPane> anchorListOne = new ArrayList<AnchorPane>();
        anchorListOne.add(anchor10);
        anchorListOne.add(anchor11);
        anchorListOne.add(anchor12);
        anchorListOne.add(anchor13);
        anchorListOne.add(anchor14);
        anchorListOne.add(anchor15);
        anchorListOne.add(anchor16);
        anchorListOne.add(anchor17);
        ArrayList<Text> textListOne = new ArrayList<Text>();
        textListOne.add(text10);
        textListOne.add(text11);
        textListOne.add(text12);
        textListOne.add(text13);
        textListOne.add(text14);
        textListOne.add(text15);
        textListOne.add(text16);
        textListOne.add(text17);
        ArrayList<AnchorPane> anchorList1 = new ArrayList<AnchorPane>();
        anchorList1.add(anchor20);
        anchorList1.add(anchor21);
        anchorList1.add(anchor22);
        anchorList1.add(anchor23);
        anchorList1.add(anchor24);
        anchorList1.add(anchor25);
        anchorList1.add(anchor26);
        anchorList1.add(anchor27);
        anchorList1.add(anchor28);
        anchorList1.add(anchor29);
        anchorList1.add(anchor30);
        anchorList1.add(anchor31);
        ArrayList<Text> textList1 = new ArrayList<Text>();
        textList1.add(text20);
        textList1.add(text21);
        textList1.add(text22);
        textList1.add(text23);
        textList1.add(text24);
        textList1.add(text25);
        textList1.add(text26);
        textList1.add(text27);
        textList1.add(text28);
        textList1.add(text29);
        textList1.add(text30);
        textList1.add(text31);
        mediaPlayer.setAutoPlay(true);
        video.setMediaPlayer(mediaPlayer);
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        mediaPlayer.play();

        mute.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.setMute(!mediaPlayer.isMute());
            }
        });

        menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                viewMenu.setDisable(false);
                viewMenu.setVisible(true);
                anchorList.get(index).setStyle("-fx-background-color: cyan");
                textList.get(index).setFill(Color.BLACK);
                menuIndex = 1;
            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (menuIndex != 0) {
                    viewMenu.setDisable(true);
                    viewMenu.setVisible(false);
                    anchorList.get(index).setStyle(null);
                    textList.get(index).setFill(Color.WHITE);
                    index = 0;
                    menuIndex = 0;
                } else if (lkIndex != 0){
                    lkMenu.setDisable(true);
                    lkMenu.setVisible(false);
                    lkIndex = 0;
                    if(i != 0) {
                        applicationMenuIndex = 1;
                        applicationMenu.setVisible(true);
                        applicationMenu.setDisable(false);
                        i = 0;
                    } else {
                        menuIndex = 1;
                    }
                } else if (applicationMenuIndex != 0){
                    applicationMenu.setDisable(true);
                    applicationMenu.setVisible(false);
                    anchorList1.get(appIndex).setStyle(null);
                    textList1.get(appIndex).setFill(Color.WHITE);
                    applicationMenuIndex = 0;
                    appIndex = 0;
                    menuIndex = 1 ;
                }
            }
        });
        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (menuIndex == 1) {
                    if (index < 4) {
                        anchorList.get(index).setStyle(null);
                        textList.get(index).setFill(Color.WHITE);
                        index++;
                        anchorList.get(index).setStyle("-fx-background-color: cyan");
                        textList.get(index).setFill(Color.BLACK);
                    } else {
                        anchorList.get(index).setStyle(null);
                        textList.get(index).setFill(Color.WHITE);
                        index = 0;
                        anchorList.get(index).setStyle("-fx-background-color: cyan");
                        textList.get(index).setFill(Color.BLACK);
                    }
                } else if (applicationMenuIndex == 1) {
                    if (appIndex < 11) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        System.out.println(appIndex);
                        appIndex ++;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                        System.out.println(appIndex);
                    } else {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 0;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    }
                }
            }
        });
        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (menuIndex == 1) {
                    if (index > 0) {
                        anchorList.get(index).setStyle(null);
                        textList.get(index).setFill(Color.WHITE);
                        index--;
                        anchorList.get(index).setStyle("-fx-background-color: cyan");
                        textList.get(index).setFill(Color.BLACK);
                    } else {
                        anchorList.get(index).setStyle(null);
                        textList.get(index).setFill(Color.WHITE);
                        index = 4;
                        anchorList.get(index).setStyle("-fx-background-color: cyan");
                        textList.get(index).setFill(Color.BLACK);
                    }
                }else if (applicationMenuIndex == 1) {
                        if (appIndex > 0) {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex --;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        } else {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex = 11;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        }
                    }
                }

        });
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (lkIndex == 1) {
                    if (lkMenuIndex > 0) {
                        anchorListOne.get(lkMenuIndex).setStyle(null);
                        textListOne.get(lkMenuIndex).setFill(Color.WHITE);
                        lkMenuIndex--;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);
                    } else {
                        anchorListOne.get(lkMenuIndex).setStyle(null);
                        textListOne.get(lkMenuIndex).setFill(Color.WHITE);
                        lkMenuIndex = 7;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);
                    }
                } else if (applicationMenuIndex == 1) {
                    if (appIndex == 0) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 8;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 1) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 9;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 2) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 10;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 3) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 11;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else {
                        if (appIndex > 0) {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex -= 4;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        } else {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex = 11;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        }
                    }
                }
            }
        });

        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (lkIndex == 1) {
                    if (lkMenuIndex < 7) {
                        anchorListOne.get(lkMenuIndex).setStyle(null);
                        textListOne.get(lkMenuIndex).setFill(Color.WHITE);
                        lkMenuIndex++;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);
                    } else {
                        anchorListOne.get(lkMenuIndex).setStyle(null);
                        textListOne.get(lkMenuIndex).setFill(Color.WHITE);
                        lkMenuIndex = 0;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);
                    }
                } else if (applicationMenuIndex == 1) {
                    if (appIndex == 11) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 3;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 10) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 2;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 9) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 1;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else if (appIndex == 8) {
                        anchorList1.get(appIndex).setStyle(null);
                        textList1.get(appIndex).setFill(Color.WHITE);
                        appIndex = 0;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    } else {
                        if (appIndex < 11) {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex += 4;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        } else {
                            anchorList1.get(appIndex).setStyle(null);
                            textList1.get(appIndex).setFill(Color.WHITE);
                            appIndex = 0;
                            anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                            textList1.get(appIndex).setFill(Color.BLACK);
                        }
                    }
                }
            }
        });

        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (menuIndex == 1) {
                    if (index == 4) {
                        lkMenu.setVisible(true);
                        lkMenu.setDisable(false);
                        menuIndex = 0;
                        lkIndex = 1;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);

                    } else if (index == 0) {
                        applicationMenu.setDisable(false);
                        applicationMenu.setVisible(true);
                        menuIndex = 0;
                        applicationMenuIndex = 1;
                        anchorList1.get(appIndex).setStyle("-fx-background-color: yellow");
                        textList1.get(appIndex).setFill(Color.BLACK);
                    }
                }
                else if (applicationMenuIndex == 1){
                    if (appIndex == 1){
                        applicationMenu.setVisible(false);
                        applicationMenu.setDisable(true);
                        lkMenu.setVisible(true);
                        lkMenu.setDisable(false);
                        lkIndex = 1;
                        applicationMenuIndex = 0;
                        i = 1;
                        anchorListOne.get(lkMenuIndex).setStyle("-fx-background-color: cyan");
                        textListOne.get(lkMenuIndex).setFill(Color.BLACK);
                    }

                }
            }
        });
    }
}
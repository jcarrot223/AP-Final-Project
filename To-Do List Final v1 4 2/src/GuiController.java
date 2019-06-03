/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;




/**
 *
 * @author Juskeerat
 */
public class GuiController implements Initializable {

    public GuiController() {
        //initializes freetime list in graphics 
        this.list2 = FXCollections.observableArrayList();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // sets date picker value to current date
        datePicker.setValue(LocalDate.now());
        
    }
    @FXML
    Button addButton;
    @FXML
    Button freetimeButton;
    @FXML
    TextField taskText;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;
    @FXML
    ListView<LocalEvent> freetimeList;
    @FXML
    Label dateTime;
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();
    ObservableList<LocalEvent> list2;
    
    @FXML
    DatePicker timePicker;
    
    @FXML
    Button removeButton;
    
    //@FXML
    //DropdownButton suggestions;

    @FXML
    private void addEvent(Event e)
    {
        //adds event to agenda!
        list.add(new LocalEvent(datePicker.getValue(), taskText.getText(), LocalTime.now()));
        eventList.setItems(list);
        refresh();
    }
    
    @FXML
    private void removeEvent(Event e)
    {
        //removes event from agenda
        list.remove(0, 1);
    }
    
    
    
    @FXML
    private void addToFreetime(Event e)
    {
        //adds events to freetime list 
        list2.add(new LocalEvent(datePicker.getValue(), taskText.getText()));
        freetimeList.setItems(list2);
        refresh();
    }    
    
    private void refresh()
    {
        //sets date picker value to today's date & resets the text bar
        datePicker.setValue(LocalDate.now());
        taskText.setText(null);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainhotelapp;






import couchdb.Room.roomType;
import hotelbackend.HotelBackend;
import hotelbackend.Sqllc;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebView;


public class ReservationSystemUIController implements Initializable

{
    @FXML
    private HBox navBtnBar;

    @FXML
    private DatePicker fromBookingDatePicker;

    @FXML
    private DatePicker toBookingDatePicker;

    @FXML
    private ComboBox<String> roomBookingTypeComboBox;

    @FXML
    private ComboBox<Integer> numOfBookedRoomsComboBox;

    @FXML
    private Button searchBookingBtn;

    @FXML
    private WebView calenderResultsWebView;

    @FXML
    private TableView<?> roomResultsTable;

    @FXML
    private TableColumn<?, ?> roomNumTableColumn;

    @FXML
    private TableColumn<?, ?> roomDurationTableColumn;

    @FXML
    private TableColumn<?, ?> roomNotesTableColumn;

    @FXML
    private TableColumn<?, ?> roomAddPkgColumn;

    @FXML
    private TableColumn<?, ?> roomActionColumn;


    /*
        Steps to get basic booking functionality working

    1) input room types for the roomBookingTypeComboBox: "King, Queen"
    2) input number of rooms for the numOfBookedRoomsComboBox
    3) make search button clickListener check that the input is valid and not blank for input boxes:
        - fromBookingDatePicker
        - toBookingDatePicker
        - roomBookingTypeComboBox
        - numOfBookedRoomsComboBox

        1) if the input fields are invalid, show a toolTip besides the box that is currently invalid with
            a message of how to correct the issue.
        2) if the input field is valid, query the database with the given request params



    */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         calenderResultsWebView.getEngine().load("http://google.com");

         setupRoomBookingComboBox();
         setupNumOfBookedRoomsComboBox();





    }

    @FXML
    void onBarClicked(MouseEvent event)
    {

    }

    @FXML
    void onClickedCalender(MouseEvent event)
    {

    }

    @FXML
    void onClickedSearchBtn(MouseEvent event) throws Exception
    {

            //param1: LocalDate, param2: LocalDate
            System.out.println("from date: "+fromBookingDatePicker.getValue());
            System.out.println("from date: "+toBookingDatePicker.getValue());
            System.out.println("roomType: "+roomBookingTypeComboBox.getSelectionModel().getSelectedItem());
            System.out.println("num of selected rooms: "+numOfBookedRoomsComboBox.getValue());

            
            HotelBackend myHotelRoom = new HotelBackend();


//            HotelRoom myHotelRoom = new HotelRoom(); //need updated backend code

            LocalDate fromDate = fromBookingDatePicker.getValue();
            LocalDate toDate = fromBookingDatePicker.getValue();
//            RoomTypeConst roomType = roomBookingTypeComboBox.getSelectionModel().getSelectedItem(); //need updated backend code
            int numOfBookedRooms = numOfBookedRoomsComboBox.getValue();

//            myHotelRoom.bookRoom(fromDate, toDate, roomType, numOfBookedRooms); //need updated backend code


        System.out.println("verify print");





    }

    private void setupRoomBookingComboBox()
    {
        //instantiate combobox for roomTypeSelection
         ObservableList<String> roomTypes = FXCollections.observableArrayList(
        roomType.reg.toString(),
        roomType.suite.toString(),
        roomType.handi.toString()
    );

         roomBookingTypeComboBox.setItems(roomTypes);

    }

    private void setupNumOfBookedRoomsComboBox()
    {

         ObservableList<Integer> maxNumOfRooms = FXCollections.observableArrayList(1,2,3,4,5);

        numOfBookedRoomsComboBox.setItems(maxNumOfRooms);
    }



}


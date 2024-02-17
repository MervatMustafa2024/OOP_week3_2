module com.example.week3_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week3_2 to javafx.fxml;
    exports com.example.week3_2;
}
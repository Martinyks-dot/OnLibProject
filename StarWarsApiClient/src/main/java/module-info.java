module com.example.starwarsapiclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires rest.assured;
    requires com.fasterxml.jackson.databind;
    requires org.apache.logging.log4j;

    opens com.example.starwarsapiclient to javafx.fxml;
    exports com.example.starwarsapiclient;
}

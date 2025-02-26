module HelloMe {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens it.marcoschiavo.hellome to javafx.graphics, javafx.fxml;
}

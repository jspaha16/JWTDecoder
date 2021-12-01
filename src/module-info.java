module app.jwt {
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	exports application.view;
	opens application.view;
	opens application;
}
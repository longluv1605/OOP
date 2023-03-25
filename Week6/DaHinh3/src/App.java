import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;
    private Scene scene1, scene2;

    private Button up = new Button("UP");
    private Button down = new Button("DOWN");
    private Button left = new Button("LEFT");
    private Button right = new Button("RIGHT");
    private Button change = new Button("Change to Square");
    private HBox box = new HBox();
    private Group root = new Group();

    private Button up1 = new Button("UP");
    private Button down1 = new Button("DOWN");
    private Button left1 = new Button("LEFT");
    private Button right1 = new Button("RIGHT");
    private Button change1 = new Button("Change to Circle");
    private HBox box1 = new HBox();
    private Group root1 = new Group();

    private Shape a = new Circle(new Point(540, 360), 100, "RED", true);
    private Shape b = new Square(new Point(50, 50), 100, "BLUE", true);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        a.render();
        b.render();

        // // Scene 1
        // //
        // ----------------------------------------------------------------------------------------
        // Button up = new Button("UP");
        // Button down = new Button("DOWN");
        // Button left = new Button("LEFT");
        // Button right = new Button("RIGHT");
        // Button change1 = new Button("Change to Square");
        // HBox box = new HBox();
        // Group root = new Group();

        // // Scene 2
        // //
        // --------------------------------------------------------------------------------------------
        // Button up1 = new Button("UP");
        // Button down1 = new Button("DOWN");
        // Button left1 = new Button("LEFT");
        // Button right1 = new Button("RIGHT");
        // Button change2 = new Button("Change to Circle");
        // HBox box1 = new HBox();
        // Group root1 = new Group();

        // Event 1
        change.setOnAction(event -> {
            // a.render();
            // b.render();
            // left1.setOnAction(evente -> {
            // b.left();
            // });

            // up1.setOnAction(evente -> {
            // b.up();
            // });

            // down1.setOnAction(evente -> {
            // b.down();
            // });

            // right1.setOnAction(evente -> {
            // b.right();
            // });

            // box1.getChildren().addAll(up1, down1, left1, right1, change1);
            root1.getChildren().addAll(box1, a.getCir(), b.getRect());
            // scene2 = new Scene(root1, 1080, 720, Color.AQUAMARINE);
            stage.setScene(scene2);
        });

        // left.setOnAction(event -> {
        // a.left();
        // });

        // up.setOnAction(event -> {
        // a.up();
        // });

        // down.setOnAction(event -> {
        // a.down();
        // });

        // right.setOnAction(event -> {
        // a.right();
        // });

        box.getChildren().addAll(up, down, left, right, change);
        root.getChildren().addAll(box, a.getCir(), b.getRect());
        scene1 = new Scene(root, 1080, 720, Color.AQUAMARINE);
        stage.setScene(scene1);
        // ------------------------------------------------------------------------------------------------

        // Event 2
        // -----------------------------------------------------------------------------------------

        change1.setOnAction(event -> {
            // a.render();
            // b.render();
            // left.setOnAction(evente -> {
            // a.left();
            // });

            // up.setOnAction(evente -> {
            // a.up();
            // });

            // down.setOnAction(evente -> {
            // a.down();
            // });

            // right.setOnAction(evente -> {
            // a.right();
            // });

            // box.getChildren().addAll(up, down, left, right, change);
            root.getChildren().addAll(box, a.getCir(), b.getRect());
            // scene1 = new Scene(root, 1080, 720, Color.AQUAMARINE);
            stage.setScene(scene1);
        });

        // left1.setOnAction(event -> {
        // b.left();
        // });

        // up1.setOnAction(event -> {
        // b.up();
        // });

        // down1.setOnAction(event -> {
        // b.down();
        // });

        // right1.setOnAction(event -> {
        // b.right();
        // });

        // box1.getChildren().addAll(up1, down1, left1, right1, change1);
        box1.getChildren().addAll(up1, down1, left1, right1, change1);
        // root1.getChildren().addAll(box1, a.getCir(), b.getRect());
        scene2 = new Scene(root1, 1080, 720, Color.AQUAMARINE);
        // ------------------------------------------------------------------------------------------------

        Image image = new Image("Mew.jpg");
        stage.getIcons().add(image);
        stage.setTitle("Test");
        stage.setResizable(false);
        stage.show();
    }
}
import javax.swing.*;

class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
        this.setTitle("Titanic Passengers Data");
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.add(new MainPanel(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT));
        this.setVisible(true);

    }



}
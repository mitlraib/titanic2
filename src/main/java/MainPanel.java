import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPanel extends JPanel {
    private JComboBox <String> survivedComboBox;

    public MainPanel (int x, int y, int width, int height) {
        File file = new File(Constants.PATH_TO_DATA_FILE); //this is the path to the data file
        try {

            Scanner scanner = new Scanner(file);
            List<Passenger> passengerList = new ArrayList<>();
            int i = 0;
            while (scanner.hasNextLine()){
                String passenger = scanner.nextLine();
//                System.out.println(passenger);
                if (i!=0){
                    Passenger passengerObject = new Passenger(passenger);
                    passengerList.add(passengerObject);
                }
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        List <Passenger> passengerData = new ArrayList<>();
        this.setLayout(null);
        this.setBounds(x, y + Constants.MARGIN_FROM_TOP, width, height);
        JLabel survivedLabel = new JLabel("Passenger Class: ");
        survivedLabel.setBounds(x + Constants.MARGIN_FROM_LEFT, y, Constants.LABEL_WIDTH, Constants.LABEL_HEIGHT);
        this.add(survivedLabel);
        this.survivedComboBox = new JComboBox<>(Constants.PASSENGER_CLASS_OPTIONS);
        this.survivedComboBox.setBounds(survivedLabel.getX()+Constants.EXTRA_SPACE_FOR_APPEARANCE
                + survivedLabel.getWidth() + Constants.EXTRA_SPACE_FOR_APPEARANCE,
                survivedLabel.getY()+Constants.EXTRA_SPACE_FOR_APPEARANCE,
                Constants.COMBO_BOX_WIDTH, Constants.COMBO_BOX_HEIGHT);

        this.add(this.survivedComboBox);
        this.survivedComboBox.addActionListener((e) -> {
            //do whatever you want on change
        });


    }

}


public class Passenger {
    public static final int WANTED_STRING_SIZE = 10;


    private int passengerId;
    private boolean survived;
    private int pClass;
    private String name;
    private String sex;
    private int age;
    private int sib;
    private int parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;

    public Passenger(String lineData) {
        String[] dataItem = lineData.split(",");
        this.passengerId = Integer.valueOf(dataItem[0]);
        if (dataItem[1].equals("0")) {
            this.survived = false;
        } else if (dataItem[1].equals("0")) {
            this.survived = true;
        }
        this.pClass = Integer.valueOf(dataItem[2]);
        this.name = getFormattedName(dataItem[3]);
        this.sex = dataItem[4];

        if (dataItem[5].equals("")) {
            this.age = 0;
        }

        else if (dataItem[5].equals("28.5")) {
            this.age = 28;
        }
        else if (dataItem[5].equals("83.475")) {
            this.age = 28;
        }

        this.sib = Integer.valueOf(dataItem[6]);
        this.parch = Integer.valueOf(dataItem[7]);
        this.ticket = dataItem[8];
        this.fare = Double.valueOf(dataItem[9]);
        this.cabin = dataItem[10];

        if (dataItem[11]== null) {
            this.embarked = "no data";
        }
        else {
            this.embarked = dataItem[11];

        }
    }

    public static String getFormattedName(String name) {
        String formattedName = name;
        if ((name.contains("Mr"))){
            formattedName =  formattedName.replace("Mr"," ");
//            (String regex, String replacement)
//            name.replace("r"," ");
//            name.replace("s"," ");
//            formattedName=   name.substring(0, 7);
        }

        return formattedName;
    }


}

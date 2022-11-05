public class Main {
    public static void main(String[] args) {


    }

    public static String come (int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return ("Можно идти гулять");}
        else if (age < 20 && temp > 0 && temp < 30){
            return ("Можно идти гулять");}
        else if (age > 45 && temp > -10 && temp < 25 ){
            return ("Можно идти гулять");
        }
        return ("Можно идти гулять");
        }

 
    }

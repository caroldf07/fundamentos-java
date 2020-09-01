package ClassAndMethod;

public class DataChallenge {
    public static void main(String[] args) {
        Data date = new Data();
        date.day = 07;
        date.month  = 11;
        date.year = 1993;

        Data date02 = new Data();

        System.out.println(date.dateFormatted());
        System.out.println(date02.dateFormatted());

    }
}

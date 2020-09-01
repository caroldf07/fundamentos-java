package ClassAndMethod;

public class Data {
    int day;
    int month;
    int year;

    Data(){
        day = 01;
        month = 01;
        year = 1970;
    }

    Data(int dayInitial, int monthInitial, int yearInitial){
        day = dayInitial;
        month = monthInitial;
        year = yearInitial;
    }

    String dateFormatted(){
        return String.format("%d/%d/%d\n", day,month, year);
    }
}

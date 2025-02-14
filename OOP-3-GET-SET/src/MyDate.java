public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year >= 1){
            this.year = year;
        }
    }

    public MyDate(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }
        else{
            this.day = 1;
        }
        if(month >=1 && month <= 12){
            this.month = month;
        }
        else{
            this.month = 1;
        }
        if(year >= 0 ){
            this.year = year;
        }
        else {
            this.year = 1;
        }
    }
}

class TimeFormat {
    private int hour;
    private int minutes;
    private int seconds;
    public TimeFormat() {
        hour = 0;
        minutes = 0;
        seconds = 0;
    }
    public TimeFormat(int hour) {
        hour = hour;
        minutes = 0;
        seconds = 0;
    }   
    public TimeFormat(int hour, int minutes) {
        hour = hour;
        minutes = minutes;
        seconds = 0;
    }   
    public TimeFormat(int hour, int minutes, int seconds) {
        hour = hour;
        minutes = minutes;
        seconds = seconds;
    }
        public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minutes, seconds);
    }
}
class lab14{
public static void main(String[] args) {
System.out.printf("Ambrish Kalia 2230143");
    TimeFormat t1 = new TimeFormat();   
    TimeFormat t2 = new TimeFormat(15); 
    TimeFormat t3 = new TimeFormat(12, 30);
    TimeFormat t4 = new TimeFormat(10, 45, 25); 
    t1.displayTime();
    t2.displayTime();
    t3.displayTime();
    t4.displayTime();
}} 

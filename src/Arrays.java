public class Arrays {
    String [] days={"monday", "tuesday", "wednesday","thursday","friday","saturday","sunday"};

    int indexday;
    public void setDays(String day){
        this.indexday=3;
        for (int i=0;i<days.length;i++){
            if(days.equals(days[i])){
                this.indexday=i;
                break;
            }
        }
    }
    public void setDays(int day){
        this.indexday=day;
    }
    public String nextDay(){
        return calculateDay(1);
    }
    public String previousDay(){
        return calculateDay(-1);
    }
    public String calculateDay(int numbers){
        if (numbers<=0){
            return days[(this.indexday-Math.abs(numbers))%7];
        }
        return days [(this.indexday+numbers)%7];
    }
}
class ArraysDriver {
    public static void main (String []args){
        Arrays today=new Arrays();
        today.setDays(6);
        today.nextDay();
        today.calculateDay(5);
        today.previousDay();
        System.out.println(today);
        System.out.println(today.nextDay());
        System.out.println(today.calculateDay(5));
        System.out.println(today.previousDay());
    }
}

public class TimeCalc {
    public static void main(String[] args) {
        int firstHour = Integer.parseInt("" + args[0].charAt(0));
		int secondHour = Integer.parseInt("" + args[0].charAt(1));
		int firstMinute = Integer.parseInt("" + args[0].charAt(3));
		int secondMinute = Integer.parseInt("" + args[0].charAt(4));
        int min2add = Integer.parseInt(args[1]);
      

        int hours = (int)((firstHour *10) + secondHour);
        int minutes = (int)((firstMinute * 10) + secondMinute);
       
        minutes += min2add % 60;
        hours += min2add / 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
 
        if (hours <10){
            System.out.print("0");
        }
        System.out.print(hours + ":");

        if (minutes <10){
            System.out.print("0");
        }
        System.out.print(minutes);
    }
}

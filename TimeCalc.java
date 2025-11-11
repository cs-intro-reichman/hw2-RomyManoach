public class TimeCalc {
    public static void main(String[] args) {
        int firstHour = Integer.parseInt("" + args[0].charAt(0));
		int secondHour = Integer.parseInt("" + args[0].charAt(1));
		int firstMinute = Integer.parseInt("" + args[0].charAt(3));
		int secondMinute = Integer.parseInt("" + args[0].charAt(4));
        int min2add = Integer.parseInt(args[1]);
      

        int hours = (int)((firstHour *10) + secondHour);
        int minutes = (int)((firstMinute * 10) + secondMinute);
       
        if (min2add > 60){
            minutes = minutes + (min2add % 60);
        }
        else {
            minutes = minutes + min2add;
        }
        
        if (minutes > 60){
            minutes = minutes % 60;
            hours = (hours+(min2add/60));
        }
        if (minutes == 60){
            minutes = 00;
            hours++;
        }
        
       if (hours > 24){
        hours = hours % 24;
       }
       if (minutes >= 10){
        System.out.println(hours + ":" + minutes);
       }
       if (minutes < 10){
        System.out.println(hours + ":0" + minutes);
       }
    }
}

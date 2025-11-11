public class Cheers {
        public static void main(String[] args) {
        String small = args[0];
        String word = small.toUpperCase();
        int times = Integer.parseInt(args[1]);

            for (int i = 0; i < word.length(); i++){
                System.out.print("Give me a");

                // check if an/a 
                if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'F' || 
                        word.charAt(i) == 'H' || word.charAt(i) == 'I' || word.charAt(i) == 'L' || 
                        word.charAt(i) == 'M' || word.charAt(i) == 'O' || word.charAt(i) == 'R' || word.charAt(i) == 'S'|| word.charAt(i) == 'X'|| word.charAt(i) == 'N') {
                        System.out.println("n " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
                else {
                        System.out.println( "  " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");

             for (int i = 0; i < times; i++){
                System.out.println(word + "!!!");
             }
            
        }
}

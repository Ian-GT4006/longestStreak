public class longest {
    public static void main (String[] args){
        longestStreak("eajnijneifnwiebfbbbweqaaaaaaaiiiiiiiixixcxxxxxxxxqepoqeonn");

    }

    public static void longestStreak (String str){
        int streaklength = 0;
        
        String longest = "";
        String storage = "";
        int streaklen = 0;
        for (int x = 0; x<(str.length()-1); /*x+=1*/){
             streaklength = streaklen;
             String lastLetter = String.valueOf(str.charAt(x));
             if (x<str.length()){x++;}
             String ithLetter = String.valueOf(str.charAt(x));
             
             //System.out.println(x);
            if (lastLetter.equals(ithLetter)){
                storage = storage + ithLetter;
                if (storage.length()==1){
                    storage = storage + lastLetter;
                }
                streaklen = storage.length();
                //System.out.println(streaklen);

                //System.out.println(storage);
                if (streaklength<= streaklen){
                    longest = storage;
                }
            }
            else {
                storage = "";
            }
             
             
             

             
        }
        System.out.print(longest.charAt(0) + ", ");
        System.out.print( longest.length());


    }
}




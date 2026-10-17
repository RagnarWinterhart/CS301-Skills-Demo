public class ROT13 {
    public static void main(String[] args) {
        /*
        Rot13 is a very simple encryption scheme used on some
         Internet newsgroups to conceal potentially offensive
          postings. It works by cyclically shifting each
           lowercase or uppercase letter 13 positions. So,
           the letter 'a' is replaced by 'n' and the letter
            'n' is replaced by 'a'. For example, the string
            "Encryption" is encoded as "Rapelcgvba." Write a
            program ROT13.java that reads in a String as a
            command line parameter and encodes it using Rot13.
         */
        if (args.length < 1){
            System.err.println("Use: java ROT13 <String>");
            System.exit(1);
        }

        String text = args[0];
        System.out.println(encrypt(text));

    }

    public static String encrypt(String string){
        if(string == null) return null;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);

            if(c >= 'a' && c <= 'z'){
                result.append((char) ('a' + (c - 'a' + 13) % 26));
            } else if (c >= 'A' && c<= 'Z') {
                result.append((char) ('A' + (c - 'A' + 13) % 26));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}

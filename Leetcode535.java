import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.lang.*;

public class Leetcode535 {
    public class Codec {
        String dic="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random getRan=new Random();
        Map<String,String>map= new HashMap<>();
        public String getKey(){
            StringBuilder key_holder=new StringBuilder();
            for(int i=0;i<6;i++){
                key_holder.append(dic.charAt(getRan.nextInt(62)));
            }
            return key_holder.toString();

        }
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {


            String key=getKey();
            map.put(key,longUrl);
            return "http://tinyurl.com/"+key;

        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            String originalString=map.get(shortUrl.replace("http://tinyurl.com",""));
            return originalString;
        }
    }

    public static void main(String[] args) {

    }
}

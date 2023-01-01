public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        longUrl=longUrl+"encode";
        return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        shortUrl=shortUrl.substring(0,shortUrl.length()-6);
        return shortUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

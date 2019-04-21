
public class Context
{
    IHashStrategy hash = null;
    
    public void setCurrentStrategy(IHashStrategy h) {
        hash = h;
    }
    
    public String doHash(String input) {
        String hashSum = hash.hashSum(input);
        return hashSum;
    }
}

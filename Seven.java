package test;

public class Seven {
    private static Seven seven;
    private Seven(){};
    public static Seven getSeven()
    {
        if(seven==null)
        {
            Seven seven=new Seven();
        }
        return seven;
        
    }
}

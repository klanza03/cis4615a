public class R06_MET01_J {
    
    // Rule 06. Methods
    // Example: MET01_J - Never use assertions to validat method arguments

    public static int getAbsAdd(int x, int y){
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
    // Usage: getAbsAdd(Integer.MIN_VALUE, 1);
}

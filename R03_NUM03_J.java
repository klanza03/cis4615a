public class R03_NUM03_J {
    
    public static int getInteger(DataInputStream is) throws IOException{
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}

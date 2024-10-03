public class R02_XP00_J {
    
    public void deleteFile(){

        File someFile = new File("someFileName.txt");
        // Do something with said file
        if(!someFile.delete()){
            // handle failure to delete file
        }
    }

}

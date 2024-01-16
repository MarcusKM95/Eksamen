public class Image {

    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType(){
        String lowerCaseFileName = fileName.toLowerCase();

        return lowerCaseFileName.endsWith(".jpg") ||
                lowerCaseFileName.endsWith(".jpeg") ||
                lowerCaseFileName.endsWith(".gif") ||
                lowerCaseFileName.endsWith(".png") ||
                lowerCaseFileName.endsWith(".webp") ||
                lowerCaseFileName.endsWith(".bmp");
    }

    public boolean isPortrait(){
        if (width < height){
            return true;
        }
        return false;
    }
    public boolean isLandScape(){
        if (width > height){
            return true;
        }
        return false;
    }
}

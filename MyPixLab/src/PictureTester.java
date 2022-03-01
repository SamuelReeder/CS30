
/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("images/beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void textZeroRed() {
        Picture beach = new Picture("images/beach.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
//        convertToBlackAndWhite();
//        adjustBrightness(0.8);
//        Picture pic = new SimplePicture();
        
//    testZeroBlue();
//      textZeroRed();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }

    public static void convertToBlackAndWhite() {
        Picture pic = new Picture("images/femaleLionAndHall.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (Pixel[] rowArray : pixels) {
            for (Pixel pixObj : rowArray) {
                double avg = pixObj.getAverage();
                pixObj.setRed((int)Math.round(avg));
                pixObj.setGreen((int)Math.round(avg));
                pixObj.setBlue((int)Math.round(avg));
            }
        }
        
        pic.explore();
    }
    
    public static void adjustBrightness(double brightness) {
        Picture pic = new Picture("images/koala.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (Pixel[] rowArray : pixels) {
            for (Pixel pixObj : rowArray) {
               
                double revisedBrightness;
                double arr[] = {(pixObj.getRed() * brightness),(pixObj.getGreen() * brightness), (pixObj.getBlue() * brightness)};
                
                if (arr[0] > 255 || arr[1] > 255 || arr[2] > 255) {
                    double max = Math.max(arr[0], Math.max(arr[1], arr[2]));
                    double factor = max / 255.0;
                    revisedBrightness = brightness - (factor - 1); 
                } else {
                    revisedBrightness = brightness;
                }
                
                pixObj.setRed((int)(pixObj.getRed() * revisedBrightness));
                pixObj.setGreen((int) (pixObj.getGreen() * revisedBrightness));
                pixObj.setBlue((int) (pixObj.getBlue() * revisedBrightness));
            }
        }
        
        pic.explore();
    }
}

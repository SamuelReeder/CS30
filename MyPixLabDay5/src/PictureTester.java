
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
        Picture canvas = new Picture("images/640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("images/swan.jpg");
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
        repairTemple();
        flipVertically();
        flipHorizontal();
        horizontalMirror();
        verticalMirror();
        convertToBlackAndWhite();
        adjustBrightness(0.8);
//        Picture pic = new SimplePicture();

        testZeroBlue();
        textZeroRed();
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
//        testCollage();
        //testCopy();
//        testEdgeDetection();
//        testEdgeDetection2();
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
                pixObj.setRed((int) Math.round(avg));
                pixObj.setGreen((int) Math.round(avg));
                pixObj.setBlue((int) Math.round(avg));
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
                double arr[] = {(pixObj.getRed() * brightness), (pixObj.getGreen() * brightness), (pixObj.getBlue() * brightness)};

                if (arr[0] > 255 || arr[1] > 255 || arr[2] > 255) {
                    double max = Math.max(arr[0], Math.max(arr[1], arr[2]));
                    double factor = max / 255.0;
                    revisedBrightness = brightness - (factor - 1);
                } else {
                    revisedBrightness = brightness;
                }

                pixObj.setRed((int) (pixObj.getRed() * revisedBrightness));
                pixObj.setGreen((int) (pixObj.getGreen() * revisedBrightness));
                pixObj.setBlue((int) (pixObj.getBlue() * revisedBrightness));
            }
        }

        pic.explore();
    }

    public static void verticalMirror() {
        Picture pic = new Picture("images/redMotorcycle.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[r].length / 2; c++) {
                int pos = pixels[r].length - 1 - c;
                pixels[r][pos].setRed((int) (pixels[r][c].getRed()));
                pixels[r][pos].setGreen((int) (pixels[r][c].getGreen()));
                pixels[r][pos].setBlue((int) (pixels[r][c].getBlue()));

            }
        }

        pic.explore();
    }

    public static void horizontalMirror() {
        Picture pic = new Picture("images/redMotorcycle.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (int c = 0; c < pixels[0].length; c++) {
            for (int r = 0; r < pixels.length / 2; r++) {
                int pos = pixels.length - 1 - r;
                pixels[pos][c].setRed((int) (pixels[r][c].getRed()));
                pixels[pos][c].setGreen((int) (pixels[r][c].getGreen()));
                pixels[pos][c].setBlue((int) (pixels[r][c].getBlue()));

            }
        }

        pic.explore();
    }

    public static void flipHorizontal() {
        Picture pic1 = new Picture("images/butterfly1.jpg");
        Picture pic2 = new Picture("images/butterfly1.jpg");

        pic1.explore();

        Pixel[][] pixels1 = pic1.getPixels2D();
        Pixel[][] pixels2 = pic2.getPixels2D();

        for (int r = 0; r < pixels1.length; r++) {
            for (int c = 0; c < pixels1[r].length; c++) {
                int pos = pixels1[r].length - 1 - c;
                pixels2[r][c].setRed((int) (pixels1[r][pos].getRed()));
                pixels2[r][c].setGreen((int) (pixels1[r][pos].getGreen()));
                pixels2[r][c].setBlue((int) (pixels1[r][pos].getBlue()));

            }
        }

        pic2.explore();
    }

    public static void flipVertically() {
        Picture pic1 = new Picture("images/butterfly1.jpg");
        Picture pic2 = new Picture("images/butterfly1.jpg");

        pic1.explore();

        Pixel[][] pixels1 = pic1.getPixels2D();
        Pixel[][] pixels2 = pic2.getPixels2D();

        for (int c = 0; c < pixels1[0].length; c++) {
            for (int r = 0; r < pixels1.length; r++) {
                int pos = pixels1.length - 1 - r;
                pixels2[r][c].setRed((int) (pixels1[pos][c].getRed()));
                pixels2[r][c].setGreen((int) (pixels1[pos][c].getGreen()));
                pixels2[r][c].setBlue((int) (pixels1[pos][c].getBlue()));

            }
        }

        pic2.explore();
    }

    public static void repairTemple() {
        Picture pic = new Picture("images/temple.jpg");
        pic.explore();
        Pixel[][] pixels = pic.getPixels2D();

        for (int r = 27; r < 97; r++) {
            for (int c = 13; c < 276; c++) {
                int pos = pixels[r].length - 14 - c;
                pixels[r][pos].setRed((int) (pixels[r][c].getRed()));
                pixels[r][pos].setGreen((int) (pixels[r][c].getGreen()));
                pixels[r][pos].setBlue((int) (pixels[r][c].getBlue()));
            }
        }

        pic.explore();
    }

}

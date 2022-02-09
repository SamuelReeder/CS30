package frontend_viewcontroller;

import backend_models.*;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 * This class is responsible for displaying the data from the backend, and
 * directly putting data on the screen for users to see.
 *
 * Responsibilities of this class include:
 *
 * (1) Construct the graphical user interface (GUI) on the screen
 *
 * (2) Pull data from the backend to display in the GUI
 *
 * There should be no code here for handling user's keyboard or mouse
 * interaction! That belongs in the ModelsAndViewsController class.
 *
 * There should also be no code here directly about modeling the problem or
 * situation your program solves.
 *
 * All problem or situation modeling related code must go in the backend classes
 *
 * The FOUR (4) main steps to creating GUI widgets are labeled below. There are
 * many smaller steps you should get familiar with as well.
 *
 * @author cheng
 */
public class MainViewDisplay extends JFrame {

    /*
     *
     * MainViewDisplay needs to have a instance variable to reference the
     * backend's models because the frontend's MainViewDisplay is responsible
     * for displaying data from the backend.
     *
     * Since the backend models is initially set up by an instance of the
     * BackendModelSetup class, we just need this one instance variable here:
     */
    BackendModelSetup theBackendModel;

    /*
     *
     * Step 1 of 4 for creating GUI widgets: declare them
     * --------------------------------------------------
     *
     * GUI widgets to be displayed to the user on the screen is declared here
     * (but will be constructed and initialized in the initComponents method).
     * The user will see data and can later interact with these widgets.
     */
    
    JLabel textContentLabel;
    JTextField textContentField;
    JButton openSourceFileButton;
    JButton saveResultToFileButton;
    JButton encryptSourceButton;
    JButton decryptSourceButton;

    /*
     *
     * Constructor. Probably nothing for students to change.
     */
    public MainViewDisplay(BackendModelSetup aBackend) {
        this.theBackendModel = aBackend;
        this.initComponents();
    }

    /*
     *
     * initComponents is all about fulfilling Responsibility #1 of this class:
     * (1) Construct the graphical user interface (GUI) on the screen
     */
    private void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.setMinimumSize(new Dimension(600, 200));

        /*
         *
         * Step 2 of 4 for creating GUI widgets: construct them
         * ----------------------------------------------------
         *
         * Construct GUI widget components here, and add them into the
         * mainDisplayPane later
         */
        
        this.textContentLabel = new JLabel();
        this.textContentLabel.setText("Text content");
        
        this.textContentField = new JTextField();
        
        this.openSourceFileButton = new JButton();
        this.openSourceFileButton.setText("Open File");
        
        this.saveResultToFileButton = new JButton();
        this.saveResultToFileButton.setText("Save File");
        
        this.encryptSourceButton = new JButton();
        this.encryptSourceButton.setText("Encrypt");
        
        this.decryptSourceButton = new JButton();
        this.decryptSourceButton.setText("Decrypt");

        /*
         * Choose your LayoutManager for the mainDisplayPane here. See:
         * http://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
         *
         * I suggest GridBagLayout. For more details, see:
         * http://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
         */
        Container mainDisplayPane = this.getContentPane();
        mainDisplayPane.setLayout(new GridBagLayout());


        /*
         * you should construct a new GridBagConstraints object each time you
         * use it, in order to avoid subtle bugs...
         */
        GridBagConstraints c;


        /*
         *
         * Step 3 of 4 for creating GUI widgets: add them to the pane
         * ----------------------------------------------------------
         *
         * For each GUI widget you constructed earlier, you will now specify a
         * GridBagConstraints for it, then add the widget into the
         * mainDisplayPane
         */
//        c = new GridBagConstraints(); // construct a new GridBagConstraints each time you use it, to avoid subtle bugs...
//        c.gridx = 0;
//        c.gridy = 0;
//        c.gridwidth = 1;
//        c.gridheight = 1;
//        mainDisplayPane.add(this.nameLabel, c);
//
//        c = new GridBagConstraints();
//        c.gridx = 1;
//        c.gridy = 0;
//        c.gridwidth = 1;
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.anchor = GridBagConstraints.LINE_START;
//        mainDisplayPane.add(this.nameField, c);
//
//        c = new GridBagConstraints();
//        c.gridx = 0;
//        c.gridy = 2;
//        mainDisplayPane.add(this.rankLabel, c);
//
//        c = new GridBagConstraints();
//        c.gridx = 1;
//        c.gridy = 2;
//        c.gridwidth = 1;
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.anchor = GridBagConstraints.LINE_START;
//        mainDisplayPane.add(this.rankField, c);
//
//        c = new GridBagConstraints();
//        c.gridx = 6;
//        c.gridy = 6;
//        mainDisplayPane.add(this.openButton, c);
//
//        c = new GridBagConstraints();
//        c.gridx = 7;
//        c.gridy = 6;
//        mainDisplayPane.add(this.saveButton, c);

        this.pack(); // leave this line last in this method.
        // must pack this JFrame before it can be displayed on screen
    }

    /*
     *
     * Step 4 of 4 for creating GUI widgets: write methods to update them
     * -------------------------------------------------------------------
     *
     * The methods below are all about fulfilling Responsibility #2 of this
     * class: (2) Pull data from the backend to display in the GUI
     *
     * Write below all the methods for displaying data into the GUI using this
     * MainViewDisplay object
     */
//    void updatePowListDisplay() {
//        this.powJListForScrollPane.setListData(this.theBackendModel.thePowList.toArray());
//    }

    String showSaveDialog() {
        JFileChooser jfc = new JFileChooser();
        int status = jfc.showSaveDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            File theFile = jfc.getSelectedFile();
            String thePath = theFile.getAbsolutePath();
            return thePath;
        }

        return null;
    }

    String showOpenDialog() {
        JFileChooser jfc = new JFileChooser();
        int status = jfc.showOpenDialog(this);
        if (status == JFileChooser.APPROVE_OPTION) {
            File theFile = jfc.getSelectedFile();
            String thePath = theFile.getAbsolutePath();
            return thePath;
        }

        return null;
    }
}

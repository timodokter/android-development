package com.example.android.tourguide;

public class Attractions {

    //info to show
    private String outputInfoOnCategory;

    //title to show
    private String outputTitleforCategory;

    //image to show
    private int outputImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //set the outputs
    public Attractions(String inputInfoOnCategory, String inputTitleforCategory, int inputImageResourceId) {
        outputInfoOnCategory = inputInfoOnCategory;
        outputTitleforCategory = inputTitleforCategory;
        outputImageResourceId = inputImageResourceId;
    }

    //get the outputs
    public String getOutputInfoOnCategory(){return outputInfoOnCategory;}

    public String getOutputTitleforCategory(){return outputTitleforCategory;}

    public int getImageResourceID() {
        return outputImageResourceId;
    }

    public boolean hasImage() {
        return outputImageResourceId != NO_IMAGE_PROVIDED;
    }
}

package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Id for the image connected to the word*/
    private int mresourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mresourceID = resourceID;
    }

    /** Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word. */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /** Get the resource id of the word */
    public int getResourceID(){return mresourceID;}

    public boolean hasImage() {
        return mresourceID != NO_IMAGE_PROVIDED;
    }
}
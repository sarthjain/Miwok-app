package com.example.android.miwok;

/**
 * Created by sarth on 7/29/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMivokTranslation;
    private int imageid;
    private int musicid;
    private boolean hasImage;

    public Word(String DeafultTranslation, String Mivoktranslation,int musicid)
    {
        mDefaultTranslation = DeafultTranslation;
        mMivokTranslation = Mivoktranslation;
        this.musicid=musicid;
        hasImage=false;
    }

    public Word(String DeafultTranslation, String Mivoktranslation,int id,int musicid)
    {
        mDefaultTranslation = DeafultTranslation;
        mMivokTranslation = Mivoktranslation;
        imageid=id;
        this.musicid=musicid;
        hasImage=true;
    }

    //get the defaut translation of word.
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    //get the mivok translation of word.
    public String getMivokTranslation()
    {
        return mMivokTranslation;
    }

    public int getImageId()
    {
        return imageid;
    }

    public int getMusicId(){return musicid;}

    public boolean haveImage()
    {
        return hasImage;
    }
}

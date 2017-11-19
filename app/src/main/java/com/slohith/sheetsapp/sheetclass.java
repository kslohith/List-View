package com.slohith.sheetsapp;

/**
 * Created by K.S.LOHITH on 19-11-2017.
 */

public class sheetclass {
    private String mainword;
    private String description;
   public sheetclass(String n,String b)
    {
        mainword = n;
        description = b;
    }
    public String getMainword()
    {
        return mainword;
    }
    public String getDescription()
    {
        return description;
    }
}

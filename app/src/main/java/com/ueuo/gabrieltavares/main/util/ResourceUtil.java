package com.ueuo.gabrieltavares.main.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable getDrawableImage(Context context, String recursoString){
        Resources resources = context.getResources();
        int idDrawable = resources.getIdentifier(recursoString, DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDrawable);
    }

}

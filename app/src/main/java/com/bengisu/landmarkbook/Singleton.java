package com.bengisu.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {
    private Bitmap chosenImage;
    private static Singleton singleton;

    private Singleton(){

    }

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }
    public static Singleton getInstance() {//bu sinifin objesini al demek
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

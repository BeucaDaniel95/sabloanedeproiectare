package services;

import models.Element;

import java.util.concurrent.TimeUnit;
import java.lang.System.*;

public class Image implements Element {
    private String imageName;
    private long time;
    Image(String name) {
        time = System.currentTimeMillis();
        imageName = name;
        try {
            System.out.println("Image is being delayed: \n");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print()
    {
        System.out.println("Image with name: " + this.imageName);
    }

}

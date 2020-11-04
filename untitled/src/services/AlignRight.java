package services;
import models.Paragraph;

import models.Context;
public class AlignRight implements AlignStrategy {
    public void render(Paragraph p, Context c){
        System.out.println("Aligned with AlignRight: " + p.getText());
    }
}
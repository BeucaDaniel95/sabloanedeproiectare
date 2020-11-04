package services;

import models.Paragraph;

import models.Context;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph p, Context c){
        System.out.println("Aligned with AlignLeft: " + p.getText());
    }
}
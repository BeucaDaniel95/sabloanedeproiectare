package services;

import models.Paragraph;

import models.Context;

public class AlignCenter implements AlignStrategy{
    public void render(Paragraph p, Context c){
        System.out.println("Aligned with AlignCenter: " + p.getText());
    }
}
package domain;

import domain.model.Shape;

public class square extends Shape{
    private int width=0;

    public int getwidth(){

        return width;
    }
 public void setwidth(int newwidth){
    if (newwidth>=0)

    width =newwidth;
 }

    public int getheight(){
        return getwidth();
 }
 public void setheight(int newheight){
    setwidth(newheight);


 }
 

    
}



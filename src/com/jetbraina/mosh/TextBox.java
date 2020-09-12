package com.jetbraina.mosh;

public class TextBox extends UIControl {

    private String text ="";

    public TextBox() {
        super(true);
        System.out.println("Second it is pointing to textbox");
    }
    @Override
    public String toString(){
         return text;
    }

    public void setText(String text){
        this.text =text;
    }

    public void clear(){
        text = "";
    }

   /*public void check(){
        System.out.println("Textbox");
    }
*/
}

package com.jetbraina.mosh;

public class UIControl {

        boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled =isEnabled;
        System.out.println("First is pointing to uicontrol");
    }

    public void enable(){
           isEnabled =true;
       }

       public void disable(){
           isEnabled = false;
       }

       public boolean isEnabled(){
           return isEnabled;
       }

        public void check(){
            System.out.println("Uicontrol");
        }

}

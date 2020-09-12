package com.jetbraina.mosh;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  TextBox control = new TextBox(); //textbox class extends the ui control so it can uses those properties
        control.setText("printed from Uicontrol");
        control.disable();
        System.out.println(control.isEnabled());

       TextBox text = new TextBox();
       text.setText("hellowworld");  //overriding the tosttring method example
        System.out.println(text);
`

      UIControl control = new UIControl(true);
        TextBox textBox = new TextBox();
        show(textBox);
    } */

    // upcasting and downcating and instanceof


        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        System.out.println(point1.equals(point2));

        UIControl control = new UIControl(true);
        TextBox textBox = new TextBox();
        textBox.check();

//        UIControl control = new UIControl(true);
//        TextBox textBox = new TextBox();
        show(textBox);

 UIControl upcasting = new TextBox();
 upcasting.check();


    }
// control = testbox object
    // parent class reference varialble can hold the object of child class
    public static void show(UIControl control ) {
        if (control instanceof TextBox) {
            TextBox textBox = (TextBox) control;
            textBox.setText("hellow workd");
        }
        System.out.println(control);
    }

    }

/* <applet code="MaxOf3No" height=150 width=400>   </applet> */

import java.awt.*;

import java.applet.*;

publicclass MaxOf3No extends Applet

{

     TextField T1,T2,T3;

      

      publicvoid init(){

          T1 = new TextField(10);

          T2 = new TextField(10);

          T3 = new TextField(10);

          add(T1);

          add(T2);

          add(T3);

          T1.setText("0");

          T2.setText("0");

          T3.setText("0");

        }

        publicvoid paint(Graphics g){

             int a, b, c,result;

             String str;

             g.drawString("Enter value to Check the Maximum of 3 ",10,50);

             str=T1.getText();

             a=Integer.parseInt(str);

             str=T2.getText();

             b=Integer.parseInt(str);

             str=T3.getText();

             c=Integer.parseInt(str);

              g.setColor(Color.blue);

              if (a>b) {

                  if (a>c)

                      result=a;

                  else

                      result=c;

                }

            else{

                  if (b>c) 

                      result=b;

                  else

                      result=c;

              }

              g.drawString("Maximnum of 3 No is "+result,10,70);

              showStatus("MAXIMUM OF 3 NUMBERS");

            }

            public boolean action(Event e, Object o){

                  repaint();

                  returntrue;

            }

}

package lab2ex2;

import java.util.*;
import javax.swing.JOptionPane;

public class CanadaLottoTest {
    public static void main(String[] args){
        //HERE ISTODO auto-generated mehtod stub
        int runTime=5;

        for (int i =1; i<= runTime; i++) {
            CanadaLotto lottoNumber = new CanadaLotto();
            int lottoSum=Arrays.stream(lottoNumber.getRandLottoArray()).sum();
            int selectedVariable =Integer.parseInt(JOptionPane.showInputDialog("Choose a number between the range 1 to 27: "));

            if(selectedVariable  == lottoSum)
            {
                JOptionPane.showMessageDialog(null,"Congratulations you won!!");
                break;
            } else if (selectedVariable != lottoSum && i != runTime){
                JOptionPane.showMessageDialog(null, "Keep guessing....");
            }else{
                JOptionPane.showMessageDialog(null,"Sorry You Lost ! Better luck next time!");
            }

        }
    }

}

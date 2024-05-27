package lab2ex2;

import java.util.Random;

public class CanadaLotto {
    //Here is Fields
    private int [] randLottoArray;

    //Here is constructor
    public CanadaLotto(int [] randLottoNumber)
    {
        this.randLottoArray = randLottoNumber;
    }
    //Here is Getter
    public int[] getRandLottoArray(){
        return randLottoArray;
    }
    //Here is Mehtod to Generate Lottery Number
    public CanadaLotto(){
        randLottoArray = new int [3];
        Random randomNumber = new Random();

        for (int i = 1; i < randLottoArray.length; i++) {
            randLottoArray[i]=randomNumber.nextInt(9)+1;
        }
    }
}

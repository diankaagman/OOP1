/**
 * Description here
 *
 * @author Koen Lippe 500794493
 */

public class Kofferslot {
    private Letter letterlijst[];
    private Cijfer cijfer[];

    public Kofferslot(){
        Letter letterlijst[] = {};
        letterlijst[0] = new Letter();
        letterlijst[1] = new Letter();

        Cijfer cijfer = new Cijfer();
    }

    public Kofferslot(char firstLetter, char secondLetter, int cijfer){
        Letter letterlijst[] = {};
        letterlijst[0] = new Letter();
        letterlijst[1] = new Letter();

        letterlijst[0].setLetter(firstLetter);
        letterlijst[1].setLetter(secondLetter);

        Cijfer cijfer1 = new Cijfer();
        cijfer1.setCijfer(cijfer);
    }

/////////////////////////////////////////////////////// USE .volgende() not finished ///////////////////////////////////////////////////////
    public void volgende(){
        //Number is not 9 yet so increase number
        if(this.cijfer[0].getCijfer() < 9){
            this.cijfer[0].setCijfer(0);
        }
        //Number = 9 so increase some letters.
        else if(this.cijfer[0].getCijfer() == 9){

            //bot letters are 'Z' --> number to 0, both letters to 'A'
            if(letterlijst[1].getLetter() == 'Z' && letterlijst[0].getLetter() == 'Z'){
                this.cijfer[0].setCijfer(0);
                letterlijst[0].setLetter('A');
                letterlijst[1].setLetter('A');
            }
            //Only second letter = 'Z' --> set second letter tp 'A', increase second number. set number to 0 (number = 9)
            else if (letterlijst[1].getLetter() == 'Z'){
                letterlijst[1].setLetter('A');
                letterlijst[0].volgende();
                this.cijfer[0].setCijfer(0);
            }
            //Only number is 9 so set number to 0 and increase second number
            else {
                this.cijfer[0].setCijfer(0);
                letterlijst[1].volgende();
            }

        }

    }
}
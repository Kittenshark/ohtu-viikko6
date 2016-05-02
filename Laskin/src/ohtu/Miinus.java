package ohtu;

import static java.lang.Integer.parseInt;
import javax.swing.JTextField;

public class Miinus implements Komento{
    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    int arvo;
    
    public Miinus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }


    @Override
    public void suorita() {
        arvo = parseInt(syotekentta.getText());
        sovellus.miinus(arvo);
        
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(arvo);
        
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }
}

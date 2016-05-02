package ohtu;

import static java.lang.Integer.parseInt;
import javax.swing.JTextField;

public class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    int arvo;
    
    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    

    @Override
    public void suorita() {
        arvo = parseInt(syotekentta.getText());
        sovellus.plus(arvo);
        
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.miinus(arvo);
        
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }
    
}

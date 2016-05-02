package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento{
    Sovelluslogiikka sovellus;
    JTextField tuloskentta; 
    JTextField syotekentta;
    int tulos;
    
    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        tulos = sovellus.tulos();
        sovellus.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        sovellus.plus(tulos);
        
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }
    
}

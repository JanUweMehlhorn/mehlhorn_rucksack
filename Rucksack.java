
public class Rucksack
{  
    private String farbe;
    private int volumen;
    private boolean wasserdicht;
    private boolean reflektierend;
    private int preis;

    public Rucksack(String farbe, boolean wasserdicht, boolean reflektierend, int volumen, int preis)
    {
        setFarbe(farbe);
        setWasserdicht(wasserdicht);
        setReflektierend(reflektierend);
        setVolumen(volumen);
        setPreis(preis);
    } 

    public Rucksack(String farbe, boolean wasserdicht,int volumen)
    {
        setFarbe(farbe);
        setWasserdicht(wasserdicht);
        setVolumen(volumen);
        setReflektierend(false);
        setPreis(60);
    }

    public Rucksack(String farbe, boolean wasserdicht)
    {
        setFarbe(farbe);
        setWasserdicht(wasserdicht);
        setReflektierend(false);
        setVolumen(1);
        setPreis(60);
    }

    /* Dieser Konstruktor kann wegen gleicher Signatur nicht implementiert werden

    public Rucksack(String Farbe, boolean Reflektierend, int Volumen)
    {
    setFarbe(Farbe);
    setReflektierend(Reflektierend);
    setVolumen(Volumen);
    }
     */
    public  Rucksack(String farbe, int volumen, boolean reflektierend) 
    {
        setFarbe(farbe);
        setWasserdicht(false);
        setReflektierend(reflektierend);
        setVolumen(volumen);
        setPreis(60);
    }

    public Rucksack(String farbe)                                                                                  
    {
        setFarbe(farbe);
        setWasserdicht(false);
        setReflektierend(false);
        setVolumen(1);
        setPreis(60);
    }

    Rucksack()
    {
        setFarbe("UNKN");
        setWasserdicht(false);
        setReflektierend(false);
        setVolumen(1);
        setPreis(60);
    }

    public String getFarbe()
    {
        return this.farbe;
    }

    public int getVolumen()
    {
        return this.volumen;
    }

    public boolean getWasserdicht()
    {
        return this.wasserdicht;
    }

    public boolean getReflektierend()
    {
        return this.reflektierend;
    }

    public int getPreis()
    {
        return this.preis;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }

    public void setVolumen(int volumen)
    {
        if ((volumen >= 1) && (volumen < 150))
        {
            this.volumen = volumen;
        }
        else
        {
            System.out.println("Fehler: das Volumen muss zwischen 1 und 150 sein!");
            this.volumen = 1;
        }
    }

    public void setWasserdicht(boolean wasserdicht)
    {
        this.wasserdicht = wasserdicht;
    }

    public void setReflektierend(boolean reflektierend)
    {
        this.reflektierend = reflektierend;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    public void printRucksack()
    {
        if (wasserdicht == true)
        {
            System.out.println("Rucksack: " + farbe + " - " + volumen + " Liter - " + "wasserdicht");
        }
        else
        {
            System.out.println("Rucksack: " + farbe + " - " + volumen + " Liter - " + "nicht wasserdicht");
        }

    }
}
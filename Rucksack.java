
public class Rucksack
{  
    private String farbe;
    private int volumen;
    private boolean wasserdicht;
    private boolean reflektierend;
    private int preis;

    public Rucksack(String neuFarbe, boolean neuWasserdicht, boolean neuReflektierend, int neuVolumen, int neuPreis)
    {
        setFarbe(neuFarbe);
        setWasserdicht(neuWasserdicht);
        setReflektierend(neuReflektierend);
        setVolumen(neuVolumen);
        setPreis(neuPreis);
    } 

    public Rucksack(String neuFarbe, boolean neuWasserdicht,int neuVolumen)
    {
        setFarbe(neuFarbe);
        setWasserdicht(neuWasserdicht);
        setVolumen(neuVolumen);
        setReflektierend(false);
        setPreis(60);
    }

    public Rucksack(String neuFarbe, boolean neuWasserdicht)
    {
        setFarbe(neuFarbe);
        setWasserdicht(neuWasserdicht);
        setReflektierend(false);
        setVolumen(1);
        setPreis(60);
    }

    /* Dieser Konstruktor kann wegen gleicher Signatur nicht implementiert werden

    public Rucksack(String neuFarbe, boolean neuReflektierend, int neuVolumen)
    {
    setFarbe(neuFarbe);
    setReflektierend(neuReflektierend);
    setVolumen(neuVolumen);
    }
     */
    public  Rucksack(String neuFarbe, int neuVolumen, boolean neuReflektierend) 
    {
        setFarbe(neuFarbe);
        setWasserdicht(false);
        setReflektierend(neuReflektierend);
        setVolumen(neuVolumen);
        setPreis(60);
    }

    public Rucksack(String neuFarbe)                                                                                  
    {
        setFarbe(neuFarbe);
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
        this.volumen = volumen;
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
        System.out.println(farbe + " Rucksack: " + volumen + " Liter - " + wasserdicht);
    }
}
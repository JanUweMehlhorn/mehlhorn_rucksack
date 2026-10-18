
public class Rucksack
{  
    private String farbe;
    private int volumen;
    private boolean wasserdicht;

    public Rucksack(String farbe, int volumen, boolean wasserdicht)
    {
        setFarbe(farbe);
        setVolumen(volumen);
        setWasserdicht(wasserdicht);
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
}
package com.development.jordan.pap;

/**
 * Created by Jordan on 13.07.2015.
 */
public class Player
{
    int id;
    String gameName;
    String spielerName;
    String beruf;
    String geschlecht;
    String alter;
    String koerpergroesse;
    String gewicht;
    String schuhgroesse;
    String koerperkraft;
    String ausdauer;
    String geschwindigkeit;
    String intelligenz;
    String charme;
    String geistigeGesundheit;
    String lebensenergie;
    String mentaleBelastbarkeit;
    String nahkampf;
    String distanz;
    String parade;
    String initiative;

    public Player(int i,String stringABC, String string, String cursorString, String s, String string1, String cursorString1, String s1, String string2, String cursorString2, String s2, String string3, String cursorString3, String s3, String string4, String cursorString4, String s4, String string5, String cursorString5, String s5, String string6, String cursorString6){}

    public Player (
                    int id,
                    String gameName,
                    String name,
                    String beruf,
                    String geschlecht,
                    String alter,
                    String koerpergroesse,
                    String gewicht,
                    String schuhgroesse,
                    String koerperkraft,
                    String ausdauer,
                    String geschwindigkeit,
                    String intelligenz,
                    String charme,
                    String geistigeGesundheit,
                    String lebensenergie,
                    String mentaleBelastbarkeit,
                    String nahkampf,
                    String distanz,
                    String parade,
                    String initiative)
    {
        this.id = id;
        this.gameName = gameName;
        this.spielerName = name;
        this.beruf = beruf;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.koerpergroesse = koerpergroesse;
        this.gewicht = gewicht;
        this.schuhgroesse = schuhgroesse;
        this.koerperkraft = koerperkraft;
        this.ausdauer = ausdauer;
        this.geschwindigkeit = geschwindigkeit;
        this.intelligenz = intelligenz ;
        this.charme = charme;
        this.geistigeGesundheit = geistigeGesundheit;
        this.lebensenergie = lebensenergie;
        this.mentaleBelastbarkeit = mentaleBelastbarkeit;
        this.nahkampf = nahkampf;
        this.distanz = distanz;
        this.parade = parade;
        this.initiative = initiative;
    }

    public Player (
            String gameName,
            String name,
            String beruf,
            String geschlecht, String alter,
            String koerpergroesse,
            String gewicht,
            String schuhgroesse,
            String koerperkraft,
            String ausdauer,
            String geschwindigkeit,
            String intelligenz,
            String charme,
            String geistigeGesundheit,
            String lebensenergie,
            String mentaleBelastbarkeit,
            String nahkampf,
            String distanz,
            String parade,
            String initiative)
    {
        this.gameName = gameName;
        this.spielerName = name;
        this.beruf = beruf;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.koerpergroesse = koerpergroesse;
        this.gewicht = gewicht;
        this.schuhgroesse = schuhgroesse;
        this.koerperkraft = koerperkraft;
        this.ausdauer = ausdauer;
        this.geschwindigkeit = geschwindigkeit;
        this.intelligenz = intelligenz ;
        this.charme = charme;
        this.geistigeGesundheit = geistigeGesundheit;
        this.lebensenergie = lebensenergie;
        this.mentaleBelastbarkeit = mentaleBelastbarkeit;
        this.nahkampf = nahkampf;
        this.distanz = distanz;
        this.parade = parade;
        this.initiative = initiative;
    }

    public Player(){}

    public  void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    public String getGameName()
    {
        return this.gameName;
    }

    public  void setSpielerName(String name)
    {
        this.spielerName = name;
    }

    public String getSpielerName()
    {
        return this.spielerName;
    }

    public void setBeruf(String b)
    {
        this.beruf = b;
    }

    public String getBeruf()
    {
        return this.beruf;
    }

    public void setGeschlecht(String g)
    {
        this.geschlecht = g;
    }

    public String getGeschlecht()
    {
        return this.geschlecht;
    }

    public void setAlter(String a)
    {
        this.alter = a;
    }

    public String getAlter()
    {
        return this.alter;
    }

    public void setKoerpergroesse(String k)
    {
        this.koerpergroesse = k;
    }

    public String getKoerpergroesse()
    {
        return this.koerpergroesse;
    }

    public void setGewicht(String g)
    {
        this.gewicht = g;
    }

    public String getGewicht()
    {
        return this.gewicht;
    }

    public void setSchuhgroesse(String s)
    {
        this.schuhgroesse = s;
    }

    public String getSchuhgroesse()
    {
        return this.schuhgroesse;
    }

    public void setKoerperkraft(String kk)
    {
        this.koerperkraft = kk;
    }

    public String getKoerperkraft()
    {
        return this.koerperkraft;
    }

    public void setAusdauer(String ausd)
    {
        this.ausdauer = ausd;
    }

    public String getAusdauer()
    {
        return this.ausdauer;
    }

    public void setGeschwindigkeit(String g)
    {
        this.geschwindigkeit = g;
    }

    public String getGeschwindigkeit()
    {
        return this.geschwindigkeit;
    }

    public void setIntelligenz(String intel)
    {
        this.intelligenz = intel;
    }

    public String getIntelligenz()
    {
        return this.intelligenz;
    }

    public void setCharme(String c)
    {
        this.charme = c;
    }

    public String getCharme()
    {
        return this.charme;
    }

    public void setGeistigeGesundheit(String gg)
    {
        this.geistigeGesundheit = gg;
    }

    public String getGeistigeGesundheit()
    {
        return this.geistigeGesundheit;
    }

    public void setLebensenergie(String le)
    {
        this.lebensenergie = le;
    }

    public String getLebensenergie()
    {
        return this.lebensenergie;
    }

    public void setMentaleBelastbarkeit(String mb)
    {
        this.mentaleBelastbarkeit = mb;
    }

    public String getMentaleBelastbarkeit()
    {
        return this.mentaleBelastbarkeit;
    }

    public void setNahkampf(String nk)
    {
        this.nahkampf = nk;
    }

    public String getNahkampf()
    {
        return this.nahkampf;
    }

    public void setDistanz(String d)
    {
        this.distanz = d;
    }

    public String getDistanz()
    {
        return this.distanz;
    }

    public void setParade(String p)
    {
        this.parade = p;
    }

    public String getParade()
    {
        return this.parade;
    }

    public void setInitiative(String init)
    {
        this.initiative = init;
    }

    public String getInitiative()
    {
        return this.initiative;
    }
}


class Assign {
    public static void main(String[] args) {
        State s = new State("pune", "maharashtra", "india", "asia");
        System.out.println(s.details());
        
    }
}

class Continent
{
    public String continentName;
    public Continent(String c)
    {
        continentName = c;
    }
}
class Country extends Continent
{
    public String countryName;
    public Country(String cy, String ct)
    {
        super(ct);
        countryName = cy;
    }
}
class State extends Country
{
    public String stateName;
    public String placeName;
    public State(String pl, String st, String cy, String ct)
    {
        super(cy, ct);
        placeName = pl;
        stateName = st;
    }
    public String details()
    {
        return String.format("Place: %s\nState:%s\nCountry:%s\nContinent:%s",placeName,stateName,countryName,continentName);
    }
}
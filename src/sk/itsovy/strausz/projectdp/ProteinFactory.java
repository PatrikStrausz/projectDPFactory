package sk.itsovy.strausz.projectdp;

public class ProteinFactory {

    public Protein getProtein(String type) {

        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Whey")) {
            return new Whey();
        } else if (type.equalsIgnoreCase("Egg")) {
            return new Egg();
        } else if (type.equalsIgnoreCase("Casein")) {
            return new Casein();
        }
        return null;
    }


}

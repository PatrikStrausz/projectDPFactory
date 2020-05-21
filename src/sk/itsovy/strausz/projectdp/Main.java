package sk.itsovy.strausz.projectdp;

public class Main {

    public static void main(String[] args) {
        ProteinFactory proteinFactory = new ProteinFactory();
	Protein p1 = proteinFactory.getProtein("Whey");
	Protein p2 = proteinFactory.getProtein("Egg");
	Protein p3 = proteinFactory.getProtein("Casein");

	p1.print();
	p2.print();
	p3.print();

    }
}

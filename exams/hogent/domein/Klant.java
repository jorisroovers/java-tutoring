package hogent.domein;

public class Klant {

	private String naam;

	private boolean klantenkaart;

	private double totaalAankopen;

	private double kortingpercentage;

	public Klant(String naam, boolean klantenkaart) {
		super();
		this.naam = naam;
		this.klantenkaart = klantenkaart;
		this.totaalAankopen = 0.0;
		this.kortingpercentage = 0.0;
	}

	public Klant() {
		// roep een andere constructor aan met this()
		this("onbekend", false);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean getKlantenkaart() {
		return klantenkaart;
	}

	public void setKlantenkaart(boolean klantenkaart) {
		this.klantenkaart = klantenkaart;
	}

	public double getKortingpercentage() {
		return kortingpercentage;
	}

	public void bepaalKortingPercentage() {
		if (totaalAankopen >= 20000) {
			this.kortingpercentage = 0.2;
		} else if (totaalAankopen >= 15000) {
			this.kortingpercentage = 0.15;
		} else if (totaalAankopen >= 10000) {
			this.kortingpercentage = 0.1;
		} else {
			// indien geen enkele van de bovenstaande if's waar is,
			// dan kan totaalAankopen enkel < 10000
			this.kortingpercentage = 0;
		}
	}

	public double registreerAankoop(double bedrag) {
		// indien de klant geen klantenkaart heeft, betaald hij het volledige bedrag
		double teBetalenBedrag = bedrag;
		if (klantenkaart) {
			// klant heeft wel een klantenkaart! Bepaal het bedrag met korting!
			double teBetalenPercentage = 1.0 - this.kortingpercentage;
			teBetalenBedrag = bedrag * teBetalenPercentage;
			// het is niet helemaal duidelijk uit de opgave op de totaalAankopen met het orginele of met het kortings
			// bedrag moet verhoogd worden.
			this.totaalAankopen += bedrag;
		}
		return teBetalenBedrag;
	}

	public String getKortingPercentage() {
		String kortingsPercentageStr = "nihil";
		if (this.kortingpercentage == 0.2) {
			kortingsPercentageStr = "premium";
		} else if (this.kortingpercentage == 0.15) {
			kortingsPercentageStr = "gold";
		} else if (this.kortingpercentage == 0.1) {
			kortingsPercentageStr = "silver";
		}
		// niet nodig om de case van this.kortingpercentage == 0 te behandelen met een aparte if omdat we
		// `kortingsPercentageStr` al met "0%" hebben geinitialiseerd.

		return kortingsPercentageStr;
	}

}

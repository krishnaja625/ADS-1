/**
 * Class for country teams details.
 * This is to 
 */
class CountryTeams implements Comparable<CountryTeams>{
	String countryname;
	int wins;
	int losses;
	int draws;
	CountryTeams(final String name, final int win, final int loss, final int draw) {
		countryname = name;
		wins = win;
		losses = loss;
		draws = draw;
	}
	public int compareTo(CountryTeams ct) {
		if (this.wins > ct.wins) {
			return 1;
		}
		if (this.wins < ct.wins) {
			return -1;
		}
		if (this.losses < ct.losses) {
			return 1;
		}
		if (this.losses > ct.losses) {
			return -1;
		}
		if (this.draws > ct.draws) {
			return 1;
		}
		if (this.draws < ct.draws) {
			return -1;
		}
		return 0;  
	}
	public String getName() {
		return this.countryname;
	}
}

/**
 * Class for country teams details.
 * This is to 
 */
class countryTeams implements Comparable<countryTeams>{
	String countryname;
	int wins;
	int losses;
	int draws;
	countryTeams(String name, int win, int loss, int draw) {
		countryname = name;
		wins = win;
		losses = loss;
		draws = draw;
	}
	public int compareTo(countryTeams ct) {
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

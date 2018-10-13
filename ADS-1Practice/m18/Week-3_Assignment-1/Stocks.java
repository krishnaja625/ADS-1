class Stocks implements Comparable<Stocks> {
	private String name;
	private Double perchange;
	Stocks(String name1, Double perchange1) {
		this.name = name1;
		this.perchange = perchange1;
	}
	String getName() {
		return this.name;
	}
	Double getperchange() {
		return this.perchange;
	}

	public String toString() {
		return this.name + " " + this.perchange;
	}
	
	public int compareTo(Stocks that) {
        if(this.perchange > that.perchange) {
        	return -1;
        }
        if( this.perchange < that.perchange) {
        	return 1;
        }
        if(this.name.compareTo(that.name) < 0) {
        	return -1;
        }
        if( this.name.compareTo(that.name) > 0) {
        	return 1;
        }
        return this.getName().compareTo(this.getName());
	}
}
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
        else if( this.perchange < that.perchange) {
        	return 1;
        }
        if(this.getName().compareTo(that.getName()) < 0) {
        	return -1;
        }
        if(this.getName().compareTo(that.getName()) > 0) {
        	return 1;
        }
        else{
        return this.getName().compareTo(this.getName());
    }
	}
}
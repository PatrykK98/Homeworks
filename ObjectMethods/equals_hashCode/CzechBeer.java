package equals_hashCode;

public class CzechBeer extends Beer {
	private String city;
	
	public CzechBeer(String name, String origin,String city, double alcAmount, double volume) {
		super(name, origin, alcAmount, volume);
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		return result;*/
		return 5*5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CzechBeer other = (CzechBeer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}


	
}

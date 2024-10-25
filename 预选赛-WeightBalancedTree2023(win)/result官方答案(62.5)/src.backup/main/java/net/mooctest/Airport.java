package net.mooctest;

// YOU SHOULD NOT MODIFY THIS FILE

/**
 * Airport object. An airport is represented by its:
 *   - 3-letter IATA code name (e.g., "LAX")
 *   - name (e.g., "Los Angeles International")
 *   - city (e.g., "Los Angeles"
 *   - country (e.g., "USA")
 *   - coordinates (x,y), given as longitude (-180...180) and latitude (-90...+90)
 */
public class Airport {

	// Private data (The x,y coordinates are provided by the Point2D class)
	
    private final String code; // IATA code
    private final String name; // airport name
    private final String city; // city
    private final String country; // country
	private final Point2D location; // coordinates

    /** Basic constructor.
     * @param code IATA code (String)
     * @param name full name (String)
     * @param city city (String)
     * @param country country (String)
     * @param x x-coordinate [longitude] (float)
     * @param y y-coordinate [latitude] (float)
     */
    public Airport(String code, String name, String city, String country, float x, float y) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;
        this.location = new Point2D(x, y);
    }
    
	/** Minimal constructor.
     * 
	 * @param code Airport's IATA code (String)
     */
	public Airport(String code) {
		this.code = code;
		this.name = "";
        this.city = "";
        this.country = "";
		this.location = new Point2D();
	}

    // Standard functions - Getters and toString
    public String getName() { return name; }

    public String getCode() { return code; }

    public String getCity() { return city; }

    public String getCountry() { return country; }

	public float getX() { return location.getX(); }
	
	public float getY() { return location.getY(); }
	
	public float getCoord(int i) { return location.get(i); }
	
	public Point2D getPoint2D() { return location; }
    
    public String toString() { return city; }
    
	/** Generate string according to desired format.
     * 
	 * @param format Formatting code
     */
    public String getString(String format) {
    	if (format.compareTo("default") == 0 || format.compareTo("") == 0) {
    		return toString();
    	}
    	else if (format.compareTo("code-only") == 0) {
    		return code;
    	}
    	else if (format.compareTo("full") == 0) {
    		return code + ", " + name + ", " + city + ", " + country + ", (" + location.getX() + "," + location.getY() + ")";
    	}
    	else if (format.compareTo("attributes") == 0) {
    		return name + ", " + city + ", " + country + ", (" + location.getX() + "," + location.getY() + ")";
    	}
    	else return "Invalid format!";
    }
}

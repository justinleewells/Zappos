package data;

public class URLCreator {
	public String apiKey = "&key=52ddafbe3ee659bad97fcce7c53592916a6bfd73";
	
	public String create(int page, int range){
		String rv = "";
		String pageString = "";
		String rangeString = "";
		
		pageString = "&page=" + page;
		
		switch(range){
		case 50:
			rangeString = "&filters={\"priceFacet\":\"$50.00 and Under\"}";
			break;
		case 100:
			rangeString = "&filters={\"priceFacet\":\"$100.00 and Under\"}";
			break;
		case 200:
			rangeString = "&filters={\"priceFacet\":\"$200.00 and Under\"}";
			break;
		case 201:
			rangeString = "&filters={\"priceFacet\":\"$200.00 and Over\"}";
			break;
		}
		
		rv = "http://api.zappos.com/Search/term/all?limit=100" + pageString + rangeString + "&sort={\"price\":\"desc\"}" + apiKey;
		return rv;
	}
}

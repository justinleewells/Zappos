package data;

public class Schema {
	public int lessThan50;
	public int lessThan100;
	public int lessThan200;
	public int moreThan200;
	
	public int lt50Pages;
	public int lt100Pages;
	public int lt200Pages;
	public int mt200Pages;
	
	public int lt50FinalPageSize;
	public int lt100FinalPageSize;
	public int lt200FinalPageSize;
	public int mt200FinalPageSize;
	
	public Schema(int a, int b, int c, int d) {
		lessThan50 	= a;
		lessThan100 = b - a;
		lessThan200 = c - b;
		moreThan200 = d;
		
		lt50Pages = lessThan50 / 100;
		lt50FinalPageSize = lessThan50 - (lt50Pages * 100);
		// lt50Pages++;
		lt100Pages = lessThan100 / 100;
		lt100FinalPageSize = lessThan100 - (lt100Pages * 100);
		// lt100Pages++;
		lt200Pages = lessThan200 / 100;
		lt200FinalPageSize = lessThan200 - (lt200Pages * 100);
		// lt200Pages++;
		mt200Pages = moreThan200 / 100;
		mt200FinalPageSize = moreThan200 - (mt200Pages * 100);
		// mt200Pages++;
	}
	
	public int getFinalPageSize(int range) {
		switch(range) {
		case 50:
			return lt50FinalPageSize;
		case 100:
			return lt100FinalPageSize;
		case 200:
			return lt200FinalPageSize;
		case 201:
			return mt200FinalPageSize;
		default:
			return 0;
		}
	}
	
	public int getNumberOfPages(int range) {
		switch(range) {
		case 50:
			return lt50Pages;
		case 100:
			return lt100Pages;
		case 200:
			return lt200Pages;
		case 201:
			return mt200Pages;
		default:
			return 0;
		}
	}
}

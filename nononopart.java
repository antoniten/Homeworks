package Homeworks;

public class nononopart extends nonopart {
	private String loc2name;
	 public String Getloc2name(){
		  loc2name = "Свалка";
		  return loc2name;
	  }
	 public int numbermutants(int vid1, int vid2) {
		    return vid1 + vid2;
		}
		 
		public int numbermutants(int vid1, int vid2, int vid3) {
		    return vid1 + vid2 + vid3;
		}


}

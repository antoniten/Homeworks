package Homeworks;

import java.util.Scanner;

public class nonopart {
	public static Scanner in = new Scanner(System.in); 
	
 private int standartartefact;
 private boolean stalkers;
 private boolean mainquestlocation;
 private String name;
 
  public int NumArtefact(){
	  standartartefact = 10;
	return standartartefact;
  }
 
  public void setmainquestlocation(){
	  mainquestlocation=false;
	  }
  public boolean getmainquestlocation(){
	  return mainquestlocation;
	  }
  
  public String Getname(){
	  name = "Наземная ";
	  return name;
  }
  public boolean Getstalkers(){
	  stalkers=false;
	  return stalkers;
	  }
}

package Homeworks;

public class mainpart {
	public static void main(String[] args) {
		nonopart standart  = new nonopart();
		nopart kordon = new nopart();
		nononopart svalka = new nononopart();
		if (standart.getmainquestlocation() == svalka.getmainquestlocation() ){
			System.out.println("Количество артефактов на локации "+svalka.Getloc2name()+" = "+svalka.NumArtefact());
			System.out.println(svalka.Getname()+"локация " + svalka.Getloc2name()+ " не задействована в основном сюжете игры");
			System.out.println("Суммарное количество 1го, 2го и 3го видов мутантов, проживающих на данной территории: "+svalka.numbermutants(4, 5, 8)+" особей");
			System.out.println("Суммарное количество 1го и 2го видов мутантов, проживающих на данной территории: "+svalka.numbermutants(4, 5)+" особей");
		}
		System.out.println();
		if (kordon.getmainquestlocation() == false){
			System.out.println("Количество артефактов на локации "+kordon.Getloc1name()+" = "+kordon.NumArtefact());
			System.out.println(kordon.Getname()+"локация " + kordon.Getloc1name()+ " не задействована в основном сюжете игры");
		}
	}
}

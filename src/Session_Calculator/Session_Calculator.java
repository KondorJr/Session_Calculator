package Session_Calculator;

class Equals{
	//Название предмета, имя препода
	public String nazv;
	public String name;
	//Числовые значения
	public int potochka;
	public int summa;
	public float chance;
}


public class Session_Calculator {
	Equals n = new Equals();
	
	
	public static Equals sum(int summa){
		Equals p = new Equals();
		p.potochka=1;
		p.summa= p.potochka*50;
		System.out.println("Summa = "+p);
		return p;
	}
	
	public static Equals chan(float chance){
		Equals s = new Equals();
		s.potochka=2;
		s.chance=(float) (s.potochka*2.125);
		System.out.println("Potochka = "+s);
		return s;
	}
	
	

	public static void main(String[] args) {
		
		Equals n = new Equals();
		n.name="Пукач";
		n.nazv="Жопонализ";
		float o = 0 ;
		chan(o);
		int b = 0;
		sum(b);

	}

}

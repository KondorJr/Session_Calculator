package Session_Calculator;

class Equals{
	//�������� ��������, ��� �������
	public String nazv;
	public String name;
	//�������� ��������
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
		n.name="�����";
		n.nazv="���������";
		float o = 0 ;
		chan(o);
		int b = 0;
		sum(b);

	}

}

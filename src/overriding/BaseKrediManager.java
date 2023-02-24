package overriding;

public class BaseKrediManager {
	public double Hesapla(double tutar) { //public double final yazsaydı eğer OgrenciKrediManager çalışmayacaktı. Final etmek method değerlerinin değiştirilemez olduğu anlamına gelir.
		return tutar * 1.18;
	}

}
//overridible






public class Operatoren {
	public static void main(String [] args){
		int a=15;
		int b=34;
		int c=1;
		System.out.println("1: "+ (a==b));			// false
		System.out.println("2: "+ (a==b-19));		// true -> minus vor Vergleich
		System.out.println("3: "+ (a^b));			// 45 -> bitwise xor
		System.out.println("4: "+ (a++^b));			// 45 -> bitwise xor, danach a+=1
		System.out.println("5: "+ (7<<++c));		// 28 -> 00111 wird zu 11100
		System.out.println("6: "+ (a=b=c=0x10));	// 0x10 == 16 -> Zuweisung gibt Wert zurück
		System.out.println("7: "+ (1e1));			// wiss. Notation: 1*10 hoch 1
	}
}


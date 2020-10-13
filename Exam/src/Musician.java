//Luka Bowen i6222534 Q3
public class Musician extends Person {
	Instrument instrument;
	Instrument[] instruments;


	public Musician(String name, Instrument instruments) {
		super(name);
		this.instrument = instruments;
		// TODO Auto-generated constructor stub
	}
	public Musician(String name, Instrument[] instruments) {
		super(name);
		this.instruments = instruments;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String str = "";
		if(instrument!=null) {
			str += instrument.name() ;
		}
		if(instruments!=null) {
			for(int i = 0; i<instruments.length;i++) {
				str += " " +instruments[i].name() +" " + "(" + instruments[i].type()+ ")";}
		}
		return str;

	}
	}




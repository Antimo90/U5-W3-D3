package riccardogulin.u5d13.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Mediaworld implements Subscriber {
	private String address;
	private String phoneNumber;

	@Override
	public void receiveNews(String message) {
		System.out.println("Salve siamo la Mediaworld");
		System.out.println("Con indirizzo " + address);
		System.out.println("Abbiamo ricevuto il seguente messaggio");
		System.out.println(message);
	}
}

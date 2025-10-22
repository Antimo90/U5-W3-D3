package riccardogulin.u5d13.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User implements Subscriber {
	private String name;
	private String surname;

	@Override
	public void receiveNews(String message) {
		System.out.println("Ciao sono " + this.name);
		System.out.println(message);
		System.out.println("Ah corro subito a comprarlo!");
	}
}

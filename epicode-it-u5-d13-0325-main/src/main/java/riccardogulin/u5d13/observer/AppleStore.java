package riccardogulin.u5d13.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AppleStore implements Subscriber {
	private String ownerName;

	@Override
	public void receiveNews(String message) {
		System.out.println(message);
		System.out.println("Inviatemene un milione!");
	}
}

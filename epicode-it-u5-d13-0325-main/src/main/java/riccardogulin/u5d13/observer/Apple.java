package riccardogulin.u5d13.observer;

import java.util.ArrayList;
import java.util.List;

public class Apple { // PUBLISHER
	private List<Subscriber> subscribers = new ArrayList<>();

	public void addSub(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	public void removeSub(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}

	public void makeAnnouncement(String message) {
		for (Subscriber subscriber : this.subscribers) {
			subscriber.receiveNews(message);
		}
	}
}

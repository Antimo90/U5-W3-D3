package riccardogulin.u5d13.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		User aldo = new User("Aldo", "Baglio");
		User giovanni = new User("Giovanni", "Storti");
		Mediaworld mediaworld = new Mediaworld("corso italia 3", "2o333232");
		AppleStore appleStore = new AppleStore("Ajeje Brazorf");

		Apple apple = new Apple();
		apple.addSub(aldo);
		// apple.addSub(giovanni);
		apple.addSub(mediaworld);
		apple.addSub(appleStore);

		apple.makeAnnouncement("E' uscito il nuovo MacBook Pro 123123");
	}
}

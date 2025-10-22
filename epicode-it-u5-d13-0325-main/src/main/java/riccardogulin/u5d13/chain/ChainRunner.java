package riccardogulin.u5d13.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		User user = new User("admin@gmail.com", "1234", "USER");

		LoggerFilter loggerFilter = new LoggerFilter();
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();
		AuthenticationFilter authenticationFilter = new AuthenticationFilter();

		// Imposto l'ordine di esecuzione dei filtri
		loggerFilter.setNext(authorizationFilter);
		authorizationFilter.setNext(authenticationFilter);

		// Faccio partire la catena
		loggerFilter.doFilter(user);
	}
}

package riccardogulin.u5d13.chain;

public class LoggerFilter extends BaseFilter {
	@Override
	public void doFilter(User user) {
		System.out.println("Ho ricevuto questo utente: " + user);
		this.next(user);
	}
}

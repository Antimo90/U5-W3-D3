package riccardogulin.u5d13.chain;

public class AuthorizationFilter extends BaseFilter {
	@Override
	public void doFilter(User user) {
		if (user.getRole().equals("ADMIN")) {
			System.out.println("WELCOME ADMIN!");
			this.next(user);
		} else {
			System.out.println("SOLO ADMIN POSSONO ACCEDERE!!!");
		}
	}
}

package riccardogulin.u5d13.chain;

import lombok.Setter;

@Setter
public abstract class BaseFilter {
	private BaseFilter next;

	public abstract void doFilter(User user);

	public void next(User user) {
		if (this.next != null) this.next.doFilter(user);
		else System.out.println("Siamo arrivati a fine catena!");
	}
}


public class ObserverTest {

	public static void main(String[] args) {
		User john = new User("John");
		User jack = new User("Jack");
		User david = new User("David");

		Netflix netflix = new Netflix();
		netflix.subscribe(john);
		netflix.subscribe(jack);
		netflix.subscribe(david);

		System.out.println("After subscribing 3 users ----------");
		netflix.addMovie();

		netflix.unsubscribe(jack);
		System.out.println("\nAfter unsubscribing Jack ----------");
		netflix.addMovie();
	}
}




package feature.book;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hascode.tutorial.cucumber.book.Book;
import com.hascode.tutorial.cucumber.book.Library;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class BookSearchSteps {
	Library library = new Library();
	List<Book> result = new ArrayList<>();

	/** Description of setSearchParameters(@Format("yyyy") final Date from, @Format("yyyy") final Date to)
	 *
	 * @param title			Description of position
	 * @param author			Description of title
	 * @param published			Description of published
	 */
	@Given(".+book with the title '(.+)', written by '(.+)', published in (.+)")
	public void addNewBook(final String title, final String author, @Format("dd MMMMM yyyy") final Date published) {
		Book book = new Book(title, author, published);
		library.addBook(book);
	}

		/** Description of setSearchParameters(@Format("yyyy") final Date from, @Format("yyyy") final Date to)
		 *
		 * @param from			Description of position
		 * @param to			Description of title
		 */
		@When("^the customer searches for books published between (\\d+) and (\\d+)$")
	public void setSearchParameters(@Format("yyyy") final Date from, @Format("yyyy") final Date to) {
		result = library.findBooks(from, to);
	}


	/** Description of verifyAmountOfBooksFound(final int booksFound)
	 *
	 * @param booksFound			Description of a
	 */
	@Then("(\\d+) books should have been found$")
	public void verifyAmountOfBooksFound(final int booksFound) {
		assertThat(result.size(), equalTo(booksFound));
	}

	/** Description of verifyBookAtPosition(final int position, final String title)
	 *
	 * @param position			Description of position
	 * @param title			Description of title
	 */
	@Then("Book (\\d+) should have the title '(.+)'$")
	public void verifyBookAtPosition(final int position, final String title) {
		assertThat(result.get(position - 1).getTitle(), equalTo(title));
	}

	/** Description of i_want_do_smth_with(String arg1)
	 *
	 * @param arg1			Description of a
	 */
	@Then("^i want do smth with \"([^\"]*)\"$")
	public void i_want_do_smth_with(String arg1){
		assertThat("All Ok", true);
	}

	@And("^want i do \"([^\"]*)\"$")
	public void want_i_do(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}
	
	@And("^i want save this string to Git$")
	public void want_i_do(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}


}

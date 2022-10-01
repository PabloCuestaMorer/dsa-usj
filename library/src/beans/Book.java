
package beans;

/**
 * @author pablo
 *
 */
public class Book {
	private String title;
	private int pages;

	/**
	 * Constructor.
	 * 
	 * @param title
	 * @param pages
	 */
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + "]";
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

}

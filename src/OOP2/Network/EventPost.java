package OOP2.Network;

public class EventPost extends Post{

	private String message;
	
	public EventPost(String author, String title, String location, String date, String time) {
		super(author);
		message = title + location + date + time;
	}
	
	public String getText()
    {
        return message;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
    	super.display();
        System.out.println(message);
    }
}

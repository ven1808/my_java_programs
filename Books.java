public class Books 
{
    public String title;
    public double price;
    public String author;
    public String ISBN;
    public String genre;

    public Books()
    {
        title = "Some Title";
        price = 0.00;
        author = "some author";
        genre = "uncategorized";
        ISBN = "ABCD1234";
    }

    public Books(String t, double p, String i, String g,String a)throws InvalidPriceException, InvalidTitleException
    {
        if(p<=0)
        {
            throw new InvalidPriceException("Price cannot be negative.");
        }
        if(t == null)
        {
            throw new InvalidTitleException("Title cant be null.");
        }
        title = t;
        price = p;
        ISBN = i;
        genre = g;
        author = a;
    }
    public Books(Books b)
    {
        title = b.title;
        price = b.price;
        ISBN = b.ISBN;
        author = b.author;
        genre = b.genre;
    }

    
}

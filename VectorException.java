public class VectorException extends Exception {
    public VectorException(String m) {
        super(m);
    }
}

//DimensionException is a child of Java’s built-in Exception class.
//The Exception class already has a constructor like this: Exception(String message)
//We are calling the parent class constructor and passing the message to it.
//eg : throw new DimensionException("Vectors must have same dimension.");
//"Vectors must have same dimension." is passed into m, super(m) sends it to the Exception class
/*Later, when you do: catch (DimensionException e) {
    System.out.println(e.getMessage());
}  
getMessage() returns that same string.*/
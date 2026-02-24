class Vector {
    private double[] components;
    //Declares an array to store vector values.
    //double[] allows decimal values like 2.5, 3.7 etc
    private int dimension; //private to protect it from outside modification.

    /*Constructor used to create a Vector object.
        Takes an array of numbers as input.
        throws VectorException → may throw custom exception if invalid input. */
    public Vector(double[] values) throws VectorException {
        if (values.length != 2 && values.length != 3) { //Checks array size., If length is NOT 2 AND NOT 3 → invalid vector.
            throw new VectorException("Only 2D or 3D vectors are allowed.");
        }

        dimension = values.length; //Stores dimension (2 or 3).
        components = new double[dimension]; //Creates a new array inside the object.

        for (int i = 0; i < dimension; i++) {
            components[i] = values[i];
        } //Copies input values into internal array, Done to keep the object’s data independent.
    }

    // Check dimension compatibility
    private void checkDimension(Vector v) throws VectorException { //Takes another Vector as parameter.
        if (this.dimension != v.dimension) { //Compares dimensions of both vectors.
            throw new VectorException("Vector dimensions must be the same.");
        }
    }

    // Add vectors
    public Vector add(Vector v) throws VectorException {
        checkDimension(v);
        double[] result = new double[dimension]; //Creates array to store sum.

        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] + v.components[i]; //Adds corresponding components.
        }
        return new Vector(result); //Creates and returns a new vector with summed values.
    }

    // Subtract vectors
    public Vector subtract(Vector v) throws VectorException {
        checkDimension(v);
        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] - v.components[i];
        }
        return new Vector(result);
    }

    // Dot product
    //Returns a single number, not a vector, That’s why return type is double.
    public double dotProduct(Vector v) throws VectorException {
        checkDimension(v);
        double result = 0; //initialising the result

        for (int i = 0; i < dimension; i++) {
            result += this.components[i] * v.components[i]; //Multiplies corresponding elements and adds them to result.
        }
        return result;
    }

    // Display vector
    public void display() {
        System.out.print("(");
        for (int i = 0; i < dimension; i++) {
            System.out.print(components[i]);
            if (i < dimension - 1) System.out.print(", ");
        }
        System.out.println(")");
    }
}


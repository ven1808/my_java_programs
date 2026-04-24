//Legacy Class 
class LegacyItem {
    private int itemId;
    private String description;

    //Parameterized Constructor
    public LegacyItem(int itemId, String description) {
        this.itemId = itemId;
        this.description = description;
    }

    //Existing method (incompatible with Product interface)
    public void print() {
        System.out.println("Legacy Item -> ID: " + itemId + ", Description: " + description);
    }
}
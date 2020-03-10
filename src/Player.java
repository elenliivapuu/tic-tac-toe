public class Player {

    private String name;
    private String symbol;
    private double score;

    public Player(String name, String symbol) {
        this.name = name;
        if (symbol.equals("X") || symbol.equals("O")) {
            this.symbol = symbol;
        } else {
            System.err.println("Ebasobilik sümbol!");
            System.exit(1);
        }
    }

}

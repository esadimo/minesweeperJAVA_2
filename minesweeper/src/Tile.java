
public class Tile
{
    private static final String flag = "F";
    private final int[][] neighbors = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    private boolean flagged = false;
    private final boolean revealed;
    private final int[][] position;
    public Tile()
    {
        this.flagged = false;
        this.revealed = false;
        position = new int[0][];
    }

    public int[][] getPosition()
    {
        return position;
    }

    public boolean isRevealed()
    {
        return revealed;
    }

    public void click()
    {
    }

    public void flag()
    {

    }

}

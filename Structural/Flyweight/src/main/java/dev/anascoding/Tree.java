package dev.anascoding;

// this is the unique state  - each Tree Object can have its OWN x,z
public final class Tree
{
    private final int x;
    private final int y;
    private final TreeType treeType;

    public Tree(int x, int y, TreeType treeType)
    {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
}

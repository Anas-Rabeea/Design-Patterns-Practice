package dev.anascoding;

// to make the share state object immutable between the unique state objects
public final class TreeType
{
    private final String name;
    private final String texture;
    private final String model;

    public TreeType(String name, String texture, String model)
    {
        this.name = name;
        this.texture = texture;
        this.model = model;
    }
}

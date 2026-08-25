package dev.anascoding;

import java.util.HashMap;
import java.util.Map;

// Factory to return only ONE shared immutable state between all the unique states
// final class to make clients not able to change anything in it
public final class TreeTypeFactory
{

    // we can have multiple Shared States so we create a hashmap of them
    private final Map<String, TreeType> cache = new HashMap<>();

    public TreeType getTreeTypeSharedInstance(
      String name,
      String texture,
      String model
    )
    {
        // add the TreeType Instance in the HashMap if not exist
        // if exist return the ONE Singular TreeType that is existed already and shared
            // between the same unique states
        return cache.computeIfAbsent(name, k -> new TreeType(name,texture,model));
    }

//    The factory/registry guarantees:
//
//    Oak   → one shared TreeType
//    Pine  → one shared TreeType
//    Birch → one shared TreeType


}

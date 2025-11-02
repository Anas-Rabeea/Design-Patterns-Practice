package org.servlet;


public class Main {
    public static void main(String[] args) {

        // singleton example
        // 1. LAZY
        ThreadSafeLogger logger1 = ThreadSafeLogger.getInstance();
        ThreadSafeLogger logger2 = ThreadSafeLogger.getInstance();

        // logger1 and logger2 are both the same instance
        System.out.println(logger1 == logger2);
        logger1.log("logger1 use the same instance");
        logger2.log("logger2 use the same instance");

        EnumLogger.INSTANCE.log("anything from only one isntance ");

    }


    /*

    | Approach               | Thread-Safe | Lazy? | Common Use                   |
| ---------------------- | ----------- | ----- | ---------------------------- |
| Classic (lazy)         | ❌           | ✅     | Simple demos                 |
| Synchronized           | ✅           | ✅     | Simple apps                  |
| Double-Checked Locking | ✅           | ✅     | Real-world use               |
| Eager                  | ✅           | ❌     | When instance is lightweight |
| Enum                   | ✅           | ❌     | Modern best practice         |



     */
}
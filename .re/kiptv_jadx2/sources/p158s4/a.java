package p158s4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public abstract class a {

    public static final Logger f27265a = Logger.getLogger(a.class.getName());

    public static final AtomicBoolean f27266b = new AtomicBoolean(false);

    public static boolean a() {
        return f27266b.get();
    }
}

package p057g2;

import com.google.android.gms.internal.play_billing.M0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class d {

    public final c f21858a = new c();

    public final LinkedHashMap f21859b = new LinkedHashMap();

    public final LinkedHashSet f21860c = new LinkedHashSet();

    public volatile boolean f21861d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                M0.v(autoCloseable);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}

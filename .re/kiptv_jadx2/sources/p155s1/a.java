package p155s1;

import java.util.concurrent.CancellationException;

public final class a {

    public static final a f27224b;

    public static final a f27225c;

    public final CancellationException f27226a;

    static {
        if (g.f27240k) {
            f27225c = null;
            f27224b = null;
        } else {
            f27225c = new a(false, null);
            f27224b = new a(true, null);
        }
    }

    public a(boolean z6, CancellationException cancellationException) {
        this.f27226a = cancellationException;
    }
}

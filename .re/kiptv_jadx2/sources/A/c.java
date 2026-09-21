package A;

import java.util.concurrent.CancellationException;
import p089k0.f;

public abstract class c extends CancellationException {

    public final int f10h;

    public c(String str, int i3) {
        super(str);
        this.f10h = i3;
    }

    @Override
    public final Throwable fillInStackTrace() {
        switch (this.f10h) {
            case 0:
                setStackTrace(d.f11a);
                break;
            case 1:
                setStackTrace(N0.b.f7297a);
                break;
            default:
                setStackTrace(f.f24412b);
                break;
        }
        return this;
    }
}

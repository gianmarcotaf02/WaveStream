package S7;

import java.util.concurrent.CancellationException;

public final class B0 extends CancellationException implements InterfaceC0904u {

    public final transient C0 f9525h;

    public B0(String str, C0 c9) {
        super(str);
        this.f9525h = c9;
    }

    @Override
    public final Throwable createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        B0 b9 = new B0(message, this.f9525h);
        b9.initCause(this);
        return b9;
    }
}

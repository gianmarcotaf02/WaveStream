package p036d8;

import kotlin.jvm.internal.m;

public final class a extends IllegalArgumentException {
    public a(String msg, int i3) {
        super(msg);
        switch (i3) {
            case 1:
                m.e(msg, "msg");
                super(msg);
                break;
            default:
                m.e(msg, "message");
                break;
        }
    }

    public a(String message, Exception exc) {
        super(message, exc);
        m.e(message, "message");
    }
}

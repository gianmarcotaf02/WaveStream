package p019c;

import D1.C;
import Y6.f;
import android.window.BackEvent;

public final class a {

    public final float f18026a;

    public final float f18027b;

    public final float f18028c;

    public final int f18029d;

    public a(BackEvent backEvent) {
        float fN = C.n(backEvent);
        float fO = C.o(backEvent);
        float fI = C.i(backEvent);
        int iM = C.m(backEvent);
        this.f18026a = fN;
        this.f18027b = fO;
        this.f18028c = fI;
        this.f18029d = iM;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f18026a);
        sb.append(", touchY=");
        sb.append(this.f18027b);
        sb.append(", progress=");
        sb.append(this.f18028c);
        sb.append(", swipeEdge=");
        return f.j(sb, this.f18029d, '}');
    }
}

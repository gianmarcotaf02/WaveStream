package t8;

import Y2.C1038h;
import java.util.LinkedHashMap;
import p070h6.C2180b;

public final class G extends p117n6.c {

    public C2180b f28568h;

    public C1038h f28569i;
    public LinkedHashMap j;

    public String f28570k;

    public Object f28571l;

    public final C1038h f28572m;

    public int f28573n;

    public G(C1038h c1038h, p117n6.a aVar) {
        super(aVar);
        this.f28572m = c1038h;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f28571l = obj;
        this.f28573n |= Integer.MIN_VALUE;
        return C1038h.d(this.f28572m, null, this);
    }
}

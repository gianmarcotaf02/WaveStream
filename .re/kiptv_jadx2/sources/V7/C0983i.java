package V7;

import O1.C0754s;
import java.util.Iterator;

public final class C0983i extends p117n6.c {

    public Object f10464h;

    public int f10465i;
    public final C0754s j;

    public InterfaceC0982h f10466k;

    public Iterator f10467l;

    public C0983i(C0754s c0754s, p100l6.c cVar) {
        super(cVar);
        this.j = c0754s;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10464h = obj;
        this.f10465i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}

package p005a5;

import com.kiptv.core.model.XtreamSeries;
import p117n6.c;

public final class D3 extends c {

    public J3 f13306h;

    public String f13307i;
    public XtreamSeries j;

    public int f13308k;

    public Object f13309l;

    public final J3 f13310m;

    public int f13311n;

    public D3(J3 j9, c cVar) {
        super(cVar);
        this.f13310m = j9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13309l = obj;
        this.f13311n |= Integer.MIN_VALUE;
        return this.f13310m.a(0, null, null, this);
    }
}

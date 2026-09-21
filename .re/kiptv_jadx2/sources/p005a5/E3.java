package p005a5;

import com.kiptv.core.model.XtreamSeries;
import p117n6.c;

public final class E3 extends c {

    public J3 f13340h;

    public String f13341i;
    public XtreamSeries j;

    public String f13342k;

    public Object f13343l;

    public final J3 f13344m;

    public int f13345n;

    public E3(J3 j9, c cVar) {
        super(cVar);
        this.f13344m = j9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13343l = obj;
        this.f13345n |= Integer.MIN_VALUE;
        return this.f13344m.c(null, null, null, this);
    }
}

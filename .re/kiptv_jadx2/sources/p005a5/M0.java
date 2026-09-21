package p005a5;

import com.kiptv.core.model.I0;
import com.kiptv.core.repository.a;
import java.util.HashMap;
import java.util.Iterator;
import p117n6.c;
import p194x6.m;

public final class M0 extends c {

    public a f13641h;

    public String f13642i;
    public m j;

    public m f13643k;

    public HashMap f13644l;

    public Iterator f13645m;

    public I0 f13646n;

    public int f13647o;

    public Object f13648p;

    public final a f13649q;

    public int f13650r;

    public M0(a aVar, c cVar) {
        super(cVar);
        this.f13649q = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13648p = obj;
        this.f13650r |= Integer.MIN_VALUE;
        return this.f13649q.f(null, null, null, null, this);
    }
}

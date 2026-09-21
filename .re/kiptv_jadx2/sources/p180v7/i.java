package p180v7;

import B7.m;
import E6.u;
import L7.g;
import N6.N;
import Q6.AbstractC0793b;
import Q6.L;
import V6.c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.B;
import p000a.a;
import p078i6.w;
import p101l7.e;
import p194x6.j;

public abstract class i extends p {

    public static final u[] f29683d = {B.f24540a.h(new kotlin.jvm.internal.u(i.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    public final AbstractC0793b f29684b;

    public final B7.i f29685c;

    public i(m storageManager, AbstractC0793b abstractC0793b) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f29684b = abstractC0793b;
        this.f29685c = new B7.i(storageManager, new g(0, this));
    }

    @Override
    public final Collection a(f kindFilter, j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return !kindFilter.a(f.f29671n.f29678b) ? w.f23205h : (List) a.v(this.f29685c, f29683d[0]);
    }

    @Override
    public final Collection b(e name, V6.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) a.v(this.f29685c, f29683d[0]);
        if (list.isEmpty()) {
            return w.f23205h;
        }
        g gVar = new g();
        for (Object obj : list) {
            if ((obj instanceof L) && kotlin.jvm.internal.m.a(((L) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override
    public final Collection e(e name, c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) a.v(this.f29685c, f29683d[0]);
        if (list.isEmpty()) {
            return w.f23205h;
        }
        g gVar = new g();
        for (Object obj : list) {
            if ((obj instanceof N) && kotlin.jvm.internal.m.a(((N) obj).getName(), name)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public abstract List h();
}

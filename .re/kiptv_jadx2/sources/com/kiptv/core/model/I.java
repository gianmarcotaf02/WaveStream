package com.kiptv.core.model;

import java.util.List;

public final class I {

    public final List f19797a;

    public final List f19798b;

    public final List f19799c;

    public final List f19800d;

    public I(int i3, List list, List list2, List list3) {
        int i9 = i3 & 1;
        p078i6.w wVar = p078i6.w.f23205h;
        this(i9 != 0 ? wVar : list, (i3 & 2) != 0 ? wVar : list2, (i3 & 4) != 0 ? wVar : list3, wVar);
    }

    public final boolean a() {
        return this.f19797a.isEmpty() && this.f19798b.isEmpty() && this.f19799c.isEmpty() && this.f19800d.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return kotlin.jvm.internal.m.a(this.f19797a, i3.f19797a) && kotlin.jvm.internal.m.a(this.f19798b, i3.f19798b) && kotlin.jvm.internal.m.a(this.f19799c, i3.f19799c) && kotlin.jvm.internal.m.a(this.f19800d, i3.f19800d);
    }

    public final int hashCode() {
        return this.f19800d.hashCode() + B2.a.b(B2.a.b(this.f19797a.hashCode() * 31, 31, this.f19798b), 31, this.f19799c);
    }

    public final String toString() {
        return "IntroDBResult(intro=" + this.f19797a + ", recap=" + this.f19798b + ", credits=" + this.f19799c + ", preview=" + this.f19800d + ")";
    }

    public I(List intro, List recap, List credits, List preview) {
        kotlin.jvm.internal.m.e(intro, "intro");
        kotlin.jvm.internal.m.e(recap, "recap");
        kotlin.jvm.internal.m.e(credits, "credits");
        kotlin.jvm.internal.m.e(preview, "preview");
        this.f19797a = intro;
        this.f19798b = recap;
        this.f19799c = credits;
        this.f19800d = preview;
    }
}

package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f19797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f19798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f19799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f19800d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(int i3, java.util.List list, java.util.List list2, java.util.List list3) {
        int i9 = i3 & 1;
        p078i6.w wVar = p078i6.w.f23205h;
        this(i9 != 0 ? wVar : list, (i3 & 2) != 0 ? wVar : list2, (i3 & 4) != 0 ? wVar : list3, wVar);
    }

    public final boolean a() {
        return this.f19797a.isEmpty() && this.f19798b.isEmpty() && this.f19799c.isEmpty() && this.f19800d.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.I)) {
            return false;
        }
        com.kiptv.core.model.I i3 = (com.kiptv.core.model.I) obj;
        return kotlin.jvm.internal.m.a(this.f19797a, i3.f19797a) && kotlin.jvm.internal.m.a(this.f19798b, i3.f19798b) && kotlin.jvm.internal.m.a(this.f19799c, i3.f19799c) && kotlin.jvm.internal.m.a(this.f19800d, i3.f19800d);
    }

    public final int hashCode() {
        return this.f19800d.hashCode() + B2.a.b(B2.a.b(this.f19797a.hashCode() * 31, 31, this.f19798b), 31, this.f19799c);
    }

    public final java.lang.String toString() {
        return "IntroDBResult(intro=" + this.f19797a + ", recap=" + this.f19798b + ", credits=" + this.f19799c + ", preview=" + this.f19800d + ")";
    }

    public I(java.util.List intro, java.util.List recap, java.util.List credits, java.util.List preview) {
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

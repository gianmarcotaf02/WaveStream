package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1512t implements java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC1514v f16255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.AbstractC1514v f16256i;

    public AbstractC1512t(androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v) {
        this.f16255h = abstractC1514v;
        if (abstractC1514v.g()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16256i = abstractC1514v.i();
    }

    public final androidx.datastore.preferences.protobuf.AbstractC1514v a() {
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514vB = b();
        abstractC1514vB.getClass();
        if (androidx.datastore.preferences.protobuf.AbstractC1514v.f(abstractC1514vB, true)) {
            return abstractC1514vB;
        }
        throw new androidx.datastore.preferences.protobuf.d0();
    }

    public final androidx.datastore.preferences.protobuf.AbstractC1514v b() {
        if (!this.f16256i.g()) {
            return this.f16256i;
        }
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = this.f16256i;
        abstractC1514v.getClass();
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        u6.getClass();
        u6.a(abstractC1514v.getClass()).b(abstractC1514v);
        abstractC1514v.h();
        return this.f16256i;
    }

    public final void c() {
        if (this.f16256i.g()) {
            return;
        }
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514vI = this.f16255h.i();
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = this.f16256i;
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        u6.getClass();
        u6.a(abstractC1514vI.getClass()).a(abstractC1514vI, abstractC1514v);
        this.f16256i = abstractC1514vI;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.AbstractC1512t abstractC1512t = (androidx.datastore.preferences.protobuf.AbstractC1512t) this.f16255h.c(5);
        abstractC1512t.f16256i = b();
        return abstractC1512t;
    }
}

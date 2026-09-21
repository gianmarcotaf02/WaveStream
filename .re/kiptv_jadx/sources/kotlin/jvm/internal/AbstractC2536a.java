package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2536a implements kotlin.jvm.internal.InterfaceC2543h, java.io.Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private final java.lang.String signature;

    public AbstractC2536a(java.lang.Class cls, java.lang.String str) {
        this(0, 0, cls, kotlin.jvm.internal.AbstractC2538c.NO_RECEIVER, "<init>", str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.jvm.internal.AbstractC2536a)) {
            return false;
        }
        kotlin.jvm.internal.AbstractC2536a abstractC2536a = (kotlin.jvm.internal.AbstractC2536a) obj;
        return this.isTopLevel == abstractC2536a.isTopLevel && this.arity == abstractC2536a.arity && this.flags == abstractC2536a.flags && kotlin.jvm.internal.m.a(this.receiver, abstractC2536a.receiver) && kotlin.jvm.internal.m.a(this.owner, abstractC2536a.owner) && this.name.equals(abstractC2536a.name) && this.signature.equals(abstractC2536a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC2543h
    public int getArity() {
        return this.arity;
    }

    public E6.InterfaceC0333f getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.B.f24540a.c(cls) : kotlin.jvm.internal.B.f24540a.b(cls);
    }

    public int hashCode() {
        java.lang.Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Class cls = this.owner;
        return ((((B2.a.a(B2.a.a((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.B.f24540a.i(this);
    }

    public AbstractC2536a(int i3, int i9, java.lang.Class cls, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i3;
        this.flags = i9 >> 1;
    }
}

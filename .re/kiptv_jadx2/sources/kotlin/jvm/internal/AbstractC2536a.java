package kotlin.jvm.internal;

import E6.InterfaceC0333f;
import java.io.Serializable;

public abstract class AbstractC2536a implements InterfaceC2543h, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AbstractC2536a(Class cls, String str) {
        this(0, 0, cls, AbstractC2538c.NO_RECEIVER, "<init>", str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2536a)) {
            return false;
        }
        AbstractC2536a abstractC2536a = (AbstractC2536a) obj;
        return this.isTopLevel == abstractC2536a.isTopLevel && this.arity == abstractC2536a.arity && this.flags == abstractC2536a.flags && m.a(this.receiver, abstractC2536a.receiver) && m.a(this.owner, abstractC2536a.owner) && this.name.equals(abstractC2536a.name) && this.signature.equals(abstractC2536a.signature);
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public InterfaceC0333f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? B.f24540a.c(cls) : B.f24540a.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((B2.a.a(B2.a.a((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return B.f24540a.i(this);
    }

    public AbstractC2536a(int i3, int i9, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i3;
        this.flags = i9 >> 1;
    }
}

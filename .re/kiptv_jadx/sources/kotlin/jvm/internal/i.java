package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends kotlin.jvm.internal.AbstractC2538c implements kotlin.jvm.internal.InterfaceC2543h, E6.InterfaceC0334g {
    private final int arity;
    private final int flags;

    public i(int i3, int i9, java.lang.Class cls, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i3;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public E6.InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.a(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.i) {
            kotlin.jvm.internal.i iVar = (kotlin.jvm.internal.i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && kotlin.jvm.internal.m.a(getBoundReceiver(), iVar.getBoundReceiver()) && kotlin.jvm.internal.m.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof E6.InterfaceC0334g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2543h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // E6.InterfaceC0334g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // E6.InterfaceC0334g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // E6.InterfaceC0334g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // E6.InterfaceC0334g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC2538c, E6.InterfaceC0330c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public java.lang.String toString() {
        E6.InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return interfaceC0330cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public E6.InterfaceC0334g getReflected() {
        E6.InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return (E6.InterfaceC0334g) interfaceC0330cCompute;
        }
        throw new H6.t0();
    }
}

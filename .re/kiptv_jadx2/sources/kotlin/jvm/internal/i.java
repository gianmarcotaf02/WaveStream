package kotlin.jvm.internal;

import E6.InterfaceC0330c;
import E6.InterfaceC0334g;
import H6.t0;

public abstract class i extends AbstractC2538c implements InterfaceC2543h, InterfaceC0334g {
    private final int arity;
    private final int flags;

    public i(int i3, int i9, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i3;
        this.flags = 0;
    }

    @Override
    public InterfaceC0330c computeReflected() {
        return B.f24540a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && m.a(getBoundReceiver(), iVar.getBoundReceiver()) && m.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof InterfaceC0334g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return interfaceC0330cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override
    public InterfaceC0334g getReflected() {
        InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return (InterfaceC0334g) interfaceC0330cCompute;
        }
        throw new t0();
    }
}

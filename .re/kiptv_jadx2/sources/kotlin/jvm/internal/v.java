package kotlin.jvm.internal;

import E6.InterfaceC0330c;
import H6.t0;

public abstract class v extends AbstractC2538c implements E6.u {
    private final boolean syntheticJavaProperty;

    public v(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.syntheticJavaProperty = (i3 & 2) == 2;
    }

    @Override
    public InterfaceC0330c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return getOwner().equals(vVar.getOwner()) && getName().equals(vVar.getName()) && getSignature().equals(vVar.getSignature()) && m.a(getBoundReceiver(), vVar.getBoundReceiver());
        }
        if (obj instanceof E6.u) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return interfaceC0330cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override
    public E6.u getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return (E6.u) interfaceC0330cCompute;
        }
        throw new t0();
    }
}

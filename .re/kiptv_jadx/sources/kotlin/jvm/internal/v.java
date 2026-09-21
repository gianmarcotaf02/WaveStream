package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends kotlin.jvm.internal.AbstractC2538c implements E6.u {
    private final boolean syntheticJavaProperty;

    public v(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.syntheticJavaProperty = (i3 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public E6.InterfaceC0330c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.v) {
            kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj;
            return getOwner().equals(vVar.getOwner()) && getName().equals(vVar.getName()) && getSignature().equals(vVar.getSignature()) && kotlin.jvm.internal.m.a(getBoundReceiver(), vVar.getBoundReceiver());
        }
        if (obj instanceof E6.u) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // E6.u
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // E6.u
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public java.lang.String toString() {
        E6.InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return interfaceC0330cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public E6.u getReflected() {
        if (this.syntheticJavaProperty) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        E6.InterfaceC0330c interfaceC0330cCompute = compute();
        if (interfaceC0330cCompute != this) {
            return (E6.u) interfaceC0330cCompute;
        }
        throw new H6.t0();
    }
}

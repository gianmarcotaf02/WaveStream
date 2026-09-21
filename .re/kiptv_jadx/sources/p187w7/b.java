package p187w7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends D1.AbstractC0220e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q6.AbstractC0805n f30473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(N6.InterfaceC0688b interfaceC0688b, C7.AbstractC0191x abstractC0191x) {
        super(abstractC0191x);
        if (abstractC0191x == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f30473i = (Q6.AbstractC0805n) interfaceC0688b;
    }

    public final java.lang.String toString() {
        return getType() + ": Ext {" + this.f30473i + "}";
    }
}

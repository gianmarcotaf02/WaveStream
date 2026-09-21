package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2538c implements E6.InterfaceC0330c, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = kotlin.jvm.internal.C2537b.f24546h;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient E6.InterfaceC0330c reflected;
    private final java.lang.String signature;

    public AbstractC2538c(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // E6.InterfaceC0330c
    public java.lang.Object call(java.lang.Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // E6.InterfaceC0330c
    public java.lang.Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    public E6.InterfaceC0330c compute() {
        E6.InterfaceC0330c interfaceC0330c = this.reflected;
        if (interfaceC0330c != null) {
            return interfaceC0330c;
        }
        E6.InterfaceC0330c interfaceC0330cComputeReflected = computeReflected();
        this.reflected = interfaceC0330cComputeReflected;
        return interfaceC0330cComputeReflected;
    }

    public abstract E6.InterfaceC0330c computeReflected();

    @Override // E6.InterfaceC0329b
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public java.lang.Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // E6.InterfaceC0330c
    public java.lang.String getName() {
        return this.name;
    }

    public E6.InterfaceC0333f getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.B.f24540a.c(cls) : kotlin.jvm.internal.B.f24540a.b(cls);
    }

    @Override // E6.InterfaceC0330c
    public java.util.List<E6.o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract E6.InterfaceC0330c getReflected();

    @Override // E6.InterfaceC0330c
    public E6.v getReturnType() {
        return getReflected().getReturnType();
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // E6.InterfaceC0330c
    public java.util.List<E6.w> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // E6.InterfaceC0330c
    public E6.A getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // E6.InterfaceC0330c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // E6.InterfaceC0330c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // E6.InterfaceC0330c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // E6.InterfaceC0330c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}

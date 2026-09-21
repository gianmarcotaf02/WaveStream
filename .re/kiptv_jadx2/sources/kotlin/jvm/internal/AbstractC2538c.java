package kotlin.jvm.internal;

import E6.InterfaceC0330c;
import E6.InterfaceC0333f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

public abstract class AbstractC2538c implements InterfaceC0330c, Serializable {
    public static final Object NO_RECEIVER = C2537b.f24546h;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC0330c reflected;
    private final String signature;

    public AbstractC2538c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC0330c compute() {
        InterfaceC0330c interfaceC0330c = this.reflected;
        if (interfaceC0330c != null) {
            return interfaceC0330c;
        }
        InterfaceC0330c interfaceC0330cComputeReflected = computeReflected();
        this.reflected = interfaceC0330cComputeReflected;
        return interfaceC0330cComputeReflected;
    }

    public abstract InterfaceC0330c computeReflected();

    @Override
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public InterfaceC0333f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? B.f24540a.c(cls) : B.f24540a.b(cls);
    }

    @Override
    public List<E6.o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC0330c getReflected();

    @Override
    public E6.v getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override
    public List<E6.w> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override
    public E6.A getVisibility() {
        return getReflected().getVisibility();
    }

    @Override
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}

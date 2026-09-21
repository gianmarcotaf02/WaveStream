package S6;

import N6.InterfaceC0689c;
import N6.InterfaceC0691e;
import T6.s;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import y7.o;

public final class d implements o {

    public static final d f9513b = new d();

    public static final d f9514c = new d();

    @Override
    public void a(InterfaceC0691e descriptor, ArrayList arrayList) {
        m.e(descriptor, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + arrayList);
    }

    @Override
    public void b(InterfaceC0689c descriptor) {
        m.e(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    public f c(p027c7.c javaElement) {
        m.e(javaElement, "javaElement");
        return new f((s) javaElement);
    }
}

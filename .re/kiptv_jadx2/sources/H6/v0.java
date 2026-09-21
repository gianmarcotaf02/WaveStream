package H6;

import N6.InterfaceC0689c;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

public final class v0 implements Function0 {
    public static final w0 j = new w0();

    public final Function0 f4502h;

    public volatile SoftReference f4503i;

    public v0(InterfaceC0689c interfaceC0689c, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f4503i = null;
        this.f4502h = function0;
        if (interfaceC0689c != null) {
            this.f4503i = new SoftReference(interfaceC0689c);
        }
    }

    @Override
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f4503i;
        Object obj2 = j;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f4502h.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f4503i = new SoftReference(obj2);
        return objInvoke;
    }
}

package p153r8;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import p143q8.a;

public abstract class AbstractC2685a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override
    public Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        m.e(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        a aVarC = decoder.c(getDescriptor());
        while (true) {
            int iS = aVarC.s(getDescriptor());
            if (iS == -1) {
                aVarC.a(getDescriptor());
                return h(objA);
            }
            f(aVarC, iS + iB, objA);
        }
    }

    public abstract void f(a aVar, int i3, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}

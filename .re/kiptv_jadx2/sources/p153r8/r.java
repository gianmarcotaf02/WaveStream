package p153r8;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p143q8.a;
import p143q8.b;

public abstract class r extends AbstractC2685a {

    public final KSerializer f26994a;

    public r(KSerializer kSerializer) {
        this.f26994a = kSerializer;
    }

    @Override
    public void f(a aVar, int i3, Object obj) {
        i(obj, i3, aVar.x(getDescriptor(), i3, this.f26994a, null));
    }

    public abstract void i(Object obj, int i3, Object obj2);

    @Override
    public void serialize(Encoder encoder, Object obj) {
        m.e(encoder, "encoder");
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        b bVarA = encoder.A(descriptor);
        Iterator itC = c(obj);
        for (int i3 = 0; i3 < iD; i3++) {
            bVarA.h(getDescriptor(), i3, this.f26994a, itC.next());
        }
        bVarA.a(descriptor);
    }
}

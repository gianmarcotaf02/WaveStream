package p162s8;

import F.e0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import p008a8.c;
import p119n8.l;
import t8.B;
import t8.C;
import t8.C2859i;
import t8.I;
import t8.L;
import t8.N;
import t8.x;
import t8.z;
import v8.f;

public abstract class d implements l {

    public static final c f27387d = new c(new j(false, false, false, false, true, "    ", false, "type", false, true, a.f27384i), f.f29713a);

    public final j f27388a;

    public final v8.d f27389b;

    public final c f27390c = new c(23);

    public d(j jVar, v8.d dVar) {
        this.f27388a = jVar;
        this.f27389b = dVar;
    }

    public final Object a(KSerializer deserializer, b element) {
        Decoder zVar;
        m.e(deserializer, "deserializer");
        m.e(element, "element");
        String str = null;
        if (element instanceof kotlinx.serialization.json.c) {
            zVar = new B(this, (kotlinx.serialization.json.c) element, str, 12);
        } else if (element instanceof a) {
            zVar = new C(this, (a) element);
        } else {
            if (!(element instanceof r) && !element.equals(JsonNull.INSTANCE)) {
                throw new I3.b();
            }
            zVar = new z(this, (kotlinx.serialization.json.d) element, null);
        }
        return zVar.p(deserializer);
    }

    public final Object b(String string, KSerializer deserializer) {
        m.e(deserializer, "deserializer");
        m.e(string, "string");
        L l2 = new L(string);
        Object objP = new I(this, N.OBJ, l2, deserializer.getDescriptor(), null).p(deserializer);
        l2.p();
        return objP;
    }

    public final b c(KSerializer serializer, Object obj) {
        m.e(serializer, "serializer");
        A a2 = new A();
        new t8.A(this, new e0(a2, 2), 1).z(serializer, obj);
        Object obj2 = a2.f24539h;
        if (obj2 != null) {
            return (b) obj2;
        }
        m.k("result");
        throw null;
    }

    public final String d(KSerializer serializer, Object obj) {
        m.e(serializer, "serializer");
        Y2.L l2 = new Y2.L((char) 0, 11);
        l2.j = C2859i.f28623c.d(128);
        try {
            x.l(this, l2, serializer, obj);
            return l2.toString();
        } finally {
            C2859i c2859i = C2859i.f28623c;
            char[] array = (char[]) l2.j;
            c2859i.getClass();
            m.e(array, "array");
            c2859i.b(array);
        }
    }

    public final b e(String string) {
        m.e(string, "string");
        return (b) b(string, m.f27417a);
    }
}

package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements p119n8.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p162s8.c f27387d = new p162s8.c(new p162s8.j(false, false, false, false, true, "    ", false, "type", false, true, p162s8.a.f27384i), v8.f.f29713a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p162s8.j f27388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v8.d f27389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p008a8.c f27390c = new p008a8.c(23);

    public d(p162s8.j jVar, v8.d dVar) {
        this.f27388a = jVar;
        this.f27389b = dVar;
    }

    public final java.lang.Object a(kotlinx.serialization.KSerializer deserializer, kotlinx.serialization.json.b element) {
        kotlinx.serialization.encoding.Decoder zVar;
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        kotlin.jvm.internal.m.e(element, "element");
        java.lang.String str = null;
        if (element instanceof kotlinx.serialization.json.c) {
            zVar = new t8.B(this, (kotlinx.serialization.json.c) element, str, 12);
        } else if (element instanceof kotlinx.serialization.json.a) {
            zVar = new t8.C(this, (kotlinx.serialization.json.a) element);
        } else {
            if (!(element instanceof p162s8.r) && !element.equals(kotlinx.serialization.json.JsonNull.INSTANCE)) {
                throw new I3.b();
            }
            zVar = new t8.z(this, (kotlinx.serialization.json.d) element, null);
        }
        return zVar.p(deserializer);
    }

    public final java.lang.Object b(java.lang.String string, kotlinx.serialization.KSerializer deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        kotlin.jvm.internal.m.e(string, "string");
        t8.L l2 = new t8.L(string);
        java.lang.Object objP = new t8.I(this, t8.N.OBJ, l2, deserializer.getDescriptor(), null).p(deserializer);
        l2.p();
        return objP;
    }

    public final kotlinx.serialization.json.b c(kotlinx.serialization.KSerializer serializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        new t8.A(this, new F.e0(a2, 2), 1).z(serializer, obj);
        java.lang.Object obj2 = a2.f24539h;
        if (obj2 != null) {
            return (kotlinx.serialization.json.b) obj2;
        }
        kotlin.jvm.internal.m.k("result");
        throw null;
    }

    public final java.lang.String d(kotlinx.serialization.KSerializer serializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        Y2.L l2 = new Y2.L((char) 0, 11);
        l2.j = t8.C2859i.f28623c.d(128);
        try {
            t8.x.l(this, l2, serializer, obj);
            return l2.toString();
        } finally {
            t8.C2859i c2859i = t8.C2859i.f28623c;
            char[] array = (char[]) l2.j;
            c2859i.getClass();
            kotlin.jvm.internal.m.e(array, "array");
            c2859i.b(array);
        }
    }

    public final kotlinx.serialization.json.b e(java.lang.String string) {
        kotlin.jvm.internal.m.e(string, "string");
        return (kotlinx.serialization.json.b) b(string, p162s8.m.f27417a);
    }
}

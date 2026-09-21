package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends p153r8.AbstractC2685a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.KSerializer f26906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.KSerializer f26907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p153r8.E f26909d;

    public F(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, byte b9) {
        this.f26906a = kSerializer;
        this.f26907b = kSerializer2;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object a() {
        switch (this.f26908c) {
            case 0:
                return new java.util.HashMap();
            default:
                return new java.util.LinkedHashMap();
        }
    }

    @Override // p153r8.AbstractC2685a
    public final int b(java.lang.Object obj) {
        switch (this.f26908c) {
            case 0:
                java.util.HashMap map = (java.util.HashMap) obj;
                kotlin.jvm.internal.m.e(map, "<this>");
                return map.size() * 2;
            default:
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) obj;
                kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // p153r8.AbstractC2685a
    public final java.util.Iterator c(java.lang.Object obj) {
        switch (this.f26908c) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                kotlin.jvm.internal.m.e(map, "<this>");
                return map.entrySet().iterator();
            default:
                java.util.Map map2 = (java.util.Map) obj;
                kotlin.jvm.internal.m.e(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // p153r8.AbstractC2685a
    public final int d(java.lang.Object obj) {
        switch (this.f26908c) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                kotlin.jvm.internal.m.e(map, "<this>");
                return map.size();
            default:
                java.util.Map map2 = (java.util.Map) obj;
                kotlin.jvm.internal.m.e(map2, "<this>");
                return map2.size();
        }
    }

    @Override // p153r8.AbstractC2685a
    public final void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        java.util.Map builder = (java.util.Map) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        java.lang.Object objX = aVar.x(getDescriptor(), i3, this.f26906a, null);
        int iS = aVar.s(getDescriptor());
        if (iS != i3 + 1) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, iS, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objX);
        kotlinx.serialization.KSerializer kSerializer = this.f26907b;
        builder.put(objX, (!zContainsKey || (kSerializer.getDescriptor().c() instanceof p135p8.f)) ? aVar.x(getDescriptor(), iS, kSerializer, null) : aVar.x(getDescriptor(), iS, kSerializer, p078i6.C.M0(objX, builder)));
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object g(java.lang.Object obj) {
        switch (this.f26908c) {
            case 0:
                kotlin.jvm.internal.m.e(null, "<this>");
                return new java.util.HashMap((java.util.Map) null);
            default:
                kotlin.jvm.internal.m.e(null, "<this>");
                return new java.util.LinkedHashMap((java.util.Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        switch (this.f26908c) {
            case 0:
                break;
        }
        return this.f26909d;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object h(java.lang.Object obj) {
        switch (this.f26908c) {
            case 0:
                java.util.HashMap map = (java.util.HashMap) obj;
                kotlin.jvm.internal.m.e(map, "<this>");
                return map;
            default:
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) obj;
                kotlin.jvm.internal.m.e(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        d(obj);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        p143q8.b bVarA = encoder.A(descriptor);
        java.util.Iterator itC = c(obj);
        int i3 = 0;
        while (itC.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itC.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int i9 = i3 + 1;
            bVarA.h(getDescriptor(), i3, this.f26906a, key);
            i3 += 2;
            bVarA.h(getDescriptor(), i9, this.f26907b, value);
        }
        bVarA.a(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer vSerializer, int i3) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f26908c = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(kSerializer, "kSerializer");
                kotlin.jvm.internal.m.e(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                kotlinx.serialization.descriptors.SerialDescriptor keyDesc = kSerializer.getDescriptor();
                kotlinx.serialization.descriptors.SerialDescriptor valueDesc = vSerializer.getDescriptor();
                kotlin.jvm.internal.m.e(keyDesc, "keyDesc");
                kotlin.jvm.internal.m.e(valueDesc, "valueDesc");
                this.f26909d = new p153r8.E("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                kotlin.jvm.internal.m.e(kSerializer, "kSerializer");
                kotlin.jvm.internal.m.e(vSerializer, "vSerializer");
                kotlinx.serialization.descriptors.SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                kotlinx.serialization.descriptors.SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                kotlin.jvm.internal.m.e(keyDesc2, "keyDesc");
                kotlin.jvm.internal.m.e(valueDesc2, "valueDesc");
                this.f26909d = new p153r8.E("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}

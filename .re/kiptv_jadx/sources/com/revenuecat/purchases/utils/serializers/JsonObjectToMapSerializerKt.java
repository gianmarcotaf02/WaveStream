package com.revenuecat.purchases.utils.serializers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/c;", "", "", "", "toAnyMap", "(Lkotlinx/serialization/json/c;)Ljava/util/Map;", "Lkotlinx/serialization/json/b;", "toAny", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonObjectToMapSerializerKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final java.lang.Object toAny(kotlinx.serialization.json.b bVar) {
        if (bVar instanceof kotlinx.serialization.json.JsonNull) {
            return null;
        }
        if (!(bVar instanceof kotlinx.serialization.json.d)) {
            if (bVar instanceof kotlinx.serialization.json.c) {
                return toAnyMap((kotlinx.serialization.json.c) bVar);
            }
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new I3.b();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.lang.Iterable) bVar).iterator();
            while (it.hasNext()) {
                java.lang.Object any = toAny((kotlinx.serialization.json.b) it.next());
                if (any != null) {
                    arrayList.add(any);
                }
            }
            return arrayList;
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVar;
        if (dVar.e()) {
            return dVar.d();
        }
        if (p162s8.l.e(dVar) != null) {
            java.lang.Boolean boolE = p162s8.l.e(dVar);
            kotlin.jvm.internal.m.b(boolE);
            return boolE;
        }
        if (p162s8.l.g(dVar) != null) {
            java.lang.Integer numG = p162s8.l.g(dVar);
            kotlin.jvm.internal.m.b(numG);
            return numG;
        }
        if (p162s8.l.k(dVar) != null) {
            java.lang.Long lK = p162s8.l.k(dVar);
            kotlin.jvm.internal.m.b(lK);
            return lK;
        }
        if (O7.w.l0(dVar.d()) == null) {
            return dVar.d();
        }
        java.lang.Double dL0 = O7.w.l0(dVar.d());
        kotlin.jvm.internal.m.b(dL0);
        return dL0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map<java.lang.String, java.lang.Object> toAnyMap(kotlinx.serialization.json.c cVar) {
        java.util.Set<java.util.Map.Entry> setEntrySet = cVar.f24558h.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object any = toAny((kotlinx.serialization.json.b) entry.getValue());
            p070h6.k kVar = any == null ? null : new p070h6.k(str, any);
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return p078i6.C.X0(arrayList);
    }
}

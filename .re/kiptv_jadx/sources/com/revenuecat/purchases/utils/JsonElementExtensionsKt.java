package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/b;", "", "", "", "asMap", "(Lkotlinx/serialization/json/b;)Ljava/util/Map;", "getExtractedContent", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "extractedContent", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonElementExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> asMap(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        if (!(bVar instanceof kotlinx.serialization.json.c)) {
            return null;
        }
        java.util.Set<java.util.Map.Entry> setEntrySet = p162s8.l.i(bVar).f24558h.entrySet();
        int iI0 = p078i6.D.I0(p078i6.q.I0(setEntrySet, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        for (java.util.Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), getExtractedContent((kotlinx.serialization.json.b) entry.getValue()));
        }
        return linkedHashMap;
    }

    private static final java.lang.Object getExtractedContent(kotlinx.serialization.json.b bVar) {
        java.lang.Float fValueOf;
        java.util.LinkedHashMap linkedHashMap = null;
        if (!(bVar instanceof kotlinx.serialization.json.d)) {
            if (bVar instanceof kotlinx.serialization.json.a) {
                kotlinx.serialization.json.a aVarH = p162s8.l.h(bVar);
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH, 10));
                java.util.Iterator it = aVarH.f24557h.iterator();
                while (it.hasNext()) {
                    arrayList.add(getExtractedContent((kotlinx.serialization.json.b) it.next()));
                }
                return arrayList;
            }
            if (bVar instanceof kotlinx.serialization.json.c) {
                java.util.Set<java.util.Map.Entry> setEntrySet = p162s8.l.i(bVar).f24558h.entrySet();
                int iI0 = p078i6.D.I0(p078i6.q.I0(setEntrySet, 10));
                if (iI0 < 16) {
                    iI0 = 16;
                }
                linkedHashMap = new java.util.LinkedHashMap(iI0);
                for (java.util.Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), getExtractedContent((kotlinx.serialization.json.b) entry.getValue()));
                }
            }
            return linkedHashMap;
        }
        kotlinx.serialization.json.d dVarJ = p162s8.l.j(bVar);
        if (dVarJ.e()) {
            return dVarJ.d();
        }
        java.lang.Boolean boolE = p162s8.l.e(dVarJ);
        if (boolE != null) {
            return boolE;
        }
        java.lang.Integer numG = p162s8.l.g(dVarJ);
        if (numG != null) {
            return numG;
        }
        java.lang.Long lK = p162s8.l.k(dVarJ);
        if (lK != null) {
            return lK;
        }
        java.lang.String strD = dVarJ.d();
        kotlin.jvm.internal.m.e(strD, "<this>");
        try {
            fValueOf = O7.w.k0(strD) ? java.lang.Float.valueOf(java.lang.Float.parseFloat(strD)) : null;
        } catch (java.lang.NumberFormatException unused) {
        }
        if (fValueOf != null) {
            return fValueOf;
        }
        java.lang.Double dL0 = O7.w.l0(dVarJ.d());
        if (dL0 == null) {
            return dVarJ instanceof kotlinx.serialization.json.JsonNull ? null : dVarJ.d();
        }
        return dL0;
    }
}

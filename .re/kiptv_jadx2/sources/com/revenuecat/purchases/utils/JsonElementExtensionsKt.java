package com.revenuecat.purchases.utils;

import O7.w;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import p078i6.D;
import p078i6.q;
import p162s8.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/b;", "", "", "", "asMap", "(Lkotlinx/serialization/json/b;)Ljava/util/Map;", "getExtractedContent", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "extractedContent", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(kotlinx.serialization.json.b bVar) {
        m.e(bVar, "<this>");
        if (!(bVar instanceof c)) {
            return null;
        }
        Set<Map.Entry> setEntrySet = l.i(bVar).f24558h.entrySet();
        int iI0 = D.I0(q.I0(setEntrySet, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), getExtractedContent((kotlinx.serialization.json.b) entry.getValue()));
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(kotlinx.serialization.json.b bVar) {
        Float fValueOf;
        LinkedHashMap linkedHashMap = null;
        if (!(bVar instanceof d)) {
            if (bVar instanceof kotlinx.serialization.json.a) {
                kotlinx.serialization.json.a aVarH = l.h(bVar);
                ArrayList arrayList = new ArrayList(q.I0(aVarH, 10));
                Iterator it = aVarH.f24557h.iterator();
                while (it.hasNext()) {
                    arrayList.add(getExtractedContent((kotlinx.serialization.json.b) it.next()));
                }
                return arrayList;
            }
            if (bVar instanceof c) {
                Set<Map.Entry> setEntrySet = l.i(bVar).f24558h.entrySet();
                int iI0 = D.I0(q.I0(setEntrySet, 10));
                if (iI0 < 16) {
                    iI0 = 16;
                }
                linkedHashMap = new LinkedHashMap(iI0);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), getExtractedContent((kotlinx.serialization.json.b) entry.getValue()));
                }
            }
            return linkedHashMap;
        }
        d dVarJ = l.j(bVar);
        if (dVarJ.e()) {
            return dVarJ.d();
        }
        Boolean boolE = l.e(dVarJ);
        if (boolE != null) {
            return boolE;
        }
        Integer numG = l.g(dVarJ);
        if (numG != null) {
            return numG;
        }
        Long lK = l.k(dVarJ);
        if (lK != null) {
            return lK;
        }
        String strD = dVarJ.d();
        m.e(strD, "<this>");
        try {
            fValueOf = w.k0(strD) ? Float.valueOf(Float.parseFloat(strD)) : null;
        } catch (NumberFormatException unused) {
        }
        if (fValueOf != null) {
            return fValueOf;
        }
        Double dL0 = w.l0(dVarJ.d());
        if (dL0 == null) {
            return dVarJ instanceof JsonNull ? null : dVarJ.d();
        }
        return dL0;
    }
}

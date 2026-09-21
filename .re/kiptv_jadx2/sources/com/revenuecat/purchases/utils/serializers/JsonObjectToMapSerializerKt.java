package com.revenuecat.purchases.utils.serializers;

import O7.w;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import p070h6.k;
import p078i6.C;
import p162s8.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/c;", "", "", "", "toAnyMap", "(Lkotlinx/serialization/json/c;)Ljava/util/Map;", "Lkotlinx/serialization/json/b;", "toAny", "(Lkotlinx/serialization/json/b;)Ljava/lang/Object;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonObjectToMapSerializerKt {
    private static final Object toAny(b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (!(bVar instanceof d)) {
            if (bVar instanceof c) {
                return toAnyMap((c) bVar);
            }
            if (!(bVar instanceof a)) {
                throw new I3.b();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) bVar).iterator();
            while (it.hasNext()) {
                Object any = toAny((b) it.next());
                if (any != null) {
                    arrayList.add(any);
                }
            }
            return arrayList;
        }
        d dVar = (d) bVar;
        if (dVar.e()) {
            return dVar.d();
        }
        if (l.e(dVar) != null) {
            Boolean boolE = l.e(dVar);
            m.b(boolE);
            return boolE;
        }
        if (l.g(dVar) != null) {
            Integer numG = l.g(dVar);
            m.b(numG);
            return numG;
        }
        if (l.k(dVar) != null) {
            Long lK = l.k(dVar);
            m.b(lK);
            return lK;
        }
        if (w.l0(dVar.d()) == null) {
            return dVar.d();
        }
        Double dL0 = w.l0(dVar.d());
        m.b(dL0);
        return dL0;
    }

    public static final Map<String, Object> toAnyMap(c cVar) {
        Set<Map.Entry> setEntrySet = cVar.f24558h.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            Object any = toAny((b) entry.getValue());
            k kVar = any == null ? null : new k(str, any);
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return C.X0(arrayList);
    }
}

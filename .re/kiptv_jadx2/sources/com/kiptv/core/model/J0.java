package com.kiptv.core.model;

import com.google.android.gms.internal.play_billing.V0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class J0 implements KSerializer {

    public static final J0 f19808a = new J0();

    public static final p135p8.g f19809b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamSeriesInfo", new SerialDescriptor[0], new p108m5.c(22));

    @Override
    public final Object deserialize(Decoder decoder) {
        XtreamSeriesDetail xtreamSeriesDetail;
        List<XtreamSeason> listI1;
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2;
        p070h6.k kVar;
        Integer num;
        List list;
        Integer num2;
        List list2;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar2 = (p162s8.k) decoder;
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar2.i());
        p162s8.d dVarT = kVar2.t();
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("info");
        if (bVar != null) {
            try {
                xtreamSeriesDetail = (XtreamSeriesDetail) dVarT.a(XtreamSeriesDetail.INSTANCE.serializer(), bVar);
            } catch (Exception unused) {
                xtreamSeriesDetail = null;
            }
        } else {
            xtreamSeriesDetail = null;
        }
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("seasons");
        if (bVar2 != null) {
            try {
                if (bVar2 instanceof kotlinx.serialization.json.a) {
                    listI1 = (List) dVarT.a(V0.a(XtreamSeason.INSTANCE.serializer()), bVar2);
                } else if (bVar2 instanceof kotlinx.serialization.json.c) {
                    listI1 = p078i6.o.I1(((Map) dVarT.a(V0.b(p153r8.p0.f26988a, XtreamSeason.INSTANCE.serializer()), bVar2)).values(), new C1951k(6));
                } else {
                    listI1 = null;
                }
            } catch (Exception unused2) {
            }
        } else {
            listI1 = null;
        }
        kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI.get("episodes");
        int i3 = 0;
        if (bVar3 == 0) {
            linkedHashMap = null;
        } else if (bVar3 instanceof kotlinx.serialization.json.c) {
            try {
                linkedHashMap = (Map) dVarT.a(V0.b(p153r8.p0.f26988a, V0.a(E0.Companion.serializer())), bVar3);
            } catch (Exception unused3) {
                linkedHashMap = null;
            }
        } else if (!(bVar3 instanceof kotlinx.serialization.json.a) || ((Collection) bVar3).isEmpty()) {
            linkedHashMap = null;
        } else if (((kotlinx.serialization.json.b) ((kotlinx.serialization.json.a) bVar3).f24557h.get(0)) instanceof kotlinx.serialization.json.a) {
            try {
                list = (List) dVarT.a(V0.a(V0.a(E0.Companion.serializer())), bVar3);
            } catch (Exception unused4) {
                list = null;
            }
            if (list != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                int iIntValue = 0;
                for (Object obj : list) {
                    int i9 = iIntValue + 1;
                    if (iIntValue < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    List list3 = (List) obj;
                    if (!list3.isEmpty()) {
                        E0 e6 = (E0) p078i6.o.j1(list3);
                        if (e6 != null && (num2 = e6.g) != null) {
                            iIntValue = num2.intValue();
                        }
                        linkedHashMap3.put(String.valueOf(iIntValue), p078i6.o.I1(list3, new C1951k(7)));
                    }
                    iIntValue = i9;
                }
                if (linkedHashMap3.isEmpty()) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = linkedHashMap3;
                }
            } else {
                linkedHashMap = null;
            }
        } else {
            try {
                list2 = (List) dVarT.a(V0.a(E0.Companion.serializer()), bVar3);
            } catch (Exception unused5) {
                list2 = null;
            }
            if (list2 == null || list2.isEmpty()) {
                linkedHashMap = null;
            } else {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj2 : list2) {
                    Integer num3 = ((E0) obj2).g;
                    String strValueOf = String.valueOf(num3 != null ? num3.intValue() : 1);
                    Object arrayList = linkedHashMap4.get(strValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap4.put(strValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                linkedHashMap = new LinkedHashMap(p078i6.D.I0(linkedHashMap4.size()));
                for (Map.Entry entry : linkedHashMap4.entrySet()) {
                    linkedHashMap.put(entry.getKey(), p078i6.o.I1((List) entry.getValue(), new C1951k(8)));
                }
            }
        }
        if (linkedHashMap != null && linkedHashMap.size() == 1 && listI1 != null && listI1.size() > 1) {
            List list4 = (List) p078i6.o.g1(linkedHashMap.values());
            if (list4.size() > 1) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    Integer num4 = ((E0) it.next()).g;
                    if (num4 != null) {
                        arrayList2.add(num4);
                    }
                }
                if (p078i6.o.R1(arrayList2).size() > 1) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    for (Object obj3 : list4) {
                        Integer num5 = ((E0) obj3).g;
                        String strValueOf2 = String.valueOf(num5 != null ? num5.intValue() : 1);
                        Object arrayList3 = linkedHashMap5.get(strValueOf2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap5.put(strValueOf2, arrayList3);
                        }
                        ((List) arrayList3).add(obj3);
                    }
                    linkedHashMap2 = new LinkedHashMap(p078i6.D.I0(linkedHashMap5.size()));
                    for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), p078i6.o.I1((List) entry2.getValue(), new C1951k(5)));
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (XtreamSeason xtreamSeason : listI1) {
                        Integer num6 = xtreamSeason.f20680b;
                        if (num6 == null) {
                            kVar = null;
                        } else {
                            if (num6.intValue() <= 0) {
                                num6 = null;
                            }
                            if (num6 == null || (num = xtreamSeason.f20681c) == null) {
                                kVar = null;
                            } else {
                                if (num.intValue() <= 0) {
                                    num = null;
                                }
                                if (num != null) {
                                    kVar = new p070h6.k(num6, num);
                                } else {
                                    kVar = null;
                                }
                            }
                        }
                        if (kVar != null) {
                            arrayList4.add(kVar);
                        }
                    }
                    List<p070h6.k> listI2 = p078i6.o.I1(arrayList4, new C1951k(3));
                    Iterator it2 = listI2.iterator();
                    int iIntValue2 = 0;
                    while (it2.hasNext()) {
                        iIntValue2 += ((Number) ((p070h6.k) it2.next()).f22540i).intValue();
                    }
                    int iMax = Math.max(10, iIntValue2 / 10);
                    if (!listI2.isEmpty() && Math.abs(iIntValue2 - list4.size()) <= iMax) {
                        List listI3 = p078i6.o.I1(list4, new C1951k(4));
                        linkedHashMap2 = new LinkedHashMap();
                        for (p070h6.k kVar3 : listI2) {
                            int iIntValue3 = ((Number) kVar3.f22539h).intValue();
                            int iMin = Math.min(((Number) kVar3.f22540i).intValue() + i3, listI3.size());
                            if (i3 < iMin) {
                                linkedHashMap2.put(String.valueOf(iIntValue3), listI3.subList(i3, iMin));
                            }
                            i3 = iMin;
                        }
                        if (i3 < listI3.size()) {
                            String strValueOf3 = String.valueOf(((Number) ((p070h6.k) p078i6.o.q1(listI2)).f22539h).intValue());
                            Collection collection = (List) linkedHashMap2.get(strValueOf3);
                            if (collection == null) {
                                collection = p078i6.w.f23205h;
                            }
                            linkedHashMap2.put(strValueOf3, p078i6.o.A1(collection, listI3.subList(i3, listI3.size())));
                        }
                    }
                }
                linkedHashMap = linkedHashMap2;
            }
        }
        return new I0(listI1, xtreamSeriesDetail, linkedHashMap);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f19809b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        I0 value = (I0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new UnsupportedOperationException("Serialization not supported");
    }
}

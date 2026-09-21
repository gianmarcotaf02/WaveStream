package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.J0 f19808a = new com.kiptv.core.model.J0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f19809b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamSeriesInfo", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    /* JADX WARN: Code duplicated, block: B:125:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.kiptv.core.model.XtreamSeriesDetail xtreamSeriesDetail;
        java.util.List<com.kiptv.core.model.XtreamSeason> listI1;
        java.util.Map linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        p070h6.k kVar;
        java.lang.Integer num;
        java.util.List list;
        java.lang.Integer num2;
        java.util.List list2;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar2 = (p162s8.k) decoder;
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar2.i());
        p162s8.d dVarT = kVar2.t();
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("info");
        if (bVar != null) {
            try {
                xtreamSeriesDetail = (com.kiptv.core.model.XtreamSeriesDetail) dVarT.a(com.kiptv.core.model.XtreamSeriesDetail.INSTANCE.serializer(), bVar);
            } catch (java.lang.Exception unused) {
                xtreamSeriesDetail = null;
            }
        } else {
            xtreamSeriesDetail = null;
        }
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("seasons");
        if (bVar2 != null) {
            try {
                if (bVar2 instanceof kotlinx.serialization.json.a) {
                    listI1 = (java.util.List) dVarT.a(com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.XtreamSeason.INSTANCE.serializer()), bVar2);
                } else if (bVar2 instanceof kotlinx.serialization.json.c) {
                    listI1 = p078i6.o.I1(((java.util.Map) dVarT.a(com.google.android.gms.internal.play_billing.V0.b(p153r8.p0.f26988a, com.kiptv.core.model.XtreamSeason.INSTANCE.serializer()), bVar2)).values(), new com.kiptv.core.model.C1951k(6));
                } else {
                    listI1 = null;
                }
            } catch (java.lang.Exception unused2) {
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
                linkedHashMap = (java.util.Map) dVarT.a(com.google.android.gms.internal.play_billing.V0.b(p153r8.p0.f26988a, com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.E0.Companion.serializer())), bVar3);
            } catch (java.lang.Exception unused3) {
                linkedHashMap = null;
            }
        } else if (!(bVar3 instanceof kotlinx.serialization.json.a) || ((java.util.Collection) bVar3).isEmpty()) {
            linkedHashMap = null;
        } else if (((kotlinx.serialization.json.b) ((kotlinx.serialization.json.a) bVar3).f24557h.get(0)) instanceof kotlinx.serialization.json.a) {
            try {
                list = (java.util.List) dVarT.a(com.google.android.gms.internal.play_billing.V0.a(com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.E0.Companion.serializer())), bVar3);
            } catch (java.lang.Exception unused4) {
                list = null;
            }
            if (list != null) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                int iIntValue = 0;
                for (java.lang.Object obj : list) {
                    int i9 = iIntValue + 1;
                    if (iIntValue < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    java.util.List list3 = (java.util.List) obj;
                    if (!list3.isEmpty()) {
                        com.kiptv.core.model.E0 e6 = (com.kiptv.core.model.E0) p078i6.o.j1(list3);
                        if (e6 != null && (num2 = e6.g) != null) {
                            iIntValue = num2.intValue();
                        }
                        linkedHashMap3.put(java.lang.String.valueOf(iIntValue), p078i6.o.I1(list3, new com.kiptv.core.model.C1951k(7)));
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
                list2 = (java.util.List) dVarT.a(com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.E0.Companion.serializer()), bVar3);
            } catch (java.lang.Exception unused5) {
                list2 = null;
            }
            if (list2 == null || list2.isEmpty()) {
                linkedHashMap = null;
            } else {
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                for (java.lang.Object obj2 : list2) {
                    java.lang.Integer num3 = ((com.kiptv.core.model.E0) obj2).g;
                    java.lang.String strValueOf = java.lang.String.valueOf(num3 != null ? num3.intValue() : 1);
                    java.lang.Object arrayList = linkedHashMap4.get(strValueOf);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        linkedHashMap4.put(strValueOf, arrayList);
                    }
                    ((java.util.List) arrayList).add(obj2);
                }
                linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap4.size()));
                for (java.util.Map.Entry entry : linkedHashMap4.entrySet()) {
                    linkedHashMap.put(entry.getKey(), p078i6.o.I1((java.util.List) entry.getValue(), new com.kiptv.core.model.C1951k(8)));
                }
            }
        }
        if (linkedHashMap != null && linkedHashMap.size() == 1 && listI1 != null && listI1.size() > 1) {
            java.util.List list4 = (java.util.List) p078i6.o.g1(linkedHashMap.values());
            if (list4.size() > 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list4.iterator();
                while (it.hasNext()) {
                    java.lang.Integer num4 = ((com.kiptv.core.model.E0) it.next()).g;
                    if (num4 != null) {
                        arrayList2.add(num4);
                    }
                }
                if (p078i6.o.R1(arrayList2).size() > 1) {
                    java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                    for (java.lang.Object obj3 : list4) {
                        java.lang.Integer num5 = ((com.kiptv.core.model.E0) obj3).g;
                        java.lang.String strValueOf2 = java.lang.String.valueOf(num5 != null ? num5.intValue() : 1);
                        java.lang.Object arrayList3 = linkedHashMap5.get(strValueOf2);
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                            linkedHashMap5.put(strValueOf2, arrayList3);
                        }
                        ((java.util.List) arrayList3).add(obj3);
                    }
                    linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap5.size()));
                    for (java.util.Map.Entry entry2 : linkedHashMap5.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), p078i6.o.I1((java.util.List) entry2.getValue(), new com.kiptv.core.model.C1951k(5)));
                    }
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (com.kiptv.core.model.XtreamSeason xtreamSeason : listI1) {
                        java.lang.Integer num6 = xtreamSeason.f20680b;
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
                    java.util.List<p070h6.k> listI2 = p078i6.o.I1(arrayList4, new com.kiptv.core.model.C1951k(3));
                    java.util.Iterator it2 = listI2.iterator();
                    int iIntValue2 = 0;
                    while (it2.hasNext()) {
                        iIntValue2 += ((java.lang.Number) ((p070h6.k) it2.next()).f22540i).intValue();
                    }
                    int iMax = java.lang.Math.max(10, iIntValue2 / 10);
                    if (!listI2.isEmpty() && java.lang.Math.abs(iIntValue2 - list4.size()) <= iMax) {
                        java.util.List listI3 = p078i6.o.I1(list4, new com.kiptv.core.model.C1951k(4));
                        linkedHashMap2 = new java.util.LinkedHashMap();
                        for (p070h6.k kVar3 : listI2) {
                            int iIntValue3 = ((java.lang.Number) kVar3.f22539h).intValue();
                            int iMin = java.lang.Math.min(((java.lang.Number) kVar3.f22540i).intValue() + i3, listI3.size());
                            if (i3 < iMin) {
                                linkedHashMap2.put(java.lang.String.valueOf(iIntValue3), listI3.subList(i3, iMin));
                            }
                            i3 = iMin;
                        }
                        if (i3 < listI3.size()) {
                            java.lang.String strValueOf3 = java.lang.String.valueOf(((java.lang.Number) ((p070h6.k) p078i6.o.q1(listI2)).f22539h).intValue());
                            java.util.Collection collection = (java.util.List) linkedHashMap2.get(strValueOf3);
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
        return new com.kiptv.core.model.I0(listI1, xtreamSeriesDetail, linkedHashMap);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f19809b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.I0 value = (com.kiptv.core.model.I0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new java.lang.UnsupportedOperationException("Serialization not supported");
    }
}

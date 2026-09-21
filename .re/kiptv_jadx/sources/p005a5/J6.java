package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J6 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13549h;

    public /* synthetic */ J6(int i3) {
        this.f13549h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.C3098s c3098s;
        p011b1.E e6 = null;
        c1654k = null;
        p011b1.C1654k c1654k = null;
        c1655l = null;
        p011b1.C1655l c1655l = null;
        n = null;
        p011b1.N n3 = null;
        o = null;
        p011b1.O o8 = null;
        e = null;
        p011b1.E e9 = null;
        tVar = null;
        p011b1.t tVar = null;
        k = null;
        p011b1.K k9 = null;
        k = null;
        p011b1.K k10 = null;
        e6 = null;
        int i3 = 0;
        switch (this.f13549h) {
            case 0:
                java.util.Map.Entry it = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.getKey() + "=" + it.getValue();
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                java.lang.String str = (java.lang.String) entry.getKey();
                return new p005a5.j9(false, str, ((java.util.List) entry.getValue()).size(), str);
            case 2:
                return java.lang.Boolean.valueOf(!(((p011b1.InterfaceC1645b) obj) instanceof p011b1.t));
            case 3:
                p011b1.q qVar = (p011b1.q) obj;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
                sb.append(qVar.f17838b);
                sb.append(", ");
                return Y6.f.j(sb, qVar.f17839c, ')');
            case 4:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                p079i7.f fVar = p011b1.C.f17722h;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                boolean zA = kotlin.jvm.internal.m.a(obj2, bool);
                p194x6.j jVar = (p194x6.j) fVar.j;
                p011b1.E e10 = (zA || obj2 == null) ? null : (p011b1.E) jVar.invoke(obj2);
                java.lang.Object obj3 = list.get(1);
                p011b1.E e11 = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (p011b1.E) jVar.invoke(obj3);
                java.lang.Object obj4 = list.get(2);
                p011b1.E e12 = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (p011b1.E) jVar.invoke(obj4);
                java.lang.Object obj5 = list.get(3);
                if (!kotlin.jvm.internal.m.a(obj5, bool) && obj5 != null) {
                    e6 = (p011b1.E) jVar.invoke(obj5);
                }
                return new p011b1.K(e10, e11, e12, e6);
            case 5:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                java.util.List list2 = (java.util.List) obj;
                java.lang.Object obj6 = list2.get(1);
                java.util.List list3 = (kotlin.jvm.internal.m.a(obj6, java.lang.Boolean.FALSE) || obj6 == null) ? null : (java.util.List) ((p194x6.j) p011b1.C.f17716a.j).invoke(obj6);
                java.lang.Object obj7 = list2.get(0);
                java.lang.String str2 = obj7 != null ? (java.lang.String) obj7 : null;
                kotlin.jvm.internal.m.b(str2);
                return new p011b1.C1650g(list3, str2);
            case 6:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p104m1.l(((java.lang.Integer) obj).intValue());
            case 7:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                java.util.List list4 = (java.util.List) obj;
                return new p104m1.p(((java.lang.Number) list4.get(0)).floatValue(), ((java.lang.Number) list4.get(1)).floatValue());
            case 8:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list5 = (java.util.List) obj;
                java.lang.Object obj8 = list5.get(0);
                p113n1.q[] qVarArr = p113n1.p.f25569b;
                p011b1.B b9 = p011b1.C.f17735v;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj8, bool2);
                p194x6.j jVar2 = b9.f17711i;
                p113n1.p pVar = obj8 != null ? (p113n1.p) jVar2.invoke(obj8) : null;
                kotlin.jvm.internal.m.b(pVar);
                java.lang.Object obj9 = list5.get(1);
                kotlin.jvm.internal.m.a(obj9, bool2);
                p113n1.p pVar2 = obj9 != null ? (p113n1.p) jVar2.invoke(obj9) : null;
                kotlin.jvm.internal.m.b(pVar2);
                return new p104m1.q(pVar.f25571a, pVar2.f25571a);
            case 9:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p048f1.s(((java.lang.Integer) obj).intValue());
            case 10:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new p104m1.a(((java.lang.Float) obj).floatValue());
            case 11:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list6 = (java.util.List) obj;
                java.lang.Object obj10 = list6.get(0);
                java.lang.Integer num = obj10 != null ? (java.lang.Integer) obj10 : null;
                kotlin.jvm.internal.m.b(num);
                int iIntValue = num.intValue();
                java.lang.Object obj11 = list6.get(1);
                java.lang.Integer num2 = obj11 != null ? (java.lang.Integer) obj11 : null;
                kotlin.jvm.internal.m.b(num2);
                return new p011b1.L(p011b1.D.b(iIntValue, num2.intValue()));
            case 12:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list7 = (java.util.List) obj;
                java.lang.Object obj12 = list7.get(0);
                int i9 = p188x0.C3098s.f31128h;
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj12, bool3);
                if (obj12 != null) {
                    c3098s = kotlin.jvm.internal.m.a(obj12, java.lang.Boolean.FALSE) ? new p188x0.C3098s(p188x0.C3098s.g) : new p188x0.C3098s(p188x0.z.c(((java.lang.Integer) obj12).intValue()));
                } else {
                    c3098s = null;
                }
                kotlin.jvm.internal.m.b(c3098s);
                java.lang.Object obj13 = list7.get(1);
                p011b1.B b10 = p011b1.C.f17737x;
                kotlin.jvm.internal.m.a(obj13, bool3);
                p181w0.a aVar = obj13 != null ? (p181w0.a) b10.f17711i.invoke(obj13) : null;
                kotlin.jvm.internal.m.b(aVar);
                java.lang.Object obj14 = list7.get(2);
                java.lang.Float f9 = obj14 != null ? (java.lang.Float) obj14 : null;
                kotlin.jvm.internal.m.b(f9);
                return new p188x0.N(c3098s.f31129a, aVar.f29744a, f9.floatValue());
            case 13:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p104m1.k(((java.lang.Integer) obj).intValue());
            case 14:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                java.util.List list8 = (java.util.List) obj;
                java.lang.Object obj15 = list8.get(0);
                java.lang.String str3 = obj15 != null ? (java.lang.String) obj15 : null;
                kotlin.jvm.internal.m.b(str3);
                java.lang.Object obj16 = list8.get(1);
                p079i7.f fVar2 = p011b1.C.f17723i;
                if (!kotlin.jvm.internal.m.a(obj16, java.lang.Boolean.FALSE) && obj16 != null) {
                    k10 = (p011b1.K) ((p194x6.j) fVar2.j).invoke(obj16);
                }
                return new p011b1.C1655l(str3, k10);
            case 15:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p104m1.m(((java.lang.Integer) obj).intValue());
            case 16:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p104m1.d(((java.lang.Integer) obj).intValue());
            case 17:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list9 = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(list9.size());
                int size = list9.size();
                while (i3 < size) {
                    java.lang.Object obj17 = list9.get(i3);
                    p011b1.C1648e c1648e = (kotlin.jvm.internal.m.a(obj17, java.lang.Boolean.FALSE) || obj17 == null) ? null : (p011b1.C1648e) ((p194x6.j) p011b1.C.f17717b.j).invoke(obj17);
                    kotlin.jvm.internal.m.b(c1648e);
                    arrayList.add(c1648e);
                    i3++;
                }
                return arrayList;
            case 18:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p048f1.o(((java.lang.Integer) obj).intValue());
            case 19:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p048f1.p(((java.lang.Integer) obj).intValue());
            case 20:
                java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                if (kotlin.jvm.internal.m.a(obj, bool4)) {
                    return new p113n1.p(p113n1.p.f25570c);
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list10 = (java.util.List) obj;
                java.lang.Object obj18 = list10.get(0);
                java.lang.Float f10 = obj18 != null ? (java.lang.Float) obj18 : null;
                kotlin.jvm.internal.m.b(f10);
                float fFloatValue = f10.floatValue();
                java.lang.Object obj19 = list10.get(1);
                p011b1.B b11 = p011b1.C.f17736w;
                kotlin.jvm.internal.m.a(obj19, bool4);
                p113n1.q qVar2 = obj19 != null ? (p113n1.q) b11.f17711i.invoke(obj19) : null;
                kotlin.jvm.internal.m.b(qVar2);
                return new p113n1.p(com.google.common.util.concurrent.D.C(qVar2.f25572a, fFloatValue));
            case 21:
                if (kotlin.jvm.internal.m.a(obj, 0)) {
                    return new p113n1.q(8589934592L);
                }
                return kotlin.jvm.internal.m.a(obj, 1) ? new p113n1.q(4294967296L) : new p113n1.q(0L);
            case 22:
                if (kotlin.jvm.internal.m.a(obj, java.lang.Boolean.FALSE)) {
                    return new p181w0.a(9205357640488583168L);
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                java.util.List list11 = (java.util.List) obj;
                java.lang.Object obj20 = list11.get(0);
                java.lang.Float f11 = obj20 != null ? (java.lang.Float) obj20 : null;
                kotlin.jvm.internal.m.b(f11);
                float fFloatValue2 = f11.floatValue();
                java.lang.Object obj21 = list11.get(1);
                java.lang.Float f12 = obj21 != null ? (java.lang.Float) obj21 : null;
                kotlin.jvm.internal.m.b(f12);
                return new p181w0.a((((long) java.lang.Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
            case 23:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list12 = (java.util.List) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list12.size());
                int size2 = list12.size();
                while (i3 < size2) {
                    java.lang.Object obj22 = list12.get(i3);
                    p074i1.a aVar2 = (kotlin.jvm.internal.m.a(obj22, java.lang.Boolean.FALSE) || obj22 == null) ? null : (p074i1.a) ((p194x6.j) p011b1.C.f17738z.j).invoke(obj22);
                    kotlin.jvm.internal.m.b(aVar2);
                    arrayList2.add(aVar2);
                    i3++;
                }
                return new p074i1.b(arrayList2);
            case 24:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str4 = (java.lang.String) obj;
                p074i1.c.f22749a.getClass();
                java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str4);
                if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
                    android.util.Log.e("Locale", "The language tag " + str4 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new p074i1.a(localeForLanguageTag);
            case 25:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                java.util.List list13 = (java.util.List) obj;
                java.lang.Object obj23 = list13.get(0);
                java.lang.String str5 = obj23 != null ? (java.lang.String) obj23 : null;
                kotlin.jvm.internal.m.b(str5);
                java.lang.Object obj24 = list13.get(1);
                p079i7.f fVar3 = p011b1.C.f17723i;
                if (!kotlin.jvm.internal.m.a(obj24, java.lang.Boolean.FALSE) && obj24 != null) {
                    k9 = (p011b1.K) ((p194x6.j) fVar3.j).invoke(obj24);
                }
                return new p011b1.C1654k(str5, k9);
            case 26:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list14 = (java.util.List) obj;
                java.lang.Object obj25 = list14.get(0);
                float f13 = p104m1.f.f25163b;
                p011b1.B b12 = p011b1.C.f17713B;
                java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj25, bool5);
                p104m1.f fVar4 = obj25 != null ? (p104m1.f) b12.f17711i.invoke(obj25) : null;
                kotlin.jvm.internal.m.b(fVar4);
                java.lang.Object obj26 = list14.get(1);
                p011b1.B b13 = p011b1.C.f17714C;
                kotlin.jvm.internal.m.a(obj26, bool5);
                p104m1.h hVar = obj26 != null ? (p104m1.h) b13.f17711i.invoke(obj26) : null;
                kotlin.jvm.internal.m.b(hVar);
                java.lang.Object obj27 = list14.get(2);
                p011b1.B b14 = p011b1.C.f17715D;
                kotlin.jvm.internal.m.a(obj27, bool5);
                p104m1.g gVar = obj27 != null ? (p104m1.g) b14.f17711i.invoke(obj27) : null;
                kotlin.jvm.internal.m.b(gVar);
                return new p104m1.i(fVar4.f25166a, hVar.f25168a, gVar.f25167a);
            case 27:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                p104m1.f.a(fFloatValue3);
                return new p104m1.f(fFloatValue3);
            case 28:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p104m1.h(((java.lang.Integer) obj).intValue());
            default:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list15 = (java.util.List) obj;
                java.lang.Object obj28 = list15.get(0);
                p011b1.EnumC1652i enumC1652i = obj28 != null ? (p011b1.EnumC1652i) obj28 : null;
                kotlin.jvm.internal.m.b(enumC1652i);
                java.lang.Object obj29 = list15.get(2);
                java.lang.Integer num3 = obj29 != null ? (java.lang.Integer) obj29 : null;
                kotlin.jvm.internal.m.b(num3);
                int iIntValue2 = num3.intValue();
                java.lang.Object obj30 = list15.get(3);
                java.lang.Integer num4 = obj30 != null ? (java.lang.Integer) obj30 : null;
                kotlin.jvm.internal.m.b(num4);
                int iIntValue3 = num4.intValue();
                java.lang.Object obj31 = list15.get(4);
                java.lang.String str6 = obj31 != null ? (java.lang.String) obj31 : null;
                kotlin.jvm.internal.m.b(str6);
                switch (enumC1652i.ordinal()) {
                    case 0:
                        java.lang.Object obj32 = list15.get(1);
                        p079i7.f fVar5 = p011b1.C.g;
                        if (!kotlin.jvm.internal.m.a(obj32, java.lang.Boolean.FALSE) && obj32 != null) {
                            tVar = (p011b1.t) ((p194x6.j) fVar5.j).invoke(obj32);
                        }
                        kotlin.jvm.internal.m.b(tVar);
                        return new p011b1.C1648e(tVar, iIntValue2, iIntValue3, str6);
                    case 1:
                        java.lang.Object obj33 = list15.get(1);
                        p079i7.f fVar6 = p011b1.C.f17722h;
                        if (!kotlin.jvm.internal.m.a(obj33, java.lang.Boolean.FALSE) && obj33 != null) {
                            e9 = (p011b1.E) ((p194x6.j) fVar6.j).invoke(obj33);
                        }
                        kotlin.jvm.internal.m.b(e9);
                        return new p011b1.C1648e(e9, iIntValue2, iIntValue3, str6);
                    case 2:
                        java.lang.Object obj34 = list15.get(1);
                        p079i7.f fVar7 = p011b1.C.f17718c;
                        if (!kotlin.jvm.internal.m.a(obj34, java.lang.Boolean.FALSE) && obj34 != null) {
                            o8 = (p011b1.O) ((p194x6.j) fVar7.j).invoke(obj34);
                        }
                        kotlin.jvm.internal.m.b(o8);
                        return new p011b1.C1648e(o8, iIntValue2, iIntValue3, str6);
                    case 3:
                        java.lang.Object obj35 = list15.get(1);
                        p079i7.f fVar8 = p011b1.C.f17719d;
                        if (!kotlin.jvm.internal.m.a(obj35, java.lang.Boolean.FALSE) && obj35 != null) {
                            n3 = (p011b1.N) ((p194x6.j) fVar8.j).invoke(obj35);
                        }
                        kotlin.jvm.internal.m.b(n3);
                        return new p011b1.C1648e(n3, iIntValue2, iIntValue3, str6);
                    case 4:
                        java.lang.Object obj36 = list15.get(1);
                        p079i7.f fVar9 = p011b1.C.f17720e;
                        if (!kotlin.jvm.internal.m.a(obj36, java.lang.Boolean.FALSE) && obj36 != null) {
                            c1655l = (p011b1.C1655l) ((p194x6.j) fVar9.j).invoke(obj36);
                        }
                        kotlin.jvm.internal.m.b(c1655l);
                        return new p011b1.C1648e(c1655l, iIntValue2, iIntValue3, str6);
                    case 5:
                        java.lang.Object obj37 = list15.get(1);
                        p079i7.f fVar10 = p011b1.C.f17721f;
                        if (!kotlin.jvm.internal.m.a(obj37, java.lang.Boolean.FALSE) && obj37 != null) {
                            c1654k = (p011b1.C1654k) ((p194x6.j) fVar10.j).invoke(obj37);
                        }
                        kotlin.jvm.internal.m.b(c1654k);
                        return new p011b1.C1648e(c1654k, iIntValue2, iIntValue3, str6);
                    case 6:
                        java.lang.Object obj38 = list15.get(1);
                        java.lang.String str7 = obj38 != null ? (java.lang.String) obj38 : null;
                        kotlin.jvm.internal.m.b(str7);
                        return new p011b1.C1648e(new p011b1.G(str7), iIntValue2, iIntValue3, str6);
                    default:
                        throw new I3.b();
                }
        }
    }
}

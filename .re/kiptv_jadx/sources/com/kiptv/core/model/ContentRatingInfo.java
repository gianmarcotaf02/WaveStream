package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ContentRatingInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class ContentRatingInfo {
    private static final com.kiptv.core.model.ContentRatingInfo.Companion Companion = new com.kiptv.core.model.ContentRatingInfo.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19681e = {null, null, com.kiptv.core.model.EnumC1948i0.Companion.serializer(), p153r8.AbstractC2686a0.f("com.kiptv.core.model.generated.RatingScales.Kind", X4.b.values())};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f19682f = p078i6.m.F0(new java.lang.String[]{"US", "PR", "VI"});
    public static final java.util.Set g = p078i6.m.F0(new java.lang.String[]{"AT", "CH"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.EnumC1948i0 f19685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X4.b f19686d;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/ContentRatingInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ContentRatingInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "MAX_CONVERSION_DRIFT", "I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.ContentRatingInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentRatingInfo(int i3, java.lang.String str, java.lang.String str2, com.kiptv.core.model.EnumC1948i0 enumC1948i0, X4.b bVar) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.ContentRatingInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19683a = str;
        this.f19684b = str2;
        if ((i3 & 4) == 0) {
            this.f19685c = com.kiptv.core.model.EnumC1948i0.f20778i;
        } else {
            this.f19685c = enumC1948i0;
        }
        if ((i3 & 8) == 0) {
            this.f19686d = X4.b.f10859h;
        } else {
            this.f19686d = bVar;
        }
    }

    public static com.kiptv.core.model.ContentRatingInfo a(com.kiptv.core.model.ContentRatingInfo contentRatingInfo, java.lang.String str) {
        X4.d dVar;
        int i3 = 1;
        X4.b targetKind = contentRatingInfo.f19686d;
        contentRatingInfo.getClass();
        kotlin.jvm.internal.m.e(targetKind, "targetKind");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        if (upperCase.equals(contentRatingInfo.c()) && targetKind == contentRatingInfo.f19686d) {
            return contentRatingInfo;
        }
        X4.d dVarG = contentRatingInfo.g();
        java.lang.Integer numValueOf = dVarG != null ? java.lang.Integer.valueOf(dVarG.f10867b) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            java.util.List listB = X4.c.b(upperCase, targetKind);
            if (listB != null) {
                if (listB.isEmpty()) {
                    listB = null;
                }
                if (listB != null && (dVar = (X4.d) p078i6.o.v1(listB, com.google.crypto.tink.shaded.protobuf.q0.n(new D5.C0250e0(iIntValue, 5), new com.kiptv.core.model.C1933b(i3)))) != null) {
                    int i9 = ((X4.d) p078i6.o.h1(listB)).f10867b;
                    int i10 = dVar.f10867b;
                    if (i10 == i9 || java.lang.Math.abs(i10 - iIntValue) <= 3) {
                        com.kiptv.core.model.EnumC1948i0 enumC1948i0 = com.kiptv.core.model.EnumC1948i0.f20778i;
                        if (contentRatingInfo.f19685c != enumC1948i0 || !upperCase.equals(contentRatingInfo.c())) {
                            enumC1948i0 = com.kiptv.core.model.EnumC1948i0.j;
                        }
                        return new com.kiptv.core.model.ContentRatingInfo(dVar.f10866a, upperCase, enumC1948i0, targetKind);
                    }
                }
            }
        }
        return null;
    }

    public static java.lang.String h(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = lowerCase.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = lowerCase.charAt(i3);
            if (java.lang.Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public final java.lang.String b() {
        java.lang.String lowerCase;
        java.util.List listI0;
        java.lang.Object obj = X4.c.f10861a;
        java.lang.String strC = c();
        X4.b kind = this.f19686d;
        kotlin.jvm.internal.m.e(kind, "kind");
        ?? r9 = kind == X4.b.f10859h ? X4.c.f10863c : X4.c.f10864d;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strC.toUpperCase(locale);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        X4.a aVar = (X4.a) r9.get(upperCase);
        if (aVar == null) {
            aVar = X4.a.f10857k;
        }
        if (com.kiptv.core.model.AbstractC1935c.f20742a[aVar.ordinal()] == 1) {
            aVar = this.f19685c == com.kiptv.core.model.EnumC1948i0.f20778i ? X4.a.f10855h : X4.a.f10857k;
        }
        if (aVar != X4.a.f10855h) {
            return null;
        }
        if (kind == X4.b.f10860i) {
            if (f19682f.contains(c())) {
                lowerCase = "us_tv";
            } else if (g.contains(c())) {
                lowerCase = "de";
            } else {
                lowerCase = c().toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            }
        } else if (g.contains(c())) {
            lowerCase = "de";
        } else {
            lowerCase = c().toLowerCase(locale);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        }
        java.lang.String lowerCase2 = d().toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
        java.lang.String strW0 = O7.x.w0(lowerCase2, "+", "plus");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("[^a-z0-9]+");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        int iEnd = 0;
        O7.q.Y0(0);
        java.util.regex.Matcher matcher = patternCompile.matcher(strW0);
        if (matcher.find()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(10);
            do {
                arrayList.add(strW0.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(strW0.subSequence(iEnd, strW0.length()).toString());
            listI0 = arrayList;
        } else {
            listI0 = com.google.common.util.concurrent.P.i0(strW0.toString());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listI0) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        java.lang.String strO1 = p078i6.o.o1(arrayList2, "_", null, null, null, 62);
        if (strO1.length() == 0) {
            return null;
        }
        return B2.a.m("ic_rating_", lowerCase, "_", strO1);
    }

    public final java.lang.String c() {
        java.lang.String upperCase = this.f19684b.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String d() {
        java.util.Set setEntrySet;
        java.lang.Object next;
        java.lang.String str;
        java.util.Map map = (java.util.Map) X4.c.f10865e.get(c());
        java.lang.String str2 = this.f19683a;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            java.util.Iterator it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!O7.x.r0((java.lang.String) ((java.util.Map.Entry) next).getKey(), str2, true));
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (entry != null && (str = (java.lang.String) entry.getValue()) != null) {
                return str;
            }
        }
        return str2;
    }

    public final java.lang.String e() {
        X4.d dVarG = g();
        java.lang.Integer numValueOf = dVarG != null ? java.lang.Integer.valueOf(dVarG.f10867b) : null;
        if (numValueOf != null) {
            return Y6.f.e(numValueOf.intValue(), "+");
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.ContentRatingInfo)) {
            return false;
        }
        com.kiptv.core.model.ContentRatingInfo contentRatingInfo = (com.kiptv.core.model.ContentRatingInfo) obj;
        return kotlin.jvm.internal.m.a(this.f19683a, contentRatingInfo.f19683a) && kotlin.jvm.internal.m.a(this.f19684b, contentRatingInfo.f19684b) && this.f19685c == contentRatingInfo.f19685c && this.f19686d == contentRatingInfo.f19686d;
    }

    public final com.kiptv.core.model.ContentRatingInfo f() {
        com.kiptv.core.model.ContentRatingInfo contentRatingInfoA;
        java.lang.String strU = com.google.android.gms.internal.play_billing.V0.u();
        return (c().equals(strU) || (contentRatingInfoA = a(this, strU)) == null) ? this : contentRatingInfoA;
    }

    public final X4.d g() {
        java.lang.Object next;
        java.lang.Integer numZ0;
        int iIntValue;
        java.lang.Object next2;
        int i3 = 0;
        int i9 = 2;
        java.lang.Object obj = X4.c.f10861a;
        java.util.List listB = X4.c.b(c(), this.f19686d);
        if (listB != null) {
            java.lang.String strD = d();
            java.util.Iterator it = listB.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((X4.d) next).f10866a.equalsIgnoreCase(strD));
            X4.d dVar = (X4.d) next;
            if (dVar != null) {
                return dVar;
            }
            java.lang.String strH = h(strD);
            if (strH.length() > 0) {
                java.util.Iterator it2 = listB.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.m.a(h(((X4.d) next2).f10866a), strH));
                X4.d dVar2 = (X4.d) next2;
                if (dVar2 != null) {
                    return dVar2;
                }
            }
            java.lang.String str = (java.lang.String) p078i6.o.F1(N7.o.s0(N7.o.p0(O7.o.b(new O7.o("\\d+"), strD), new com.kiptv.core.model.C1933b(i9))));
            if (str == null || (numZ0 = O7.x.z0(str)) == null || (iIntValue = numZ0.intValue()) < 0 || iIntValue >= 22) {
                numZ0 = null;
            }
            if (numZ0 != null) {
                int iIntValue2 = numZ0.intValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : listB) {
                    if (((X4.d) obj2).f10867b == iIntValue2) {
                        arrayList.add(obj2);
                    }
                }
                X4.d dVar3 = (X4.d) p078i6.o.j1(arrayList);
                if (dVar3 != null) {
                    return dVar3;
                }
                X4.d dVar4 = (X4.d) p078i6.o.v1(listB, com.google.crypto.tink.shaded.protobuf.q0.n(new D5.C0250e0(iIntValue2, 4), new com.kiptv.core.model.C1933b(i3)));
                if (dVar4 != null && java.lang.Math.abs(dVar4.f10867b - iIntValue2) <= 3) {
                    return dVar4;
                }
            }
        }
        return null;
    }

    public final int hashCode() {
        return this.f19686d.hashCode() + ((this.f19685c.hashCode() + B2.a.a(this.f19683a.hashCode() * 31, 31, this.f19684b)) * 31);
    }

    public final java.lang.String toString() {
        return "ContentRatingInfo(certification=" + this.f19683a + ", region=" + this.f19684b + ", provenance=" + this.f19685c + ", kind=" + this.f19686d + ")";
    }

    public ContentRatingInfo(java.lang.String str, java.lang.String region, com.kiptv.core.model.EnumC1948i0 enumC1948i0, X4.b bVar) {
        kotlin.jvm.internal.m.e(region, "region");
        this.f19683a = str;
        this.f19684b = region;
        this.f19685c = enumC1948i0;
        this.f19686d = bVar;
    }
}

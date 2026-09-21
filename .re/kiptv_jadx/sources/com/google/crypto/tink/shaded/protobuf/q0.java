package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f19573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f19574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static java.lang.Class f19575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f19576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Field f19577f;
    public static boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static java.lang.reflect.Field f19578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f19579i;
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19580k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f19581l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f19582m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19583a;

    public /* synthetic */ q0(int i3) {
        this.f19583a = i3;
    }

    public static int A(int i3, int i9, int i10, int[] iArr) {
        while (i9 < i10) {
            if (iArr[i9] == i3) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static final boolean B(java.lang.String key, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }

    public static java.lang.String D(java.lang.String str, java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String string;
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        int i3 = 0;
        for (int i9 = 0; i9 < objArr.length; i9++) {
            java.lang.Object obj = objArr[i9];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (java.lang.Exception e6) {
                    java.lang.String str2 = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for " + str2, (java.lang.Throwable) e6);
                    java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("<", str2, " threw ");
                    sbQ.append(e6.getClass().getName());
                    sbQ.append(">");
                    string = sbQ.toString();
                }
            }
            objArr[i9] = string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((objArr.length * 16) + strValueOf.length());
        int i10 = 0;
        while (i3 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i10)) != -1) {
            sb.append((java.lang.CharSequence) strValueOf, i10, iIndexOf);
            sb.append(objArr[i3]);
            i10 = iIndexOf + 2;
            i3++;
        }
        sb.append((java.lang.CharSequence) strValueOf, i10, strValueOf.length());
        if (i3 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i11 = i3 + 1; i11 < objArr.length; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    public static p080i8.c E(p080i8.p pVar, java.lang.String str, p080i8.c initialContainer) throws java.io.IOException, p080i8.j {
        java.lang.String string;
        kotlin.jvm.internal.m.e(initialContainer, "initialContainer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayListD0 = p078i6.p.D0(new p080i8.k(initialContainer, pVar, 0));
        while (true) {
            p080i8.k kVar = (p080i8.k) p078i6.u.U0(arrayListD0);
            if (kVar != null) {
                p080i8.c cVar = (p080i8.c) kVar.f23269a.a();
                p080i8.p pVar2 = kVar.f23270b;
                int size = pVar2.f23275a.size();
                int iIntValue = kVar.f23271c;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        java.util.List list = pVar2.f23276b;
                        if (!list.isEmpty()) {
                            int size2 = list.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i9 = size2 - 1;
                                arrayListD0.add(new p080i8.k(cVar, (p080i8.p) list.get(size2), iIntValue));
                                if (i9 < 0) {
                                    break;
                                }
                                size2 = i9;
                            }
                        } else {
                            if (iIntValue != str.length()) {
                                arrayList.add(new p080i8.i(iIntValue, p080i8.m.f23273h));
                                break;
                            }
                            return cVar;
                        }
                    } else {
                        java.lang.Object objA = ((p080i8.o) pVar2.f23275a.get(i3)).a(cVar, str, iIntValue);
                        if (!(objA instanceof java.lang.Integer)) {
                            if (!(objA instanceof p080i8.i)) {
                                throw new java.lang.IllegalStateException(p121o0.p.n(objA, "Unexpected parse result: "));
                            }
                            arrayList.add((p080i8.i) objA);
                            break;
                        }
                        iIntValue = ((java.lang.Number) objA).intValue();
                        i3++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    p078i6.t.L0(new p080i8.l(0), arrayList);
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((p080i8.i) arrayList.get(0)).f23267a + ": " + ((java.lang.String) ((p080i8.i) arrayList.get(0)).f23268b.invoke());
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(arrayList.size() * 33);
                    p078i6.o.n1(arrayList, sb, ", ", "Errors: ", null, p080i8.n.f23274h, 56);
                    string = sb.toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                }
                throw new p080i8.j(string);
            }
        }
    }

    public static int F(long j9) {
        if (j9 > 2147483647L) {
            return androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        if (j9 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j9;
    }

    public static final java.lang.Object G(java.util.Set set, java.lang.Enum r9, java.lang.Enum r10, java.lang.Enum r11, boolean z6) {
        java.lang.Enum r12;
        if (!z6) {
            if (r11 != null) {
                set = p078i6.o.R1(p078i6.I.p0(set, r11));
            }
            return p078i6.o.E1(set);
        }
        if (set.contains(r9)) {
            r12 = r9;
        } else {
            r12 = set.contains(r10) ? r10 : null;
        }
        if (kotlin.jvm.internal.m.a(r12, r9) && kotlin.jvm.internal.m.a(r11, r10)) {
            return null;
        }
        return r11 == null ? r12 : r11;
    }

    public static int[] H(java.util.Collection collection) {
        if (collection instanceof p107m4.b) {
            p107m4.b bVar = (p107m4.b) collection;
            return java.util.Arrays.copyOfRange(bVar.f25393h, bVar.f25394i, bVar.j);
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            java.lang.Object obj = array[i3];
            obj.getClass();
            iArr[i3] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    public static final java.lang.String I(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int i3 = 0;
        int i9 = -1;
        if (!O7.q.B0(str, ":", false)) {
            try {
                java.lang.String ascii = java.net.IDN.toASCII(str);
                kotlin.jvm.internal.m.d(ascii, "toASCII(host)");
                java.util.Locale US = java.util.Locale.US;
                kotlin.jvm.internal.m.d(US, "US");
                java.lang.String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = lowerCase.charAt(i10);
                    if (kotlin.jvm.internal.m.f(cCharAt, 31) <= 0 || kotlin.jvm.internal.m.f(cCharAt, 127) >= 0 || O7.q.K0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        java.net.InetAddress inetAddressQ = (O7.x.x0(str, "[", false) && O7.x.q0(str, "]", false)) ? q(1, str.length() - 1, str) : q(0, str.length(), str);
        if (inetAddressQ == null) {
            return null;
        }
        byte[] address = inetAddressQ.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressQ.getHostAddress();
            }
            throw new java.lang.AssertionError(B2.a.i('\'', "Invalid IPv6 address: '", str));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < address.length) {
            int i13 = i11;
            while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i9 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        M8.C0682j c0682j = new M8.C0682j();
        while (i3 < address.length) {
            if (i3 == i9) {
                c0682j.Z(58);
                i3 += i12;
                if (i3 == 16) {
                    c0682j.Z(58);
                }
            } else {
                if (i3 > 0) {
                    c0682j.Z(58);
                }
                byte b9 = address[i3];
                byte[] bArr = x8.b.f31716a;
                c0682j.a0(((b9 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return c0682j.T();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final t5.C2819m0 J(com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail, java.lang.String imageBaseUrl) {
        java.lang.String str;
        com.kiptv.core.model.TMDBImage tMDBImageA;
        java.util.List list;
        java.lang.Object next;
        kotlin.jvm.internal.m.e(tMDBMovieDetail, "<this>");
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        com.kiptv.core.model.TMDBCredits tMDBCredits = tMDBMovieDetail.f20211s;
        if (tMDBCredits == null || (list = tMDBCredits.f20148b) == null) {
            str = null;
        } else {
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBCrewMember) next).f20151c, "Director"));
            com.kiptv.core.model.TMDBCrewMember tMDBCrewMember = (com.kiptv.core.model.TMDBCrewMember) next;
            if (tMDBCrewMember != null) {
                str = tMDBCrewMember.f20150b;
            } else {
                str = null;
            }
        }
        java.util.List list2 = tMDBCredits != null ? tMDBCredits.f20147a : null;
        java.util.List list3 = p078i6.w.f23205h;
        if (list2 == null) {
            list2 = list3;
        }
        java.util.List listJ1 = p078i6.o.J1(list2, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listJ1, 10));
        java.util.Iterator it2 = listJ1.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.kiptv.core.model.TMDBCastMember) it2.next()).f20123b);
        }
        com.kiptv.core.model.TMDBImages tMDBImages = tMDBMovieDetail.f20212t;
        java.lang.String str2 = (tMDBImages == null || (tMDBImageA = com.kiptv.core.model.TMDBImages.a(tMDBImages)) == null) ? null : tMDBImageA.f20180a;
        Y4.Q0.Companion.getClass();
        java.lang.String strB = Y4.A.b(str2, "w300", imageBaseUrl);
        java.lang.Integer numC = tMDBMovieDetail.c();
        java.util.List list4 = tMDBMovieDetail.f20204l;
        if (list4 != null) {
            list3 = list4;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list3, 10));
        java.util.Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((com.kiptv.core.model.TMDBGenre) it3.next()).f20179b);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        java.util.List listC0 = arrayList;
        if (zIsEmpty) {
            listC0 = p078i6.p.C0(str);
        }
        return new t5.C2819m0(tMDBMovieDetail.f20196b, strB, (java.lang.String) null, numC, tMDBMovieDetail.f20202i, (java.lang.Integer) null, tMDBMovieDetail.j, tMDBMovieDetail.f20203k, arrayList2, listC0, tMDBMovieDetail.f20199e, tMDBMovieDetail.a(null), (java.util.List) null, 12324);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static java.lang.Integer K(java.lang.String str) {
        byte b9;
        java.lang.Long lValueOf;
        byte b10;
        str.getClass();
        if (!str.isEmpty()) {
            int i3 = str.charAt(0) == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i9 = i3 + 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt < 128) {
                    b9 = p107m4.c.f25395a[cCharAt];
                } else {
                    byte[] bArr = p107m4.c.f25395a;
                    b9 = -1;
                }
                if (b9 >= 0 && b9 < 10) {
                    long j9 = -b9;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i9 >= str.length()) {
                            if (i3 == 0) {
                                if (j9 != Long.MIN_VALUE) {
                                    lValueOf = java.lang.Long.valueOf(-j9);
                                    break;
                                }
                                break;
                            }
                            lValueOf = java.lang.Long.valueOf(j9);
                            break;
                        }
                        int i10 = i9 + 1;
                        char cCharAt2 = str.charAt(i9);
                        if (cCharAt2 < 128) {
                            b10 = p107m4.c.f25395a[cCharAt2];
                        } else {
                            byte[] bArr2 = p107m4.c.f25395a;
                            b10 = -1;
                        }
                        if (b10 >= 0 && b10 < 10 && j9 >= j11) {
                            long j12 = j9 * j10;
                            int i11 = i3;
                            long j13 = b10;
                            if (j12 >= j13 - Long.MIN_VALUE) {
                                j9 = j12 - j13;
                                i9 = i10;
                                i3 = i11;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(lValueOf.intValue());
    }

    public static int L(long j9, byte[] bArr, int i3, int i9) {
        if (i9 == 0) {
            com.google.crypto.tink.shaded.protobuf.q0 q0Var = com.google.crypto.tink.shaded.protobuf.s0.f19590a;
            if (i3 > -12) {
                return -1;
            }
            return i3;
        }
        if (i9 == 1) {
            return com.google.crypto.tink.shaded.protobuf.s0.c(i3, com.google.crypto.tink.shaded.protobuf.p0.g(j9, bArr));
        }
        if (i9 == 2) {
            return com.google.crypto.tink.shaded.protobuf.s0.d(i3, com.google.crypto.tink.shaded.protobuf.p0.g(j9, bArr), com.google.crypto.tink.shaded.protobuf.p0.g(j9 + 1, bArr));
        }
        throw new java.lang.AssertionError();
    }

    public static final long M(long j9, long j10) {
        int iD;
        int iF = p011b1.L.f(j9);
        int iE = p011b1.L.e(j9);
        if ((p011b1.L.f(j10) < p011b1.L.e(j9)) && (p011b1.L.f(j9) < p011b1.L.e(j10))) {
            if ((p011b1.L.f(j10) <= p011b1.L.f(j9)) && (p011b1.L.e(j9) <= p011b1.L.e(j10))) {
                iF = p011b1.L.f(j10);
                iE = iF;
            } else {
                if ((p011b1.L.f(j9) <= p011b1.L.f(j10)) && (p011b1.L.e(j10) <= p011b1.L.e(j9))) {
                    iD = p011b1.L.d(j10);
                } else {
                    int iF2 = p011b1.L.f(j10);
                    if (iF >= p011b1.L.e(j10) || iF2 > iF) {
                        iE = p011b1.L.f(j10);
                    } else {
                        iF = p011b1.L.f(j10);
                        iD = p011b1.L.d(j10);
                    }
                }
                iE -= iD;
            }
        } else if (iE > p011b1.L.f(j10)) {
            iF -= p011b1.L.d(j10);
            iD = p011b1.L.d(j10);
            iE -= iD;
        }
        return p011b1.D.b(iF, iE);
    }

    public static java.lang.String N(com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(abstractC1859m0.n());
        for (int i3 = 0; i3 < abstractC1859m0.n(); i3++) {
            byte bD = abstractC1859m0.d(i3);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final long a(float f9, float f10) {
        return (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f9) << 32);
    }

    public static p048f1.y b(int i3, p048f1.s sVar) {
        return new p048f1.y(i3, sVar, new p048f1.r(new p048f1.q[0]));
    }

    public static final long c(float f9, float f10) {
        return (((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f9) << 32);
    }

    public static final p153r8.g0 d(java.lang.String str, p135p8.f fVar) {
        if (O7.q.N0(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited");
        }
        java.lang.Object it = ((p064h0.h) p153r8.h0.f26967a.values()).iterator();
        while (((D1.I) it).hasNext()) {
            kotlinx.serialization.KSerializer kSerializer = (kotlinx.serialization.KSerializer) ((p086j6.c) it).next();
            if (str.equals(kSerializer.getDescriptor().a())) {
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbQ.append(kotlin.jvm.internal.B.f24540a.b(kSerializer.getClass()).h());
                sbQ.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new java.lang.IllegalArgumentException(O7.r.T(sbQ.toString()));
            }
        }
        return new p153r8.g0(str, fVar);
    }

    public static final t5.C2819m0 e(t5.C2819m0 c2819m0, java.util.List list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<com.kiptv.core.model.TMDBWatchProvider> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (hashSet.add(java.lang.Integer.valueOf(((com.kiptv.core.model.TMDBWatchProvider) obj).f20351a))) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.kiptv.core.model.TMDBWatchProvider tMDBWatchProvider : arrayList) {
            Y4.A a2 = Y4.Q0.Companion;
            java.lang.String str = tMDBWatchProvider.f20353c;
            a2.getClass();
            java.lang.String strB = Y4.A.b(str, "w92", "https://image.tmdb.org/t/p");
            if (strB != null) {
                arrayList2.add(strB);
            }
        }
        return t5.C2819m0.a(c2819m0, arrayList2);
    }

    public static java.util.List f(int... iArr) {
        return iArr.length == 0 ? java.util.Collections.EMPTY_LIST : new p107m4.b(0, iArr.length, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:22:0x0067->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[EDGE_INSN: B:31:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:22:0x0067->B:26:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(K0.S r8, K0.EnumC0668p r9, p117n6.a r10) {
        /*
            boolean r0 = r10 instanceof x.P
            if (r0 == 0) goto L13
            r0 = r10
            x.P r0 = (x.P) r0
            int r1 = r0.f30765k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30765k = r1
            goto L18
        L13:
            x.P r0 = new x.P
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.f30765k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            K0.p r8 = r0.f30764i
            K0.S r9 = r0.f30763h
            com.google.common.util.concurrent.P.u0(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.google.common.util.concurrent.P.u0(r10)
            K0.U r10 = r8.f6674m
            K0.o r10 = r10.f6685z
            java.lang.Object r10 = r10.f6724a
            int r2 = r10.size()
            r5 = r4
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            K0.x r6 = (K0.x) r6
            boolean r6 = r6.f6741d
            if (r6 == 0) goto L77
        L51:
            r0.f30763h = r8
            r0.f30764i = r9
            r0.f30765k = r3
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            K0.o r10 = (K0.C0667o) r10
            java.lang.Object r10 = r10.f6724a
            int r2 = r10.size()
            r5 = r4
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            K0.x r6 = (K0.x) r6
            boolean r6 = r6.f6741d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            h6.A r8 = p070h6.A.f22523a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.g(K0.S, K0.p, n6.a):java.lang.Object");
    }

    public static final java.lang.Object h(K0.B b9, p194x6.m mVar, p100l6.c cVar) {
        java.lang.Object objN0 = ((K0.U) b9).N0(new x.Q(cVar.getContext(), mVar, null), cVar);
        return objN0 == p109m6.a.f25430h ? objN0 : p070h6.A.f22523a;
    }

    public static final java.lang.Object i(java.lang.Object possiblyPrimitiveType, boolean z6) {
        p169t7.c cVar;
        kotlin.jvm.internal.m.e(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z6) {
            possiblyPrimitiveType = (p044e7.k) possiblyPrimitiveType;
            if ((possiblyPrimitiveType instanceof p044e7.j) && (cVar = ((p044e7.j) possiblyPrimitiveType).f21460i) != null) {
                p101l7.c cVar2 = cVar.f28546k;
                if (cVar2 == null) {
                    p169t7.c.a(15);
                    throw null;
                }
                java.lang.String strD = p169t7.b.b(cVar2).d();
                kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
                return p044e7.f.d(strD);
            }
        }
        return possiblyPrimitiveType;
    }

    public static final p135p8.g j(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, p194x6.j builderAction) {
        kotlin.jvm.internal.m.e(builderAction, "builderAction");
        if (O7.q.N0(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited");
        }
        p135p8.a aVar = new p135p8.a(str);
        builderAction.invoke(aVar);
        return new p135p8.g(str, p135p8.j.f26283f, aVar.f26256c.size(), p078i6.m.E0(serialDescriptorArr), aVar);
    }

    public static final p135p8.g k(java.lang.String serialName, com.google.android.gms.internal.play_billing.V0 v6, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(serialName, "serialName");
        if (O7.q.N0(serialName)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited");
        }
        if (v6.equals(p135p8.j.f26283f)) {
            throw new java.lang.IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        p135p8.a aVar = new p135p8.a(serialName);
        jVar.invoke(aVar);
        return new p135p8.g(serialName, v6, aVar.f26256c.size(), p078i6.m.E0(serialDescriptorArr), aVar);
    }

    public static p135p8.g l(java.lang.String serialName, com.google.android.gms.internal.play_billing.V0 v6, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr) {
        kotlin.jvm.internal.m.e(serialName, "serialName");
        if (O7.q.N0(serialName)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited");
        }
        if (v6.equals(p135p8.j.f26283f)) {
            throw new java.lang.IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        p135p8.a aVar = new p135p8.a(serialName);
        return new p135p8.g(serialName, v6, aVar.f26256c.size(), p078i6.m.E0(serialDescriptorArr), aVar);
    }

    public static int m(long j9) {
        int i3 = (int) j9;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.N(((long) i3) == j9, "Out of range: %s", j9);
        return i3;
    }

    public static S4.B n(p194x6.j... jVarArr) {
        if (jVarArr.length > 0) {
            return new S4.B(10, jVarArr);
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.");
    }

    public static int o(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int p(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.K("min (%s) must be less than or equal to max (%s)", i9, 1073741823, i9 <= 1073741823);
        return java.lang.Math.min(java.lang.Math.max(i3, i9), 1073741823);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final java.net.InetAddress q(int i3, int i9, java.lang.String str) {
        int i10;
        int i11;
        int iR;
        byte[] bArr = new byte[16];
        int i12 = i3;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        while (i12 < i9) {
            if (i13 == 16) {
                return null;
            }
            int i16 = i12 + 2;
            if (i16 <= i9 && O7.x.y0(false, str, i12, io.github.jan.supabase.storage.resumable.Fingerprint.FINGERPRINT_SEPARATOR)) {
                if (i14 != -1) {
                    return null;
                }
                i13 += 2;
                i14 = i13;
                if (i16 == i9) {
                    break;
                }
                i15 = i16;
                i10 = 0;
                i12 = i15;
                while (i12 < i9) {
                    iR = x8.b.r(str.charAt(i12));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i10 = (i10 << 4) + iR;
                    i12++;
                }
                i11 = i12 - i15;
                return i11 == 0 ? null : null;
            }
            if (i13 != 0) {
                if (!O7.x.y0(false, str, i12, ":")) {
                    if (!O7.x.y0(false, str, i12, ".")) {
                        return null;
                    }
                    int i17 = i13 - 2;
                    int i18 = i17;
                    while (i15 < i9) {
                        if (i18 == 16) {
                            return null;
                        }
                        if (i18 != i17) {
                            if (str.charAt(i15) != '.') {
                                return null;
                            }
                            i15++;
                        }
                        int i19 = 0;
                        int i20 = i15;
                        while (i20 < i9) {
                            char cCharAt = str.charAt(i20);
                            if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0 || kotlin.jvm.internal.m.f(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i19 == 0 && i15 != i20) || (i19 = ((i19 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i20++;
                        }
                        if (i20 - i15 == 0) {
                            return null;
                        }
                        bArr[i18] = (byte) i19;
                        i18++;
                        i15 = i20;
                    }
                    if (i18 != i13 + 2) {
                        return null;
                    }
                    i13 += 2;
                    break;
                }
                i12++;
            }
            i15 = i12;
            i10 = 0;
            i12 = i15;
            while (i12 < i9) {
                iR = x8.b.r(str.charAt(i12));
                if (iR != -1) {
                    break;
                }
                i10 = (i10 << 4) + iR;
                i12++;
            }
            i11 = i12 - i15;
            if (i11 == 0 && i11 <= 4) {
                int i21 = i13 + 1;
                bArr[i13] = (byte) (255 & (i10 >>> 8));
                i13 += 2;
                bArr[i21] = (byte) (i10 & 255);
            }
        }
        if (i13 != 16) {
            if (i14 == -1) {
                return null;
            }
            int i22 = i13 - i14;
            java.lang.System.arraycopy(bArr, i14, bArr, 16 - i22, i22);
            java.util.Arrays.fill(bArr, i14, (16 - i13) + i14, (byte) 0);
        }
        return java.net.InetAddress.getByAddress(bArr);
    }

    public static final p126o6.b t(java.lang.Enum[] entries) {
        kotlin.jvm.internal.m.e(entries, "entries");
        return new p126o6.b(entries);
    }

    public static int u(byte b9, byte b10, byte b11, byte b12) {
        return (b9 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static final int v(java.lang.String str, android.os.Bundle bundle) {
        int i3 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i3 != Integer.MIN_VALUE || bundle.getInt(str, androidx.media3.common.util.Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i3;
        }
        com.google.android.gms.internal.play_billing.V0.w(str);
        throw null;
    }

    public static java.lang.String w(java.lang.Class cls) {
        java.util.LinkedHashMap linkedHashMap = p114n2.L.f25609b;
        java.lang.String strValue = (java.lang.String) linkedHashMap.get(cls);
        if (strValue == null) {
            p114n2.J j9 = (p114n2.J) cls.getAnnotation(p114n2.J.class);
            strValue = j9 != null ? j9.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new java.lang.IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        kotlin.jvm.internal.m.b(strValue);
        return strValue;
    }

    public static java.lang.Object x(java.lang.String str, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return E1.e.b(str, bundle);
        }
        android.os.Parcelable parcelable = bundle.getParcelable(str);
        if (p046f.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final android.os.Bundle y(java.lang.String key, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        android.os.Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        com.google.android.gms.internal.play_billing.V0.w(key);
        throw null;
    }

    public static final java.util.ArrayList z(java.lang.String key, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        java.util.ArrayList arrayListC = android.os.Build.VERSION.SDK_INT >= 34 ? E1.e.c(bundle, key, com.google.android.gms.internal.play_billing.AbstractC1833d1.x(kotlin.jvm.internal.B.f24540a.b(android.os.Bundle.class))) : bundle.getParcelableArrayList(key);
        if (arrayListC != null) {
            return arrayListC;
        }
        com.google.android.gms.internal.play_billing.V0.w(key);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    public boolean C(byte[] bArr, int i3, int i9) {
        int iA;
        int iL;
        int i10;
        int i11;
        long j9;
        long j10;
        byte bG;
        long j11;
        byte bG2;
        long j12;
        int i12 = i3;
        switch (this.f19583a) {
            case 0:
                while (i12 < i9 && bArr[i12] >= 0) {
                    i12++;
                }
                if (i12 >= i9) {
                    iA = 0;
                    iL = iA;
                } else {
                    while (true) {
                        if (i12 >= i9) {
                            iA = 0;
                        } else {
                            int i13 = i12 + 1;
                            byte b9 = bArr[i12];
                            if (b9 >= 0) {
                                i12 = i13;
                            } else if (b9 < -32) {
                                if (i13 >= i9) {
                                    iL = b9;
                                } else {
                                    if (b9 >= -62) {
                                        i12 += 2;
                                        if (bArr[i13] > -65) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else if (b9 < -16) {
                                if (i13 >= i9 - 1) {
                                    iA = com.google.crypto.tink.shaded.protobuf.s0.a(bArr, i13, i9);
                                } else {
                                    int i14 = i12 + 2;
                                    byte b10 = bArr[i13];
                                    if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                                        i12 += 3;
                                        if (bArr[i14] > -65) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else if (i13 >= i9 - 2) {
                                iA = com.google.crypto.tink.shaded.protobuf.s0.a(bArr, i13, i9);
                            } else {
                                int i15 = i12 + 2;
                                byte b11 = bArr[i13];
                                if (b11 <= -65) {
                                    if ((((b11 + 112) + (b9 << 28)) >> 30) == 0) {
                                        int i16 = i12 + 3;
                                        if (bArr[i15] <= -65) {
                                            i12 += 4;
                                            if (bArr[i16] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                            }
                        }
                    }
                    iL = iA;
                }
                if (iL == 0) {
                    return true;
                }
                return false;
            default:
                if ((i12 | i9 | (bArr.length - i9)) < 0) {
                    throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i9)));
                }
                long j13 = i12;
                int i17 = (int) (((long) i9) - j13);
                long j14 = 1;
                if (i17 < 16) {
                    i10 = 0;
                } else {
                    int i18 = 8 - (((int) j13) & 7);
                    long j15 = j13;
                    i10 = 0;
                    while (true) {
                        if (i10 < i18) {
                            long j16 = j15 + 1;
                            if (com.google.crypto.tink.shaded.protobuf.p0.g(j15, bArr) >= 0) {
                                i10++;
                                j15 = j16;
                            }
                        } else {
                            while (true) {
                                int i19 = i10 + 8;
                                if (i19 <= i17) {
                                    if ((com.google.crypto.tink.shaded.protobuf.p0.f19569c.h(com.google.crypto.tink.shaded.protobuf.p0.f19572f + j15, bArr) & (-9187201950435737472L)) == 0) {
                                        j15 += 8;
                                        i10 = i19;
                                    }
                                }
                            }
                            while (true) {
                                if (i10 < i17) {
                                    long j17 = j15 + 1;
                                    if (com.google.crypto.tink.shaded.protobuf.p0.g(j15, bArr) >= 0) {
                                        i10++;
                                        j15 = j17;
                                    }
                                } else {
                                    i10 = i17;
                                }
                            }
                        }
                    }
                }
                int i20 = i17 - i10;
                long j18 = j13 + ((long) i10);
                while (true) {
                    byte bG3 = 0;
                    while (i20 > 0) {
                        long j19 = j18 + j14;
                        bG3 = com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr);
                        if (bG3 < 0) {
                            j18 = j19;
                            if (i20 == 0) {
                                iL = 0;
                            } else {
                                i11 = i20 - 1;
                                if (bG3 < -32) {
                                    if (i11 == 0) {
                                        iL = bG3;
                                    } else {
                                        i20 -= 2;
                                        if (bG3 >= -62) {
                                            j12 = j18 + j14;
                                            if (com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr) > -65) {
                                                j9 = j14;
                                                j18 = j12;
                                                j14 = j9;
                                            }
                                        }
                                    }
                                } else if (bG3 < -16) {
                                    j9 = j14;
                                    if (i11 < 3) {
                                        iL = L(j18, bArr, bG3, i11);
                                    } else {
                                        i20 -= 4;
                                        j10 = j18 + j9;
                                        bG = com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr);
                                        if (bG <= -65) {
                                            if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                                j11 = 2 + j18;
                                                if (com.google.crypto.tink.shaded.protobuf.p0.g(j10, bArr) <= -65) {
                                                    j18 += 3;
                                                    if (com.google.crypto.tink.shaded.protobuf.p0.g(j11, bArr) > -65) {
                                                        j14 = j9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (i11 < 2) {
                                    iL = L(j18, bArr, bG3, i11);
                                } else {
                                    i20 -= 3;
                                    j9 = j14;
                                    long j20 = j18 + j9;
                                    bG2 = com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr);
                                    if (bG2 > -65 && ((bG3 != -32 || bG2 >= -96) && (bG3 != -19 || bG2 < -96))) {
                                        j18 += 2;
                                        if (com.google.crypto.tink.shaded.protobuf.p0.g(j20, bArr) <= -65) {
                                            j14 = j9;
                                        }
                                    }
                                }
                            }
                            if (iL == 0) {
                                return true;
                            }
                            return false;
                        }
                        i20--;
                        j18 = j19;
                    }
                    if (i20 == 0) {
                        iL = 0;
                    } else {
                        i11 = i20 - 1;
                        if (bG3 < -32) {
                            if (i11 == 0) {
                                iL = bG3;
                            } else {
                                i20 -= 2;
                                if (bG3 >= -62) {
                                    j12 = j18 + j14;
                                    if (com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr) > -65) {
                                        j9 = j14;
                                        j18 = j12;
                                        j14 = j9;
                                    }
                                }
                            }
                        } else if (bG3 < -16) {
                            j9 = j14;
                            if (i11 < 3) {
                                iL = L(j18, bArr, bG3, i11);
                            } else {
                                i20 -= 4;
                                j10 = j18 + j9;
                                bG = com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr);
                                if (bG <= -65) {
                                    if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                        j11 = 2 + j18;
                                        if (com.google.crypto.tink.shaded.protobuf.p0.g(j10, bArr) <= -65) {
                                            j18 += 3;
                                            if (com.google.crypto.tink.shaded.protobuf.p0.g(j11, bArr) > -65) {
                                                j14 = j9;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i11 < 2) {
                            iL = L(j18, bArr, bG3, i11);
                        } else {
                            i20 -= 3;
                            j9 = j14;
                            long j21 = j18 + j9;
                            bG2 = com.google.crypto.tink.shaded.protobuf.p0.g(j18, bArr);
                            if (bG2 > -65) {
                            }
                        }
                    }
                    if (iL == 0) {
                        return true;
                    }
                    return false;
                }
                iL = -1;
                if (iL == 0) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    public final java.lang.String r(byte[] bArr, int i3, int i9) throws com.google.crypto.tink.shaded.protobuf.D {
        int i10;
        byte b9;
        int i11;
        byte b10;
        byte b11;
        byte b12;
        switch (this.f19583a) {
            case 0:
                if ((i3 | i9 | ((bArr.length - i3) - i9)) < 0) {
                    throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9)));
                }
                int i12 = i3 + i9;
                char[] cArr = new char[i9];
                int i13 = 0;
                while (i3 < i12) {
                    byte b13 = bArr[i3];
                    if (b13 < 0) {
                        while (i3 < i12) {
                            i10 = i3 + 1;
                            b9 = bArr[i3];
                            if (b9 < 0) {
                                i11 = i13 + 1;
                                cArr[i13] = (char) b9;
                                while (i10 < i12) {
                                    b10 = bArr[i10];
                                    if (b10 >= 0) {
                                        i10++;
                                        cArr[i11] = (char) b10;
                                        i11++;
                                    } else {
                                        i13 = i11;
                                        i3 = i10;
                                    }
                                }
                                i13 = i11;
                                i3 = i10;
                            } else if (b9 < -32) {
                                if (i10 < i12) {
                                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                                }
                                i3 += 2;
                                byte b14 = bArr[i10];
                                int i14 = i13 + 1;
                                if (b9 >= -62 || com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b14)) {
                                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                                }
                                cArr[i13] = (char) ((b14 & 63) | ((b9 & 31) << 6));
                                i13 = i14;
                            } else {
                                if (b9 >= -16) {
                                    if (i10 < i12 - 2) {
                                        throw com.google.crypto.tink.shaded.protobuf.D.b();
                                    }
                                    b12 = bArr[i10];
                                    int i15 = i3 + 3;
                                    byte b15 = bArr[i3 + 2];
                                    i3 += 4;
                                    byte b16 = bArr[i15];
                                    int i16 = i13 + 1;
                                    if (!com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b12)) {
                                        if ((((b12 + 112) + (b9 << 28)) >> 30) != 0 && !com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b15) && !com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b16)) {
                                            int i17 = ((b12 & 63) << 12) | ((b9 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                                            cArr[i13] = (char) ((i17 >>> 10) + 55232);
                                            cArr[i16] = (char) ((i17 & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
                                            i13 += 2;
                                        }
                                    }
                                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                                }
                                if (i10 < i12 - 1) {
                                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                                }
                                int i18 = i3 + 2;
                                b11 = bArr[i10];
                                i3 += 3;
                                byte b17 = bArr[i18];
                                int i19 = i13 + 1;
                                if (!com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b11) || ((b9 == -32 && b11 < -96) || ((b9 == -19 && b11 >= -96) || com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b17)))) {
                                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                                }
                                cArr[i13] = (char) (((b11 & 63) << 6) | ((b9 & 15) << 12) | (b17 & 63));
                                i13 = i19;
                            }
                        }
                        return new java.lang.String(cArr, 0, i13);
                    }
                    i3++;
                    cArr[i13] = (char) b13;
                    i13++;
                }
                while (i3 < i12) {
                    i10 = i3 + 1;
                    b9 = bArr[i3];
                    if (b9 < 0) {
                        if (b9 < -32) {
                            if (i10 < i12) {
                                throw com.google.crypto.tink.shaded.protobuf.D.b();
                            }
                            i3 += 2;
                            byte b18 = bArr[i10];
                            int i110 = i13 + 1;
                            if (b9 >= -62) {
                            }
                            throw com.google.crypto.tink.shaded.protobuf.D.b();
                        }
                        if (b9 >= -16) {
                            if (i10 < i12 - 1) {
                                throw com.google.crypto.tink.shaded.protobuf.D.b();
                            }
                            int i111 = i3 + 2;
                            b11 = bArr[i10];
                            i3 += 3;
                            byte b19 = bArr[i111];
                            int i112 = i13 + 1;
                            if (com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b11)) {
                            }
                            throw com.google.crypto.tink.shaded.protobuf.D.b();
                        }
                        if (i10 < i12 - 2) {
                            throw com.google.crypto.tink.shaded.protobuf.D.b();
                        }
                        b12 = bArr[i10];
                        int i113 = i3 + 3;
                        byte b110 = bArr[i3 + 2];
                        i3 += 4;
                        byte b111 = bArr[i113];
                        int i114 = i13 + 1;
                        if (!com.google.android.gms.internal.play_billing.AbstractC1864o0.i0(b12)) {
                            if ((((b12 + 112) + (b9 << 28)) >> 30) != 0) {
                            }
                        }
                        throw com.google.crypto.tink.shaded.protobuf.D.b();
                    }
                    i11 = i13 + 1;
                    cArr[i13] = (char) b9;
                    while (i10 < i12) {
                        b10 = bArr[i10];
                        if (b10 >= 0) {
                            i10++;
                            cArr[i11] = (char) b10;
                            i11++;
                        } else {
                            i13 = i11;
                            i3 = i10;
                        }
                    }
                    i13 = i11;
                    i3 = i10;
                }
                return new java.lang.String(cArr, 0, i13);
            default:
                java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
                java.lang.String str = new java.lang.String(bArr, i3, i9, charset);
                if (str.contains("�") && !java.util.Arrays.equals(str.getBytes(charset), java.util.Arrays.copyOfRange(bArr, i3, i9 + i3))) {
                    throw com.google.crypto.tink.shaded.protobuf.D.b();
                }
                return str;
        }
    }

    public final int s(java.lang.String str, byte[] bArr, int i3, int i9) {
        int i10;
        int i11;
        char cCharAt;
        long j9;
        char c9;
        long j10;
        long j11;
        char c10;
        int i12;
        char cCharAt2;
        switch (this.f19583a) {
            case 0:
                int length = str.length();
                int i13 = i9 + i3;
                int i14 = 0;
                while (i14 < length && (i11 = i14 + i3) < i13 && (cCharAt = str.charAt(i14)) < 128) {
                    bArr[i11] = (byte) cCharAt;
                    i14++;
                }
                if (i14 == length) {
                    return i3 + length;
                }
                int i15 = i3 + i14;
                while (i14 < length) {
                    char cCharAt3 = str.charAt(i14);
                    if (cCharAt3 < 128 && i15 < i13) {
                        bArr[i15] = (byte) cCharAt3;
                        i15++;
                    } else if (cCharAt3 < 2048 && i15 <= i13 - 2) {
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt3 >>> 6) | 960);
                        i15 += 2;
                        bArr[i16] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i15 > i13 - 3) {
                            if (i15 > i13 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i10 = i14 + 1) == str.length() || !java.lang.Character.isSurrogatePair(cCharAt3, str.charAt(i10)))) {
                                    throw new com.google.crypto.tink.shaded.protobuf.r0(i14, length);
                                }
                                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i15);
                            }
                            int i17 = i14 + 1;
                            if (i17 != str.length()) {
                                char cCharAt4 = str.charAt(i17);
                                if (java.lang.Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i15] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                    bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i18 = i15 + 3;
                                    bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i15 += 4;
                                    bArr[i18] = (byte) ((codePoint & 63) | 128);
                                    i14 = i17;
                                } else {
                                    i14 = i17;
                                }
                            }
                            throw new com.google.crypto.tink.shaded.protobuf.r0(i14 - 1, length);
                        }
                        bArr[i15] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i19 = i15 + 2;
                        bArr[i15 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i15 += 3;
                        bArr[i19] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i14++;
                }
                return i15;
            default:
                long j12 = i3;
                long j13 = ((long) i9) + j12;
                int length2 = str.length();
                if (length2 > i9 || bArr.length - i9 < i3) {
                    throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i9));
                }
                int i20 = 0;
                while (true) {
                    j9 = 1;
                    c9 = 128;
                    if (i20 < length2 && (cCharAt2 = str.charAt(i20)) < 128) {
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12, (byte) cCharAt2);
                        i20++;
                        j12 = 1 + j12;
                    }
                }
                if (i20 == length2) {
                    return (int) j12;
                }
                while (i20 < length2) {
                    char cCharAt5 = str.charAt(i20);
                    if (cCharAt5 < c9 && j12 < j13) {
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12, (byte) cCharAt5);
                        c10 = c9;
                        j10 = j9;
                        j11 = j12 + j9;
                    } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                        j10 = j9;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                            long j14 = j12;
                            if (j14 > j13 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i12 = i20 + 1) == length2 || !java.lang.Character.isSurrogatePair(cCharAt5, str.charAt(i12)))) {
                                    throw new com.google.crypto.tink.shaded.protobuf.r0(i20, length2);
                                }
                                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j14);
                            }
                            int i21 = i20 + 1;
                            if (i21 != length2) {
                                char cCharAt6 = str.charAt(i21);
                                if (java.lang.Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = java.lang.Character.toCodePoint(cCharAt5, cCharAt6);
                                    com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j14, (byte) ((codePoint2 >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK));
                                    c10 = 128;
                                    com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j14 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j14 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j14 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j11 = j14 + 4;
                                    i20 = i21;
                                } else {
                                    i20 = i21;
                                }
                            }
                            throw new com.google.crypto.tink.shaded.protobuf.r0(i20 - 1, length2);
                        }
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j15 = j12;
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j11 = j15 + 3;
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j15 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c10 = 128;
                    } else {
                        j10 = j9;
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                        com.google.crypto.tink.shaded.protobuf.p0.k(bArr, j12 + j10, (byte) ((cCharAt5 & '?') | c9));
                        j11 = j12 + 2;
                        c10 = c9;
                    }
                    i20++;
                    c9 = c10;
                    j12 = j11;
                    j9 = j10;
                }
                return (int) j12;
        }
    }
}

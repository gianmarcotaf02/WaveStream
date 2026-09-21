package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f30576a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f30579d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f30581f;
    public java.util.ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f30582h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f30577b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f30578c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30580e = -1;

    public n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f30581f = arrayList;
        arrayList.add("");
    }

    public final w8.o a() {
        java.util.ArrayList arrayList;
        java.lang.String str = this.f30576a;
        if (str == null) {
            throw new java.lang.IllegalStateException("scheme == null");
        }
        java.lang.String strE = w8.C3022b.e(this.f30577b, 0, 0, 7);
        java.lang.String strE2 = w8.C3022b.e(this.f30578c, 0, 0, 7);
        java.lang.String str2 = this.f30579d;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("host == null");
        }
        int iB = b();
        java.util.ArrayList arrayList2 = this.f30581f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(w8.C3022b.e((java.lang.String) it.next(), 0, 0, 7));
        }
        java.util.ArrayList<java.lang.String> arrayList4 = this.g;
        if (arrayList4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(p078i6.q.I0(arrayList4, 10));
            for (java.lang.String str3 : arrayList4) {
                arrayList5.add(str3 != null ? w8.C3022b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        java.lang.String str4 = this.f30582h;
        return new w8.o(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? w8.C3022b.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i3 = this.f30580e;
        if (i3 != -1) {
            return i3;
        }
        java.lang.String str = this.f30576a;
        kotlin.jvm.internal.m.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[LOOP:5: B:108:0x01c9->B:241:?, LOOP_START, PHI: r1
  0x01c9: PHI (r1v21 int) = (r1v10 int), (r1v22 int) binds: [B:107:0x01c7, B:241:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:131:0x020c  */
    /* JADX WARN: Code duplicated, block: B:133:0x022e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x0247  */
    /* JADX WARN: Code duplicated, block: B:138:0x024d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0250  */
    /* JADX WARN: Code duplicated, block: B:143:0x0257  */
    /* JADX WARN: Code duplicated, block: B:198:0x0355  */
    /* JADX WARN: Code duplicated, block: B:235:0x01e1 A[EDGE_INSN: B:235:0x01e1->B:118:0x01e1 BREAK  A[LOOP:4: B:105:0x01bf->B:116:0x01dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01d5 A[EDGE_INSN: B:239:0x01d5->B:112:0x01d5 BREAK  A[LOOP:5: B:108:0x01c9->B:241:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0146  */
    public final void c(w8.o oVar, java.lang.String str) {
        int i3;
        int i9;
        int iE;
        byte bCharAt;
        int i10;
        int i11;
        java.lang.String str2;
        int i12;
        int i13;
        char cCharAt;
        char cCharAt2;
        byte[] bArr = x8.b.f31716a;
        int iN = x8.b.n(0, str.length(), str);
        int iO = x8.b.o(iN, str.length(), str);
        if (iO - iN < 2) {
            i3 = -1;
            break;
        }
        char cCharAt3 = str.charAt(iN);
        char c9 = 'a';
        if ((kotlin.jvm.internal.m.f(cCharAt3, 97) < 0 || kotlin.jvm.internal.m.f(cCharAt3, 122) > 0) && (kotlin.jvm.internal.m.f(cCharAt3, 65) < 0 || kotlin.jvm.internal.m.f(cCharAt3, 90) > 0)) {
            i3 = -1;
            break;
        }
        i3 = iN + 1;
        while (true) {
            if (i3 < iO) {
                char cCharAt4 = str.charAt(i3);
                if ((c9 > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                    if (cCharAt4 != ':') {
                        break;
                    } else {
                        break;
                    }
                } else {
                    i3++;
                    c9 = 'a';
                }
            }
            i3 = -1;
            break;
        }
        if (i3 == -1) {
            if (oVar == null) {
                throw new java.lang.IllegalArgumentException(p121o0.p.C("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? O7.q.p1(6, str).concat("...") : str));
            }
            this.f30576a = oVar.f30583a;
        } else if (O7.x.y0(true, str, iN, "https:")) {
            this.f30576a = "https";
            iN += 6;
        } else {
            if (!O7.x.y0(true, str, iN, "http:")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                java.lang.String strSubstring = str.substring(0, i3);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                sb.append('\'');
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.f30576a = "http";
            iN += 5;
        }
        int i14 = 0;
        for (int i15 = iN; i15 < iO && ((cCharAt2 = str.charAt(i15)) == '\\' || cCharAt2 == '/'); i15++) {
            i14++;
        }
        java.util.ArrayList arrayList = this.f30581f;
        char c10 = '#';
        if (i14 >= 2 || oVar == null) {
            i9 = iN + i14;
            boolean z6 = false;
            boolean z9 = false;
            while (true) {
                iE = x8.b.e(i9, iO, str, "@/\\?#");
                if (iE != iO) {
                    bCharAt = str.charAt(iE);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt != -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z6) {
                        this.f30578c += "%40" + w8.C3022b.b(i9, iE, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, str, " \"':;<=>@[]^`{}|/\\?#");
                        z6 = z6;
                    } else {
                        boolean z10 = z6;
                        int iF = x8.b.f(str, i9, iE, ':');
                        java.lang.String strB = w8.C3022b.b(i9, iF, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, str, " \"':;<=>@[]^`{}|/\\?#");
                        if (z9) {
                            strB = B2.a.o(new java.lang.StringBuilder(), this.f30577b, "%40", strB);
                        }
                        this.f30577b = strB;
                        if (iF != iE) {
                            this.f30578c = w8.C3022b.b(iF + 1, iE, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, str, " \"':;<=>@[]^`{}|/\\?#");
                            z6 = true;
                        } else {
                            z6 = z10;
                        }
                        z9 = true;
                    }
                    i9 = iE + 1;
                    c10 = '#';
                }
            }
            i10 = i9;
            while (true) {
                if (i10 >= iE) {
                    i10 = iE;
                    break;
                }
                cCharAt = str.charAt(i10);
                if (cCharAt == '[') {
                    if (cCharAt == ':') {
                        break;
                    }
                } else {
                    do {
                        i10++;
                        if (i10 < iE) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            i11 = i10 + 1;
            if (i11 < iE) {
                this.f30579d = com.google.crypto.tink.shaded.protobuf.q0.I(w8.C3022b.e(str, i9, i10, 4));
                try {
                    i13 = java.lang.Integer.parseInt(w8.C3022b.b(i11, iE, 248, str, ""));
                    if (1 <= i13 || i13 >= 65536) {
                        i13 = -1;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                this.f30580e = i13;
                if (i13 == -1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid URL port: \"");
                    java.lang.String strSubstring2 = str.substring(i11, iE);
                    kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f30579d = com.google.crypto.tink.shaded.protobuf.q0.I(w8.C3022b.e(str, i9, i10, 4));
                str2 = this.f30576a;
                kotlin.jvm.internal.m.b(str2);
                if (str2.equals("http")) {
                    i12 = 80;
                } else if (str2.equals("https")) {
                    i12 = 443;
                } else {
                    i12 = -1;
                }
                this.f30580e = i12;
            }
            if (this.f30579d != null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid URL host: \"");
                java.lang.String strSubstring3 = str.substring(i9, i10);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(strSubstring3);
                sb3.append('\"');
                throw new java.lang.IllegalArgumentException(sb3.toString().toString());
            }
            iN = iE;
        } else if (kotlin.jvm.internal.m.a(oVar.f30583a, this.f30576a)) {
            this.f30577b = oVar.e();
            this.f30578c = oVar.a();
            this.f30579d = oVar.f30586d;
            this.f30580e = oVar.f30587e;
            arrayList.clear();
            arrayList.addAll(oVar.c());
            if (iN == iO || str.charAt(iN) == '#') {
                java.lang.String strD = oVar.d();
                this.g = strD != null ? w8.C3022b.f(w8.C3022b.b(0, 0, 211, strD, " \"'<>#")) : null;
            }
        } else {
            i9 = iN + i14;
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                iE = x8.b.e(i9, iO, str, "@/\\?#");
                if (iE != iO) {
                    bCharAt = str.charAt(iE);
                } else {
                    bCharAt = -1;
                }
                if (bCharAt != -1) {
                    break;
                } else {
                    break;
                }
            }
            i10 = i9;
            while (true) {
                if (i10 >= iE) {
                    i10 = iE;
                    break;
                }
                cCharAt = str.charAt(i10);
                if (cCharAt == '[') {
                    if (cCharAt == ':') {
                        break;
                        break;
                    }
                } else {
                    do {
                        i10++;
                        if (i10 < iE) {
                            break;
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            i11 = i10 + 1;
            if (i11 < iE) {
                this.f30579d = com.google.crypto.tink.shaded.protobuf.q0.I(w8.C3022b.e(str, i9, i10, 4));
                i13 = java.lang.Integer.parseInt(w8.C3022b.b(i11, iE, 248, str, ""));
                if (1 <= i13) {
                    i13 = -1;
                } else {
                    i13 = -1;
                }
                this.f30580e = i13;
                if (i13 == -1) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid URL port: \"");
                    java.lang.String strSubstring4 = str.substring(i11, iE);
                    kotlin.jvm.internal.m.d(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring4);
                    sb4.append('\"');
                    throw new java.lang.IllegalArgumentException(sb4.toString().toString());
                }
            } else {
                this.f30579d = com.google.crypto.tink.shaded.protobuf.q0.I(w8.C3022b.e(str, i9, i10, 4));
                str2 = this.f30576a;
                kotlin.jvm.internal.m.b(str2);
                if (str2.equals("http")) {
                    i12 = 80;
                } else if (str2.equals("https")) {
                    i12 = 443;
                } else {
                    i12 = -1;
                }
                this.f30580e = i12;
            }
            if (this.f30579d != null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Invalid URL host: \"");
                java.lang.String strSubstring5 = str.substring(i9, i10);
                kotlin.jvm.internal.m.d(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                sb5.append(strSubstring5);
                sb5.append('\"');
                throw new java.lang.IllegalArgumentException(sb5.toString().toString());
            }
            iN = iE;
        }
        int iE2 = x8.b.e(iN, iO, str, "?#");
        if (iN != iE2) {
            char cCharAt5 = str.charAt(iN);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iN++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iN < iE2) {
                int iE3 = x8.b.e(iN, iE2, str, "/\\");
                boolean z13 = iE3 < iE2;
                java.lang.String strB2 = w8.C3022b.b(iN, iE3, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, str, " \"<>^`{}|/\\?#");
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((java.lang.CharSequence) com.google.android.gms.internal.play_billing.M0.j(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z13) {
                            arrayList.add("");
                        }
                    } else if (((java.lang.String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iN = z13 ? iE3 + 1 : iE3;
            }
        }
        if (iE2 < iO && str.charAt(iE2) == '?') {
            int iF2 = x8.b.f(str, iE2, iO, '#');
            this.g = w8.C3022b.f(w8.C3022b.b(iE2 + 1, iF2, 208, str, " \"'<>#"));
            iE2 = iF2;
        }
        if (iE2 >= iO || str.charAt(iE2) != '#') {
            return;
        }
        this.f30582h = w8.C3022b.b(iE2 + 1, iO, 176, str, "");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.f30576a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f30577b.length() > 0 || this.f30578c.length() > 0) {
            sb.append(this.f30577b);
            if (this.f30578c.length() > 0) {
                sb.append(':');
                sb.append(this.f30578c);
            }
            sb.append('@');
        }
        java.lang.String str2 = this.f30579d;
        if (str2 != null) {
            if (O7.q.C0(str2, ':')) {
                sb.append('[');
                sb.append(this.f30579d);
                sb.append(']');
            } else {
                sb.append(this.f30579d);
            }
        }
        int i3 = -1;
        if (this.f30580e != -1 || this.f30576a != null) {
            int iB = b();
            java.lang.String str3 = this.f30576a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i3 = 80;
                } else if (str3.equals("https")) {
                    i3 = 443;
                }
                if (iB != i3) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        java.util.ArrayList arrayList = this.f30581f;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append('/');
            sb.append((java.lang.String) arrayList.get(i9));
        }
        if (this.g != null) {
            sb.append('?');
            java.util.ArrayList arrayList2 = this.g;
            kotlin.jvm.internal.m.b(arrayList2);
            D6.e eVarS = O7.r.S(O7.r.W(0, arrayList2.size()), 2);
            int i10 = eVarS.f2458h;
            int i11 = eVarS.f2459i;
            int i12 = eVarS.j;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    java.lang.String str4 = (java.lang.String) arrayList2.get(i10);
                    java.lang.String str5 = (java.lang.String) arrayList2.get(i10 + 1);
                    if (i10 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
        }
        if (this.f30582h != null) {
            sb.append('#');
            sb.append(this.f30582h);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

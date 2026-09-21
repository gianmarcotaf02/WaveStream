package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.q f12787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z2.Z f12788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z2.K0 f12792f;
    public java.lang.StringBuilder g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.StringBuilder f12794i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:234:0x037d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0491  */
    /* JADX WARN: Code duplicated, block: B:344:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:389:0x058a  */
    /* JADX WARN: Code duplicated, block: B:444:0x0652  */
    public static void D(Z2.V v6, java.lang.String str, java.lang.String str2) {
        A7.m mVar;
        java.lang.Boolean bool;
        int i3;
        int i9;
        java.lang.String strO;
        Z2.F fS;
        java.lang.String strSubstring;
        Z2.F fS2;
        int i10;
        int i11;
        Z2.F fL;
        Z2.F[] fArr;
        int i12;
        int i13;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = Z2.J0.a(str).ordinal();
        if (iOrdinal == 1) {
            if (!androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO.equals(str2) && str2.startsWith("rect(")) {
                Z2.M m8 = new Z2.M(str2.substring(5));
                m8.X();
                Z2.F fU = u(m8);
                m8.W();
                Z2.F fU2 = u(m8);
                m8.W();
                Z2.F fU3 = u(m8);
                m8.W();
                Z2.F fU4 = u(m8);
                m8.X();
                if (m8.t(')') || m8.w()) {
                    mVar = new A7.m(9, false);
                    mVar.f321i = fU;
                    mVar.j = fU2;
                    mVar.f322k = fU3;
                    mVar.f323l = fU4;
                } else {
                    mVar = null;
                }
            } else {
                mVar = null;
            }
            v6.f12844w = mVar;
            if (mVar != null) {
                v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            v6.f12815E = r(str2);
            v6.f12830h |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            v6.f12827R = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            v6.f12830h |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                v6.f12839r = n(str2);
                v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                return;
            }
            if (iOrdinal == 8) {
                int i14 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                v6.f12825P = i14;
                if (i14 != 0) {
                    v6.f12830h |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                v6.f12816F = r(str2);
                v6.f12830h |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                v6.f12838q = v(str2);
                v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = java.lang.Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = java.lang.Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                v6.f12843v = bool;
                if (bool != null) {
                    v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i15 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                v6.f12828S = i15;
                if (i15 != 0) {
                    v6.f12830h |= 34359738368L;
                    return;
                }
                return;
            }
            Z2.C1213x c1213x = Z2.C1213x.f12966h;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    v6.f12817G = c1213x;
                } else {
                    try {
                        v6.f12817G = n(str2);
                    } catch (Z2.D0 e6) {
                        android.util.Log.w("SVGParser", e6.getMessage());
                        return;
                    }
                }
                v6.f12830h |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                v6.H = v(str2);
                v6.f12830h |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i3 = 2;
                        break;
                    case "end":
                        i3 = 3;
                        break;
                    case "start":
                        i3 = 1;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                v6.f12826Q = i3;
                if (i3 != 0) {
                    v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i9 = 4;
                        break;
                    case "underline":
                        i9 = 2;
                        break;
                    case "none":
                        i9 = 1;
                        break;
                    case "blink":
                        i9 = 5;
                        break;
                    case "overline":
                        i9 = 3;
                        break;
                    default:
                        i9 = 0;
                        break;
                }
                v6.f12824O = i9;
                if (i9 != 0) {
                    v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            v6.f12811A = java.lang.Boolean.valueOf(!str2.equals("none"));
                            v6.f12830h |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    Z2.AbstractC1187e0 abstractC1187e0W = w(str2);
                    v6.f12831i = abstractC1187e0W;
                    if (abstractC1187e0W != null) {
                        v6.f12830h |= 1;
                    }
                    break;
                case 16:
                    int i16 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    v6.f12820K = i16;
                    if (i16 != 0) {
                        v6.f12830h |= 2;
                    }
                    break;
                case 17:
                    java.lang.Float fV = v(str2);
                    v6.j = fV;
                    if (fV != null) {
                        v6.f12830h |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        Z2.M m9 = new Z2.M(str2);
                        java.lang.Integer num = null;
                        java.lang.String str3 = null;
                        int i17 = 0;
                        while (true) {
                            strO = m9.O('/', false);
                            m9.X();
                            if (strO == null) {
                                break;
                            } else if (num == null || i17 == 0) {
                                if (!strO.equals(io.sentry.ProfilingTraceData.TRUNCATION_REASON_NORMAL) && (num != null || (num = (java.lang.Integer) Z2.H0.f12682a.get(strO)) == null)) {
                                    if (i17 == 0) {
                                        switch (strO) {
                                            case "oblique":
                                                i17 = 3;
                                                break;
                                            case "italic":
                                                i17 = 2;
                                                break;
                                            case "normal":
                                                i17 = 1;
                                                break;
                                            default:
                                                i17 = 0;
                                                break;
                                        }
                                        if (i17 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strO.equals("small-caps")) {
                                        str3 = strO;
                                    }
                                }
                            }
                        }
                        try {
                            fS = (Z2.F) Z2.G0.f12675a.get(strO);
                            if (fS == null) {
                                fS = s(strO);
                            }
                        } catch (Z2.D0 unused) {
                            fS = null;
                        }
                        if (m9.t('/')) {
                            m9.X();
                            java.lang.String strN = m9.N();
                            if (strN != null) {
                                s(strN);
                            }
                            m9.X();
                        }
                        if (m9.w()) {
                            strSubstring = null;
                        } else {
                            int i18 = m9.f12783b;
                            m9.f12783b = m9.f12784c;
                            strSubstring = ((java.lang.String) m9.f12785d).substring(i18);
                        }
                        v6.f12840s = q(strSubstring);
                        v6.f12841t = fS;
                        v6.f12842u = java.lang.Integer.valueOf(num == null ? com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST : num.intValue());
                        v6.f12823N = i17 == 0 ? 1 : i17;
                        v6.f12830h |= 122880;
                        break;
                    }
                    break;
                case 19:
                    java.util.ArrayList arrayListQ = q(str2);
                    v6.f12840s = arrayListQ;
                    if (arrayListQ != null) {
                        v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    }
                    break;
                case 20:
                    try {
                        Z2.F f9 = (Z2.F) Z2.G0.f12675a.get(str2);
                        fS2 = f9 == null ? s(str2) : f9;
                    } catch (Z2.D0 unused2) {
                        fS2 = null;
                    }
                    v6.f12841t = fS2;
                    if (fS2 != null) {
                        v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE;
                    }
                    break;
                case 21:
                    java.lang.Integer num2 = (java.lang.Integer) Z2.H0.f12682a.get(str2);
                    v6.f12842u = num2;
                    if (num2 != null) {
                        v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i10 = 3;
                            break;
                        case "italic":
                            i10 = 2;
                            break;
                        case "normal":
                            i10 = 1;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    v6.f12823N = i10;
                    if (i10 != 0) {
                        v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i11 = 2;
                                    break;
                                case "auto":
                                    i11 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i11 = 3;
                                    break;
                                default:
                                    i11 = 0;
                                    break;
                            }
                            v6.f12829T = i11;
                            if (i11 != 0) {
                                v6.f12830h |= 137438953472L;
                            }
                            break;
                        case 28:
                            java.lang.String strR = r(str2);
                            v6.f12845x = strR;
                            v6.y = strR;
                            v6.f12846z = strR;
                            v6.f12830h |= 14680064;
                            break;
                        case 29:
                            v6.f12845x = r(str2);
                            v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                            break;
                        case 30:
                            v6.y = r(str2);
                            v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                            break;
                        case 31:
                            v6.f12846z = r(str2);
                            v6.f12830h |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        v6.f12813C = c1213x;
                                    } else {
                                        try {
                                            v6.f12813C = n(str2);
                                        } catch (Z2.D0 e9) {
                                            android.util.Log.w("SVGParser", e9.getMessage());
                                            return;
                                        }
                                    }
                                    v6.f12830h |= 67108864;
                                    break;
                                case 63:
                                    v6.f12814D = v(str2);
                                    v6.f12830h |= 134217728;
                                    break;
                                case 64:
                                    Z2.AbstractC1187e0 abstractC1187e0W2 = w(str2);
                                    v6.f12832k = abstractC1187e0W2;
                                    if (abstractC1187e0W2 != null) {
                                        v6.f12830h |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        Z2.M m10 = new Z2.M(str2);
                                        m10.X();
                                        if (m10.w() || (fL = m10.L()) == null || fL.f()) {
                                            fArr = null;
                                        } else {
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            arrayList.add(fL);
                                            float f10 = fL.f12668h;
                                            while (true) {
                                                if (!m10.w()) {
                                                    m10.W();
                                                    Z2.F fL2 = m10.L();
                                                    if (fL2 != null && !fL2.f()) {
                                                        arrayList.add(fL2);
                                                        f10 += fL2.f12668h;
                                                    }
                                                } else if (f10 != 0.0f) {
                                                    fArr = (Z2.F[]) arrayList.toArray(new Z2.F[arrayList.size()]);
                                                }
                                                fArr = null;
                                            }
                                        }
                                        v6.f12836o = fArr;
                                        if (fArr != null) {
                                            v6.f12830h |= 512;
                                        }
                                    } else {
                                        v6.f12836o = null;
                                        v6.f12830h |= 512;
                                    }
                                    break;
                                case 66:
                                    v6.f12837p = s(str2);
                                    v6.f12830h |= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                                    break;
                                case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                    if ("butt".equals(str2)) {
                                        i12 = 1;
                                    } else if ("round".equals(str2)) {
                                        i12 = 2;
                                    } else {
                                        i12 = "square".equals(str2) ? 3 : 0;
                                    }
                                    v6.f12821L = i12;
                                    if (i12 != 0) {
                                        v6.f12830h |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i13 = 1;
                                    } else if ("round".equals(str2)) {
                                        i13 = 2;
                                    } else {
                                        i13 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    v6.f12822M = i13;
                                    if (i13 != 0) {
                                        v6.f12830h |= 128;
                                    }
                                    break;
                                case 69:
                                    v6.f12835n = java.lang.Float.valueOf(p(str2));
                                    v6.f12830h |= 256;
                                    break;
                                case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_TRACE /* 70 */:
                                    java.lang.Float fV2 = v(str2);
                                    v6.f12833l = fV2;
                                    if (fV2 != null) {
                                        v6.f12830h |= 16;
                                    }
                                    break;
                                case androidx.media3.extractor.ts.TsExtractor.TS_SYNC_BYTE /* 71 */:
                                    v6.f12834m = s(str2);
                                    v6.f12830h |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                v6.f12818I = c1213x;
                                            } else {
                                                try {
                                                    v6.f12818I = n(str2);
                                                } catch (Z2.D0 e10) {
                                                    android.util.Log.w("SVGParser", e10.getMessage());
                                                    return;
                                                }
                                            }
                                            v6.f12830h |= 8589934592L;
                                            break;
                                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                            v6.f12819J = v(str2);
                                            v6.f12830h |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    v6.f12812B = java.lang.Boolean.valueOf(str2.equals("visible"));
                                                    v6.f12830h |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (Z2.D0 unused3) {
        }
    }

    public static int b(float f9) {
        if (f9 < 0.0f) {
            return 0;
        }
        if (f9 > 255.0f) {
            return 255;
        }
        return java.lang.Math.round(f9);
    }

    public static int d(float f9, float f10, float f11) {
        float f12 = 0.0f;
        float f13 = f9 % 360.0f;
        if (f9 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f10 / 100.0f;
        float f16 = f11 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        if (f16 >= 0.0f) {
            f12 = f16 > 1.0f ? 1.0f : f16;
        }
        float f17 = f12 <= 0.5f ? (f15 + 1.0f) * f12 : (f12 + f15) - (f15 * f12);
        float f18 = (f12 * 2.0f) - f17;
        return b(e(f18, f17, f14 - 2.0f) * 256.0f) | (b(e(f18, f17, f14 + 2.0f) * 256.0f) << 16) | (b(e(f18, f17, f14) * 256.0f) << 8);
    }

    public static float e(float f9, float f10, float f11) {
        if (f11 < 0.0f) {
            f11 += 6.0f;
        }
        if (f11 >= 6.0f) {
            f11 -= 6.0f;
        }
        if (f11 < 1.0f) {
            return ((f10 - f9) * f11) + f9;
        }
        if (f11 < 3.0f) {
            return f10;
        }
        if (f11 >= 4.0f) {
            return f9;
        }
        return ((4.0f - f11) * (f10 - f9)) + f9;
    }

    public static void f(Z2.X x9, org.xml.sax.Attributes attributes) {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String strTrim = attributes.getValue(i3).trim();
            int iD = Y6.f.d(attributes, i3);
            if (iD != 73) {
                switch (iD) {
                    case 52:
                        Z2.M m8 = new Z2.M(strTrim);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        while (!m8.w()) {
                            java.lang.String strN = m8.N();
                            if (strN.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strN.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            m8.X();
                        }
                        x9.f(hashSet);
                        break;
                    case 53:
                        x9.i(strTrim);
                        break;
                    case 54:
                        Z2.M m9 = new Z2.M(strTrim);
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        while (!m9.w()) {
                            hashSet2.add(m9.N());
                            m9.X();
                        }
                        x9.j(hashSet2);
                        break;
                    case 55:
                        java.util.ArrayList arrayListQ = q(strTrim);
                        x9.h(arrayListQ != null ? new java.util.HashSet(arrayListQ) : new java.util.HashSet(0));
                        break;
                }
            } else {
                Z2.M m10 = new Z2.M(strTrim);
                java.util.HashSet hashSet3 = new java.util.HashSet();
                while (!m10.w()) {
                    java.lang.String strN2 = m10.N();
                    int iIndexOf = strN2.indexOf(45);
                    if (iIndexOf != -1) {
                        strN2 = strN2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new java.util.Locale(strN2, "", "").getLanguage());
                    m10.X();
                }
                x9.k(hashSet3);
            }
        }
    }

    public static void g(Z2.AbstractC1181b0 abstractC1181b0, org.xml.sax.Attributes attributes) throws Z2.D0 {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String qName = attributes.getQName(i3);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC1181b0.f12859c = attributes.getValue(i3).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                java.lang.String strTrim = attributes.getValue(i3).trim();
                if ("default".equals(strTrim)) {
                    abstractC1181b0.f12860d = java.lang.Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new Z2.D0(p121o0.p.C("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC1181b0.f12860d = java.lang.Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(Z2.A a2, org.xml.sax.Attributes attributes) throws Z2.D0 {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String strTrim = attributes.getValue(i3).trim();
            int iD = Y6.f.d(attributes, i3);
            if (iD == 23) {
                a2.j = z(strTrim);
            } else if (iD != 24) {
                if (iD != 26) {
                    if (iD != 60) {
                        continue;
                    } else {
                        try {
                            a2.f12638k = Y6.f.A(strTrim);
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new Z2.D0(Y6.f.h("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                    a2.f12639l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                a2.f12637i = java.lang.Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new Z2.D0("Invalid value for attribute gradientUnits");
                }
                a2.f12637i = java.lang.Boolean.TRUE;
            }
        }
    }

    public static void i(Z2.P p2, org.xml.sax.Attributes attributes, java.lang.String str) throws Z2.D0 {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            if (Z2.J0.a(attributes.getLocalName(i3)) == Z2.J0.f12732c0) {
                Z2.M m8 = new Z2.M(attributes.getValue(i3));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                m8.X();
                while (!m8.w()) {
                    float fK = m8.K();
                    if (java.lang.Float.isNaN(fK)) {
                        throw new Z2.D0(Y6.f.h("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    m8.W();
                    float fK2 = m8.K();
                    if (java.lang.Float.isNaN(fK2)) {
                        throw new Z2.D0(Y6.f.h("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    m8.W();
                    arrayList.add(java.lang.Float.valueOf(fK));
                    arrayList.add(java.lang.Float.valueOf(fK2));
                }
                p2.f12803o = new float[arrayList.size()];
                java.util.Iterator it = arrayList.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    p2.f12803o[i9] = ((java.lang.Float) it.next()).floatValue();
                    i9++;
                }
            }
        }
    }

    public static void j(Z2.AbstractC1181b0 abstractC1181b0, org.xml.sax.Attributes attributes) {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String strTrim = attributes.getValue(i3).trim();
            if (strTrim.length() != 0) {
                int iD = Y6.f.d(attributes, i3);
                if (iD == 0) {
                    Z2.C1182c c1182c = new Z2.C1182c(strTrim);
                    java.util.ArrayList arrayList = null;
                    while (!c1182c.w()) {
                        java.lang.String strN = c1182c.N();
                        if (strN != null) {
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                            }
                            arrayList.add(strN);
                            c1182c.X();
                        }
                    }
                    abstractC1181b0.g = arrayList;
                } else if (iD != 72) {
                    if (abstractC1181b0.f12861e == null) {
                        abstractC1181b0.f12861e = new Z2.V();
                    }
                    D(abstractC1181b0.f12861e, attributes.getLocalName(i3), attributes.getValue(i3).trim());
                } else {
                    Z2.M m8 = new Z2.M(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        java.lang.String strO = m8.O(':', false);
                        m8.X();
                        if (!m8.t(':')) {
                            break;
                        }
                        m8.X();
                        java.lang.String strO2 = m8.O(';', true);
                        if (strO2 == null) {
                            break;
                        }
                        m8.X();
                        if (m8.w() || m8.t(';')) {
                            if (abstractC1181b0.f12862f == null) {
                                abstractC1181b0.f12862f = new Z2.V();
                            }
                            D(abstractC1181b0.f12862f, strO, strO2);
                            m8.X();
                        }
                    }
                }
            }
        }
    }

    public static void k(Z2.q0 q0Var, org.xml.sax.Attributes attributes) {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String strTrim = attributes.getValue(i3).trim();
            int iD = Y6.f.d(attributes, i3);
            if (iD == 9) {
                q0Var.f12918p = t(strTrim);
            } else if (iD == 10) {
                q0Var.f12919q = t(strTrim);
            } else if (iD == 82) {
                q0Var.f12916n = t(strTrim);
            } else if (iD == 83) {
                q0Var.f12917o = t(strTrim);
            }
        }
    }

    public static void l(Z2.D d4, org.xml.sax.Attributes attributes) {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            if (Z2.J0.a(attributes.getLocalName(i3)) == Z2.J0.f12699F0) {
                d4.l(z(attributes.getValue(i3)));
            }
        }
    }

    public static void m(Z2.AbstractC1193h0 abstractC1193h0, org.xml.sax.Attributes attributes) throws Z2.D0 {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            java.lang.String strTrim = attributes.getValue(i3).trim();
            int iD = Y6.f.d(attributes, i3);
            if (iD == 48) {
                x(abstractC1193h0, strTrim);
            } else if (iD != 80) {
                continue;
            } else {
                Z2.M m8 = new Z2.M(strTrim);
                m8.X();
                float fK = m8.K();
                m8.W();
                float fK2 = m8.K();
                m8.W();
                float fK3 = m8.K();
                m8.W();
                float fK4 = m8.K();
                if (java.lang.Float.isNaN(fK) || java.lang.Float.isNaN(fK2) || java.lang.Float.isNaN(fK3) || java.lang.Float.isNaN(fK4)) {
                    throw new Z2.D0("Invalid viewBox definition - should have four numbers");
                }
                if (fK3 < 0.0f) {
                    throw new Z2.D0("Invalid viewBox. width cannot be negative");
                }
                if (fK4 < 0.0f) {
                    throw new Z2.D0("Invalid viewBox. height cannot be negative");
                }
                abstractC1193h0.f12888o = new Z2.C1209t(fK, fK2, fK3, fK4);
            }
        }
    }

    public static Z2.C1212w n(java.lang.String str) throws Z2.D0 {
        long j;
        int i3;
        if (str.charAt(0) == '#') {
            int length = str.length();
            Z2.C1206p c1206p = null;
            if (1 < length) {
                long j9 = 0;
                int i9 = 1;
                while (true) {
                    if (i9 < length) {
                        char cCharAt = str.charAt(i9);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j9 * 16;
                                i3 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j9 * 16;
                                i3 = cCharAt - 'a';
                            }
                            j9 = j + ((long) i3) + 10;
                        } else {
                            j9 = (j9 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j9 <= 4294967295L) {
                            i9++;
                        }
                    }
                    if (i9 != 1) {
                        c1206p = new Z2.C1206p(j9, i9);
                    }
                }
            }
            if (c1206p == null) {
                throw new Z2.D0("Bad hex colour value: ".concat(str));
            }
            long j10 = c1206p.f12909b;
            int i10 = c1206p.f12908a;
            if (i10 == 4) {
                int i11 = (int) j10;
                int i12 = i11 & 3840;
                int i13 = i11 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
                int i14 = i11 & 15;
                return new Z2.C1212w(i14 | (i12 << 8) | (-16777216) | (i12 << 12) | (i13 << 8) | (i13 << 4) | (i14 << 4));
            }
            if (i10 != 5) {
                if (i10 == 7) {
                    return new Z2.C1212w(((int) j10) | (-16777216));
                }
                if (i10 != 9) {
                    throw new Z2.D0("Bad hex colour value: ".concat(str));
                }
                int i15 = (int) j10;
                return new Z2.C1212w((i15 >>> 8) | (i15 << 24));
            }
            int i16 = (int) j10;
            int i17 = 61440 & i16;
            int i18 = i16 & 3840;
            int i19 = i16 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
            int i20 = i16 & 15;
            return new Z2.C1212w((i20 << 24) | (i20 << 28) | (i17 << 8) | (i17 << 4) | (i18 << 4) | i18 | i19 | (i19 >> 4));
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            Z2.M m8 = new Z2.M(str.substring(zStartsWith ? 5 : 4));
            m8.X();
            float fK = m8.K();
            if (!java.lang.Float.isNaN(fK) && m8.t('%')) {
                fK = (fK * 256.0f) / 100.0f;
            }
            float fK2 = m8.k(fK);
            if (!java.lang.Float.isNaN(fK2) && m8.t('%')) {
                fK2 = (fK2 * 256.0f) / 100.0f;
            }
            float fK3 = m8.k(fK2);
            if (!java.lang.Float.isNaN(fK3) && m8.t('%')) {
                fK3 = (fK3 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                m8.X();
                if (java.lang.Float.isNaN(fK3) || !m8.t(')')) {
                    throw new Z2.D0("Bad rgb() colour value: ".concat(str));
                }
                return new Z2.C1212w((b(fK) << 16) | (-16777216) | (b(fK2) << 8) | b(fK3));
            }
            float fK4 = m8.k(fK3);
            m8.X();
            if (java.lang.Float.isNaN(fK4) || !m8.t(')')) {
                throw new Z2.D0("Bad rgba() colour value: ".concat(str));
            }
            return new Z2.C1212w((b(fK4 * 256.0f) << 24) | (b(fK) << 16) | (b(fK2) << 8) | b(fK3));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            java.lang.Integer num = (java.lang.Integer) Z2.F0.f12670a.get(lowerCase);
            if (num != null) {
                return new Z2.C1212w(num.intValue());
            }
            throw new Z2.D0("Invalid colour keyword: ".concat(lowerCase));
        }
        Z2.M m9 = new Z2.M(str.substring(zStartsWith2 ? 5 : 4));
        m9.X();
        float fK5 = m9.K();
        float fK6 = m9.k(fK5);
        if (!java.lang.Float.isNaN(fK6)) {
            m9.t('%');
        }
        float fK7 = m9.k(fK6);
        if (!java.lang.Float.isNaN(fK7)) {
            m9.t('%');
        }
        if (!zStartsWith2) {
            m9.X();
            if (java.lang.Float.isNaN(fK7) || !m9.t(')')) {
                throw new Z2.D0("Bad hsl() colour value: ".concat(str));
            }
            return new Z2.C1212w(d(fK5, fK6, fK7) | (-16777216));
        }
        float fK8 = m9.k(fK7);
        m9.X();
        if (java.lang.Float.isNaN(fK8) || !m9.t(')')) {
            throw new Z2.D0("Bad hsla() colour value: ".concat(str));
        }
        return new Z2.C1212w((b(fK8 * 256.0f) << 24) | d(fK5, fK6, fK7));
    }

    public static float o(int i3, java.lang.String str) throws Z2.D0 {
        float fA = new Z2.C1207q().a(0, i3, str);
        if (java.lang.Float.isNaN(fA)) {
            throw new Z2.D0(p121o0.p.C("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(java.lang.String str) throws Z2.D0 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new Z2.D0("Invalid float value (empty string)");
    }

    public static java.util.ArrayList q(java.lang.String str) {
        Z2.M m8 = new Z2.M(str);
        java.util.ArrayList arrayList = null;
        do {
            java.lang.String strM = m8.M();
            if (strM == null) {
                strM = m8.O(',', true);
            }
            if (strM == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(strM);
            m8.W();
        } while (!m8.w());
        return arrayList;
    }

    public static java.lang.String r(java.lang.String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static Z2.F s(java.lang.String str) throws Z2.D0 {
        int iB;
        if (str.length() == 0) {
            throw new Z2.D0("Invalid length value (empty string)");
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iB = 9;
        } else if (length > 2 && java.lang.Character.isLetter(cCharAt) && java.lang.Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iB = Y6.f.B(str.substring(length).toLowerCase(java.util.Locale.US));
            } catch (java.lang.IllegalArgumentException unused) {
                throw new Z2.D0("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iB = 1;
        }
        try {
            return new Z2.F(o(length, str), iB);
        } catch (java.lang.NumberFormatException e6) {
            throw new Z2.D0("Invalid length value: ".concat(str), e6);
        }
    }

    public static java.util.ArrayList t(java.lang.String str) throws Z2.D0 {
        java.lang.String str2;
        if (str.length() == 0) {
            throw new Z2.D0("Invalid length list (empty string)");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        Z2.M m8 = new Z2.M(str);
        m8.X();
        while (!m8.w()) {
            float fK = m8.K();
            if (java.lang.Float.isNaN(fK)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid length list value: ");
                int i3 = m8.f12783b;
                while (true) {
                    boolean zW = m8.w();
                    str2 = (java.lang.String) m8.f12785d;
                    if (zW || Z2.M.G(str2.charAt(m8.f12783b))) {
                        break;
                    }
                    m8.f12783b++;
                }
                java.lang.String strSubstring = str2.substring(i3, m8.f12783b);
                m8.f12783b = i3;
                sb.append(strSubstring);
                throw new Z2.D0(sb.toString());
            }
            int iP = m8.P();
            if (iP == 0) {
                iP = 1;
            }
            arrayList.add(new Z2.F(fK, iP));
            m8.W();
        }
        return arrayList;
    }

    public static Z2.F u(Z2.M m8) {
        return m8.u(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO) ? new Z2.F(0.0f) : m8.L();
    }

    public static java.lang.Float v(java.lang.String str) {
        try {
            float fP = p(str);
            float f9 = 0.0f;
            if (fP < 0.0f) {
                fP = f9;
            } else {
                f9 = 1.0f;
                if (fP > 1.0f) {
                    fP = f9;
                }
            }
            return java.lang.Float.valueOf(fP);
        } catch (Z2.D0 unused) {
            return null;
        }
    }

    public static Z2.AbstractC1187e0 w(java.lang.String str) {
        boolean zStartsWith = str.startsWith("url(");
        Z2.AbstractC1187e0 abstractC1187e0N = Z2.C1212w.j;
        Z2.C1213x c1213x = Z2.C1213x.f12966h;
        Z2.AbstractC1187e0 abstractC1187e0 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return abstractC1187e0N;
            }
            if (str.equals("currentColor")) {
                return c1213x;
            }
            try {
                return n(str);
            } catch (Z2.D0 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new Z2.K(str.substring(4).trim(), null);
        }
        java.lang.String strTrim = str.substring(4, iIndexOf).trim();
        java.lang.String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    abstractC1187e0N = c1213x;
                } else {
                    try {
                        abstractC1187e0N = n(strTrim2);
                    } catch (Z2.D0 unused2) {
                        abstractC1187e0N = null;
                    }
                }
            }
            abstractC1187e0 = abstractC1187e0N;
        }
        return new Z2.K(strTrim, abstractC1187e0);
    }

    public static void x(Z2.AbstractC1189f0 abstractC1189f0, java.lang.String str) throws Z2.D0 {
        int i3;
        Z2.M m8 = new Z2.M(str);
        m8.X();
        java.lang.String strN = m8.N();
        if ("defer".equals(strN)) {
            m8.X();
            strN = m8.N();
        }
        Z2.r rVar = (Z2.r) Z2.E0.f12667a.get(strN);
        m8.X();
        if (m8.w()) {
            i3 = 0;
        } else {
            java.lang.String strN2 = m8.N();
            strN2.getClass();
            if (strN2.equals("meet")) {
                i3 = 1;
            } else {
                if (!strN2.equals("slice")) {
                    throw new Z2.D0("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i3 = 2;
            }
        }
        abstractC1189f0.f12876n = new Z2.C1208s(rVar, i3);
    }

    public static java.util.HashMap y(Z2.M m8) {
        java.util.HashMap map = new java.util.HashMap();
        m8.X();
        java.lang.String strO = m8.O('=', false);
        while (strO != null) {
            m8.t('=');
            map.put(strO, m8.M());
            m8.X();
            strO = m8.O('=', false);
        }
        return map;
    }

    public static android.graphics.Matrix z(java.lang.String str) throws Z2.D0 {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        Z2.M m8 = new Z2.M(str);
        m8.X();
        while (!m8.w()) {
            java.lang.String strSubstring = null;
            if (!m8.w()) {
                int i3 = m8.f12783b;
                java.lang.String str2 = (java.lang.String) m8.f12785d;
                int iCharAt = str2.charAt(i3);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = m8.g();
                    }
                }
                int i9 = m8.f12783b;
                while (Z2.M.G(iCharAt)) {
                    iCharAt = m8.g();
                }
                if (iCharAt == 40) {
                    m8.f12783b++;
                    strSubstring = str2.substring(i3, i9);
                } else {
                    m8.f12783b = i3;
                }
            }
            if (strSubstring == null) {
                throw new Z2.D0("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    m8.X();
                    float fK = m8.K();
                    m8.W();
                    float fK2 = m8.K();
                    m8.W();
                    float fK3 = m8.K();
                    m8.W();
                    float fK4 = m8.K();
                    m8.W();
                    float fK5 = m8.K();
                    m8.W();
                    float fK6 = m8.K();
                    m8.X();
                    if (java.lang.Float.isNaN(fK6) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.setValues(new float[]{fK, fK3, fK5, fK2, fK4, fK6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    m8.X();
                    float fK7 = m8.K();
                    float fS = m8.S();
                    float fS2 = m8.S();
                    m8.X();
                    if (java.lang.Float.isNaN(fK7) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    if (java.lang.Float.isNaN(fS)) {
                        matrix.preRotate(fK7);
                    } else {
                        if (java.lang.Float.isNaN(fS2)) {
                            throw new Z2.D0("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fK7, fS, fS2);
                    }
                    break;
                    break;
                case "scale":
                    m8.X();
                    float fK8 = m8.K();
                    float fS3 = m8.S();
                    m8.X();
                    if (java.lang.Float.isNaN(fK8) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    if (!java.lang.Float.isNaN(fS3)) {
                        matrix.preScale(fK8, fS3);
                    } else {
                        matrix.preScale(fK8, fK8);
                    }
                    break;
                    break;
                case "skewX":
                    m8.X();
                    float fK9 = m8.K();
                    m8.X();
                    if (java.lang.Float.isNaN(fK9) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) java.lang.Math.tan(java.lang.Math.toRadians(fK9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    m8.X();
                    float fK10 = m8.K();
                    m8.X();
                    if (java.lang.Float.isNaN(fK10) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) java.lang.Math.tan(java.lang.Math.toRadians(fK10)));
                    break;
                    break;
                case "translate":
                    m8.X();
                    float fK11 = m8.K();
                    float fS4 = m8.S();
                    m8.X();
                    if (java.lang.Float.isNaN(fK11) || !m8.t(')')) {
                        throw new Z2.D0("Invalid transform list: ".concat(str));
                    }
                    if (!java.lang.Float.isNaN(fS4)) {
                        matrix.preTranslate(fK11, fS4);
                    } else {
                        matrix.preTranslate(fK11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new Z2.D0(Y6.f.h("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (m8.w()) {
                return matrix;
            }
            m8.W();
        }
        return matrix;
    }

    public final void A(java.io.InputStream inputStream) throws Z2.D0 {
        android.util.Log.d("SVGParser", "Falling back to SAX parser");
        try {
            javax.xml.parsers.SAXParserFactory sAXParserFactoryNewInstance = javax.xml.parsers.SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            org.xml.sax.XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            Z2.I0 i3 = new Z2.I0(this);
            xMLReader.setContentHandler(i3);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", i3);
            xMLReader.parse(new org.xml.sax.InputSource(inputStream));
        } catch (java.io.IOException e6) {
            throw new Z2.D0("Stream error", e6);
        } catch (javax.xml.parsers.ParserConfigurationException e9) {
            throw new Z2.D0("XML parser problem", e9);
        } catch (org.xml.sax.SAXException e10) {
            throw new Z2.D0("SVG parse error", e10);
        }
    }

    public final void B(java.io.InputStream inputStream) throws Z2.D0 {
        try {
            try {
                org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = android.util.Xml.newPullParser();
                Z2.L0 l2 = new Z2.L0();
                l2.f12781a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        android.util.Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        Z2.M m8 = new Z2.M(xmlPullParserNewPullParser.getText());
                        java.lang.String strN = m8.N();
                        y(m8);
                        strN.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((Z2.W) this.f12787a.f15617i) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                android.util.Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (java.io.IOException unused) {
                                android.util.Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        java.lang.String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, l2);
                    } else if (eventType == 3) {
                        java.lang.String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (org.xmlpull.v1.XmlPullParserException e6) {
                throw new Z2.D0("XML parser problem", e6);
            }
        } catch (java.io.IOException e9) {
            throw new Z2.D0("Stream error", e9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:115:0x0300  */
    /* JADX WARN: Code duplicated, block: B:149:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0320 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void C(org.xml.sax.Attributes attributes) throws Z2.D0 {
        int iIntValue;
        float fK;
        float f9;
        float f10;
        float f11;
        float f12;
        int i3;
        char cCharAt;
        org.xml.sax.Attributes attributes2 = attributes;
        Z2.Z z6 = this.f12788b;
        if (z6 == null) {
            throw new Z2.D0("Invalid document. Root element must be <svg>");
        }
        Z2.L l2 = new Z2.L();
        l2.f12869a = this.f12787a;
        l2.f12870b = z6;
        g(l2, attributes2);
        j(l2, attributes2);
        l(l2, attributes2);
        f(l2, attributes2);
        int i9 = 0;
        int i10 = 0;
        while (i10 < attributes2.getLength()) {
            java.lang.String strTrim = attributes2.getValue(i10).trim();
            int iD = Y6.f.d(attributes2, i10);
            float f13 = 0.0f;
            if (iD == 13) {
                Z2.M m8 = new Z2.M(strTrim);
                Z2.M m9 = new Z2.M(0);
                m9.f12783b = i9;
                m9.f12784c = i9;
                m9.f12785d = new byte[8];
                m9.f12786e = new float[16];
                if (!m8.w() && ((iIntValue = m8.J().intValue()) == 77 || iIntValue == 109)) {
                    float f14 = 0.0f;
                    float fK2 = 0.0f;
                    float f15 = 0.0f;
                    float fK3 = 0.0f;
                    float f16 = 0.0f;
                    float f17 = 0.0f;
                    while (true) {
                        m8.X();
                        float f18 = f13;
                        switch (iIntValue) {
                            case 65:
                            case 97:
                                float fK4 = m8.K();
                                float fK5 = m8.k(fK4);
                                float f19 = f15;
                                float fK6 = m8.k(fK5);
                                java.lang.Boolean boolJ = m8.j(java.lang.Float.valueOf(fK6));
                                java.lang.Boolean boolJ2 = m8.j(boolJ);
                                if (boolJ2 == null) {
                                    fK = Float.NaN;
                                } else {
                                    m8.W();
                                    fK = m8.K();
                                }
                                float f20 = fK;
                                float fK7 = m8.k(f20);
                                if (!java.lang.Float.isNaN(fK7) && fK4 >= f18 && fK5 >= f18) {
                                    if (iIntValue == 97) {
                                        f9 = f20 + f14;
                                        fK7 += f19;
                                    } else {
                                        f9 = f20;
                                    }
                                    boolean zBooleanValue = boolJ.booleanValue();
                                    boolean zBooleanValue2 = boolJ2.booleanValue();
                                    float f21 = f9;
                                    float f22 = fK7;
                                    m9.d(fK4, fK5, fK6, zBooleanValue, zBooleanValue2, f21, f22);
                                    f14 = f21;
                                    fK2 = f14;
                                    f15 = f22;
                                    fK3 = f15;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c && (((cCharAt = ((java.lang.String) m8.f12785d).charAt(i3)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                            case 99:
                                float fK8 = m8.K();
                                float fK9 = m8.k(fK8);
                                float fK10 = m8.k(fK9);
                                float fK11 = m8.k(fK10);
                                float fK12 = m8.k(fK11);
                                float fK13 = m8.k(fK12);
                                if (!java.lang.Float.isNaN(fK13)) {
                                    if (iIntValue == 99) {
                                        fK12 += f14;
                                        fK13 += f15;
                                        fK8 += f14;
                                        fK9 += f15;
                                        fK10 += f14;
                                        fK11 += f15;
                                    }
                                    float f23 = fK8;
                                    float f24 = fK9;
                                    f10 = fK10;
                                    fK3 = fK11;
                                    f11 = fK13;
                                    f12 = fK12;
                                    m9.c(f23, f24, f10, fK3, f12, f11);
                                    fK2 = f10;
                                    f14 = f12;
                                    f15 = f11;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 72:
                            case 104:
                                float fK14 = m8.K();
                                if (!java.lang.Float.isNaN(fK14)) {
                                    if (iIntValue == 104) {
                                        fK14 += f14;
                                    }
                                    f14 = fK14;
                                    m9.e(f14, f15);
                                    fK2 = f14;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 76:
                            case 108:
                                float fK15 = m8.K();
                                float fK16 = m8.k(fK15);
                                if (!java.lang.Float.isNaN(fK16)) {
                                    if (iIntValue == 108) {
                                        fK15 += f14;
                                        fK16 += f15;
                                    }
                                    f14 = fK15;
                                    f15 = fK16;
                                    m9.e(f14, f15);
                                    fK2 = f14;
                                    fK3 = f15;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 77:
                            case 109:
                                float fK17 = m8.K();
                                float fK18 = m8.k(fK17);
                                if (!java.lang.Float.isNaN(fK18)) {
                                    if (iIntValue == 109 && m9.f12783b != 0) {
                                        fK17 += f14;
                                        fK18 += f15;
                                    }
                                    f14 = fK17;
                                    f15 = fK18;
                                    m9.b(f14, f15);
                                    fK2 = f14;
                                    f16 = fK2;
                                    fK3 = f15;
                                    f17 = fK3;
                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 81:
                            case 113:
                                fK2 = m8.K();
                                fK3 = m8.k(fK2);
                                float fK19 = m8.k(fK3);
                                float fK20 = m8.k(fK19);
                                if (!java.lang.Float.isNaN(fK20)) {
                                    if (iIntValue == 113) {
                                        fK19 += f14;
                                        fK20 += f15;
                                        fK2 += f14;
                                        fK3 += f15;
                                    }
                                    f14 = fK19;
                                    f15 = fK20;
                                    m9.a(fK2, fK3, f14, f15);
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 83:
                            case 115:
                                float f25 = (f14 * 2.0f) - fK2;
                                float f26 = (2.0f * f15) - fK3;
                                float fK21 = m8.K();
                                float fK22 = m8.k(fK21);
                                float fK23 = m8.k(fK22);
                                float fK24 = m8.k(fK23);
                                if (!java.lang.Float.isNaN(fK24)) {
                                    if (iIntValue == 115) {
                                        fK23 += f14;
                                        fK24 += f15;
                                        fK21 += f14;
                                        fK22 += f15;
                                    }
                                    f10 = fK21;
                                    fK3 = fK22;
                                    f11 = fK24;
                                    f12 = fK23;
                                    m9.c(f25, f26, f10, fK3, f12, f11);
                                    fK2 = f10;
                                    f14 = f12;
                                    f15 = f11;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 84:
                            case androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                                fK2 = (f14 * 2.0f) - fK2;
                                fK3 = (2.0f * f15) - fK3;
                                float fK25 = m8.K();
                                float fK26 = m8.k(fK25);
                                if (!java.lang.Float.isNaN(fK26)) {
                                    if (iIntValue == 116) {
                                        fK25 += f14;
                                        fK26 += f15;
                                    }
                                    f14 = fK25;
                                    f15 = fK26;
                                    m9.a(fK2, fK3, f14, f15);
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 86:
                            case 118:
                                float fK27 = m8.K();
                                if (!java.lang.Float.isNaN(fK27)) {
                                    if (iIntValue == 118) {
                                        fK27 += f15;
                                    }
                                    f15 = fK27;
                                    m9.e(f14, f15);
                                    fK3 = f15;
                                    m8.W();
                                    if (m8.w()) {
                                        i3 = m8.f12783b;
                                        if (i3 != m8.f12784c) {
                                            iIntValue = m8.J().intValue();
                                        }
                                        f13 = f18;
                                    }
                                } else {
                                    android.util.Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 90:
                            case 122:
                                m9.close();
                                f14 = f16;
                                fK2 = f14;
                                f15 = f17;
                                fK3 = f15;
                                m8.W();
                                if (m8.w()) {
                                    i3 = m8.f12783b;
                                    if (i3 != m8.f12784c) {
                                        iIntValue = m8.J().intValue();
                                    }
                                    f13 = f18;
                                }
                                break;
                        }
                    }
                }
                l2.f12780o = m9;
            } else if (iD == 43 && p(strTrim) < 0.0f) {
                throw new Z2.D0("Invalid <path> element. pathLength cannot be negative");
            }
            i10++;
            attributes2 = attributes;
            i9 = 0;
        }
        this.f12788b.a(l2);
    }

    public final void E() {
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(16, false);
        qVar.f15617i = null;
        qVar.j = new Z2.C1202m(0);
        qVar.f15618k = new java.util.HashMap();
        this.f12787a = qVar;
    }

    public final void F(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws Z2.D0 {
        boolean z6;
        if (this.f12789c) {
            this.f12790d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            Z2.K0 k1 = (Z2.K0) Z2.K0.f12778l.get(str2.length() > 0 ? str2 : str3);
            if (k1 == null) {
                k1 = Z2.K0.f12777k;
            }
            switch (k1.ordinal()) {
                case 0:
                    Z2.W w6 = new Z2.W();
                    w6.f12869a = this.f12787a;
                    w6.f12870b = this.f12788b;
                    g(w6, attributes);
                    j(w6, attributes);
                    f(w6, attributes);
                    m(w6, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        java.lang.String strTrim = attributes.getValue(i3).trim();
                        int iD = Y6.f.d(attributes, i3);
                        if (iD == 25) {
                            Z2.F fS = s(strTrim);
                            w6.f12850s = fS;
                            if (fS.f()) {
                                throw new Z2.D0("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (iD != 79) {
                            switch (iD) {
                                case 81:
                                    Z2.F fS2 = s(strTrim);
                                    w6.f12849r = fS2;
                                    if (fS2.f()) {
                                        throw new Z2.D0("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    w6.f12847p = s(strTrim);
                                    break;
                                case 83:
                                    w6.f12848q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    Z2.Z z9 = this.f12788b;
                    if (z9 == null) {
                        this.f12787a.f15617i = w6;
                    } else {
                        z9.a(w6);
                    }
                    this.f12788b = w6;
                    return;
                case 1:
                case 7:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C c9 = new Z2.C();
                    c9.f12869a = this.f12787a;
                    c9.f12870b = this.f12788b;
                    g(c9, attributes);
                    j(c9, attributes);
                    l(c9, attributes);
                    f(c9, attributes);
                    this.f12788b.a(c9);
                    this.f12788b = c9;
                    return;
                case 2:
                    Z2.Z z10 = this.f12788b;
                    if (z10 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1210u c1210u = new Z2.C1210u();
                    c1210u.f12869a = this.f12787a;
                    c1210u.f12870b = z10;
                    g(c1210u, attributes);
                    j(c1210u, attributes);
                    l(c1210u, attributes);
                    f(c1210u, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        java.lang.String strTrim2 = attributes.getValue(i9).trim();
                        int iD2 = Y6.f.d(attributes, i9);
                        if (iD2 == 6) {
                            c1210u.f12945o = s(strTrim2);
                        } else if (iD2 == 7) {
                            c1210u.f12946p = s(strTrim2);
                        } else if (iD2 != 49) {
                            continue;
                        } else {
                            Z2.F fS3 = s(strTrim2);
                            c1210u.f12947q = fS3;
                            if (fS3.f()) {
                                throw new Z2.D0("Invalid <circle> element. r cannot be negative");
                            }
                        }
                    }
                    this.f12788b.a(c1210u);
                    return;
                case 3:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1211v c1211v = new Z2.C1211v();
                    c1211v.f12869a = this.f12787a;
                    c1211v.f12870b = this.f12788b;
                    g(c1211v, attributes);
                    j(c1211v, attributes);
                    l(c1211v, attributes);
                    f(c1211v, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        java.lang.String strTrim3 = attributes.getValue(i10).trim();
                        if (Y6.f.d(attributes, i10) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                c1211v.f12955o = java.lang.Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    throw new Z2.D0("Invalid value for attribute clipPathUnits");
                                }
                                c1211v.f12955o = java.lang.Boolean.TRUE;
                            }
                        }
                    }
                    this.f12788b.a(c1211v);
                    this.f12788b = c1211v;
                    return;
                case 4:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1214y c1214y = new Z2.C1214y();
                    c1214y.f12869a = this.f12787a;
                    c1214y.f12870b = this.f12788b;
                    g(c1214y, attributes);
                    j(c1214y, attributes);
                    l(c1214y, attributes);
                    this.f12788b.a(c1214y);
                    this.f12788b = c1214y;
                    return;
                case 5:
                case 26:
                    this.f12791e = true;
                    this.f12792f = k1;
                    return;
                case 6:
                    Z2.Z z11 = this.f12788b;
                    if (z11 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1215z c1215z = new Z2.C1215z();
                    c1215z.f12869a = this.f12787a;
                    c1215z.f12870b = z11;
                    g(c1215z, attributes);
                    j(c1215z, attributes);
                    l(c1215z, attributes);
                    f(c1215z, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        java.lang.String strTrim4 = attributes.getValue(i11).trim();
                        int iD3 = Y6.f.d(attributes, i11);
                        if (iD3 == 6) {
                            c1215z.f12972o = s(strTrim4);
                        } else if (iD3 == 7) {
                            c1215z.f12973p = s(strTrim4);
                        } else if (iD3 == 56) {
                            Z2.F fS4 = s(strTrim4);
                            c1215z.f12974q = fS4;
                            if (fS4.f()) {
                                throw new Z2.D0("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iD3 != 57) {
                            continue;
                        } else {
                            Z2.F fS5 = s(strTrim4);
                            c1215z.f12975r = fS5;
                            if (fS5.f()) {
                                throw new Z2.D0("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f12788b.a(c1215z);
                    return;
                case 8:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.E e6 = new Z2.E();
                    e6.f12869a = this.f12787a;
                    e6.f12870b = this.f12788b;
                    g(e6, attributes);
                    j(e6, attributes);
                    l(e6, attributes);
                    f(e6, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        java.lang.String strTrim5 = attributes.getValue(i12).trim();
                        int iD4 = Y6.f.d(attributes, i12);
                        if (iD4 == 25) {
                            Z2.F fS6 = s(strTrim5);
                            e6.f12665s = fS6;
                            if (fS6.f()) {
                                throw new Z2.D0("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iD4 != 26) {
                            if (iD4 != 48) {
                                switch (iD4) {
                                    case 81:
                                        Z2.F fS7 = s(strTrim5);
                                        e6.f12664r = fS7;
                                        if (fS7.f()) {
                                            throw new Z2.D0("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        e6.f12662p = s(strTrim5);
                                        break;
                                    case 83:
                                        e6.f12663q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(e6, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i12)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i12))) {
                            e6.f12661o = strTrim5;
                        }
                    }
                    this.f12788b.a(e6);
                    this.f12788b = e6;
                    return;
                case 9:
                    Z2.Z z12 = this.f12788b;
                    if (z12 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.G g = new Z2.G();
                    g.f12869a = this.f12787a;
                    g.f12870b = z12;
                    g(g, attributes);
                    j(g, attributes);
                    l(g, attributes);
                    f(g, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        java.lang.String strTrim6 = attributes.getValue(i13).trim();
                        switch (Y6.f.d(attributes, i13)) {
                            case 84:
                                g.f12671o = s(strTrim6);
                                break;
                            case 85:
                                g.f12672p = s(strTrim6);
                                break;
                            case 86:
                                g.f12673q = s(strTrim6);
                                break;
                            case 87:
                                g.f12674r = s(strTrim6);
                                break;
                        }
                    }
                    this.f12788b.a(g);
                    return;
                case 10:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1183c0 c1183c0 = new Z2.C1183c0();
                    c1183c0.f12869a = this.f12787a;
                    c1183c0.f12870b = this.f12788b;
                    g(c1183c0, attributes);
                    j(c1183c0, attributes);
                    h(c1183c0, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        java.lang.String strTrim7 = attributes.getValue(i14).trim();
                        switch (Y6.f.d(attributes, i14)) {
                            case 84:
                                c1183c0.f12863m = s(strTrim7);
                                break;
                            case 85:
                                c1183c0.f12864n = s(strTrim7);
                                break;
                            case 86:
                                c1183c0.f12865o = s(strTrim7);
                                break;
                            case 87:
                                c1183c0.f12866p = s(strTrim7);
                                break;
                        }
                    }
                    this.f12788b.a(c1183c0);
                    this.f12788b = c1183c0;
                    return;
                case 11:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.H h9 = new Z2.H();
                    h9.f12869a = this.f12787a;
                    h9.f12870b = this.f12788b;
                    g(h9, attributes);
                    j(h9, attributes);
                    f(h9, attributes);
                    m(h9, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        java.lang.String strTrim8 = attributes.getValue(i15).trim();
                        int iD5 = Y6.f.d(attributes, i15);
                        if (iD5 != 41) {
                            if (iD5 == 50) {
                                h9.f12677q = s(strTrim8);
                            } else if (iD5 != 51) {
                                switch (iD5) {
                                    case 32:
                                        Z2.F fS8 = s(strTrim8);
                                        h9.f12680t = fS8;
                                        if (fS8.f()) {
                                            throw new Z2.D0("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        continue;
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim8)) {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                throw new Z2.D0("Invalid value for attribute markerUnits");
                                            }
                                            h9.f12676p = true;
                                        } else {
                                            h9.f12676p = false;
                                            continue;
                                        }
                                        break;
                                    case 34:
                                        Z2.F fS9 = s(strTrim8);
                                        h9.f12679s = fS9;
                                        if (fS9.f()) {
                                            throw new Z2.D0("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                h9.f12678r = s(strTrim8);
                            }
                        } else if (androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO.equals(strTrim8)) {
                            h9.f12681u = java.lang.Float.valueOf(Float.NaN);
                        } else {
                            h9.f12681u = java.lang.Float.valueOf(p(strTrim8));
                        }
                    }
                    this.f12788b.a(h9);
                    this.f12788b = h9;
                    return;
                case 12:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.I i16 = new Z2.I();
                    i16.f12869a = this.f12787a;
                    i16.f12870b = this.f12788b;
                    g(i16, attributes);
                    j(i16, attributes);
                    f(i16, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        java.lang.String strTrim9 = attributes.getValue(i17).trim();
                        int iD6 = Y6.f.d(attributes, i17);
                        if (iD6 == 25) {
                            Z2.F fS10 = s(strTrim9);
                            i16.f12686q = fS10;
                            if (fS10.f()) {
                                throw new Z2.D0("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iD6 != 36) {
                            if (iD6 != 37) {
                                switch (iD6) {
                                    case 81:
                                        Z2.F fS11 = s(strTrim9);
                                        i16.f12685p = fS11;
                                        if (fS11.f()) {
                                            throw new Z2.D0("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                i16.f12683n = java.lang.Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    throw new Z2.D0("Invalid value for attribute maskUnits");
                                }
                                i16.f12683n = java.lang.Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            i16.f12684o = java.lang.Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                throw new Z2.D0("Invalid value for attribute maskContentUnits");
                            }
                            i16.f12684o = java.lang.Boolean.TRUE;
                        }
                    }
                    this.f12788b.a(i16);
                    this.f12788b = i16;
                    return;
                case 13:
                    C(attributes);
                    return;
                case 14:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.O o8 = new Z2.O();
                    o8.f12869a = this.f12787a;
                    o8.f12870b = this.f12788b;
                    g(o8, attributes);
                    j(o8, attributes);
                    f(o8, attributes);
                    m(o8, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        java.lang.String strTrim10 = attributes.getValue(i18).trim();
                        int iD7 = Y6.f.d(attributes, i18);
                        if (iD7 == 25) {
                            Z2.F fS12 = s(strTrim10);
                            o8.f12801v = fS12;
                            if (fS12.f()) {
                                throw new Z2.D0("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iD7 != 26) {
                            switch (iD7) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new Z2.D0("Invalid value for attribute patternContentUnits");
                                        }
                                        o8.f12796q = java.lang.Boolean.TRUE;
                                    } else {
                                        o8.f12796q = java.lang.Boolean.FALSE;
                                    }
                                    break;
                                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                                    o8.f12797r = z(strTrim10);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new Z2.D0("Invalid value for attribute patternUnits");
                                        }
                                        o8.f12795p = java.lang.Boolean.TRUE;
                                    } else {
                                        o8.f12795p = java.lang.Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iD7) {
                                        case 81:
                                            Z2.F fS13 = s(strTrim10);
                                            o8.f12800u = fS13;
                                            if (fS13.f()) {
                                                throw new Z2.D0("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            o8.f12798s = s(strTrim10);
                                            break;
                                        case 83:
                                            o8.f12799t = s(strTrim10);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i18))) {
                            o8.f12802w = strTrim10;
                        }
                    }
                    this.f12788b.a(o8);
                    this.f12788b = o8;
                    return;
                case 15:
                    Z2.Z z13 = this.f12788b;
                    if (z13 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.Q q9 = new Z2.Q();
                    q9.f12869a = this.f12787a;
                    q9.f12870b = z13;
                    g(q9, attributes);
                    j(q9, attributes);
                    l(q9, attributes);
                    f(q9, attributes);
                    i(q9, attributes, "polygon");
                    this.f12788b.a(q9);
                    return;
                case 16:
                    Z2.Z z14 = this.f12788b;
                    if (z14 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.P p2 = new Z2.P();
                    p2.f12869a = this.f12787a;
                    p2.f12870b = z14;
                    g(p2, attributes);
                    j(p2, attributes);
                    l(p2, attributes);
                    f(p2, attributes);
                    i(p2, attributes, "polyline");
                    this.f12788b.a(p2);
                    return;
                case 17:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1191g0 c1191g0 = new Z2.C1191g0();
                    c1191g0.f12869a = this.f12787a;
                    c1191g0.f12870b = this.f12788b;
                    g(c1191g0, attributes);
                    j(c1191g0, attributes);
                    h(c1191g0, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        java.lang.String strTrim11 = attributes.getValue(i19).trim();
                        int iD8 = Y6.f.d(attributes, i19);
                        if (iD8 == 6) {
                            c1191g0.f12878m = s(strTrim11);
                        } else if (iD8 == 7) {
                            c1191g0.f12879n = s(strTrim11);
                        } else if (iD8 == 11) {
                            c1191g0.f12881p = s(strTrim11);
                        } else if (iD8 == 12) {
                            c1191g0.f12882q = s(strTrim11);
                        } else if (iD8 != 49) {
                            continue;
                        } else {
                            Z2.F fS14 = s(strTrim11);
                            c1191g0.f12880o = fS14;
                            if (fS14.f()) {
                                throw new Z2.D0("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f12788b.a(c1191g0);
                    this.f12788b = c1191g0;
                    return;
                case 18:
                    Z2.Z z15 = this.f12788b;
                    if (z15 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.S s9 = new Z2.S();
                    s9.f12869a = this.f12787a;
                    s9.f12870b = z15;
                    g(s9, attributes);
                    j(s9, attributes);
                    l(s9, attributes);
                    f(s9, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        java.lang.String strTrim12 = attributes.getValue(i20).trim();
                        int iD9 = Y6.f.d(attributes, i20);
                        if (iD9 == 25) {
                            Z2.F fS15 = s(strTrim12);
                            s9.f12807r = fS15;
                            if (fS15.f()) {
                                throw new Z2.D0("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iD9 == 56) {
                            Z2.F fS16 = s(strTrim12);
                            s9.f12808s = fS16;
                            if (fS16.f()) {
                                throw new Z2.D0("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iD9 != 57) {
                            switch (iD9) {
                                case 81:
                                    Z2.F fS17 = s(strTrim12);
                                    s9.f12806q = fS17;
                                    if (fS17.f()) {
                                        throw new Z2.D0("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    s9.f12804o = s(strTrim12);
                                    break;
                                case 83:
                                    s9.f12805p = s(strTrim12);
                                    break;
                            }
                        } else {
                            Z2.F fS18 = s(strTrim12);
                            s9.f12809t = fS18;
                            if (fS18.f()) {
                                throw new Z2.D0("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f12788b.a(s9);
                    return;
                case 19:
                    Z2.Z z16 = this.f12788b;
                    if (z16 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.T t9 = new Z2.T();
                    t9.f12869a = this.f12787a;
                    t9.f12870b = z16;
                    g(t9, attributes);
                    j(t9, attributes);
                    this.f12788b.a(t9);
                    this.f12788b = t9;
                    return;
                case 20:
                    Z2.Z z17 = this.f12788b;
                    if (z17 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    if (!(z17 instanceof Z2.A)) {
                        throw new Z2.D0("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    Z2.U u6 = new Z2.U();
                    u6.f12869a = this.f12787a;
                    u6.f12870b = z17;
                    g(u6, attributes);
                    j(u6, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        java.lang.String strTrim13 = attributes.getValue(i21).trim();
                        if (Y6.f.d(attributes, i21) == 39) {
                            if (strTrim13.length() == 0) {
                                throw new Z2.D0("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim13.length();
                            if (strTrim13.charAt(strTrim13.length() - 1) == '%') {
                                length--;
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            try {
                                float fO = o(length, strTrim13);
                                float f9 = 100.0f;
                                if (z6) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f9 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f9 = fO;
                                }
                                u6.f12810h = java.lang.Float.valueOf(f9);
                            } catch (java.lang.NumberFormatException e9) {
                                throw new Z2.D0("Invalid offset value in <stop>: ".concat(strTrim13), e9);
                            }
                        }
                    }
                    this.f12788b.a(u6);
                    this.f12788b = u6;
                    return;
                case 21:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    java.lang.String str4 = androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL;
                    boolean zEquals = true;
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        java.lang.String strTrim14 = attributes.getValue(i22).trim();
                        int iD10 = Y6.f.d(attributes, i22);
                        if (iD10 == 38) {
                            str4 = strTrim14;
                        } else if (iD10 == 77) {
                            zEquals = strTrim14.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        Z2.EnumC1184d enumC1184d = Z2.EnumC1184d.f12868i;
                        Z2.C1182c c1182c = new Z2.C1182c(str4);
                        c1182c.X();
                        for (Z2.EnumC1184d enumC1184d2 : Y2.C1038h.g(c1182c)) {
                            if (enumC1184d2 == Z2.EnumC1184d.f12867h || enumC1184d2 == enumC1184d) {
                                this.f12793h = true;
                                return;
                            }
                        }
                    }
                    this.f12789c = true;
                    this.f12790d = 1;
                    return;
                case 22:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1195i0 c1195i0 = new Z2.C1195i0();
                    c1195i0.f12869a = this.f12787a;
                    c1195i0.f12870b = this.f12788b;
                    g(c1195i0, attributes);
                    j(c1195i0, attributes);
                    l(c1195i0, attributes);
                    f(c1195i0, attributes);
                    this.f12788b.a(c1195i0);
                    this.f12788b = c1195i0;
                    return;
                case 23:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1197j0 c1197j0 = new Z2.C1197j0();
                    c1197j0.f12869a = this.f12787a;
                    c1197j0.f12870b = this.f12788b;
                    g(c1197j0, attributes);
                    j(c1197j0, attributes);
                    f(c1197j0, attributes);
                    m(c1197j0, attributes);
                    this.f12788b.a(c1197j0);
                    this.f12788b = c1197j0;
                    return;
                case 24:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.C1203m0 c1203m0 = new Z2.C1203m0();
                    c1203m0.f12869a = this.f12787a;
                    c1203m0.f12870b = this.f12788b;
                    g(c1203m0, attributes);
                    j(c1203m0, attributes);
                    l(c1203m0, attributes);
                    f(c1203m0, attributes);
                    k(c1203m0, attributes);
                    this.f12788b.a(c1203m0);
                    this.f12788b = c1203m0;
                    return;
                case 25:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.p0 p0Var = new Z2.p0();
                    p0Var.f12869a = this.f12787a;
                    p0Var.f12870b = this.f12788b;
                    g(p0Var, attributes);
                    j(p0Var, attributes);
                    f(p0Var, attributes);
                    for (int i23 = 0; i23 < attributes.getLength(); i23++) {
                        java.lang.String strTrim15 = attributes.getValue(i23).trim();
                        int iD11 = Y6.f.d(attributes, i23);
                        if (iD11 != 26) {
                            if (iD11 == 61) {
                                p0Var.f12911o = s(strTrim15);
                            }
                        } else if ("".equals(attributes.getURI(i23)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i23))) {
                            p0Var.f12910n = strTrim15;
                        }
                    }
                    this.f12788b.a(p0Var);
                    this.f12788b = p0Var;
                    Z2.Z z18 = p0Var.f12870b;
                    if (z18 instanceof Z2.C1203m0) {
                        p0Var.f12912p = (Z2.C1203m0) z18;
                        return;
                    } else {
                        p0Var.f12912p = ((Z2.n0) z18).e();
                        return;
                    }
                case 27:
                    Z2.Z z19 = this.f12788b;
                    if (z19 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    if (!(z19 instanceof Z2.o0)) {
                        throw new Z2.D0("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    Z2.C1199k0 c1199k0 = new Z2.C1199k0();
                    c1199k0.f12869a = this.f12787a;
                    c1199k0.f12870b = this.f12788b;
                    g(c1199k0, attributes);
                    j(c1199k0, attributes);
                    f(c1199k0, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        java.lang.String strTrim16 = attributes.getValue(i24).trim();
                        if (Y6.f.d(attributes, i24) == 26 && ("".equals(attributes.getURI(i24)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i24)))) {
                            c1199k0.f12893n = strTrim16;
                        }
                    }
                    this.f12788b.a(c1199k0);
                    Z2.Z z20 = c1199k0.f12870b;
                    if (z20 instanceof Z2.C1203m0) {
                        c1199k0.f12894o = (Z2.C1203m0) z20;
                        return;
                    } else {
                        c1199k0.f12894o = ((Z2.n0) z20).e();
                        return;
                    }
                case 28:
                    Z2.Z z21 = this.f12788b;
                    if (z21 == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    if (!(z21 instanceof Z2.o0)) {
                        throw new Z2.D0("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    Z2.C1201l0 c1201l0 = new Z2.C1201l0();
                    c1201l0.f12869a = this.f12787a;
                    c1201l0.f12870b = this.f12788b;
                    g(c1201l0, attributes);
                    j(c1201l0, attributes);
                    f(c1201l0, attributes);
                    k(c1201l0, attributes);
                    this.f12788b.a(c1201l0);
                    this.f12788b = c1201l0;
                    Z2.Z z22 = c1201l0.f12870b;
                    if (z22 instanceof Z2.C1203m0) {
                        c1201l0.f12898r = (Z2.C1203m0) z22;
                        return;
                    } else {
                        c1201l0.f12898r = ((Z2.n0) z22).e();
                        return;
                    }
                case 29:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.s0 s0Var = new Z2.s0();
                    s0Var.f12869a = this.f12787a;
                    s0Var.f12870b = this.f12788b;
                    g(s0Var, attributes);
                    j(s0Var, attributes);
                    l(s0Var, attributes);
                    f(s0Var, attributes);
                    for (int i25 = 0; i25 < attributes.getLength(); i25++) {
                        java.lang.String strTrim17 = attributes.getValue(i25).trim();
                        int iD12 = Y6.f.d(attributes, i25);
                        if (iD12 == 25) {
                            Z2.F fS19 = s(strTrim17);
                            s0Var.f12939s = fS19;
                            if (fS19.f()) {
                                throw new Z2.D0("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iD12 != 26) {
                            switch (iD12) {
                                case 81:
                                    Z2.F fS20 = s(strTrim17);
                                    s0Var.f12938r = fS20;
                                    if (fS20.f()) {
                                        throw new Z2.D0("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    s0Var.f12936p = s(strTrim17);
                                    break;
                                case 83:
                                    s0Var.f12937q = s(strTrim17);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i25)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i25))) {
                            s0Var.f12935o = strTrim17;
                        }
                    }
                    this.f12788b.a(s0Var);
                    this.f12788b = s0Var;
                    return;
                case 30:
                    if (this.f12788b == null) {
                        throw new Z2.D0("Invalid document. Root element must be <svg>");
                    }
                    Z2.t0 t0Var = new Z2.t0();
                    t0Var.f12869a = this.f12787a;
                    t0Var.f12870b = this.f12788b;
                    g(t0Var, attributes);
                    f(t0Var, attributes);
                    m(t0Var, attributes);
                    this.f12788b.a(t0Var);
                    this.f12788b = t0Var;
                    return;
                default:
                    this.f12789c = true;
                    this.f12790d = 1;
                    return;
            }
        }
    }

    public final void G(java.lang.String str) {
        if (this.f12789c) {
            return;
        }
        if (this.f12791e) {
            if (this.g == null) {
                this.g = new java.lang.StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.f12793h) {
            if (this.f12794i == null) {
                this.f12794i = new java.lang.StringBuilder(str.length());
            }
            this.f12794i.append(str);
        } else if (this.f12788b instanceof Z2.o0) {
            a(str);
        }
    }

    public final void H(char[] cArr, int i3, int i9) {
        if (this.f12789c) {
            return;
        }
        if (this.f12791e) {
            if (this.g == null) {
                this.g = new java.lang.StringBuilder(i9);
            }
            this.g.append(cArr, i3, i9);
        } else if (this.f12793h) {
            if (this.f12794i == null) {
                this.f12794i = new java.lang.StringBuilder(i9);
            }
            this.f12794i.append(cArr, i3, i9);
        } else if (this.f12788b instanceof Z2.o0) {
            a(new java.lang.String(cArr, i3, i9));
        }
    }

    public final void a(java.lang.String str) {
        Z2.Y y = (Z2.Y) this.f12788b;
        int size = y.f12851i.size();
        Z2.AbstractC1185d0 abstractC1185d0 = size == 0 ? null : (Z2.AbstractC1185d0) y.f12851i.get(size - 1);
        if (abstractC1185d0 instanceof Z2.r0) {
            Z2.r0 r0Var = (Z2.r0) abstractC1185d0;
            r0Var.f12930c = Y6.f.m(new java.lang.StringBuilder(), r0Var.f12930c, str);
        } else {
            Z2.Z z6 = this.f12788b;
            Z2.r0 r0Var2 = new Z2.r0();
            r0Var2.f12930c = str;
            z6.a(r0Var2);
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.f12789c) {
            int i3 = this.f12790d - 1;
            this.f12790d = i3;
            if (i3 == 0) {
                this.f12789c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            Z2.K0 k1 = (Z2.K0) Z2.K0.f12778l.get(str2);
            if (k1 == null) {
                k1 = Z2.K0.f12777k;
            }
            switch (k1.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f12788b = ((Z2.AbstractC1185d0) this.f12788b).f12870b;
                    break;
                case 5:
                case 26:
                    this.f12791e = false;
                    if (this.g != null) {
                        Z2.K0 k9 = this.f12792f;
                        if (k9 == Z2.K0.j || k9 == Z2.K0.f12775h) {
                            this.f12787a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case 21:
                    java.lang.StringBuilder sb = this.f12794i;
                    if (sb != null) {
                        this.f12793h = false;
                        java.lang.String string = sb.toString();
                        Y2.C1038h c1038h = new Y2.C1038h(1);
                        android.support.v4.media.session.q qVar = this.f12787a;
                        Z2.C1182c c1182c = new Z2.C1182c(string);
                        c1182c.X();
                        ((Z2.C1202m) qVar.j).c(c1038h.i(c1182c));
                        this.f12794i.setLength(0);
                    }
                    break;
            }
        }
    }
}

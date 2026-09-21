package p184w3;

import B3.AbstractC0088a;
import B3.C0089b;
import E6.G;
import E8.l;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.cast.MediaInfo;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020c0.C1704s0;

public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR;

    public u f29899A;

    public j f29900B;

    public n f29901C;

    public boolean f29902D;

    public MediaInfo f29904h;

    public long f29905i;
    public int j;

    public double f29906k;

    public int f29907l;

    public int f29908m;

    public long f29909n;

    public long f29910o;

    public double f29911p;

    public boolean f29912q;

    public long[] f29913r;

    public int f29914s;

    public int f29915t;

    public String f29916u;

    public JSONObject f29917v;

    public int f29918w;
    public boolean y;

    public C2968c f29920z;

    public final ArrayList f29919x = new ArrayList();

    public final SparseArray f29903E = new SparseArray();

    static {
        H3.q.f("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new D(9);
    }

    public q(MediaInfo mediaInfo, long j, int i3, double d4, int i9, int i10, long j9, long j10, double d6, boolean z6, long[] jArr, int i11, int i12, String str, int i13, ArrayList arrayList, boolean z9, C2968c c2968c, u uVar, j jVar, n nVar) {
        this.f29904h = mediaInfo;
        this.f29905i = j;
        this.j = i3;
        this.f29906k = d4;
        this.f29907l = i9;
        this.f29908m = i10;
        this.f29909n = j9;
        this.f29910o = j10;
        this.f29911p = d6;
        this.f29912q = z6;
        this.f29913r = jArr;
        this.f29914s = i11;
        this.f29915t = i12;
        this.f29916u = str;
        if (str != null) {
            try {
                this.f29917v = new JSONObject(this.f29916u);
            } catch (JSONException unused) {
                this.f29917v = null;
                this.f29916u = null;
            }
        } else {
            this.f29917v = null;
        }
        this.f29918w = i13;
        if (arrayList != null && !arrayList.isEmpty()) {
            b(arrayList);
        }
        this.y = z9;
        this.f29920z = c2968c;
        this.f29899A = uVar;
        this.f29900B = jVar;
        this.f29901C = nVar;
        boolean z10 = false;
        if (nVar != null && nVar.f29889q) {
            z10 = true;
        }
        this.f29902D = z10;
    }

    public final int a(JSONObject jSONObject, int i3) throws JSONException {
        JSONObject jSONObject2;
        int i9;
        int i10;
        int i11;
        long[] jArr;
        boolean z6;
        boolean z9;
        C2968c c2968c;
        int i12;
        u uVar;
        ?? r9;
        int i13;
        int i14;
        JSONObject jSONObjectOptJSONObject;
        j jVar;
        String strB;
        int i15;
        String str;
        m mVar;
        int iIntValue;
        ArrayList arrayList;
        int iOptInt;
        long jOptDouble;
        ArrayList arrayList2;
        String str2;
        String str3;
        boolean zOptBoolean;
        m mVar2;
        int i16;
        byte b9;
        ArrayList arrayList3;
        ArrayList arrayList4;
        MediaInfo mediaInfo;
        boolean zA;
        MediaInfo mediaInfo2;
        int i17;
        int i18;
        int i19;
        boolean z10 = true;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList5.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList5.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject2.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        long j = jSONObject2.getLong("mediaSessionId");
        if (j != this.f29905i) {
            this.f29905i = j;
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i18 = 1;
            } else if (string.equals("PLAYING")) {
                i18 = 2;
            } else if (string.equals("PAUSED")) {
                i18 = 3;
            } else if (string.equals("BUFFERING")) {
                i18 = 4;
            } else {
                i18 = string.equals("LOADING") ? 5 : 0;
            }
            if (i18 != this.f29907l) {
                this.f29907l = i18;
                i9 |= 2;
            }
            if (i18 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i19 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i19 = 3;
                } else if (string2.equals("FINISHED")) {
                    i19 = 1;
                } else {
                    i19 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i19 != this.f29908m) {
                    this.f29908m = i19;
                    i9 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d4 = jSONObject2.getDouble("playbackRate");
            if (this.f29906k != d4) {
                this.f29906k = d4;
                i9 |= 2;
            }
        }
        double d6 = 1000.0d;
        if (jSONObject2.has("currentTime")) {
            double d9 = jSONObject2.getDouble("currentTime");
            Pattern pattern = AbstractC0088a.f615a;
            long j9 = (long) (d9 * 1000.0d);
            if (j9 != this.f29909n) {
                this.f29909n = j9;
                i9 |= 2;
            }
            i9 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j10 = jSONObject2.getLong("supportedMediaCommands");
            if (j10 != this.f29910o) {
                this.f29910o = j10;
                i9 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i3 == 0) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
            double d10 = jSONObject3.getDouble("level");
            i10 = 4;
            i11 = 8;
            if (d10 != this.f29911p) {
                this.f29911p = d10;
                i9 |= 2;
            }
            boolean z11 = jSONObject3.getBoolean("muted");
            if (z11 != this.f29912q) {
                this.f29912q = z11;
                i9 |= 2;
            }
        } else {
            i10 = 4;
            i11 = 8;
        }
        JSONArray jSONArray = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = AbstractC0088a.f615a;
        if (jSONArray == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray.length()];
            for (int i20 = 0; i20 < jSONArray.length(); i20++) {
                jArr[i20] = jSONArray.getLong(i20);
            }
        }
        if (jArr == null) {
            if (this.f29913r != null) {
                this.f29913r = jArr;
                i9 |= 2;
                break;
            }
        } else {
            long[] jArr2 = this.f29913r;
            if (jArr2 == null) {
                this.f29913r = jArr;
                i9 |= 2;
                break;
            }
            if (jArr2.length != jArr.length) {
                this.f29913r = jArr;
                i9 |= 2;
                break;
            }
            for (int i21 = 0; i21 < jArr.length; i21++) {
                if (this.f29913r[i21] != jArr[i21]) {
                    this.f29913r = jArr;
                    i9 |= 2;
                    break;
                }
            }
        }
        if (jSONObject2.has("customData")) {
            this.f29917v = jSONObject2.getJSONObject("customData");
            this.f29916u = null;
            i9 |= 2;
        }
        if (jSONObject2.has(LinkHeader.Parameters.Media)) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject(LinkHeader.Parameters.Media);
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.f29904h;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f29904h = mediaInfo3;
                i9 |= 2;
            }
            if (jSONObject4.has(TtmlNode.TAG_METADATA)) {
                i9 |= i10;
            }
        }
        if (jSONObject2.has("currentItemId") && this.j != (i17 = jSONObject2.getInt("currentItemId"))) {
            this.j = i17;
            i9 |= 2;
        }
        int iOptInt2 = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f29915t != iOptInt2) {
            this.f29915t = iOptInt2;
            i9 |= 16;
        }
        int iOptInt3 = jSONObject2.optInt("loadingItemId", 0);
        if (this.f29914s != iOptInt3) {
            this.f29914s = iOptInt3;
            i9 |= 2;
        }
        MediaInfo mediaInfo5 = this.f29904h;
        int i22 = mediaInfo5 == null ? -1 : mediaInfo5.f18640i;
        int i23 = this.f29907l;
        int i24 = this.f29908m;
        int i25 = this.f29914s;
        if (i23 != 1) {
            z6 = false;
        } else if (i24 != 1) {
            if (i24 != 2) {
                if (i24 == 3) {
                    if (i25 != 0) {
                        z6 = false;
                    }
                }
            } else if (i22 == 2) {
                z6 = false;
            }
            z6 = true;
        } else if (i25 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        ArrayList arrayList6 = this.f29919x;
        SparseArray sparseArray = this.f29903E;
        if (z6) {
            z9 = true;
            d6 = 1000.0d;
            this.j = 0;
            this.f29914s = 0;
            this.f29915t = 0;
            if (!arrayList6.isEmpty()) {
                i9 |= 8;
                this.f29918w = 0;
                arrayList6.clear();
                sparseArray.clear();
            }
        } else {
            if (jSONObject2.has("repeatMode")) {
                Integer numE = l.E(jSONObject2.getString("repeatMode"));
                int iIntValue2 = numE == null ? this.f29918w : numE.intValue();
                if (this.f29918w != iIntValue2) {
                    this.f29918w = iIntValue2;
                    zA = true;
                } else {
                    zA = false;
                }
            } else {
                zA = false;
            }
            if (jSONObject2.has("items")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                int length = jSONArray2.length();
                SparseArray sparseArray2 = new SparseArray();
                for (int i26 = 0; i26 < length; i26++) {
                    sparseArray2.put(i26, Integer.valueOf(jSONArray2.getJSONObject(i26).getInt("itemId")));
                }
                ArrayList arrayList7 = new ArrayList();
                int i27 = 0;
                while (i27 < length) {
                    Integer num = (Integer) sparseArray2.get(i27);
                    boolean z12 = z10;
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i27);
                    Integer num2 = (Integer) sparseArray.get(num.intValue());
                    o oVar = num2 == null ? null : (o) arrayList6.get(num2.intValue());
                    if (oVar != null) {
                        zA |= oVar.a(jSONObject5);
                        arrayList7.add(oVar);
                        if (i27 != ((Integer) sparseArray.get(num.intValue())).intValue()) {
                        }
                        i27++;
                        z10 = z12;
                    } else if (num.intValue() != this.j || (mediaInfo2 = this.f29904h) == null) {
                        arrayList7.add(new o(jSONObject5));
                    } else {
                        o oVarU = new C1704s0(mediaInfo2).u();
                        oVarU.a(jSONObject5);
                        arrayList7.add(oVarU);
                    }
                    zA = z12;
                    i27++;
                    z10 = z12;
                }
                z9 = z10;
                zA |= !(arrayList6.size() != length ? false : z9);
                b(arrayList7);
            } else {
                z9 = true;
            }
            if (zA) {
                i9 |= 8;
            }
        }
        int i28 = i9;
        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<C2968c> creator = C2968c.CREATOR;
        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("currentBreakTime") && jSONObjectOptJSONObject3.has("currentBreakClipTime")) {
            try {
                long j11 = jSONObjectOptJSONObject3.getLong("currentBreakTime");
                Pattern pattern3 = AbstractC0088a.f615a;
                long j12 = j11 * 1000;
                long j13 = jSONObjectOptJSONObject3.getLong("currentBreakClipTime") * 1000;
                String strB2 = AbstractC0088a.b(jSONObjectOptJSONObject3, "breakId");
                String strB3 = AbstractC0088a.b(jSONObjectOptJSONObject3, "breakClipId");
                long jOptLong = jSONObjectOptJSONObject3.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                c2968c = new C2968c(j12, j13, jOptLong, strB2, strB3);
            } catch (JSONException e6) {
                C0089b c0089b = C2968c.f29834m;
                Log.e(c0089b.f617a, c0089b.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e6);
                c2968c = null;
            }
        } else {
            c2968c = null;
        }
        C2968c c2968c2 = this.f29920z;
        if ((c2968c2 == null && c2968c != null) || (c2968c2 != null && !c2968c2.equals(c2968c))) {
            this.y = (c2968c == null || (c2968c.j == null && c2968c.f29837k == null)) ? false : z9;
            this.f29920z = c2968c;
            i28 |= 32;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("videoInfo");
        C0089b c0089b2 = u.f29937k;
        if (jSONObjectOptJSONObject4 == null) {
            uVar = null;
            i12 = 3;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject4.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                r9 = z9;
                            } else {
                                r9 = -1;
                            }
                        } else if (string3.equals("sdr")) {
                            r9 = 3;
                        } else {
                            r9 = -1;
                        }
                    } else if (string3.equals("hdr")) {
                        r9 = 2;
                    } else {
                        r9 = -1;
                    }
                } else if (string3.equals("dv")) {
                    r9 = 0;
                } else {
                    r9 = -1;
                }
                if (r9 == 0) {
                    i12 = 3;
                    i13 = 3;
                } else if (r9 == z9) {
                    i12 = 3;
                    i13 = 2;
                } else if (r9 != 2) {
                    i12 = 3;
                    if (r9 != 3) {
                        try {
                            c0089b2.b("Unknown HDR type: %s", string3);
                            i13 = 0;
                        } catch (JSONException e9) {
                            e = e9;
                            c0089b2.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                            uVar = null;
                        }
                    } else {
                        i13 = 1;
                    }
                } else {
                    i12 = 3;
                    i13 = 4;
                }
                uVar = new u(jSONObjectOptJSONObject4.getInt("width"), jSONObjectOptJSONObject4.getInt("height"), i13);
            } catch (JSONException e10) {
                e = e10;
                i12 = 3;
            }
        }
        u uVar2 = this.f29899A;
        if ((uVar2 == null && uVar != null) || (uVar2 != null && !uVar2.equals(uVar))) {
            this.f29899A = uVar;
            i28 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo = this.f29904h) != null) {
            mediaInfo.b(jSONObject2.getJSONObject("breakInfo"));
            i28 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
            if (jSONObject6 == null) {
                i28 = i28;
                jOptDouble = -1;
                mVar2 = null;
                i16 = 0;
                iIntValue = 0;
                iOptInt = 0;
                zOptBoolean = false;
                str3 = null;
                arrayList2 = null;
                str2 = null;
                strB = null;
            } else {
                String strB4 = AbstractC0088a.b(jSONObject6, "id");
                strB = AbstractC0088a.b(jSONObject6, "entity");
                String strOptString = jSONObject6.optString("queueType");
                int i29 = 7;
                switch (strOptString.hashCode()) {
                    case -1803151310:
                        if (strOptString.equals("PODCAST_SERIES")) {
                            i15 = 4;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case -1758903120:
                        if (strOptString.equals("RADIO_STATION")) {
                            i15 = i12;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case -1632865838:
                        if (strOptString.equals("PLAYLIST")) {
                            i15 = 1;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case -1319760993:
                        if (strOptString.equals("AUDIOBOOK")) {
                            i15 = 2;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case -1088524588:
                        if (strOptString.equals("TV_SERIES")) {
                            i15 = 5;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case 62359119:
                        if (strOptString.equals("ALBUM")) {
                            i15 = 0;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case 73549584:
                        if (strOptString.equals("MOVIE")) {
                            i15 = i11;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case 393100598:
                        if (strOptString.equals("VIDEO_PLAYLIST")) {
                            i15 = 6;
                        } else {
                            i15 = -1;
                        }
                        break;
                    case 902303413:
                        if (strOptString.equals("LIVE_TV")) {
                            i15 = 7;
                        } else {
                            i15 = -1;
                        }
                        break;
                    default:
                        i15 = -1;
                        break;
                }
                switch (i15) {
                    case 0:
                        i29 = 1;
                        break;
                    case 1:
                        i29 = 2;
                        break;
                    case 2:
                        i29 = i12;
                        break;
                    case 3:
                        i29 = 4;
                        break;
                    case 4:
                        i29 = 5;
                        break;
                    case 5:
                        i29 = 6;
                        break;
                    case 6:
                        break;
                    case 7:
                        i29 = i11;
                        break;
                    case 8:
                        i29 = 9;
                        break;
                    default:
                        i29 = 0;
                        break;
                }
                String strB5 = AbstractC0088a.b(jSONObject6, "name");
                JSONObject jSONObjectOptJSONObject5 = jSONObject6.has("containerMetadata") ? jSONObject6.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString2 = jSONObjectOptJSONObject5.optString("containerType", "");
                    int iHashCode2 = strOptString2.hashCode();
                    if (iHashCode2 != 6924225) {
                        if (iHashCode2 == 828666841 && strOptString2.equals("GENERIC_CONTAINER")) {
                            b9 = 0;
                        } else {
                            b9 = -1;
                        }
                    } else if (strOptString2.equals("AUDIOBOOK_CONTAINER")) {
                        b9 = 1;
                    } else {
                        b9 = -1;
                    }
                    int i30 = (b9 == 0 || b9 != 1) ? 0 : 1;
                    String strB6 = AbstractC0088a.b(jSONObjectOptJSONObject5, LinkHeader.Parameters.Title);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList3 = new ArrayList();
                        int i31 = 0;
                        while (i31 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray.optJSONObject(i31);
                            int i32 = i31;
                            if (jSONObjectOptJSONObject6 != null) {
                                l lVar = new l(0);
                                lVar.c(jSONObjectOptJSONObject6);
                                arrayList3.add(lVar);
                            }
                            i31 = i32 + 1;
                            strB4 = strB4;
                        }
                    } else {
                        arrayList3 = null;
                    }
                    str = strB4;
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject5.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList4 = new ArrayList();
                        C3.a.c(arrayList4, jSONArrayOptJSONArray2);
                    } else {
                        arrayList4 = null;
                    }
                    double dOptDouble = jSONObjectOptJSONObject5.optDouble("containerDuration", 0.0d);
                    mVar = new m();
                    mVar.f29877h = i30;
                    mVar.f29878i = strB6;
                    mVar.j = arrayList3;
                    mVar.f29879k = arrayList4;
                    mVar.f29880l = dOptDouble;
                } else {
                    i28 = i28;
                    str = strB4;
                    mVar = null;
                }
                Integer numE2 = l.E(jSONObject6.optString("repeatMode"));
                iIntValue = numE2 != null ? numE2.intValue() : 0;
                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList = new ArrayList();
                    for (int i33 = 0; i33 < jSONArrayOptJSONArray3.length(); i33++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i33);
                        if (jSONObjectOptJSONObject7 != null) {
                            try {
                                arrayList.add(new o(jSONObjectOptJSONObject7));
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                iOptInt = jSONObject6.optInt("startIndex", 0);
                jOptDouble = jSONObject6.has("startTime") ? (long) (jSONObject6.optDouble("startTime", -1L) * d6) : -1L;
                arrayList2 = arrayList;
                str2 = strB5;
                str3 = str;
                zOptBoolean = jSONObject6.optBoolean("shuffle");
                mVar2 = mVar;
                i16 = i29;
            }
            n nVar = new n();
            nVar.f29881h = str3;
            nVar.f29882i = strB;
            nVar.j = i16;
            nVar.f29883k = str2;
            nVar.f29884l = mVar2;
            nVar.f29885m = iIntValue;
            nVar.f29886n = arrayList2;
            nVar.f29887o = iOptInt;
            nVar.f29888p = jOptDouble;
            nVar.f29889q = zOptBoolean;
            this.f29901C = nVar;
            if (this.f29902D != zOptBoolean) {
                this.f29902D = zOptBoolean;
                i14 = i28 | 8;
            }
            if (jSONObject2.has("liveSeekableRange")) {
                i14 |= 2;
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                Parcelable.Creator<j> creator2 = j.CREATOR;
                if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has(TtmlNode.START) && jSONObjectOptJSONObject.has(TtmlNode.END)) {
                    try {
                        double d11 = jSONObjectOptJSONObject.getDouble(TtmlNode.START);
                        Pattern pattern4 = AbstractC0088a.f615a;
                        jVar = new j((long) (d11 * d6), (long) (jSONObjectOptJSONObject.getDouble(TtmlNode.END) * d6), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                    } catch (JSONException unused3) {
                        C0089b c0089b3 = j.f29856l;
                        Log.e(c0089b3.f617a, c0089b3.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]));
                        jVar = null;
                    }
                } else {
                    jVar = null;
                }
                this.f29900B = jVar;
            } else {
                if (this.f29900B != null) {
                    i14 |= 2;
                }
                this.f29900B = null;
            }
            return i14;
        }
        i28 = i28;
        i14 = i28;
        if (jSONObject2.has("liveSeekableRange")) {
            i14 |= 2;
            jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
            Parcelable.Creator<j> creator3 = j.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                jVar = null;
            } else {
                double d12 = jSONObjectOptJSONObject.getDouble(TtmlNode.START);
                Pattern pattern5 = AbstractC0088a.f615a;
                jVar = new j((long) (d12 * d6), (long) (jSONObjectOptJSONObject.getDouble(TtmlNode.END) * d6), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.f29900B = jVar;
        } else {
            if (this.f29900B != null) {
                i14 |= 2;
            }
            this.f29900B = null;
        }
        return i14;
    }

    public final void b(ArrayList arrayList) {
        ArrayList arrayList2 = this.f29919x;
        arrayList2.clear();
        SparseArray sparseArray = this.f29903E;
        sparseArray.clear();
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                o oVar = (o) arrayList.get(i3);
                arrayList2.add(oVar);
                sparseArray.put(oVar.f29891i, Integer.valueOf(i3));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.f29917v == null) == (qVar.f29917v == null) && this.f29905i == qVar.f29905i && this.j == qVar.j && this.f29906k == qVar.f29906k && this.f29907l == qVar.f29907l && this.f29908m == qVar.f29908m && this.f29909n == qVar.f29909n && this.f29911p == qVar.f29911p && this.f29912q == qVar.f29912q && this.f29914s == qVar.f29914s && this.f29915t == qVar.f29915t && this.f29918w == qVar.f29918w && Arrays.equals(this.f29913r, qVar.f29913r) && AbstractC0088a.e(Long.valueOf(this.f29910o), Long.valueOf(qVar.f29910o)) && AbstractC0088a.e(this.f29919x, qVar.f29919x) && AbstractC0088a.e(this.f29904h, qVar.f29904h) && (((jSONObject = this.f29917v) == null || (jSONObject2 = qVar.f29917v) == null || M3.a.a(jSONObject, jSONObject2)) && this.y == qVar.y && AbstractC0088a.e(this.f29920z, qVar.f29920z) && AbstractC0088a.e(this.f29899A, qVar.f29899A) && AbstractC0088a.e(this.f29900B, qVar.f29900B) && H3.q.j(this.f29901C, qVar.f29901C) && this.f29902D == qVar.f29902D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29904h, Long.valueOf(this.f29905i), Integer.valueOf(this.j), Double.valueOf(this.f29906k), Integer.valueOf(this.f29907l), Integer.valueOf(this.f29908m), Long.valueOf(this.f29909n), Long.valueOf(this.f29910o), Double.valueOf(this.f29911p), Boolean.valueOf(this.f29912q), Integer.valueOf(Arrays.hashCode(this.f29913r)), Integer.valueOf(this.f29914s), Integer.valueOf(this.f29915t), String.valueOf(this.f29917v), Integer.valueOf(this.f29918w), this.f29919x, Boolean.valueOf(this.y), this.f29920z, this.f29899A, this.f29900B, this.f29901C});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f29917v;
        this.f29916u = jSONObject == null ? null : jSONObject.toString();
        int iF0 = G.f0(parcel, 20293);
        G.Y(parcel, 2, this.f29904h, i3);
        long j = this.f29905i;
        G.e0(parcel, 3, 8);
        parcel.writeLong(j);
        int i9 = this.j;
        G.e0(parcel, 4, 4);
        parcel.writeInt(i9);
        double d4 = this.f29906k;
        G.e0(parcel, 5, 8);
        parcel.writeDouble(d4);
        int i10 = this.f29907l;
        G.e0(parcel, 6, 4);
        parcel.writeInt(i10);
        int i11 = this.f29908m;
        G.e0(parcel, 7, 4);
        parcel.writeInt(i11);
        long j9 = this.f29909n;
        G.e0(parcel, 8, 8);
        parcel.writeLong(j9);
        long j10 = this.f29910o;
        G.e0(parcel, 9, 8);
        parcel.writeLong(j10);
        double d6 = this.f29911p;
        G.e0(parcel, 10, 8);
        parcel.writeDouble(d6);
        boolean z6 = this.f29912q;
        G.e0(parcel, 11, 4);
        parcel.writeInt(z6 ? 1 : 0);
        G.X(parcel, 12, this.f29913r);
        int i12 = this.f29914s;
        G.e0(parcel, 13, 4);
        parcel.writeInt(i12);
        int i13 = this.f29915t;
        G.e0(parcel, 14, 4);
        parcel.writeInt(i13);
        G.Z(parcel, 15, this.f29916u);
        int i14 = this.f29918w;
        G.e0(parcel, 16, 4);
        parcel.writeInt(i14);
        G.c0(parcel, this.f29919x, 17);
        boolean z9 = this.y;
        G.e0(parcel, 18, 4);
        parcel.writeInt(z9 ? 1 : 0);
        G.Y(parcel, 19, this.f29920z, i3);
        G.Y(parcel, 20, this.f29899A, i3);
        G.Y(parcel, 21, this.f29900B, i3);
        G.Y(parcel, 22, this.f29901C, i3);
        G.g0(parcel, iF0);
    }
}

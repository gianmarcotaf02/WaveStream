package B3;

import android.os.SystemClock;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.Renderer;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.C1817y2;
import com.google.android.gms.internal.cast.Q1;
import com.google.android.gms.internal.cast.m3;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p191x3.C3102c;

public final class p extends t {

    public static final String f641u;

    public long f642e;

    public p184w3.q f643f;
    public Long g;

    public p191x3.C f644h;

    public int f645i;
    public final s j;

    public final s f646k;

    public final s f647l;

    public final s f648m;

    public final s f649n;

    public final s f650o;

    public final s f651p;

    public final s f652q;

    public final s f653r;

    public final s f654s;

    public final s f655t;

    static {
        Pattern pattern = AbstractC0088a.f615a;
        f641u = "urn:x-cast:com.google.cast.media";
    }

    public p() {
        super(f641u);
        this.f645i = -1;
        s sVar = new s(86400000L, "load");
        this.j = sVar;
        s sVar2 = new s(86400000L, "pause");
        this.f646k = sVar2;
        s sVar3 = new s(86400000L, "play");
        this.f647l = sVar3;
        s sVar4 = new s(86400000L, "stop");
        s sVar5 = new s(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, "seek");
        this.f648m = sVar5;
        s sVar6 = new s(86400000L, "volume");
        this.f649n = sVar6;
        s sVar7 = new s(86400000L, "mute");
        this.f650o = sVar7;
        s sVar8 = new s(86400000L, "status");
        this.f651p = sVar8;
        s sVar9 = new s(86400000L, "activeTracks");
        s sVar10 = new s(86400000L, "trackStyle");
        s sVar11 = new s(86400000L, "queueInsert");
        s sVar12 = new s(86400000L, "queueUpdate");
        this.f652q = sVar12;
        s sVar13 = new s(86400000L, "queueRemove");
        s sVar14 = new s(86400000L, "queueReorder");
        s sVar15 = new s(86400000L, "queueFetchItemIds");
        this.f653r = sVar15;
        s sVar16 = new s(86400000L, "queueFetchItemRange");
        this.f655t = sVar16;
        this.f654s = new s(86400000L, "queueFetchItems");
        s sVar17 = new s(86400000L, "setPlaybackRate");
        s sVar18 = new s(86400000L, "skipAd");
        a(sVar);
        a(sVar2);
        a(sVar3);
        a(sVar4);
        a(sVar5);
        a(sVar6);
        a(sVar7);
        a(sVar8);
        a(sVar9);
        a(sVar10);
        a(sVar11);
        a(sVar12);
        a(sVar13);
        a(sVar14);
        a(sVar15);
        a(sVar16);
        a(sVar16);
        a(sVar17);
        a(sVar18);
        g();
    }

    public static o f(JSONObject jSONObject) {
        MediaError.a(jSONObject);
        o oVar = new o(0);
        Pattern pattern = AbstractC0088a.f615a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return oVar;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            iArr[i3] = jSONArray.getInt(i3);
        }
        return iArr;
    }

    public final void d(q qVar, int i3) {
        JSONObject jSONObject = new JSONObject();
        long jB = b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", o());
            if (i3 != 0) {
                jSONObject.put("jump", i3);
            }
            int i9 = this.f645i;
            if (i9 != -1) {
                jSONObject.put("sequenceNumber", i9);
            }
        } catch (JSONException unused) {
        }
        c(jB, jSONObject.toString());
        this.f652q.a(jB, new m(this, qVar, 1));
    }

    public final long e(long j, double d4, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f642e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j10 = j + ((long) (jElapsedRealtime * d4));
        if (j9 > 0 && j10 > j9) {
            return j9;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    public final void g() {
        this.f642e = 0L;
        this.f643f = null;
        Iterator it = this.f669d.iterator();
        while (it.hasNext()) {
            ((s) it.next()).f(PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
        }
    }

    public final void h(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f645i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            C0089b c0089b = this.f666a;
            Log.w(c0089b.f617a, c0089b.d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void i() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            gVar.getClass();
            Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void j() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void k() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            Iterator it = gVar.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 2:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final void l() {
        p191x3.C c9 = this.f644h;
        if (c9 != null) {
            p199y3.g gVar = (p199y3.g) c9.f31153h;
            gVar.getClass();
            Iterator it = gVar.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (!gVar.g() && gVar.g()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = gVar.f31868h.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            for (p191x3.B b9 : gVar.f31869i) {
                switch (b9.f31151a) {
                    case 0:
                        C3102c c3102c = (C3102c) b9.f31152b;
                        p199y3.g gVar2 = c3102c.j;
                        p184w3.q qVarD = gVar2 != null ? gVar2.d() : null;
                        C1817y2 c1817y2 = c3102c.f31191l;
                        if (c1817y2 != null && qVarD != null) {
                            m3 m3VarD = c1817y2.f19178h.D();
                            z zVar = new z(qVarD);
                            Q1 q9 = new Q1();
                            q9.f18809c = zVar.f677i;
                            q9.f18807a = System.currentTimeMillis();
                            Q1 q10 = m3VarD.f18995m;
                            if (q10 == null || q10.f18809c != 2) {
                                q9.f18808b = m3VarD.f18991h;
                                m3VarD.f18995m = q9;
                            }
                        }
                        break;
                    case 1:
                        p199y3.c cVar = (p199y3.c) b9.f31152b;
                        long jE = cVar.e();
                        if (jE != cVar.f31808b) {
                            cVar.f31808b = jE;
                            cVar.c();
                            if (cVar.f31808b != 0) {
                                cVar.d();
                            }
                        }
                        break;
                    default:
                        ((p206z3.i) b9.f31152b).c();
                        break;
                }
            }
        }
    }

    public final long n() {
        p184w3.j jVar;
        p184w3.q qVar = this.f643f;
        MediaInfo mediaInfo = qVar == null ? null : qVar.f29904h;
        long jE = 0;
        if (mediaInfo != null && qVar != null) {
            Long l2 = this.g;
            if (l2 != null) {
                if (l2.equals(4294967296000L)) {
                    p184w3.q qVar2 = this.f643f;
                    if (qVar2.f29900B != null) {
                        long jLongValue = l2.longValue();
                        p184w3.q qVar3 = this.f643f;
                        if (qVar3 != null && (jVar = qVar3.f29900B) != null) {
                            boolean z6 = jVar.f29859k;
                            long j = jVar.f29858i;
                            if (z6) {
                                jE = j;
                            } else {
                                jE = e(j, 1.0d, -1L);
                            }
                        }
                        return Math.min(jLongValue, jE);
                    }
                    MediaInfo mediaInfo2 = qVar2 == null ? null : qVar2.f29904h;
                    if ((mediaInfo2 != null ? mediaInfo2.f18642l : 0L) >= 0) {
                        long jLongValue2 = l2.longValue();
                        p184w3.q qVar4 = this.f643f;
                        MediaInfo mediaInfo3 = qVar4 != null ? qVar4.f29904h : null;
                        return Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.f18642l : 0L);
                    }
                }
                return l2.longValue();
            }
            if (this.f642e != 0) {
                double d4 = qVar.f29906k;
                long j9 = qVar.f29909n;
                return (d4 == 0.0d || qVar.f29907l != 2) ? j9 : e(j9, d4, mediaInfo.f18642l);
            }
        }
        return 0L;
    }

    public final long o() throws n {
        p184w3.q qVar = this.f643f;
        if (qVar != null) {
            return qVar.f29905i;
        }
        throw new n();
    }
}

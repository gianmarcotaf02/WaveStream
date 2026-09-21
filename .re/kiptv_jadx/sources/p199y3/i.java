package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p199y3.l {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f31872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p199y3.g f31873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f31874D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(p199y3.g gVar, java.lang.Object obj, int i3) {
        super(gVar, false);
        this.f31872B = i3;
        this.f31874D = obj;
        this.f31873C = gVar;
    }

    @Override // p199y3.l
    public final void r0() {
        int i3 = 0;
        java.lang.Object obj = this.f31874D;
        p199y3.g gVar = this.f31873C;
        switch (this.f31872B) {
            case 0:
                B3.p pVar = gVar.f31864c;
                B3.q qVarS0 = s0();
                int[] iArr = (int[]) obj;
                pVar.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                long jB = pVar.b();
                try {
                    jSONObject.put("requestId", jB);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", pVar.o());
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    int length = iArr.length;
                    while (i3 < length) {
                        jSONArray.put(iArr[i3]);
                        i3++;
                    }
                    jSONObject.put("itemIds", jSONArray);
                    break;
                } catch (org.json.JSONException unused) {
                }
                pVar.c(jB, jSONObject.toString());
                pVar.f654s.a(jB, qVarS0);
                return;
            case 1:
                B3.p pVar2 = gVar.f31864c;
                B3.q qVarS1 = s0();
                pVar2.getClass();
                p184w3.k kVar = (p184w3.k) obj;
                com.google.android.gms.cast.MediaInfo mediaInfo = kVar.f29861h;
                p184w3.n nVar = kVar.f29862i;
                if (mediaInfo == null && nVar == null) {
                    throw new java.lang.IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.google.android.gms.cast.MediaInfo mediaInfo2 = kVar.f29861h;
                    if (mediaInfo2 != null) {
                        jSONObject2.put(io.ktor.http.LinkHeader.Parameters.Media, mediaInfo2.a());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.a());
                    }
                    jSONObject2.putOpt("autoplay", kVar.j);
                    long j = kVar.f29863k;
                    if (j != -1) {
                        java.util.regex.Pattern pattern = B3.AbstractC0088a.f615a;
                        jSONObject2.put("currentTime", j / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f29864l);
                    jSONObject2.putOpt("credentials", kVar.f29868p);
                    jSONObject2.putOpt("credentialsType", kVar.f29869q);
                    jSONObject2.putOpt("atvCredentials", kVar.f29870r);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f29871s);
                    long[] jArr = kVar.f29865m;
                    if (jArr != null) {
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        while (i3 < jArr.length) {
                            jSONArray2.put(i3, jArr[i3]);
                            i3++;
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f29867o);
                    jSONObject2.put("requestId", kVar.f29872t);
                    break;
                } catch (org.json.JSONException e6) {
                    B3.C0089b c0089b = p184w3.k.f29860u;
                    android.util.Log.e(c0089b.f617a, c0089b.d("Error transforming MediaLoadRequestData into JSONObject", e6));
                    jSONObject2 = new org.json.JSONObject();
                }
                long jB2 = pVar2.b();
                try {
                    jSONObject2.put("requestId", jB2);
                    jSONObject2.put("type", "LOAD");
                    break;
                } catch (org.json.JSONException unused2) {
                }
                pVar2.c(jB2, jSONObject2.toString());
                pVar2.j.a(jB2, qVarS1);
                return;
            default:
                B3.p pVar3 = gVar.f31864c;
                B3.q qVarS2 = s0();
                pVar3.getClass();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                long jB3 = pVar3.b();
                long j9 = ((p184w3.p) obj).f29898a;
                try {
                    jSONObject3.put("requestId", jB3);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", pVar3.o());
                    java.util.regex.Pattern pattern2 = B3.AbstractC0088a.f615a;
                    jSONObject3.put("currentTime", j9 / 1000.0d);
                    break;
                } catch (org.json.JSONException unused3) {
                }
                pVar3.c(jB3, jSONObject3.toString());
                pVar3.g = java.lang.Long.valueOf(j9);
                pVar3.f648m.a(jB3, new B3.m(pVar3, qVarS2, i3));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p199y3.g gVar, int[] iArr) {
        super(gVar, true);
        this.f31872B = 0;
        this.f31874D = iArr;
        this.f31873C = gVar;
    }
}

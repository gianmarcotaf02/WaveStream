package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p199y3.l {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f31870B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p199y3.g f31871C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(p199y3.g gVar, int i3) {
        super(gVar, false);
        this.f31870B = i3;
        this.f31871C = gVar;
    }

    @Override // p199y3.l
    public final void r0() {
        switch (this.f31870B) {
            case 0:
                this.f31871C.f31864c.d(s0(), -1);
                break;
            case 1:
                this.f31871C.f31864c.d(s0(), 1);
                break;
            case 2:
                B3.p pVar = this.f31871C.f31864c;
                B3.q qVarS0 = s0();
                pVar.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                long jB = pVar.b();
                try {
                    jSONObject.put("requestId", jB);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", pVar.o());
                    break;
                } catch (org.json.JSONException unused) {
                }
                pVar.c(jB, jSONObject.toString());
                pVar.f653r.a(jB, qVarS0);
                break;
            case 3:
                B3.p pVar2 = this.f31871C.f31864c;
                B3.q qVarS1 = s0();
                pVar2.getClass();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                long jB2 = pVar2.b();
                try {
                    jSONObject2.put("requestId", jB2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", pVar2.o());
                    break;
                } catch (org.json.JSONException unused2) {
                }
                pVar2.c(jB2, jSONObject2.toString());
                pVar2.f646k.a(jB2, qVarS1);
                break;
            case 4:
                B3.p pVar3 = this.f31871C.f31864c;
                B3.q qVarS2 = s0();
                pVar3.getClass();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                long jB3 = pVar3.b();
                try {
                    jSONObject3.put("requestId", jB3);
                    jSONObject3.put("type", "PLAY");
                    jSONObject3.put("mediaSessionId", pVar3.o());
                    break;
                } catch (org.json.JSONException unused3) {
                }
                pVar3.c(jB3, jSONObject3.toString());
                pVar3.f647l.a(jB3, qVarS2);
                break;
            default:
                B3.p pVar4 = this.f31871C.f31864c;
                B3.q qVarS3 = s0();
                pVar4.getClass();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                long jB4 = pVar4.b();
                try {
                    jSONObject4.put("requestId", jB4);
                    jSONObject4.put("type", "GET_STATUS");
                    p184w3.q qVar = pVar4.f643f;
                    if (qVar != null) {
                        jSONObject4.put("mediaSessionId", qVar.f29905i);
                    }
                    break;
                } catch (org.json.JSONException unused4) {
                }
                pVar4.c(jB4, jSONObject4.toString());
                pVar4.f651p.a(jB4, qVarS3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p199y3.g gVar) {
        super(gVar, true);
        this.f31870B = 2;
        this.f31871C = gVar;
    }
}

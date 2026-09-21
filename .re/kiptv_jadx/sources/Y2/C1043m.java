package Y2;

/* JADX INFO: renamed from: Y2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11483b;

    public C1043m(org.json.JSONObject jSONObject) {
        this.f11482a = jSONObject.getInt("commitmentPaymentsCount");
        this.f11483b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}

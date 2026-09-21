package t5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27805h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f27806i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f27807k;

    public /* synthetic */ A0(java.lang.String str, p194x6.j jVar, p020c0.X x9) {
        this.j = str;
        this.f27806i = jVar;
        this.f27807k = x9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27805h) {
            case 0:
                java.lang.String id = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(id, "id");
                this.f27807k.setValue(java.lang.Boolean.FALSE);
                if (!id.equals(this.j)) {
                    this.f27806i.invoke(id);
                }
                break;
            default:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f27807k.setValue(bool);
                if (zBooleanValue) {
                    this.f27806i.invoke(this.j);
                }
                break;
        }
        return p070h6.A.f22523a;
    }

    public /* synthetic */ A0(p194x6.j jVar, java.lang.String str, p020c0.X x9) {
        this.f27806i = jVar;
        this.j = str;
        this.f27807k = x9;
    }
}

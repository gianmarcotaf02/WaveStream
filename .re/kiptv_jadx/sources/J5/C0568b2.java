package J5;

/* JADX INFO: renamed from: J5.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0568b2 implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f6352i;

    public /* synthetic */ C0568b2(int i3, p020c0.X x9) {
        this.f6351h = i3;
        this.f6352i = x9;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f6351h) {
            case 0:
                java.lang.String rowKey = (java.lang.String) obj;
                kotlin.jvm.functions.Function0 action = (kotlin.jvm.functions.Function0) obj2;
                kotlin.jvm.internal.m.e(rowKey, "rowKey");
                kotlin.jvm.internal.m.e(action, "action");
                this.f6352i.setValue(rowKey);
                action.invoke();
                break;
            default:
                com.kiptv.core.model.EPGProgram program = (com.kiptv.core.model.EPGProgram) obj;
                S4.p group = (S4.p) obj2;
                kotlin.jvm.internal.m.e(program, "program");
                kotlin.jvm.internal.m.e(group, "group");
                this.f6352i.setValue(new p193x5.C3115f(program, group));
                break;
        }
        return p070h6.A.f22523a;
    }
}

package D5;

/* JADX INFO: renamed from: D5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0262p implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f2371i;
    public final /* synthetic */ p020c0.X j;

    public /* synthetic */ C0262p(int i3, p020c0.X x9, p194x6.j jVar) {
        this.f2370h = i3;
        this.f2371i = jVar;
        this.j = x9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f2370h) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                this.j.setValue(bool);
                this.f2371i.invoke(bool);
                break;
            case 1:
                com.kiptv.core.model.XtreamLiveStream channel = (com.kiptv.core.model.XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(channel, "channel");
                this.j.setValue(null);
                this.f2371i.invoke(channel);
                break;
            case 2:
                S4.p group = (S4.p) obj;
                kotlin.jvm.internal.m.e(group, "group");
                if (group.c()) {
                    this.j.setValue(group);
                } else {
                    this.f2371i.invoke(group.e());
                }
                break;
            case 3:
                p175v0.C state = (p175v0.C) obj;
                kotlin.jvm.internal.m.e(state, "state");
                p175v0.D d4 = (p175v0.D) state;
                boolean zB = d4.b();
                p020c0.X x9 = this.j;
                if (zB != ((java.lang.Boolean) x9.getValue()).booleanValue()) {
                    x9.setValue(java.lang.Boolean.valueOf(d4.b()));
                    this.f2371i.invoke(java.lang.Boolean.valueOf(d4.b()));
                }
                break;
            case 4:
                java.lang.String name = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(name, "name");
                this.j.setValue(java.lang.Boolean.FALSE);
                this.f2371i.invoke(name);
                break;
            case 5:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.booleanValue();
                this.j.setValue(bool2);
                this.f2371i.invoke(bool2);
                break;
            default:
                com.kiptv.core.model.XtreamLiveStream channel2 = (com.kiptv.core.model.XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(channel2, "channel");
                this.j.setValue(null);
                this.f2371i.invoke(java.lang.Integer.valueOf(channel2.f20657d));
                break;
        }
        return p070h6.A.f22523a;
    }
}

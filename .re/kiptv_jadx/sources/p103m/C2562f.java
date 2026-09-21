package p103m;

/* JADX INFO: renamed from: m.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2562f extends p095l.v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25038l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p103m.C2570j f25039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562f(p103m.C2570j c2570j, android.content.Context context, p095l.l lVar, android.view.View view) {
        super(com.kiptv.tv.R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f25039m = c2570j;
        this.f24703f = 8388613;
        p008a8.c cVar = c2570j.f25052D;
        this.f24704h = cVar;
        p095l.t tVar = this.f24705i;
        if (tVar != null) {
            tVar.g(cVar);
        }
    }

    @Override // p095l.v
    public final void c() {
        switch (this.f25038l) {
            case 0:
                p103m.C2570j c2570j = this.f25039m;
                c2570j.f25049A = null;
                c2570j.getClass();
                super.c();
                break;
            default:
                p103m.C2570j c2570j2 = this.f25039m;
                p095l.l lVar = c2570j2.j;
                if (lVar != null) {
                    lVar.c(true);
                }
                c2570j2.f25069z = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562f(p103m.C2570j c2570j, android.content.Context context, p095l.D d4, android.view.View view) {
        super(com.kiptv.tv.R.attr.actionOverflowMenuStyle, context, view, d4, false);
        this.f25039m = c2570j;
        if ((d4.f24577A.f24684x & 32) != 32) {
            android.view.View view2 = c2570j.f25060p;
            this.f24702e = view2 == null ? (android.view.View) c2570j.f25059o : view2;
        }
        p008a8.c cVar = c2570j.f25052D;
        this.f24704h = cVar;
        p095l.t tVar = this.f24705i;
        if (tVar != null) {
            tVar.g(cVar);
        }
    }
}

package E5;

/* JADX INFO: renamed from: E5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0312s implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t5.C2785b f3143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f3144i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f3145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3146l;

    public C0312s(t5.C2785b c2785b, boolean z6, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, java.lang.String str) {
        this.f3143h = c2785b;
        this.f3144i = z6;
        this.j = function0;
        this.f3145k = jVar;
        this.f3146l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        if (!this.f3143h.f28131d || this.f3144i) {
            this.f3145k.invoke(this.f3146l);
        } else {
            this.j.invoke();
        }
        return p070h6.A.f22523a;
    }
}

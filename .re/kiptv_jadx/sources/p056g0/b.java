package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f21751i;

    public /* synthetic */ b(int i3, java.util.Collection collection) {
        this.f21750h = i3;
        this.f21751i = collection;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f21750h) {
            case 0:
                return java.lang.Boolean.valueOf(this.f21751i.contains(obj));
            case 1:
                return java.lang.Boolean.valueOf(this.f21751i.contains(obj));
            default:
                return java.lang.Boolean.valueOf(((java.util.List) obj).retainAll(this.f21751i));
        }
    }
}

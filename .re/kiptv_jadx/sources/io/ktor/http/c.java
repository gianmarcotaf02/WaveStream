package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f23382i;

    public /* synthetic */ c(int i3, java.util.List list) {
        this.f23381h = i3;
        this.f23382i = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23381h) {
            case 0:
                return io.ktor.http.Url.segments_delegate$lambda$1(this.f23382i);
            case 1:
                return ((E6.v) this.f23382i.get(0)).d();
            default:
                return ((E6.v) this.f23382i.get(0)).d();
        }
    }
}

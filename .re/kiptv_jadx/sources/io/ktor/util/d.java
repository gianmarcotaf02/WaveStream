package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.util.StringValuesBuilderImpl f23411i;

    public /* synthetic */ d(io.ktor.util.StringValuesBuilderImpl stringValuesBuilderImpl, int i3) {
        this.f23410h = i3;
        this.f23411i = stringValuesBuilderImpl;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.util.List list = (java.util.List) obj2;
        switch (this.f23410h) {
            case 0:
                return io.ktor.util.StringValuesBuilderImpl.appendMissing$lambda$1(this.f23411i, str, list);
            default:
                return io.ktor.util.StringValuesBuilderImpl.appendAll$lambda$0(this.f23411i, str, list);
        }
    }
}

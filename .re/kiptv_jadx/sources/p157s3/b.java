package p157s3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.Comparator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p157s3.b f27262i = new p157s3.b(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27263h;

    public /* synthetic */ b(int i3) {
        this.f27263h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f27263h) {
            case 0:
                break;
        }
        return ((com.google.android.gms.common.api.Scope) obj).f18684i.compareTo(((com.google.android.gms.common.api.Scope) obj2).f18684i);
    }
}

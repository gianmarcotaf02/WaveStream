package M2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7121a;

    public /* synthetic */ a(int i3) {
        this.f7121a = i3;
    }

    public final E2.C a(java.lang.Object obj, S2.o oVar) {
        switch (this.f7121a) {
            case 0:
                return E2.p.j(((android.net.Uri) obj).toString());
            case 1:
                return E2.p.a(((java.io.File) obj).getPath());
            case 2:
                return E2.p.a(((M8.A) obj).f7208h.r());
            case 3:
                android.content.Context context = oVar.f9284a;
                int iIntValue = ((java.lang.Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return E2.p.j("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                return null;
            default:
                return E2.p.j((java.lang.String) obj);
        }
    }
}

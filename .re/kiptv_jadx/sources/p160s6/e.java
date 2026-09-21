package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends p160s6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.io.File[] f27362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p160s6.h f27365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p160s6.h hVar, java.io.File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.m.e(rootDir, "rootDir");
        this.f27365f = hVar;
    }

    @Override // p160s6.i
    public final java.io.File a() {
        boolean z6 = this.f27364e;
        java.io.File file = this.f27372a;
        p160s6.h hVar = this.f27365f;
        if (!z6 && this.f27362c == null) {
            hVar.f27371k.getClass();
            java.io.File[] fileArrListFiles = file.listFiles();
            this.f27362c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f27371k.getClass();
                this.f27364e = true;
            }
        }
        java.io.File[] fileArr = this.f27362c;
        if (fileArr != null && this.f27363d < fileArr.length) {
            kotlin.jvm.internal.m.b(fileArr);
            int i3 = this.f27363d;
            this.f27363d = i3 + 1;
            return fileArr[i3];
        }
        if (this.f27361b) {
            hVar.f27371k.getClass();
            return null;
        }
        this.f27361b = true;
        return file;
    }
}

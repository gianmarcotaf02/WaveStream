package M;

/* JADX INFO: loaded from: classes.dex */
public final class h extends M.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.textclassifier.TextClassification f7118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7119c;

    public h(java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i3) {
        super(obj);
        this.f7118b = textClassification;
        this.f7119c = i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f7106a);
        sb.append(", textClassification=");
        sb.append(this.f7118b);
        sb.append(", index=");
        return Y6.f.j(sb, this.f7119c, ')');
    }
}

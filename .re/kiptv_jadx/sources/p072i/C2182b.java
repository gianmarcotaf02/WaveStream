package p072i;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2182b implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p072i.f f22599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p072i.c f22600i;

    public C2182b(p072i.c cVar, p072i.f fVar) {
        this.f22600i = cVar;
        this.f22599h = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        p072i.c cVar = this.f22600i;
        android.content.DialogInterface.OnClickListener onClickListener = cVar.f22610l;
        p072i.f fVar = this.f22599h;
        onClickListener.onClick(fVar.f22622b, i3);
        if (cVar.f22612n) {
            return;
        }
        fVar.f22622b.dismiss();
    }
}

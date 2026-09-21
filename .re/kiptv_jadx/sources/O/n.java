package O;

/* JADX INFO: loaded from: classes.dex */
public final class n extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O.e f7550a;

    public n(O.e eVar) {
        this.f7550a = eVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        this.f7550a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.f7550a.a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f7550a.f7523a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        p181w0.b bVar = (p181w0.b) this.f7550a.f7525c.invoke();
        rect.set(java.lang.Math.round(bVar.f29746a), java.lang.Math.round(bVar.f29747b), java.lang.Math.round(bVar.f29748c), java.lang.Math.round(bVar.f29749d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f7550a.a(menu);
    }
}

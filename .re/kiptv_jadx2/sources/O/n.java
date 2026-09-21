package O;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public final class n extends ActionMode.Callback2 implements ActionMode.Callback {

    public final e f7550a;

    public n(e eVar) {
        this.f7550a = eVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f7550a.getClass();
        return false;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f7550a.a(menu);
        return menu.size() > 0;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f7550a.f7523a.close();
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        p181w0.b bVar = (p181w0.b) this.f7550a.f7525c.invoke();
        rect.set(Math.round(bVar.f29746a), Math.round(bVar.f29747b), Math.round(bVar.f29748c), Math.round(bVar.f29749d));
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f7550a.a(menu);
    }
}

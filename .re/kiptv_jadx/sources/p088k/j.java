package p088k;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static boolean a(android.view.Window.Callback callback, android.view.SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static android.view.ActionMode b(android.view.Window.Callback callback, android.view.ActionMode.Callback callback2, int i3) {
        return callback.onWindowStartingActionMode(callback2, i3);
    }
}

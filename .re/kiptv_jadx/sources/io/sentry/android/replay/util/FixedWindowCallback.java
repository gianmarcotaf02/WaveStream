package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
public class FixedWindowCallback implements android.view.Window.Callback {
    public final android.view.Window.Callback delegate;

    public FixedWindowCallback(android.view.Window.Callback callback) {
        this.delegate = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, android.view.Menu menu) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i3, menu);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i3) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, android.view.MenuItem menuItem) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i3, android.view.Menu menu) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i3, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i3, android.view.Menu menu) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i3, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z6) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z6);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i3, android.view.View view, android.view.Menu menu) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i3, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i3) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        android.view.Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        android.view.Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i3) {
        android.view.Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i3);
    }
}

package io.sentry.android.replay.util;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class FixedWindowCallback implements Window.Callback {
    public final Window.Callback delegate;

    public FixedWindowCallback(Window.Callback callback) {
        this.delegate = callback;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override
    public void onContentChanged() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i3, menu);
    }

    @Override
    public View onCreatePanelView(int i3) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i3);
    }

    @Override
    public void onDetachedFromWindow() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i3, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i3, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i3, menu);
    }

    @Override
    public void onPanelClosed(int i3, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i3, menu);
    }

    @Override
    public void onPointerCaptureChanged(boolean z6) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z6);
    }

    @Override
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i3, view, menu);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i3) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i3);
    }

    @Override
    public boolean onSearchRequested() {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z6) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z6);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.delegate;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        Window.Callback callback2 = this.delegate;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i3);
    }
}

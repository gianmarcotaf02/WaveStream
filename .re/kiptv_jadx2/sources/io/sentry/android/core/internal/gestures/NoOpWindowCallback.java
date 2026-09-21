package io.sentry.android.core.internal.gestures;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public final class NoOpWindowCallback implements Window.Callback {
    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
    }

    @Override
    public void onAttachedToWindow() {
    }

    @Override
    public void onContentChanged() {
    }

    @Override
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        return false;
    }

    @Override
    public View onCreatePanelView(int i3) {
        return null;
    }

    @Override
    public void onDetachedFromWindow() {
    }

    @Override
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return false;
    }

    @Override
    public boolean onMenuOpened(int i3, Menu menu) {
        return false;
    }

    @Override
    public void onPanelClosed(int i3, Menu menu) {
    }

    @Override
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        return false;
    }

    @Override
    public boolean onSearchRequested() {
        return false;
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    @Override
    public void onWindowFocusChanged(boolean z6) {
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        return null;
    }
}

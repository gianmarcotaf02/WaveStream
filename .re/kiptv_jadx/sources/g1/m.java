package g1;

/* JADX INFO: loaded from: classes.dex */
public class m implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.b f21831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S.y f21832b;

    public m(S.y yVar, A0.b bVar) {
        this.f21831a = bVar;
        this.f21832b = yVar;
    }

    public final void a(S.y yVar) {
        yVar.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.clearMetaKeyStates(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            if (yVar != null) {
                a(yVar);
                this.f21832b = null;
            }
            this.f21831a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i3, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitText(charSequence, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.deleteSurroundingText(i3, i9);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.deleteSurroundingTextInCodePoints(i3, i9);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getCursorCapsMode(i3);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getExtractedText(extractedTextRequest, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getSelectedText(i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getTextAfterCursor(i3, i9);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getTextBeforeCursor(i3, i9);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performContextMenuAction(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performEditorAction(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.requestCursorUpdates(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setComposingRegion(i3, i9);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setComposingText(charSequence, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setSelection(i3, i9);
        }
        return false;
    }
}

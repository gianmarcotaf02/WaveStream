package g1;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

public class m implements InputConnection {

    public final A0.b f21831a;

    public S.y f21832b;

    public m(S.y yVar, A0.b bVar) {
        this.f21831a = bVar;
        this.f21832b = yVar;
    }

    public final void a(S.y yVar) {
        yVar.closeConnection();
    }

    @Override
    public final boolean beginBatchEdit() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.beginBatchEdit();
        }
        return false;
    }

    @Override
    public final boolean clearMetaKeyStates(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.clearMetaKeyStates(i3);
        }
        return false;
    }

    @Override
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

    @Override
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override
    public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        return false;
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitText(charSequence, i3);
        }
        return false;
    }

    @Override
    public final boolean deleteSurroundingText(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.deleteSurroundingText(i3, i9);
        }
        return false;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.deleteSurroundingTextInCodePoints(i3, i9);
        }
        return false;
    }

    @Override
    public final boolean endBatchEdit() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.b();
        }
        return false;
    }

    @Override
    public final boolean finishComposingText() {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.finishComposingText();
        }
        return false;
    }

    @Override
    public final int getCursorCapsMode(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getCursorCapsMode(i3);
        }
        return 0;
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getExtractedText(extractedTextRequest, i3);
        }
        return null;
    }

    @Override
    public final Handler getHandler() {
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getSelectedText(i3);
        }
        return null;
    }

    @Override
    public final CharSequence getTextAfterCursor(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getTextAfterCursor(i3, i9);
        }
        return null;
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.getTextBeforeCursor(i3, i9);
        }
        return null;
    }

    @Override
    public final boolean performContextMenuAction(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performContextMenuAction(i3);
        }
        return false;
    }

    @Override
    public final boolean performEditorAction(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performEditorAction(i3);
        }
        return false;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.requestCursorUpdates(i3);
        }
        return false;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override
    public final boolean setComposingRegion(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setComposingRegion(i3, i9);
        }
        return false;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setComposingText(charSequence, i3);
        }
        return false;
    }

    @Override
    public final boolean setSelection(int i3, int i9) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.setSelection(i3, i9);
        }
        return false;
    }
}

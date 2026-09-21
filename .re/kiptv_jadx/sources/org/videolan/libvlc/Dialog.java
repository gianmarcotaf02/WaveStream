package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Dialog {
    public static final int TYPE_ERROR = 0;
    public static final int TYPE_LOGIN = 1;
    public static final int TYPE_PROGRESS = 3;
    public static final int TYPE_QUESTION = 2;
    private static org.videolan.libvlc.Dialog.Callbacks sCallbacks;
    private static android.os.Handler sHandler;
    private java.lang.Object mContext;
    protected java.lang.String mText;
    private final java.lang.String mTitle;
    protected final int mType;

    public interface Callbacks {
        void onCanceled(org.videolan.libvlc.Dialog dialog);

        void onDisplay(org.videolan.libvlc.Dialog.ErrorMessage errorMessage);

        void onDisplay(org.videolan.libvlc.Dialog.LoginDialog loginDialog);

        void onDisplay(org.videolan.libvlc.Dialog.ProgressDialog progressDialog);

        void onDisplay(org.videolan.libvlc.Dialog.QuestionDialog questionDialog);

        void onProgressUpdate(org.videolan.libvlc.Dialog.ProgressDialog progressDialog);
    }

    public static class ErrorMessage extends org.videolan.libvlc.Dialog {
        private ErrorMessage(java.lang.String str, java.lang.String str2) {
            super(0, str, str2);
        }
    }

    public static abstract class IdDialog extends org.videolan.libvlc.Dialog {
        protected long mId;

        public IdDialog(long j, int i3, java.lang.String str, java.lang.String str2) {
            super(i3, str, str2);
            this.mId = j;
        }

        private native void nativeDismiss(long j);

        @Override // org.videolan.libvlc.Dialog
        public void dismiss() {
            long j = this.mId;
            if (j != 0) {
                nativeDismiss(j);
                this.mId = 0L;
            }
        }
    }

    public static class LoginDialog extends org.videolan.libvlc.Dialog.IdDialog {
        private final boolean mAskStore;
        private final java.lang.String mDefaultUsername;

        private native void nativePostLogin(long j, java.lang.String str, java.lang.String str2, boolean z6);

        public boolean asksStore() {
            return this.mAskStore;
        }

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        public java.lang.String getDefaultUsername() {
            return this.mDefaultUsername;
        }

        public void postLogin(java.lang.String str, java.lang.String str2, boolean z6) {
            long j = this.mId;
            if (j != 0) {
                nativePostLogin(j, str, str2, z6);
                this.mId = 0L;
            }
        }

        private LoginDialog(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
            super(j, 1, str, str2);
            this.mDefaultUsername = str3;
            this.mAskStore = z6;
        }
    }

    public static class ProgressDialog extends org.videolan.libvlc.Dialog.IdDialog {
        private final java.lang.String mCancelText;
        private final boolean mIndeterminate;
        private float mPosition;

        /* JADX INFO: Access modifiers changed from: private */
        public void update(float f9, java.lang.String str) {
            this.mPosition = f9;
            this.mText = str;
        }

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        public java.lang.String getCancelText() {
            return this.mCancelText;
        }

        public float getPosition() {
            return this.mPosition;
        }

        public boolean isCancelable() {
            return this.mCancelText != null;
        }

        public boolean isIndeterminate() {
            return this.mIndeterminate;
        }

        private ProgressDialog(long j, java.lang.String str, java.lang.String str2, boolean z6, float f9, java.lang.String str3) {
            super(j, 3, str, str2);
            this.mIndeterminate = z6;
            this.mPosition = f9;
            this.mCancelText = str3;
        }
    }

    public static class QuestionDialog extends org.videolan.libvlc.Dialog.IdDialog {
        public static final int TYPE_ERROR = 2;
        public static final int TYPE_NORMAL = 0;
        public static final int TYPE_WARNING = 1;
        private final java.lang.String mAction1Text;
        private final java.lang.String mAction2Text;
        private final java.lang.String mCancelText;
        private final int mQuestionType;

        private native void nativePostAction(long j, int i3);

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        public java.lang.String getAction1Text() {
            return this.mAction1Text;
        }

        public java.lang.String getAction2Text() {
            return this.mAction2Text;
        }

        public java.lang.String getCancelText() {
            return this.mCancelText;
        }

        public int getQuestionType() {
            return this.mQuestionType;
        }

        public void postAction(int i3) {
            long j = this.mId;
            if (j != 0) {
                nativePostAction(j, i3);
                this.mId = 0L;
            }
        }

        private QuestionDialog(long j, java.lang.String str, java.lang.String str2, int i3, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(j, 2, str, str2);
            this.mQuestionType = i3;
            this.mCancelText = str3;
            this.mAction1Text = str4;
            this.mAction2Text = str5;
        }
    }

    public Dialog(int i3, java.lang.String str, java.lang.String str2) {
        this.mType = i3;
        this.mTitle = str;
        this.mText = str2;
    }

    private static void cancelFromNative(org.videolan.libvlc.Dialog dialog) {
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.5
            @Override // java.lang.Runnable
            public void run() {
                org.videolan.libvlc.Dialog dialog2 = org.videolan.libvlc.Dialog.this;
                if (dialog2 instanceof org.videolan.libvlc.Dialog.IdDialog) {
                    ((org.videolan.libvlc.Dialog.IdDialog) dialog2).dismiss();
                }
                if (org.videolan.libvlc.Dialog.sCallbacks == null || org.videolan.libvlc.Dialog.this == null) {
                    return;
                }
                org.videolan.libvlc.Dialog.sCallbacks.onCanceled(org.videolan.libvlc.Dialog.this);
            }
        });
    }

    private static void displayErrorFromNative(java.lang.String str, java.lang.String str2) {
        final org.videolan.libvlc.Dialog.ErrorMessage errorMessage = new org.videolan.libvlc.Dialog.ErrorMessage(str, str2);
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.1
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.Dialog.sCallbacks != null) {
                    org.videolan.libvlc.Dialog.sCallbacks.onDisplay(errorMessage);
                }
            }
        });
    }

    private static org.videolan.libvlc.Dialog displayLoginFromNative(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        final org.videolan.libvlc.Dialog.LoginDialog loginDialog = new org.videolan.libvlc.Dialog.LoginDialog(j, str, str2, str3, z6);
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.2
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.Dialog.sCallbacks != null) {
                    org.videolan.libvlc.Dialog.sCallbacks.onDisplay(loginDialog);
                }
            }
        });
        return loginDialog;
    }

    private static org.videolan.libvlc.Dialog displayProgressFromNative(long j, java.lang.String str, java.lang.String str2, boolean z6, float f9, java.lang.String str3) {
        final org.videolan.libvlc.Dialog.ProgressDialog progressDialog = new org.videolan.libvlc.Dialog.ProgressDialog(j, str, str2, z6, f9, str3);
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.4
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.Dialog.sCallbacks != null) {
                    org.videolan.libvlc.Dialog.sCallbacks.onDisplay(progressDialog);
                }
            }
        });
        return progressDialog;
    }

    private static org.videolan.libvlc.Dialog displayQuestionFromNative(long j, java.lang.String str, java.lang.String str2, int i3, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        final org.videolan.libvlc.Dialog.QuestionDialog questionDialog = new org.videolan.libvlc.Dialog.QuestionDialog(j, str, str2, i3, str3, str4, str5);
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.3
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.Dialog.sCallbacks != null) {
                    org.videolan.libvlc.Dialog.sCallbacks.onDisplay(questionDialog);
                }
            }
        });
        return questionDialog;
    }

    private static native void nativeSetCallbacks(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, boolean z6);

    public static void setCallbacks(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, org.videolan.libvlc.Dialog.Callbacks callbacks) {
        if (callbacks != null && sHandler == null) {
            sHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        sCallbacks = callbacks;
        nativeSetCallbacks(iLibVLC, callbacks != null);
    }

    private static void updateProgressFromNative(org.videolan.libvlc.Dialog dialog, final float f9, final java.lang.String str) {
        sHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.Dialog.6
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.Dialog.this.getType() != 3) {
                    throw new java.lang.IllegalArgumentException("dialog is not a progress dialog");
                }
                org.videolan.libvlc.Dialog.ProgressDialog progressDialog = (org.videolan.libvlc.Dialog.ProgressDialog) org.videolan.libvlc.Dialog.this;
                progressDialog.update(f9, str);
                if (org.videolan.libvlc.Dialog.sCallbacks != null) {
                    org.videolan.libvlc.Dialog.sCallbacks.onProgressUpdate(progressDialog);
                }
            }
        });
    }

    public void dismiss() {
    }

    public java.lang.Object getContext() {
        return this.mContext;
    }

    public java.lang.String getText() {
        return this.mText;
    }

    public java.lang.String getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public void setContext(java.lang.Object obj) {
        this.mContext = obj;
    }
}

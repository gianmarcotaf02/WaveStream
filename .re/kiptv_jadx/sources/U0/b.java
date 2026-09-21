package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static android.view.contentcapture.ContentCaptureSession a(android.view.View view) {
        return view.getContentCaptureSession();
    }

    public static java.lang.String b(android.content.Context context) {
        return context.getOpPackageName();
    }

    public static android.view.autofill.AutofillId c(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static android.view.ViewStructure d(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void e(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void f(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void g(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void h(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static android.graphics.Insets i(int i3, int i9, int i10, int i11) {
        return android.graphics.Insets.of(i3, i9, i10, i11);
    }

    public static void j(android.app.Notification.Builder builder, boolean z6) {
        builder.setAllowSystemGeneratedContextualActions(z6);
    }

    public static void k(android.app.Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void l(android.app.Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}

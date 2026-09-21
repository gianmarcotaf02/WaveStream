package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultAlertDialogHelper;", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", io.ktor.http.LinkHeader.Parameters.Title, "message", "positiveButtonText", "negativeButtonText", "neutralButtonText", "Lkotlin/Function0;", "Lh6/A;", "onPositiveButtonClicked", "onNegativeButtonClicked", "onNeutralButtonClicked", "showDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultAlertDialogHelper implements com.revenuecat.purchases.utils.AlertDialogHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$0(kotlin.jvm.functions.Function0 function0, android.content.DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$1(kotlin.jvm.functions.Function0 function0, android.content.DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$2(kotlin.jvm.functions.Function0 function0, android.content.DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    @Override // com.revenuecat.purchases.utils.AlertDialogHelper
    public void showDialog(android.app.Activity activity, java.lang.String title, java.lang.String message, java.lang.String positiveButtonText, java.lang.String negativeButtonText, java.lang.String neutralButtonText, kotlin.jvm.functions.Function0 onPositiveButtonClicked, kotlin.jvm.functions.Function0 onNegativeButtonClicked, final kotlin.jvm.functions.Function0 onNeutralButtonClicked) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(positiveButtonText, "positiveButtonText");
        kotlin.jvm.internal.m.e(negativeButtonText, "negativeButtonText");
        kotlin.jvm.internal.m.e(neutralButtonText, "neutralButtonText");
        kotlin.jvm.internal.m.e(onPositiveButtonClicked, "onPositiveButtonClicked");
        kotlin.jvm.internal.m.e(onNegativeButtonClicked, "onNegativeButtonClicked");
        kotlin.jvm.internal.m.e(onNeutralButtonClicked, "onNeutralButtonClicked");
        new android.app.AlertDialog.Builder(activity).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new com.revenuecat.purchases.utils.a(0, onPositiveButtonClicked)).setNegativeButton(negativeButtonText, new com.revenuecat.purchases.utils.a(1, onNegativeButtonClicked)).setNeutralButton(neutralButtonText, new com.revenuecat.purchases.utils.a(2, onNeutralButtonClicked)).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.revenuecat.purchases.utils.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                onNeutralButtonClicked.invoke();
            }
        }).show();
    }
}

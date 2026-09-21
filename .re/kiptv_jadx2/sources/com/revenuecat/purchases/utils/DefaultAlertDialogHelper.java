package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultAlertDialogHelper;", "Lcom/revenuecat/purchases/utils/AlertDialogHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", LinkHeader.Parameters.Title, "message", "positiveButtonText", "negativeButtonText", "neutralButtonText", "Lkotlin/Function0;", "Lh6/A;", "onPositiveButtonClicked", "onNegativeButtonClicked", "onNeutralButtonClicked", "showDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultAlertDialogHelper implements AlertDialogHelper {
    public static final void showDialog$lambda$0(Function0 function0, DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    public static final void showDialog$lambda$1(Function0 function0, DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    public static final void showDialog$lambda$2(Function0 function0, DialogInterface dialogInterface, int i3) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    @Override
    public void showDialog(Activity activity, String title, String message, String positiveButtonText, String negativeButtonText, String neutralButtonText, Function0 onPositiveButtonClicked, Function0 onNegativeButtonClicked, final Function0 onNeutralButtonClicked) {
        m.e(activity, "activity");
        m.e(title, "title");
        m.e(message, "message");
        m.e(positiveButtonText, "positiveButtonText");
        m.e(negativeButtonText, "negativeButtonText");
        m.e(neutralButtonText, "neutralButtonText");
        m.e(onPositiveButtonClicked, "onPositiveButtonClicked");
        m.e(onNegativeButtonClicked, "onNegativeButtonClicked");
        m.e(onNeutralButtonClicked, "onNeutralButtonClicked");
        new AlertDialog.Builder(activity).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new a(0, onPositiveButtonClicked)).setNegativeButton(negativeButtonText, new a(1, onNegativeButtonClicked)).setNeutralButton(neutralButtonText, new a(2, onNeutralButtonClicked)).setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                onNeutralButtonClicked.invoke();
            }
        }).show();
    }
}

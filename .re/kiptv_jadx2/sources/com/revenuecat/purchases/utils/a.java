package com.revenuecat.purchases.utils;

import android.content.DialogInterface;
import com.kiptv.tv.TvActivity;
import kotlin.jvm.functions.Function0;

public final class a implements DialogInterface.OnClickListener {

    public final int f21074h;

    public final Object f21075i;

    public a(int i3, Object obj) {
        this.f21074h = i3;
        this.f21075i = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        Object obj = this.f21075i;
        switch (this.f21074h) {
            case 0:
                DefaultAlertDialogHelper.showDialog$lambda$0((Function0) obj, dialogInterface, i3);
                break;
            case 1:
                DefaultAlertDialogHelper.showDialog$lambda$1((Function0) obj, dialogInterface, i3);
                break;
            case 2:
                DefaultAlertDialogHelper.showDialog$lambda$2((Function0) obj, dialogInterface, i3);
                break;
            default:
                int i9 = TvActivity.f21002Z;
                ((TvActivity) obj).moveTaskToBack(true);
                break;
        }
    }
}

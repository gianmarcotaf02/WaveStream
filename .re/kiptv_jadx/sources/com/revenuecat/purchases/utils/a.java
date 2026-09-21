package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21075i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f21074h = i3;
        this.f21075i = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
        java.lang.Object obj = this.f21075i;
        switch (this.f21074h) {
            case 0:
                com.revenuecat.purchases.utils.DefaultAlertDialogHelper.showDialog$lambda$0((kotlin.jvm.functions.Function0) obj, dialogInterface, i3);
                break;
            case 1:
                com.revenuecat.purchases.utils.DefaultAlertDialogHelper.showDialog$lambda$1((kotlin.jvm.functions.Function0) obj, dialogInterface, i3);
                break;
            case 2:
                com.revenuecat.purchases.utils.DefaultAlertDialogHelper.showDialog$lambda$2((kotlin.jvm.functions.Function0) obj, dialogInterface, i3);
                break;
            default:
                int i9 = com.kiptv.tv.TvActivity.f21002Z;
                ((com.kiptv.tv.TvActivity) obj).moveTaskToBack(true);
                break;
        }
    }
}

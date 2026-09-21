package O;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O.f f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O.b f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.b f7525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.view.View f7526d;

    public e(O.f fVar, O.b bVar, O.b bVar2, android.view.View view) {
        this.f7523a = fVar;
        this.f7524b = bVar;
        this.f7525c = bVar2;
        this.f7526d = view;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(android.view.Menu menu) {
        int i3;
        M.c cVar = (M.c) this.f7524b.invoke();
        int i9 = 0;
        if (kotlin.jvm.internal.m.a(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r9 = cVar.f7108a;
        int size = r9.size();
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        while (i10 < size) {
            M.b bVar = (M.b) r9.get(i10);
            if (bVar instanceof M.d) {
                i3 = i11 + 1;
                android.view.MenuItem menuItemAdd = menu.add(i12, i11, i11, ((M.d) bVar).f7109b);
                menuItemAdd.setShowAsAction(2);
                final M.d dVar = (M.d) bVar;
                final int i13 = 0;
                menuItemAdd.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: O.d
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                        switch (i13) {
                            case 0:
                                ((M.d) dVar).f7111d.invoke(((O.e) this).f7523a);
                                break;
                            default:
                                android.view.textclassifier.TextClassification textClassification = (android.view.textclassifier.TextClassification) this;
                                java.lang.String text = textClassification.getText();
                                android.app.PendingIntent activity = android.app.PendingIntent.getActivity((android.content.Context) dVar, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (android.os.Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (android.app.PendingIntent.CanceledException e6) {
                                        android.util.Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (bVar instanceof M.h) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        i3 = i11 + 1;
                        final android.content.Context context = this.f7526d.getContext();
                        M.h hVar = (M.h) bVar;
                        final android.view.textclassifier.TextClassification textClassification = hVar.f7118b;
                        int i14 = hVar.f7119c;
                        if (i14 < 0) {
                            android.view.MenuItem menuItemAdd2 = menu.add(android.R.id.textAssist, android.R.id.textAssist, i11, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i15 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: O.d
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                    switch (i15) {
                                        case 0:
                                            ((M.d) context).f7111d.invoke(((O.e) textClassification).f7523a);
                                            break;
                                        default:
                                            android.view.textclassifier.TextClassification textClassification2 = (android.view.textclassifier.TextClassification) textClassification;
                                            java.lang.String text = textClassification2.getText();
                                            android.app.PendingIntent activity = android.app.PendingIntent.getActivity((android.content.Context) context, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (android.os.Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (android.app.PendingIntent.CanceledException e6) {
                                                    android.util.Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                                                    return true;
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i16 = i14 == 0 ? 1 : i9;
                            final android.app.RemoteAction remoteActionF = B1.a.f(textClassification.getActions().get(i14));
                            android.view.MenuItem menuItemAdd3 = menu.add(android.R.id.textAssist, i16 != 0 ? 16908353 : i9, i11, remoteActionF.getTitle());
                            menuItemAdd3.setShowAsAction(i16 == 0 ? 0 : 2);
                            if (i16 != 0 || remoteActionF.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteActionF.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: O.r
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                    android.app.PendingIntent actionIntent = remoteActionF.getActionIntent();
                                    if (android.os.Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (android.app.PendingIntent.CanceledException e6) {
                                        android.util.Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e6);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (bVar instanceof M.f) {
                    i12++;
                }
                i10++;
                i9 = 0;
            }
            i11 = i3;
            i10++;
            i9 = 0;
        }
        return true;
    }
}

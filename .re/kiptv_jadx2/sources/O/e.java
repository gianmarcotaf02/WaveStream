package O;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;

public final class e {

    public final f f7523a;

    public final b f7524b;

    public final b f7525c;

    public final View f7526d;

    public e(f fVar, b bVar, b bVar2, View view) {
        this.f7523a = fVar;
        this.f7524b = bVar;
        this.f7525c = bVar2;
        this.f7526d = view;
    }

    public final boolean a(Menu menu) {
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
                MenuItem menuItemAdd = menu.add(i12, i11, i11, ((M.d) bVar).f7109b);
                menuItemAdd.setShowAsAction(2);
                final M.d dVar = (M.d) bVar;
                final int i13 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i13) {
                            case 0:
                                ((M.d) dVar).f7111d.invoke(((e) this).f7523a);
                                break;
                            default:
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity((Context) dVar, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e6) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
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
                    if (Build.VERSION.SDK_INT >= 28) {
                        i3 = i11 + 1;
                        final Context context = this.f7526d.getContext();
                        M.h hVar = (M.h) bVar;
                        final TextClassification textClassification = hVar.f7118b;
                        int i14 = hVar.f7119c;
                        if (i14 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i11, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i15 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                                @Override
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i15) {
                                        case 0:
                                            ((M.d) context).f7111d.invoke(((e) textClassification).f7523a);
                                            break;
                                        default:
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity((Context) context, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e6) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
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
                            final RemoteAction remoteActionF = B1.a.f(textClassification.getActions().get(i14));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i16 != 0 ? 16908353 : i9, i11, remoteActionF.getTitle());
                            menuItemAdd3.setShowAsAction(i16 == 0 ? 0 : 2);
                            if (i16 != 0 || remoteActionF.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteActionF.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                                @Override
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteActionF.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e6) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e6);
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

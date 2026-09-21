package p103m;

/* JADX INFO: renamed from: m.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2601z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f25151d = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25152a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.view.View f25153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f25154c;

    public /* synthetic */ C2601z() {
    }

    public android.text.method.KeyListener a(android.text.method.KeyListener keyListener) {
        if (keyListener instanceof android.text.method.NumberKeyListener) {
            return keyListener;
        }
        ((S2.a) ((A.a) this.f25154c).f9i).getClass();
        if (keyListener instanceof V1.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof android.text.method.NumberKeyListener ? keyListener : new V1.f(keyListener);
    }

    public void b(android.util.AttributeSet attributeSet, int i3) {
        switch (this.f25152a) {
            case 0:
                android.widget.AbsSeekBar absSeekBar = (android.widget.AbsSeekBar) this.f25153b;
                j1.l lVarS = j1.l.s(absSeekBar.getContext(), attributeSet, f25151d, i3);
                android.graphics.drawable.Drawable drawableM = lVarS.m(0);
                if (drawableM != null) {
                    if (drawableM instanceof android.graphics.drawable.AnimationDrawable) {
                        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawableM;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i9 = 0; i9 < numberOfFrames; i9++) {
                            android.graphics.drawable.Drawable drawableE = e(animationDrawable.getFrame(i9), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i9));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM);
                }
                android.graphics.drawable.Drawable drawableM2 = lVarS.m(1);
                if (drawableM2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableM2, false));
                }
                lVarS.u();
                return;
            default:
                android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.widget.EditText) this.f25153b).getContext().obtainStyledAttributes(attributeSet, h.a.f22412i, i3, 0);
                try {
                    boolean z6 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z6 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (java.lang.Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public V1.c c(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        A.a aVar = (A.a) this.f25154c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            S2.a aVar2 = (S2.a) aVar.f9i;
            aVar2.getClass();
            if (!(inputConnection instanceof V1.c)) {
                inputConnection = new V1.c((android.widget.EditText) aVar2.f9211i, inputConnection, editorInfo);
            }
        }
        return (V1.c) inputConnection;
    }

    public void d(boolean z6) {
        V1.j jVar = (V1.j) ((S2.a) ((A.a) this.f25154c).f9i).j;
        if (jVar.j != z6) {
            if (jVar.f10246i != null) {
                T1.j jVarA = T1.j.a();
                V1.i iVar = jVar.f10246i;
                jVarA.getClass();
                E8.d.K(iVar, "initCallback cannot be null");
                java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f9686a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f9687b.remove(iVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (java.lang.Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            jVar.j = z6;
            if (z6) {
                V1.j.a(jVar.f10245h, T1.j.a().c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable, boolean z6) {
        if (drawable instanceof p189x1.a) {
            ((p189x1.b) ((p189x1.a) drawable)).getClass();
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = e(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    layerDrawable2.setId(i9, layerDrawable.getId(i9));
                    layerDrawable2.setLayerGravity(i9, layerDrawable.getLayerGravity(i9));
                    layerDrawable2.setLayerWidth(i9, layerDrawable.getLayerWidth(i9));
                    layerDrawable2.setLayerHeight(i9, layerDrawable.getLayerHeight(i9));
                    layerDrawable2.setLayerInsetLeft(i9, layerDrawable.getLayerInsetLeft(i9));
                    layerDrawable2.setLayerInsetRight(i9, layerDrawable.getLayerInsetRight(i9));
                    layerDrawable2.setLayerInsetTop(i9, layerDrawable.getLayerInsetTop(i9));
                    layerDrawable2.setLayerInsetBottom(i9, layerDrawable.getLayerInsetBottom(i9));
                    layerDrawable2.setLayerInsetStart(i9, layerDrawable.getLayerInsetStart(i9));
                    layerDrawable2.setLayerInsetEnd(i9, layerDrawable.getLayerInsetEnd(i9));
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((android.graphics.Bitmap) this.f25154c) == null) {
                    this.f25154c = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C2601z(android.widget.AbsSeekBar absSeekBar) {
        this.f25153b = absSeekBar;
    }

    public C2601z(android.widget.EditText editText) {
        this.f25153b = editText;
        this.f25154c = new A.a(editText);
    }
}

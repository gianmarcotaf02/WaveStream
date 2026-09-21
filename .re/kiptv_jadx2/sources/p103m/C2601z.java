package p103m;

import E8.d;
import S2.a;
import V1.c;
import V1.f;
import V1.i;
import V1.j;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import j1.l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p189x1.b;

public class C2601z {

    public static final int[] f25151d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    public final int f25152a = 2;

    public View f25153b;

    public Object f25154c;

    public C2601z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((a) ((A.a) this.f25154c).f9i).getClass();
        if (keyListener instanceof f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new f(keyListener);
    }

    public void b(AttributeSet attributeSet, int i3) {
        switch (this.f25152a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f25153b;
                l lVarS = l.s(absSeekBar.getContext(), attributeSet, f25151d, i3);
                Drawable drawableM = lVarS.m(0);
                if (drawableM != null) {
                    if (drawableM instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i9 = 0; i9 < numberOfFrames; i9++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i9), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i9));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM);
                }
                Drawable drawableM2 = lVarS.m(1);
                if (drawableM2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableM2, false));
                }
                lVarS.u();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f25153b).getContext().obtainStyledAttributes(attributeSet, h.a.f22412i, i3, 0);
                try {
                    boolean z6 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z6 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public c c(InputConnection inputConnection, EditorInfo editorInfo) {
        A.a aVar = (A.a) this.f25154c;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            a aVar2 = (a) aVar.f9i;
            aVar2.getClass();
            if (!(inputConnection instanceof c)) {
                inputConnection = new c((EditText) aVar2.f9211i, inputConnection, editorInfo);
            }
        }
        return (c) inputConnection;
    }

    public void d(boolean z6) {
        j jVar = (j) ((a) ((A.a) this.f25154c).f9i).j;
        if (jVar.j != z6) {
            if (jVar.f10246i != null) {
                T1.j jVarA = T1.j.a();
                i iVar = jVar.f10246i;
                jVarA.getClass();
                d.K(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f9686a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f9687b.remove(iVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            jVar.j = z6;
            if (z6) {
                j.a(jVar.f10245h, T1.j.a().c());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z6) {
        if (drawable instanceof p189x1.a) {
            ((b) ((p189x1.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = e(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
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
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f25154c) == null) {
                    this.f25154c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C2601z(AbsSeekBar absSeekBar) {
        this.f25153b = absSeekBar;
    }

    public C2601z(EditText editText) {
        this.f25153b = editText;
        this.f25154c = new A.a(editText);
    }
}

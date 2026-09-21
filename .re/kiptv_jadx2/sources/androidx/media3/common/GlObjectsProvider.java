package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i3, int i9, int i10);

    EGLContext createEglContext(EGLDisplay eGLDisplay, int i3, int[] iArr);

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i3, boolean z6);

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay);

    void release(EGLDisplay eGLDisplay);
}

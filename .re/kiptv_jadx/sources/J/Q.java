package J;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5707a;

    public /* synthetic */ Q(int i3) {
        this.f5707a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public final J.P a(android.view.KeyEvent keyEvent) {
        J.P p2;
        J.P p9 = null;
        switch (this.f5707a) {
            case 0:
                int i3 = J.S.f5708h;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (I0.a.a(I0.c.a(keyEvent.getKeyCode()), I0.a.f4557p)) {
                        return J.P.REDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    long jB = I0.c.b(keyEvent);
                    if (I0.a.a(jB, I0.a.f4552k) || I0.a.a(jB, I0.a.y)) {
                        return J.P.COPY;
                    }
                    if (I0.a.a(jB, I0.a.f4554m)) {
                        return J.P.PASTE;
                    }
                    if (I0.a.a(jB, I0.a.f4555n)) {
                        return J.P.CUT;
                    }
                    if (I0.a.a(jB, I0.a.j)) {
                        return J.P.SELECT_ALL;
                    }
                    if (I0.a.a(jB, I0.a.f4556o)) {
                        return J.P.REDO;
                    }
                    if (I0.a.a(jB, I0.a.f4557p)) {
                        return J.P.UNDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long jA = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA, I0.a.g)) {
                        return J.P.SELECT_LEFT_CHAR;
                    }
                    if (I0.a.a(jA, I0.a.f4550h)) {
                        return J.P.SELECT_RIGHT_CHAR;
                    }
                    if (I0.a.a(jA, I0.a.f4548e)) {
                        return J.P.SELECT_UP;
                    }
                    if (I0.a.a(jA, I0.a.f4549f)) {
                        return J.P.SELECT_DOWN;
                    }
                    if (I0.a.a(jA, I0.a.f4535E)) {
                        return J.P.SELECT_PAGE_UP;
                    }
                    if (I0.a.a(jA, I0.a.f4536F)) {
                        return J.P.SELECT_PAGE_DOWN;
                    }
                    if (I0.a.a(jA, I0.a.f4564w)) {
                        return J.P.SELECT_LINE_START;
                    }
                    if (I0.a.a(jA, I0.a.f4565x)) {
                        return J.P.SELECT_LINE_END;
                    }
                    if (I0.a.a(jA, I0.a.y)) {
                        return J.P.PASTE;
                    }
                    return null;
                }
                long jA2 = I0.c.a(keyEvent.getKeyCode());
                if (I0.a.a(jA2, I0.a.g)) {
                    return J.P.LEFT_CHAR;
                }
                if (I0.a.a(jA2, I0.a.f4550h)) {
                    return J.P.RIGHT_CHAR;
                }
                if (I0.a.a(jA2, I0.a.f4548e)) {
                    return J.P.UP;
                }
                if (I0.a.a(jA2, I0.a.f4549f)) {
                    return J.P.DOWN;
                }
                if (I0.a.a(jA2, I0.a.f4551i)) {
                    return J.P.CENTER;
                }
                if (I0.a.a(jA2, I0.a.f4535E)) {
                    return J.P.PAGE_UP;
                }
                if (I0.a.a(jA2, I0.a.f4536F)) {
                    return J.P.PAGE_DOWN;
                }
                if (I0.a.a(jA2, I0.a.f4564w)) {
                    return J.P.LINE_START;
                }
                if (I0.a.a(jA2, I0.a.f4565x)) {
                    return J.P.LINE_END;
                }
                if (I0.a.a(jA2, I0.a.f4560s) || I0.a.a(jA2, I0.a.f4537G)) {
                    return J.P.NEW_LINE;
                }
                if (I0.a.a(jA2, I0.a.f4561t)) {
                    return J.P.DELETE_PREV_CHAR;
                }
                if (I0.a.a(jA2, I0.a.f4562u)) {
                    return J.P.DELETE_NEXT_CHAR;
                }
                if (I0.a.a(jA2, I0.a.f4532B)) {
                    return J.P.PASTE;
                }
                if (I0.a.a(jA2, I0.a.f4566z)) {
                    return J.P.CUT;
                }
                if (I0.a.a(jA2, I0.a.f4531A)) {
                    return J.P.COPY;
                }
                if (I0.a.a(jA2, I0.a.f4558q)) {
                    return J.P.TAB;
                }
                return null;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jA3 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA3, I0.a.g)) {
                        p2 = J.P.SELECT_LINE_LEFT;
                    } else if (I0.a.a(jA3, I0.a.f4550h)) {
                        p2 = J.P.SELECT_LINE_RIGHT;
                    } else if (I0.a.a(jA3, I0.a.f4548e)) {
                        p2 = J.P.SELECT_HOME;
                    } else if (I0.a.a(jA3, I0.a.f4549f)) {
                        p2 = J.P.SELECT_END;
                    } else {
                        p2 = null;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jA4 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA4, I0.a.g)) {
                        p2 = J.P.LINE_LEFT;
                    } else if (I0.a.a(jA4, I0.a.f4550h)) {
                        p2 = J.P.LINE_RIGHT;
                    } else if (I0.a.a(jA4, I0.a.f4548e)) {
                        p2 = J.P.HOME;
                    } else if (I0.a.a(jA4, I0.a.f4549f)) {
                        p2 = J.P.END;
                    } else {
                        p2 = null;
                    }
                } else {
                    p2 = null;
                }
                if (p2 != null) {
                    return p2;
                }
                A.a aVar = J.T.f5709a;
                aVar.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jA5 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA5, I0.a.g)) {
                        p9 = J.P.SELECT_LEFT_WORD;
                    } else if (I0.a.a(jA5, I0.a.f4550h)) {
                        p9 = J.P.SELECT_RIGHT_WORD;
                    } else if (I0.a.a(jA5, I0.a.f4548e)) {
                        p9 = J.P.SELECT_PREV_PARAGRAPH;
                    } else if (I0.a.a(jA5, I0.a.f4549f)) {
                        p9 = J.P.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jA6 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA6, I0.a.g)) {
                        p9 = J.P.LEFT_WORD;
                    } else if (I0.a.a(jA6, I0.a.f4550h)) {
                        p9 = J.P.RIGHT_WORD;
                    } else if (I0.a.a(jA6, I0.a.f4548e)) {
                        p9 = J.P.PREV_PARAGRAPH;
                    } else if (I0.a.a(jA6, I0.a.f4549f)) {
                        p9 = J.P.NEXT_PARAGRAPH;
                    } else if (I0.a.a(jA6, I0.a.f4553l)) {
                        p9 = J.P.DELETE_PREV_CHAR;
                    } else if (I0.a.a(jA6, I0.a.f4562u)) {
                        p9 = J.P.DELETE_NEXT_WORD;
                    } else if (I0.a.a(jA6, I0.a.f4561t)) {
                        p9 = J.P.DELETE_PREV_WORD;
                    } else if (I0.a.a(jA6, I0.a.f4533C)) {
                        p9 = J.P.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long jA7 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA7, I0.a.f4564w)) {
                        p9 = J.P.SELECT_LINE_START;
                    } else if (I0.a.a(jA7, I0.a.f4565x)) {
                        p9 = J.P.SELECT_LINE_END;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jA8 = I0.c.a(keyEvent.getKeyCode());
                    if (I0.a.a(jA8, I0.a.f4561t)) {
                        p9 = J.P.DELETE_FROM_LINE_START;
                    } else if (I0.a.a(jA8, I0.a.f4562u)) {
                        p9 = J.P.DELETE_TO_LINE_END;
                    }
                }
                return p9 == null ? ((J.Q) aVar.f9i).a(keyEvent) : p9;
        }
    }
}

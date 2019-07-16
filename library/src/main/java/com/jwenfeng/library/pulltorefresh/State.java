package com.jwenfeng.library.pulltorefresh;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jiang on 16/8/17.
 */

public class State {

    @IntDef({REFRESH, LOADMORE})
    @Retention(RetentionPolicy.SOURCE)
    @interface REFRESH_STATE { }

    static final int REFRESH = 10;
    static final int LOADMORE = 11;
}

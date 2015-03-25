package org.geoserver.wms.mvt;

/**
 * Created by shennebe on 13.03.2015.
 */
final class Command {
    /**
     * MoveTo: 1. (2 parameters follow)
     */
    static final int MoveTo = 1;
    /**
     * LineTo: 2. (2 parameters follow)
     */
    static final int LineTo = 2;
    /**
     * ClosePath: 7. (no parameters follow)
     */
    static final int ClosePath = 7;
    private Command() {
    }
}
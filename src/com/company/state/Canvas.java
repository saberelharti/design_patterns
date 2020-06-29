package com.company.state;

public class Canvas {

    private Tools canvasTools;

    public Canvas(Tools canvasTools) {
        this.canvasTools = canvasTools;
    }

    public void mouseDown() {
        canvasTools.mouseDown();
    }

    public void mouseUp() {
        canvasTools.mouseUp();
    }

    public Tools getCanvasTools() {
        return this.canvasTools;
    }
}

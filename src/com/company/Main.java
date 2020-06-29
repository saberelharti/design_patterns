package com.company;

import com.company.iterator.BrowseHistory;
import com.company.memento.Editor;
import com.company.memento.History;
import com.company.state.Brush;
import com.company.state.Canvas;
import com.company.state.Selection;
import com.company.strategy.BlackAndWitheFilter;
import com.company.strategy.ImageStorage;
import com.company.strategy.JpgCompressor;
import com.company.template.GenerateReportTask;
import com.company.template.Task;
import com.company.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

        testTemplatePattern();
    }

    public static void testTemplatePattern() {

        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }

    public static void testStrategyPattern() {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.storeImage("a", new JpgCompressor(), new BlackAndWitheFilter());
    }

    public static void testIteratorPattern() {
        BrowseHistory history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        var iterator = history.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }

    public static void testStateDesignPattern() {
        Canvas canvas = new Canvas(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    public static void testMementoDesignPattern() {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.addState(editor.createState(editor.content));

        editor.setContent("b");
        history.addState(editor.createState(editor.content));

        editor.setContent("c");
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        System.out.println(editor.content);
    }
}

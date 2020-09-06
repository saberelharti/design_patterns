package com.company;

import com.company.command.AddCustomerCommand;
import com.company.command.CustomerService;
import com.company.command.fx.Button;
import com.company.iterator.BrowseHistory;
import com.company.memento.Editor;
import com.company.memento.History;
import com.company.observer.Chart;
import com.company.observer.DataSource;
import com.company.observer.SpreedSheet;
import com.company.state.Brush;
import com.company.state.Canvas;
import com.company.state.Selection;
import com.company.strategy.BlackAndWitheFilter;
import com.company.strategy.ImageStorage;
import com.company.strategy.JpgCompressor;
import com.company.template.GenerateReportTask;
import com.company.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

        testObserverPattern();
    }

    public static void testObserverPattern() {
        Chart chart = new Chart();
        SpreedSheet spreedSheet1 = new SpreedSheet();
        SpreedSheet spreedSheet2 = new SpreedSheet();

        DataSource dataSource = new DataSource();
        dataSource.addObserver(chart);
        dataSource.addObserver(spreedSheet1);
        dataSource.addObserver(spreedSheet1);
        dataSource.setValue(1);
    }

    public static void testCommandPattern() {
        CustomerService customerService = new CustomerService();
        AddCustomerCommand addCustomerCommand = new AddCustomerCommand(customerService);
        Button button = new Button(addCustomerCommand);
        button.click();
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

package com.nduonglong02.unit04.program;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AwtExample1 extends Frame {

    public AwtExample1() {
//        setLayout(new FlowLayout());
        setLayout(new BorderLayout());

        final TextField text = new TextField();
        add(text, BorderLayout.PAGE_START);

        List list = new List(4, true);
        IntStream.range(0, 10).forEach(i -> {
            list.add("Item " + i);
        });
        add(list, BorderLayout.CENTER);

        Button pushButton = new Button("press me");
        add(pushButton, BorderLayout.LINE_END);

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* Test 1 */
//                System.out.println(text.getText());
//                AwtExample1.this.setTitle(text.getText());

                /* Test 2 */
//                String[] values = list.getSelectedItems();
//                StringBuilder builder = new StringBuilder();
//                Arrays.stream(values).forEach(value -> {
//                    if (builder.length() > 0) builder.append("; ");
//                    builder.append(value);
//                });
//                text.setText(builder.toString());

                /* Test 3 */
                String[] values = list.getSelectedItems();
                Arrays.stream(values).collect(Collectors.joining(","));
                Supplier<StringBuilder> supplier = StringBuilder::new;
                BiConsumer<StringBuilder, String> consumer = (builder, value) -> {
                    if (builder.length() > 0) builder.append(", ");
                    builder.append(value);
                };
                BinaryOperator<StringBuilder> operator = StringBuilder::append;
                Function<StringBuilder, String> finisher = StringBuilder::toString;

                values = list.getSelectedItems();
                Collector<String, StringBuilder, String> collector = Collector.of(supplier, consumer, operator, finisher);
                text.setText(Arrays.stream(values).collect(collector));
            }
        });

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu menu = new Menu("File");
        menuBar.add(menu);

        MenuItem menuItem = new MenuItem("Exit", new MenuShortcut('X'));
        menu.add(menuItem);
        menuItem.addActionListener(e -> {
            System.exit(1);
        });

    }

    public static void main(String[] args) {
        AwtExample1 screen = new AwtExample1();
        screen.setSize(500, 800);
        screen.setVisible(true);

        screen.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}

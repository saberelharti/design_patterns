package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private String[] urls = new String[4];
    private int index;

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void push(String item) {
        urls[index] = item;
        index++;
    }

    public class ListIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.length && history.urls[index] != null);
        }

        @Override
        public void next() {
            ++index;
        }

        @Override
        public String current() {
            return history.urls[index];
        }
    }
}

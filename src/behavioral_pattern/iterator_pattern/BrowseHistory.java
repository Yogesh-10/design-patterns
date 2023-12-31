package behavioral_pattern.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size() - 1;
        String lastItem = urls.get(lastIndex);
        urls.remove(lastItem);

        return lastItem;
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return history.urls.size() > index;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

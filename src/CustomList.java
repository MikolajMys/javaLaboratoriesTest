import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CustomList <T> extends AbstractList<T> {
    private class Node{
        T value;
        Node next;
    }
    private Node first = null;
    private Node last = null;
    public void addLast(T value){
        Node node = new Node();
        node.next = null;
        node.value = value;
        if(first == null){
            first = node;
            last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }
    public T getLast(){
        if(last == null){
            throw new NoSuchElementException();
        }
        return last.value;
    }
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(first == null){
            first = node;
            last = node;
        }
        else{
            node.next = node;
            first = node;
        }
    }
    public T getFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.value;
    }
    public T removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        else if(first == last){
            T temp = first.value;
            first = null;
            last = null;
            return temp;
        }
        else{
            T temp = first.value;
            first = first.next;
            return temp;
        }
    public T removeLast() {
        if (last == null) {
            throw new NoSuchElementException();
        }
        else if(first == last){
            T temp = last.value;
            first = null;
            last = null;
            return temp;
        }
        else{
            T temp = last.value;
            Node currentNode = first;
            while (currentNode.next != last){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            last = currentNode;
            return temp;
        }
    }
        public boolean add(T t){
            addLast(t);
            return true;
        }
        @Override
        public T get(int index){
            if(index < size()){
                Node currentNode = first;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
                return currentNode.next;
            }
            else{
                throw new NoSuchElementException();
            }
        }

        @Override
        public int size(){
            int countNode = 1;
            if(first == null){
                return 0;
            }
            else {
                Node curretnNode = first;
                while (curretnNode.next != last) {
                    curretnNode = curretnNode.next;
                    countNode++;
                }
                return countNode;
            }
        }
}

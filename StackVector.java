import java.util.ArrayList;
/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 11/02/19
 * @name StackVector.java
 * <p> Esta clase implementa los metodos de Stack para un vector</p>
 * */
/**
 * @param <E>
 */
public class StackVector<E> implements Stack<E> {

    private ArrayList<E> data;

    /**
     *
     */
    public StackVector(){
        data = new ArrayList<E>();
    }
    public void push(E item){
        data.add(item);
    }

    public E pop(){
        return data.remove(size()-1);
    }

    public E peek(){
        return data.get(size()-1);
    }

    public boolean empty(){
        return size() == 0;
    }

    public int size(){
        return data.size();
    }
}
package structures;

public interface OrderedSequence<T> extends Comparable<T>
{
  public void insert(T el) throws Exception;
  public void remove(T el) throws Exception;
  public T min() throws Exception;
  public T max() throws Exception;
  public T at(int pos) throws Exception;
  public boolean search(T el);
  public int index(T el) throws Exception;
}

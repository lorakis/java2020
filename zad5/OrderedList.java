package structures;

import java.util.Iterator;

public class OrderedList<T extends Comparable<T>> implements OrderedSequence<T>,Iterable<T>
{

  private class Node <T extends Comparable<T>>
  {
    private Node<T> next;
    private final T data;
    public Node(T val)
    {
      next = null;
      data = val;
    }
    private void insert(Node n) throws Exception
    {
      if(start == null)
      {
        start = n;
      }
      else
      {
        Node t = start;
        Node prev;
        if(t.next == null)
        {
          if(t.data.compareTo(n.data) > 0 )
          {
            n.next = t;
            start = n;
            return;
          }
          else
          {
            t.next = n;
            return;
          }
        }

        if(t.data.compareTo(n.data) > 0)
        {
          n.next = t;
          start = n;
          return;
        }

        while(t.next != null)
        {
          if(t.next.data.compareTo(n.data) > 0)
          {
            n.next = t.next;
            t.next = n;
            return;
          }
          else
          {
            t = t.next;
          }
        }
        t.next = n;

      }
    }


    private void remove(T el) throws Exception
    {
      Node t = start;
      if( t.data.compareTo(el) == 0)
        start = start.next;
      else
      {
        Node p = new Node(0);
        p.next = start;
        while(t.next != null)
        {
            if(t.data.compareTo(el) == 0)
            {
              p.next = t.next;
              return;

            }
            p = t;
            t = t.next;
        }
        p.next = null;
        return;
      }
    }

    private Node at(int pos) throws Exception
    {
      Node t = start;
      for(int i = 0; i < pos; i++)
      {
        t = t.next;
        if(t == null)
          throw new Exception("lista jest mniejsza");
      }
      return t;
    }

    private boolean search(T el)
    {
      Node t = start;
      if (t.data.compareTo(el)==0)
      {
        return true;
      }
      while (t.next!=null)
      {
        if (t.data.compareTo(el)==0)
        {
          return true;
        }
        t = t.next;
      }
      return t.data.compareTo(el) == 0;
    }

    private int index(T el) throws Exception
    {
      int n = 0;
      Node t = start;
      if(t.data.compareTo(el) == 0)
      {
        return n;
      }
      n++;
      while( t.next != null)
      {
        if(t.data.compareTo(el) == 0)
        {
          return n;
        }
        n++;
        t = t.next;
      }
      if(t.data.compareTo(el) == 0)
      {
        return n;
      }
      throw new Exception("brak elementu");
    }
  }


  private Node<T> start;

  public OrderedList()
  {
      start = null;
  }


  @Override
  public Iterator<T> iterator()
  {
    return new CustomIter<>(this);
  }

  private class CustomIter<T> implements Iterator<T>
  {
    Node current;
    Node prev;

    public CustomIter(OrderedList ol)
    {
      current = (Node)ol.start;
      prev = null;
    }

    @Override
    public boolean hasNext()
    {
      return current != null;
    }


    @Override
    public T next()
    {
      Node tmp = current;
      prev = current;
      current = current.next;
      return (T)tmp.data;
    }

    @Override
    public void remove()
    {
      prev.next = current.next;
      current = current.next;
    }
  }


  @Override
  public void insert(T el) throws Exception
  {
    if (el == null)
      throw new NullPointerException();
    else
    {
      Node ins=new Node(el);
      if (start==null)
        start=ins;
      else
      {
        if (start.search(el))
          throw new Exception("taki element juz istnieje");
        start.insert(ins);
      }
    }
  }

  @Override
  public void remove(T el) throws Exception
  {
    if(start == null)
      throw new Exception("lista jest pusta");
    start.remove((T) el);
  }

  @Override
  public T min() throws Exception
  {
    if(start == null)
      throw new Exception("lista jest pusta");
    return start.data;
  }

  @Override
  public T max() throws Exception
  {
    if (start==null)
      throw new Exception("lista jest pusta");
    Node t=start;
    while (t.next!=null)
      t = t.next;
    return (T)t.data;
  }

  @Override
  public T at(int pos) throws Exception
  {
    return (T)start.at(pos).data;
  }

  @Override
  public boolean search(T el)
  {
    return start.search(el);
  }

  @Override
  public int index(T el) throws Exception
  {
    return start.index(el);
  }

  @Override
  public int compareTo(T o)
  {
    throw new UnsupportedOperationException();
  }
}

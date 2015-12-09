import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vkostyna on 08/12/2015.
 */
public class TestMyArrayList{
    MyArrayList arrayList = new MyArrayList();
    @Before
    public void setUp(){
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
    }
    @Test
    public void testIndexOf(){
        assertEquals(0,arrayList.indexOf("one"));
    }
    @Test
    public void testLastIndexOf(){
        assertEquals(1,arrayList.lastIndexOf("two"));
    }
    @Test
    public void testSet(){
        assertEquals("one",arrayList.set("four", 0));

    }
    @Test
    public void testRemove(){
        assertEquals("two",arrayList.remove(1));
    }
    @Test
    public void testIsEmpty(){
        arrayList.clear();
        assertEquals(true,arrayList.isEmpty());
    }
    @Test
    public void testClear(){
        int tempSize;
        arrayList.clear();
        tempSize = arrayList.size;
        assertEquals(0,tempSize);
    }
    @Test
    public void testGet(){
        assertEquals("three",arrayList.get(2));
    }
    @Test
    public void testAddToEnd(){
        arrayList.add("four");
        arrayList.add("five");
        int tempSize = arrayList.size;
        assertEquals(5,tempSize);
    }
    @Test
    public void testAddAnyWhere(){
        arrayList.add("four",1);
        arrayList.add("five",0);
        int tempSize = arrayList.size;
        assertEquals(5,tempSize);
    }
}

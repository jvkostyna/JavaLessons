public class MyArrayList{
    Object[] array;
    int size;
    public MyArrayList(){
        array = new Object[10];
    }
    public void add(Object value){
        add(value,size);
    }
    public void add(Object value,int index){
        if (index <0 || index > size){
            String message = "Index: " + index + ", should be between 0 and "+ size;
            throw new IndexOutOfBoundsException(message);
        }
        if (size == array.length){
            Object[] tempArray = new Object[(size + size)];
            System.arraycopy(array,0,tempArray,0,array.length);
        } else {
            System.arraycopy(array,index,array,index+1,size-index);
        }
        array[index] = value;
        size++;
    }
    public Object get(int index){
        validateIndex(index);
        return array[index];
    }
    public int indexOf(Object element){
        for(int i = 0;i<size;i++){
            if (array[i].equals(element)){
                return i;
            }

        }
        return -1;
    }
    public int lastIndexOf(Object element){
        for (int i = size -1; i < size;i--){
            if (array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public Object remove(int index){
        validateIndex(index);
        Object previousValue = array[index];
        System.arraycopy(array,index+1,array,index,size-1);
        array[size-1] = null;
        size--;
        return previousValue;
    }
    public Object set(Object value,int index){
        validateIndex(index);
        Object previousValue = array[index];
        array[index] = value;
        return previousValue;
    }
    public boolean isEmpty(){
        return (size > 0) ? false:true;
    }
    public void clear(){
        if (size > 0){
            for (Object O :array){
                O = null;
            }
            size = 0;
        }
    }
    public void validateIndex(int index){
        if (index < 0 || index >= size)
        {
            String message = "Index: " + index + ", should be between 0 and " + size;
            throw new IndexOutOfBoundsException(message);
        }

    }

}
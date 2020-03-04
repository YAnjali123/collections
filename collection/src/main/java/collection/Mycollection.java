package collection;

public class Mycollection{
	private Object[] objArray=new Object[10];
	private int elementcount=0;
	public void add(Object obj) {
		if(elementcount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementcount]=obj;
		elementcount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=objArray.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];		
		}
		objArray=nextArray;
	}
	public int size()
	{
		return elementcount;
	}
	public int capacity() {
		return objArray.length;
	}
	public Object get(int index) {
		if(index<0||index>=size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		
		return objArray[index];
	}
	public void replace(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		objArray[index]=obj;
	}
	public void remove(int index)
	{
		if(index<0||index>=size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		while(index<size()-1)
		{
			objArray[index]=objArray[index+1];
			index++;
		}
		objArray[index]=null;
		elementcount--;
	}
	public void insert(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			throw new IndexOutOfBoundsException(""+index);
		}
		if(size()==capacity())
		{
			increaseCapacity();
		}
		for(int i=size()-1;i>=index;i--)
		{
			objArray[i+1]=objArray[i];
		}
		objArray[index]=obj;

	}
	

}

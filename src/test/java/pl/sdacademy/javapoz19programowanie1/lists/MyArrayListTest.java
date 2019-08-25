package pl.sdacademy.javapoz19programowanie1.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void removeOfMiddleElementShouldRemoveItFromList(){
        //given
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);

                myArrayList.remowe(1);
        Assert.assertEquals(2, myArrayList.size();

        Assert.assertEquals(Integer)1, myArrayList.get(0));
        Assert.assertEquals(Integer)5, myArrayList.get(1));
    }
@Test
public void removeOfNonExistingElementSsouldThrowArrayIndexOutOfBoundException() {

    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add(1);
    myArrayList.add(3);
    myArrayList.add(5);

    myArrayList.remove(2);
}
@Test
    public void add_replacingShouldAddElementInMiddleOfList(){
    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add(0);
    myArrayList.add(10);
    myArrayList.add(20);
    myArrayList.add(40);

    myArrayList.add_replacing(3,30);

    Assert.assertEquals(5,myArrayList.size());
    Assert.assertEquals(0 ,myArrayList.size(0));
    Assert.assertEquals(10,myArrayList.size(1));
    Assert.assertEquals(20,myArrayList.size(2));
    Assert.assertEquals(30,myArrayList.size(3));
    }

    @Test
    public void add_replacingShouldAddElementInMiddleOfListOfSize10(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(60);
        myArrayList.add(70);
        myArrayList.add(80);
        myArrayList.add(90);
        myArrayList.add(100);


        myArrayList.add_replacing(3,30);

        Assert.assertEquals(11,myArrayList.size());
        Assert.assertEquals(Integer)0 ,myArrayList.get(0));
        Assert.assertEquals(Integer)10 ,myArrayList.get(1));
        Assert.assertEquals(Integer)20 ,myArrayList.get(2));
        Assert.assertEquals(Integer)30 ,myArrayList.get(3));
        Assert.assertEquals(Integer)40 ,myArrayList.get(4));
        Assert.assertEquals(Integer)50 ,myArrayList.get(5));
        Assert.assertEquals(Integer)60 ,myArrayList.get(6));
        Assert.assertEquals(Integer)70 ,myArrayList.get(7));
        Assert.assertEquals(Integer)80 ,myArrayList.get(8));
        Assert.assertEquals(Integer)90 ,myArrayList.get(9));
        Assert.assertEquals(Integer)100 ,myArrayList.get(10));


    }

    @Test
    public void add_replacingShouldAddElementAtEnd(){

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(40);

        myArrayList.add_replacing(5,50);

        Assert.assertEquals(5,myArrayList.size());
        Assert.assertEquals(0 ,myArrayList.size(0));
        Assert.assertEquals(10,myArrayList.size(1));
        Assert.assertEquals(20,myArrayList.size(2));
        Assert.assertEquals(30,myArrayList.size(3));

    }

    @Test
    public void add_replacingShouldThrowArrayIndexOfBoundsExceptionWhenAddingOnWrongIndex(){
        Assert.assertEquals(5,myArrayList.size());
        Assert.assertEquals(0 ,myArrayList.size(0));
        Assert.assertEquals(10,myArrayList.size(1));
        Assert.assertEquals(20,myArrayList.size(2));
        Assert.assertEquals(30,myArrayList.size(3));
    }


}